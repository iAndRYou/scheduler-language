VOID rektorskie(DATE d){
    DELETE CLASSES SATISFYING date == d;
    RETURN;
}

VOID rektorskieKolekcja(COLLECTION OF DATE dates){
    DELETE CLASSES SATISFYING date IN dates; 
    RETURN;
}

VOID f(DAY day, INT nweeks, DATE startdate, DATE enddate){
    INT i = 0;
    IF nweeks >= 0{
        WHILE i < nweeks{
            ADD DAY day AT DATE startdate + 7*i;
            i = i + 1;
        }
        RETURN;
    }
    WHILE startdate + 7*i <= enddate{
        ADD DAY day AT DATE startdate + 7*i;
        i = i + 1;
    }
    RETURN;
}

CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";

DAY sroda CLASSES [kompilatory, eksploracja];

f(sroda, -1, 1/1/2023, 1/3/2023);

rektorskie(15/1/2023);
rektorskieKolekcja([1/1/2023, 8/1/2023]);




/*
COLLECTION OF CLASS a = GET DISTINCT CLASSES class SATISFYING class.TEACHER == "Dariusz Palka";
CLASS komp;
komp = a[0];
*/


/* STRING f(INT i){
    IF i < 10{
        RETURN "Mniejsze niz 10";
    }
    ELIF i == 10{
        RETURN "Rowne 10";
    }
    ELSE{
        RETURN "Wieksze niz 10";
    }
}

STRING a = f(11); */
