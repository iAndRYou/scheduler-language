STRING eksploracja_teacher_title = "dr inz";
STRING eksploracja_teacher = "Krzysztof Broda";
TIME eksploracja_start = 16:15;
TIME eksploracja_end = 17:45;
STRING eksploracja_subject = "Eksploracja podwodna";

// definiowanie jednostek zajeciowych
CLASS eksploracja START eksploracja_start END eksploracja_end SUBJECT eksploracja_subject TEACHER eksploracja_teacher_title + " " + eksploracja_teacher;
CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";

// dodawanie jednostki zajeciowej do planu
COLLECTION OF DATE daty = [5/4/2023, 12/4/2023];
ADD CLASS eksploracja ON DATES daty;

// definiowanie dnia zajeciowego na podstawie jednostek
DAY sroda CLASSES [eksploracja, uczmasz];

// dodawanie dnia zajeciowego do planu
ADD DAY sroda ON DATE 19/4/2023;


// dodanie godzin rektorskich w wybrany dzien na wybrany przedzial czasu
VOID rektorskieGodziny(DATE d, TIME start_time, TIME end_time){
    CLASS rekt START start_time END end_time SUBJECT "Godziny rektorskie";
    // usuniecie zajec bedacych w kolizji z godzinami rektorskimi
    DELETE CLASSES class SATISFYING (date == d) AND (class @ rekt); 
    ADD CLASS rekt ON DATE d;
    RETURN;
}

rektorskieGodziny(19/4/2023, 15:00, 17:20);

// zapisanie planu do pliku plany/plan1.json
DUMP "plany/plan1";