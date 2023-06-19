function LoadJson() {
    var request = new XMLHttpRequest();
    request.open("GET", "test.json", false);
    request.send(null);
    var object = JSON.parse(request.responseText);
    return object;
}

function createAbbreviation(subject) {
    var abbreviation = "";
    var words = subject.oUpperCase().split(" ");
    for (var word in words) {
        abbreviation += word.charAt(0);
    }
    return abbreviation;
}

function createClassContainer(data) {
    var classContainer = document.createElement("div");
    classContainer.classList.add("class");

    var subject = createAbbreviation(data.subject);

    classContainer.innerHTML = `
        <div class="start">
            ${data.start}
        </div>
        <div class="subject">
            ${subject}
        </div>
        <div class="teacher">
            ${data.start}
        </div>
    `;
    document.body.appendChild(classContainer);
}

var tds = document.getElementsByTagName("td");

tds.onclick = function() {
    console.log("clicked");
}