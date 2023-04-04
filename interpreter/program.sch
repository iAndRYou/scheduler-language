VOID rektorskie(DATE d){
    DELETE CLASSES SATISFYING date == d;
    CLASS rekt START 00:00 END 23:59 SUBJECT "Godziny rektorskie";
    ADD CLASS rekt ON DATE d;
    RETURN;
}

VOID rektorskieKolekcja(COLLECTION OF DATE dates){
    DELETE CLASSES SATISFYING date IN dates; 
    RETURN;
}


COLLECTION OF INT range(INT a, INT b){
    COLLECTION OF INT r = [];
    WHILE a < b{
        r = r + [a];
        a = a + 1;
    }
    RETURN r;
}

COLLECTION OF DATE daterange(DATE a, DATE b, COLLECTION OF DATE excludedDates){
    COLLECTION OF DATE r = [];
    WHILE a < b{
        IF NOT (a IN excludedDates){
            r = r + [a];
        }
        a = a + 1;
    }
    RETURN r;
}


CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";

DAY sroda CLASSES [kompilatory, eksploracja];

COLLECTION OF DATE a = daterange(1/1/2023, 1/2/2023, daterange(10/1/2023, 25/1/2023, []));
PRINT a;
ADD CLASS kompilatory ON DATES a;
rektorskie(2/1/2023);
