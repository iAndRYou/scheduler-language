CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "dr inz Krzysztof Broda";
CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";

DAY sroda1 CLASSES [eksploracja];
DAY sroda2 CLASSES [uczmasz];

ADD DAY sroda1+sroda2 ON DATE 5/4/2023;

DUMP "plany/test";