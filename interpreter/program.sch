/* START DATE 1/1/2023;
END DATE 1/6/2023;
CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "Krzysztof Broda";
CLASS cszarp START 12:45 END 14:15 SUBJECT "Programowanie zaawansowane" TEACHER "Tomasz Hachaj";
ADD CLASS kompilatory DATE 4/1/2023;
ADD CLASS eksploracja DATE 4/1/2023;
ADD CLASS cszarp DATE 6/1/2023; */

CLASS kompilatory START 13:15 END 14:45 SUBJECT "Teoria kompilacji" TEACHER "Dariusz Palka";
FOR INT i IN [0, 1, 2, 3]{
    ADD CLASS kompilatory DATE 1/1/2023 + 7*i;
};