VOID rektorskieCalyDzienKolekcja(COLLECTION OF DATE dates){
    DELETE CLASSES SATISFYING date IN dates; 
    CLASS rekt START 00:00 END 23:59 SUBJECT "Godziny rektorskie";
    ADD CLASS rekt ON DATES dates;
    RETURN;
}

BOOL nachodzi(TIME t1, TIME t2, TIME t3, TIME t4){
    IF t2 <= t3{
        RETURN False;
    }
    ELIF t1 >= t4{
        RETURN False;
    }
    ELSE{
        RETURN True;
    }
}

VOID rektorskieGodziny(DATE d, TIME start_time, TIME end_time){
    DELETE CLASSES class SATISFYING date == d AND nachodzi(class.START, class.END, start_time, end_time);
    CLASS rekt START start_time END end_time SUBJECT "Godziny rektorskie";
    ADD CLASS rekt ON DATE d;
    RETURN;
}

COLLECTION OF DATE daterange(DATE a, DATE b, INT step, COLLECTION OF DATE excludedDates){
    COLLECTION OF DATE r = [];
    WHILE a < b{
        IF NOT (a IN excludedDates){
            r = r + [a];
        }
        a = a + step;
    }
    RETURN r;
}


CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "dr inz Krzysztof Broda";
CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "asd";

DAY sroda CLASSES [eksploracja, uczmasz];

COLLECTION OF DATE a = daterange(1/1/2023, 1/2/2023, 7, [8/1/2023]);
PRINT a;
ADD DAY sroda ON DATES a;
rektorskieGodziny(1/1/2023, 10:00, 12:00);
rektorskieCalyDzienKolekcja([4/1/2023, 5/1/2023, 6/1/2023]);

COLLECTION OF CLASS zajeciaDrBrody = GET DISTINCT CLASSES class SATISFYING class.TEACHER == "dr inz Krzysztof Broda";
PRINT zajeciaDrBrody;
