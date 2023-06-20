const millisecondsPerDay = 24 * 60 * 60 * 1000;
const daysInWeek = ["mon", "tue", "wed", "thu", "fri", "sat", "sun"]

function createAbbreviation(subject) {
    var abbreviation = "";
    var words = subject.toUpperCase().split(" ");
    words.forEach(word => {
        abbreviation += word.charAt(0);
    });
    return abbreviation;
}

function calculateHeight(start, end) {
    var startParts = start.split(":");
    var endParts = end.split(":");

    var startMinutes = +startParts[0] * 61.75 + +startParts[1];
    var endMinutes = +endParts[0] * 61.75 + +endParts[1];

    var height = (endMinutes - startMinutes);
    return height;
}

function calculateTop(start) {
    var startParts = start.split(":");
    var startMinutes = +startParts[0] * 62 + +startParts[1];

    return startMinutes + 21;
}

function styleClassContainer(classContainer, data, day) {
    classContainer.style.height = calculateHeight(data.start, data.end) + "px";
    classContainer.style.top = calculateTop(data.start) + "px";
    classContainer.style.left = "calc(" + day + " * ((100vw - 50px )/ 7) + 50px)";
}

function createClassContainer(data, day) {
    var classContainer = document.createElement("div");
    classContainer.classList.add("class");

    var subject = createAbbreviation(data.subject);

    classContainer.innerHTML = `
        <div class="time">
            ${data.start + "-" + data.end}
        </div>
        <div class="subject">
            ${subject}
        </div>
        <div class="teacher">
            ${data.teacher ? data.teacher : ""}
        </div>
    `;
    // style the class container
    styleClassContainer(classContainer, data, day);
    document.body.appendChild(classContainer);
}

function parseDate(dateString) {
    var parts = dateString.split("/");
    var day = parseInt(parts[0], 10);
    var month = parseInt(parts[1], 10) - 1;
    var year = parseInt(parts[2], 10);
    
    return new Date(year, month, day);
}

function dateToString(date) {
    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();

    return `${day}/${month}/${year}`;
}

function dateToPresentableString(date) {
    var day = date.getDate();
    var month = date.getMonth() + 1;

    return `${day}.${month}`;
}

function calculateCalendarWeeks(data) {
    var dates = Object.keys(data);
    var startDate = parseDate(dates[0]);
    var endDate = parseDate(dates[dates.length - 1]);
  
    var startDayOfWeek = (startDate.getDay() + 6) % 7; 
    var endDayOfWeek = (endDate.getDay() + 6) % 7; 
  
    var daysInSpan = Math.ceil((endDate - startDate) / millisecondsPerDay) + 1; 
    var totalDaysInWeeks = daysInSpan + startDayOfWeek + (6 - endDayOfWeek);
    var numOfWeeks = Math.floor(totalDaysInWeeks / 7); 
  
    var adjustedStartDate = new Date(startDate.getTime() - startDayOfWeek * millisecondsPerDay);
  
    return { "startDate": adjustedStartDate, "numOfWeeks": numOfWeeks };
}

function generateWeekList(data) {
    let weeks = calculateCalendarWeeks(data);
    console.log(weeks);

    let startDate = weeks.startDate;
    let numOfWeeks = weeks.numOfWeeks;
    const weekList = [];
    
    // generate weeks: for each week generate array of days
    // each day is an object with date to present and data
    for (let i = 0; i < numOfWeeks; i++) {
      var weekStart = new Date(startDate.getTime() + i * 7 * millisecondsPerDay);
      const week = [];
  
      for (let j = 0; j < 7; j++) {
        var dayDate = new Date(weekStart.getTime() + j * millisecondsPerDay);
        var dayDateString = dateToString(dayDate);

        var dayPresentableString = dateToPresentableString(dayDate);
        var dayData = data[dayDateString] ? data[dayDateString] : null;
        
        var day = { "date": dayPresentableString, "data": dayData };
        week.push(day);
      }
  
      weekList.push(week);
    }
  
    return weekList;
}

function plotClasses(days) {
    console.log(days);
    for (let i = 0; i < days.length; i++) {
        var day = days[i];

        var header = document.getElementById(daysInWeek[i]);
        header.innerHTML += ", " + day.date;

        if (day.data != null) {
            day.data.forEach(data => {
                createClassContainer(data, i);
            });
        }
    }
}

function resetCanvas() {
    var classes = document.getElementsByClassName("class");
    classes = Array.from(classes);
    classes.forEach(classContainer => {
        document.body.removeChild(classContainer);
    });

    var headers = document.querySelectorAll("td.header");

    headers.forEach(header => {
        var day = header.id.charAt(0).toUpperCase() + header.id.slice(1);
        header.innerHTML = day;
    });
}

function manageContent() {
    fetch("http://[::]:9000/output.json").then(response => 
        response.json()).then(data => {
            console.log(data);
            // generate weeks with days
            var weeks = generateWeekList(data);
            console.log(weeks);

            // plot classes
            var currentWeek = 0;
            plotClasses(weeks[currentWeek]);

            document.body.addEventListener("keydown", event => {
                if (event.key == "ArrowRight") {
                    if (currentWeek < weeks.length - 1)
                        currentWeek++;
                    console.log(currentWeek);
                    
                    // plot classes
                    resetCanvas();
                    plotClasses(weeks[currentWeek]);
                } else if (event.key == "ArrowLeft") {
                    if (currentWeek > 0)
                        currentWeek--;
                    console.log(currentWeek);
                    
                    // plot classes
                    resetCanvas();
                    plotClasses(weeks[currentWeek]);
                }
            });
        });
}

manageContent();