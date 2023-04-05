# Scheduler .sch

## Opis języka
    
 - Język do tworzenia planów zajęć.
 - Zamysł: podział na canvas i struktury reprezentujące zajęcia i dni zajęciowe
 - Wynik działania programu: wypisane (docelowo wyświetlane) w kolejności dni z zajęciami które się wtedy odbywają 
 - Język skryptowy imperatywny
 - Silnie typowany
 - Słowa kluczowe pisane wielkimi literami
 - Pojedyncze instrukcje poza blokiem kodu zakończone są średnikiem
 - Możliwość komentowania kodu zarówno w pojedynczych liniach, jak i w blokach tekstu
     
### Typy instrukcji
 - Instrukcja w kodzie
 - Instrukcja dotyczące canvas
    
#### Instrukcje w kodzie
 - Definicje zmiennych (podstawowych: INT, BOOL, STRING, DATE, TIME) oraz struktur (CLASS, DAY), a także ich kolekcje i funkcji
 - Pętle for
 - Operacje logiczne 
 - Operatory złożone np. IN (do sprawdzania, czy dana wartość znajduje się w kolekcji) oraz autorski operator # który obsługuje nachodzenie się zajęć
 - Wypisywanie zmiennych

#### Instrukcje dotyczące canvas
 - Określanie daty początkowej i końcowej planu (START, END)
 - Dodawanie struktur (CLASS, DAY) do canvas
 - Usuwanie dodanych wcześniej do canvas struktur
 - Pobieranie wszystkich znajdujących się w canvas elementów danego typu struktury spełniających określone warunki 
 
    Tworzenie skryptów w naszym języku przypomina programowanie w języku Python pod tym względem że instrukcje znajdujące się poza funkcjami zdefiniowanymi przez użytkownika są wykonywane sekwencyjnie. 
    Wyróżniamy dwa główne typy instrukcji instrukcje "klasyczne" oraz instrukcje dotyczące canvas.
    
    Canvas reprezentuje pojedynczy plan realizowany przez jeden skrypt. 
    
    Do instrukcji w kodzie zaliczamy instrukcje warunkowe, funkcje, pętle a także definicje zmiennych typu int, bool, string, date oraz time oraz struktur stricte dotyczących planu zajęć takich jak:
    
        Class - jednostka zajęciowa zawierająca informacje o  przedmiocie, przypisanego prowadzącego zajęć oraz godziny początku i końca zajęć
        Day - struktura reprezentująca dzień w którym mogą odbywać się zajęcia, jest to kontener mogący zawierać kolekcję danych typu Class
    
    Instrukcje canvas to instrukcje mające na celu dodawanie, edycję i usuwanie, a także pobieranie kolekcji wyżej wymienionych struktur do planu zajęć. 
        
        ADD - dodaje do canvas strukturę typu Class bądź Day w dniu podanej daty
        UPDATE - edytuje w canvas strukturę typu Class bądź Day w dniu podanej daty
        DELETE - usuwa z canvas podaną jednostkę zajęciową bądź dzień zajęciowy
        GET - pobiera z canvas i zwraca kolekcję - wszystkie (dodane do danego momentu wywołania funkcji GET) struktury Class, Day - wszystkie lub spełniające podane warunki
        
### Podstawowe typy danych w języku:
    
        BOOL - typ logiczny, wartości True i False
        STRING - ciąg znaków
        INT - liczby całkowite
        DATE - data w formacie dd/mm/yyyy
        TIME - czas w formacie hh:mm określająca godziny i minuty
    
### Przykładowy program
    
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
    
        rektorskieGodziny(28/6/2023, 15:00, 17:20);
        
Powyższy przykład jest kompletnym skryptem tworzący plan zajęć.

Na start definiujemy jednostki zajęciowe typu CLASS po czym dodajemy je do planu w datach 5. kwitnia 2023 oraz 12. kwietnia 2023.

Następne definiowany jest dzień, klasa DAY, zawierający uprzednio zdefiniowane zajęcia. W następującej instrukcji dodajemy DAY zawierający zajęcia dnia 19. kwietnia 2023

Instrukcja BOOL nachodzi definiuje funkcję która to sprawdza czy dane zajęcia nachodzą na siebie

Instrukcja VOID rektorskieGodziny definiuje przykładową funkcję usuwającą z planu zajęcia w wybranej dacie co symbolizuje zwolnienie z zajęć

W ostatniej instrukcji wywoływana jest funkcja usuwająca zajęcia dnia 28. czerwca 2023 w godzinach 15:00 - 17:00




