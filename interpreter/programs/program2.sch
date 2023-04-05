// gotowy plan z poprzedniego programu
VOID dumpPlanu(){
    CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "dr inz Krzysztof Broda";
    CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";
    ADD CLASS eksploracja ON DATES [5/4/2023, 12/4/2023];
    DAY sroda CLASSES [eksploracja, uczmasz];
    ADD DAY sroda ON DATE 19/4/2023;
}

//////////////

dumpPlanu();

// odzyskiwanie zajec z planu na podstawie warunkow
COLLECTION OF CLASS wszystkieZajecia = GET DISTINCT CLASSES class SATISFYING class.TEACHER == "dr inz Krzysztof Broda";
PRINT wszystkieZajecia;

// usuwanie zajec z planu na podstawie warunkow
DELETE CLASSES SATISFYING date IN [5/4/2023, 12/4/2023];