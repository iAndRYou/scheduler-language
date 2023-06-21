COLLECTION OF DATE daterange(DATE start, DATE end, INT step){
    COLLECTION OF DATE result = [start]];
    DATE tmp = start + step;
    WHILE tmp <= end{
        result = result + [tmp];
        tmp = tmp + step;
    }
    RETURN result;
}

CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "dr inz Krzysztof Broda";
CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";
CLASS mwo START 19:30 END 21:00 SUBJECT "Metody wytwarzania oprogramowania" TEACHER "dr inz Wojciech Szmuc";
CLASS de START 13:15 END 14:45 SUBJECT "Data Engineering" TEACHER "dr inz Sebastian Ernst";
CLASS pz2 START 13:15 END 14:45 SUBJECT "Programowanie zaawansowane 2" TEACHER "dr hab inz Tomasz Hachaj";

DAY sroda CLASSES [eksploracja, uczmasz];

ADD CLASS mwo ON DATES daterange(5/6/2023, 30/6/2023, 7);
ADD DAY sroda ON DATES daterange(7/6/2023, 30/6/2023, 7);
ADD CLASS de ON DATES daterange(8/6/2023, 30/6/2023, 7);
ADD CLASS pz2 ON DATES daterange(9/6/2023, 30/6/2023, 7);