// stworzenie planu
VOID generacjaPlanu(){
    CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "dr inz Krzysztof Broda";
    CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";

    DAY sroda CLASSES [eksploracja, uczmasz];

    DATE d = 5/4/2023; 
    WHILE d < 30/6/2023{
        ADD DAY sroda ON DATE d;
        d = d + 7; // skok o tydzien
    }
    RETURN;
}

// sprawdzanie czy przedzialy czasowe na siebie nachodza
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

// dodanie godzin rektorskich w wybrany dzien
VOID rektorskieGodziny(DATE d, TIME start_time, TIME end_time){
    DELETE CLASSES class SATISFYING date == d AND nachodzi(class.START, class.END, start_time, end_time);
    CLASS rekt START start_time END end_time SUBJECT "Godziny rektorskie";
    ADD CLASS rekt ON DATE d;
    RETURN;
}

generacjaPlanu();

rektorskieGodziny(28/6/2023, 15:00, 17:20);