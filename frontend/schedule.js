function LoadJson() {

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
    `
    return classContainer;
}