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
            <h1>${data.start}</h1>
        </div>
        <div class="subject">
            <h1>${subject}</h1>
        </div>
        <div class="teacher">
            <h1>${data.start}</h1>
        </div>
    `;
    document.body.appendChild(classContainer);
}

function loadjson() {
    fetch("localhost:9000/test.json").then(response => {
        console.log(response);
    }).catch(error => {
        console.log(error);
    });
}

loadjson();