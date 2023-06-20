async function loadjson() {
    try {
        // get the json file from the local server at port 9090
        const response = await fetch("http://[::]:9090/output.json");
        const data = await response.json();
        return data;
    } catch (err) {
        console.log(err);
    }
}

function createAbbreviation(subject) {
    var abbreviation = "";
    var words = subject.toUpperCase().split(" ");
    for (var i = 0; i < words.length; i++) {
        abbreviation += words[i].charAt(0);
    }
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

function styleClassContainer(classContainer, data) {
    classContainer.style.height = calculateHeight(data.start, data.end) + "px";
    classContainer.style.top = calculateTop(data.start) + "px";
}

function createClassContainer(data) {
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
            ${data.teacher}
        </div>
    `;
    // style the class container
    styleClassContainer(classContainer, data);
    document.body.appendChild(classContainer);
}

function parseDate(dateString) {
    const parts = dateString.split("/");
    const day = parseInt(parts[0], 10);
    const month = parseInt(parts[1], 10) - 1;
    const year = parseInt(parts[2], 10);
    
    return new Date(year, month, day);
}

function dateToString(date) {
    const day = date.getDate();
    const month = date.getMonth() + 1;
    const year = date.getFullYear();

    return `${day}/${month}/${year}`;
}

function calculateCalendarWeeks(data) {
    const dates = Object.keys(data);
    const startDate = parseDate(dates[0]);
    const endDate = parseDate(dates[dates.length - 1]);
  
    const millisecondsPerDay = 24 * 60 * 60 * 1000;
    const startDayOfWeek = (startDate.getDay() + 6) % 7; 
    const endDayOfWeek = (endDate.getDay() + 6) % 7; 
  
    const daysInSpan = Math.ceil((endDate - startDate) / millisecondsPerDay) + 1; 
    const totalDaysInWeeks = daysInSpan + startDayOfWeek + (6 - endDayOfWeek);
    const numOfWeeks = Math.floor(totalDaysInWeeks / 7); 
  
    const adjustedStartDate = new Date(startDate.getTime() - startDayOfWeek * millisecondsPerDay);
  
    return { "startDate": adjustedStartDate, "numOfWeeks": numOfWeeks };
}

function createWeeks(data) {
    let weeks = calculateCalendarWeeks(data);
    console.log(weeks);
}

loadjson().then(data => {
    console.log(data);
    createWeeks(data);
});