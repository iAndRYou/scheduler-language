STRING eksploracja_teacher = "dr inz Krzysztof Broda";
TIME eksploracja_start = 16:15;

// definiowanie jednostek zajeciowych
CLASS eksploracja START eksploracja_start END 17:45 SUBJECT "Eksploracja podwodna" TEACHER eksploracja_teacher;
CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";

// dodawanie jednostki zajeciowej do planu
ADD CLASS eksploracja ON DATES [5/4/2023, 12/4/2023];

// definiowanie dnia zajeciowego na podstawie jednostek
DAY sroda CLASSES [eksploracja, uczmasz];

// dodawanie dnia zajeciowego do planu
ADD DAY sroda ON DATE 19/4/2023;
