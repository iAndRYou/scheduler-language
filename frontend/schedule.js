function loadjson() {
    // output.json
    fetch("http://[::]:9090/test.json").then(response =>
        response.json().then(data => {
            console.log(data);
            for (var key in data) {
                console.log(data[key]);
                createClassContainer(data[key]);
            }
        }
    ).catch(err => {
        console.log(err);
    }));
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

    var startMinutes = +startParts[0] * 60 + +startParts[1];
    var endMinutes = +endParts[0] * 60 + +endParts[1];

    var height = (endMinutes - startMinutes);
    return height;
}

function calculateTop(start) {
    var startParts = start.split(":");
    var startMinutes = +startParts[0] * 62 + +startParts[1];

    return startMinutes + 20;
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

function createWeeks(data) {
    let keys = Object.keys(data);
    let firstDay = keys[0];
    let dateParts = firstDay.split("/");
    let firstDate = new Date(+dateParts[2], dateParts[1] - 1, +dateParts[0]);
    let firstDayOfWeek = firstDate.getDay();
    
    let lastDay = keys[keys.length - 1];
    dateParts = lastDay.split("/");
    let lastDate = new Date(+dateParts[2], dateParts[1] - 1, +dateParts[0]);
    let lastDayOfWeek = lastDate.getDay();

    let weeks = Math.ceil((lastDate - firstDate) / (7 * 24 * 60 * 60 * 1000));
}

loadjson();