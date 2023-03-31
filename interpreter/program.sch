/* START DATE 1/1/2023;
END DATE 1/6/2023;
CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";
CLASS cszarp START 12:45 END 14:15 SUBJECT "Programowanie zaawansowane" TEACHER "Tomasz Hachaj";
ADD CLASS kompilatory DATE 4/1/2023;
ADD CLASS eksploracja DATE 4/1/2023;
ADD CLASS cszarp DATE 6/1/2023; */

VOID f(DAY day, INT nweeks, DATE start_date, DATE end_date){
    INT i = 0;
    IF nweeks >= 0{
        WHILE i < nweeks{
            ADD DAY day DATE start_date + 7*i;
            i = i + 1;
        };
        RETURN;
    };
    WHILE start_date + 7*i <= end_date{
        ADD DAY day DATE start_date + 7*i;
        i = i + 1;
    };
    RETURN;
};

CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";

DAY sroda CLASSES [kompilatory, eksploracja];

f(sroda, 10, 1/1/2023, 1/3/2023);