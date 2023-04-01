/* START DATE 1/1/2023;
END DATE 1/6/2023;
CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";
CLASS cszarp START 12:45 END 14:15 SUBJECT "Programowanie zaawansowane" TEACHER "Tomasz Hachaj";
ADD CLASS kompilatory DATE 4/1/2023;
ADD CLASS eksploracja DATE 4/1/2023;
ADD CLASS cszarp DATE 6/1/2023; */

/* VOID f(DAY day, INT nweeks, DATE startdate, DATE enddate){
    INT i = 0;
    IF nweeks >= 0{
        WHILE i < nweeks{
            ADD DAY day DATE startdate + 7*i;
            i = i + 1;
        }
        RETURN;
    }
    WHILE startdate + 7*i <= enddate{
        ADD DAY day DATE startdate + 7*i;
        i = i + 1;
    }
    RETURN;
}

CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";

DAY sroda CLASSES [kompilatory, eksploracja];

f(sroda, -1, 1/1/2023, 1/3/2023); */


STRING f(INT i){
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

STRING a = f(9);