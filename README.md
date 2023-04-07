# Scheduler .sch

## Opis języka
    
 - Język do tworzenia planów zajęć
 - Zamysłem języka jest podział logiki na:
    - canvas - plan zajęć niebędący zwykłą zmienną, a "płótnem" programu do którego dodajemy zajęcia, usuwamy je, a także odzyskujemy aby wykonać na nich dalsze operacje
    - struktury reprezentujące zajęcia i dni zajęciowe - element elastyczności języka, struktury możemy w różny sposób łączyć oraz modyfikować
 - Wynik działania programu: wypisane (docelowo wyświetlane w osobnym oknie) w kolejności dni z zajęciami które się wtedy odbywają 
 - Typowany język skryptowy imperatywny:
    - słowa kluczowe pisane wielkimi literami
    - instrukcje niezawierające bloku kodu zakończone są średnikiem
    - możliwość komentowania kodu zarówno w pojedynczych liniach (`//`), jak i w blokach tekstu (`/* */`)

## Zmienne
 - Podstawowe typy zmiennych
 - Struktury
 - Kolekcje (listy)
### Podstawowe typy zmiennych
 - `BOOL` - typ logiczny, wartości `True` i `False`:
    - ```
      BOOL zmienna = True;
      ```
 - `STRING` - łańcuch znaków:
    - ```
      STRING zmienna = "Przykladowa zmienna";
      ```
 - `INT` - liczby całkowite:
    - ```
      INT zmienna = 1;
      ```
 - `DATE` - data w formacie DD/MM/YYYY:
    - ```
      DATE zmienna = 5/4/2023;
      ```
 - `TIME` - czas w formacie hh:mm określająca godziny i minuty:
    - ```
      TIME zmienna = 13:15;
      ```
 - `VOID` - null
### Struktury
 - `CLASS` - struktura reprezentująca jednostkę zajęciową
    ```
    CLASS zmienna START 13:15 END 14:45 SUBJECT "Teoria kompilacji i kompilatory" TEACHER "dr Dariusz Palka";
    ```
    - posiada atrybuty:
        - `START` - godzina rozpoczęcia (typu `TIME`)
        - `END` - godzina zakończenia (typu `TIME`)
        - `SUBJECT` - przedmiot (typu `STRING`)
        - `TEACHER` - prowadzący (typu `STRING`)
    - dostęp do atrybutu:
      ```
      zajecia.START;
      ```
    - przypisanie:
      ```
      zajecia.SUBJECT = "New subject";
      ```
 - `DAY` - struktura reprezentująca dzień zajęć:
     ```
     DAY zmienna CLASSES [zajecia1, zajecia2, zajecia3];
     ```
 ### Kolekcje
 - `COLLECTION OF <typ/struktura>` - kolekcja elementów, będąca w rzeczywistości listą
    - ```
      COLLECTION OF INT kolekcja = [1, 2, 3, 4];
      ```
    - ```
      COLLECTION OF DATE kolekcja = [5/4/2023];
      kolekcja = kolekcja + [12/4/2023, 19/4/2023;
      ```
  
## Instrukcje
 - Instrukcje na zmiennych
 - Instrukcje na canvas
    
### Instrukcje na zmiennych
 - Definicja i przypisanie zmiennych typu podstawowego, struktur oraz kolekcji
    - definicja
    ```
    <typ> <nazwa_zmiennej> = <wyrazenie>;
    ```
    - przypisanie
    ```
    <nazwa_zmiennej> = <wyrazenie>;
    ```
 - Przypisanie wartości do atrybutu struktury
     ```
     <nazwa_zmiennej>.<atrybut> = <wyrazenie>;
     ```
 - Instrukcje warunkowe: `IF`, `ELIF`, `ELSE`
     ```
     IF <warunek>{
        // kod
     }
     ELIF <warunek>{
        // kod
     }
     ELSE{
        // kod
     }
     ```
 - Pętle: `FOR`, `WHILE`
     ```
     FOR <typ/struktura> <nazwa_zmiennej> IN <kolekcja typu/struktury>{
        // kod
     }
     ```
     ```
     WHILE <warunek>{
        // kod
     }
     ```
 - Definicja funkcji
     ```
     <typ/struktura> czyKompilatory(<typ/struktura> <nazwa_zmiennej>, ...){
        // kod
     }
     ```
 - Wypisywanie zmiennych: `PRINT`
     ```
     PRINT <wyrazenie>;
     ```
 - Instrukcje przeniesienia: `BREAK`, `RETURN`

### Instrukcje na canvas (plan zajęć)
 - Określanie daty początkowej i końcowej planu (`START`, `END`) - odgórne ograniczenie przedziału czasu w którym mogą być zajęcia, zajęcia poza nim nie zostaną dodane
 - Dodawanie struktur do canvas:
     ```
     ADD <CLASS/DAY> <wyrazenie> ON <DATE/DATES> <wyrazenie (data/kolekcja dat)>;
     ```
    - zostanie wyrzucony wyjątek jeśli nastąpi kolizja z istniejącymi już zajęciami w planie
 - Usuwanie dodanych wcześniej do canvas struktur:\
     ```
     DELETE <CLASSES/DAYS> <nazwa_zmiennej (opcjonalne)> SATISFYING <warunek>;
     ```
    - zmienna opcjonalna służy do stawiania warunków na struktury w planie
        - ```
          DELETE CLASSES zajecia SATISFYING zajecia.SUBJECT == "Teoria kompilacji i kompilatory";
          ```
    - warunek może także korzystać ze zmiennych tymczasowych, np. `date`:
        - ```
          DELETE CLASSES SATISFYING date IN [12/4/2023, 7/6/2023];
          ```
    
 - Pobieranie z canvas struktur:
     ```
     GET <CLASSES/DAYS> <nazwa_zmiennej (opcjonalne)> SATISFYING <warunek>;
     ```
    - użycie zmiennej opcjonalnej oraz zmiennych tymczasowych takie samo jak w opisie wyżej
    - zwraca kolekcję jednostek lub dni zajęciowych
 - Zapisywanie planu do pliku o formacie json:
     ```
     DUMP <sciezka_do_pliku (typu STRING)>;
     ```
 - Wczytywanie planu z pliku o formacie json:
     ```
     LOAD <sciezka_do_pliku (typu STRING)>;
     ```
 
 ## Operacje na zmiennych
 - Operatory arytmetyczne: `+`, `-`, `*`, `/`
 - Operatory logiczne: `AND`, `OR`, `NOT`
 - Operatory porównania: `==`, `!=`, `<`, `>`, `<=`, `>=`
 - Operatory złożone: `IN` (do sprawdzania, czy dana wartość znajduje się w kolekcji), `@` (obsługuje nachodzenie się zajęć w czasie)

## Przykładowy program
        STRING eksploracja_teacher_title = "dr inz";
        STRING eksploracja_teacher = "Krzysztof Broda";
        TIME eksploracja_start = 16:15;
        TIME eksploracja_end = 17:45;
        STRING eksploracja_subject = "Eksploracja podwodna"

        // definiowanie jednostek zajeciowych
        CLASS eksploracja START eksploracja_start END eksploracja_end SUBJECT eksploracja_subject TEACHER eksploracja_teacher_title + " " + eksploracja_teacher;
        CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki";

        // dodawanie jednostki zajeciowej do planu
        COLLECTION OF DATES daty = [5/4/2023, 12/4/2023];
        ADD CLASS eksploracja ON DATES daty;

        // definiowanie dnia zajeciowego na podstawie jednostek
        DAY sroda CLASSES [eksploracja, uczmasz];

        // dodawanie dnia zajeciowego do planu
        ADD DAY sroda ON DATE 19/4/2023;
    
        // dodanie godzin rektorskich w wybrany dzien
        VOID rektorskieGodziny(DATE d, TIME start_time, TIME end_time){
            CLASS rekt START start_time END end_time SUBJECT "Godziny rektorskie";
            DELETE CLASSES class SATISFYING date == d AND class @ rekt; // usuniecie zajec bedacych w kolizji z godzinami rektorskimi
            ADD CLASS rekt ON DATE d;
            RETURN;
        }
    
        rektorskieGodziny(28/6/2023, 15:00, 17:20);
        STRING sciezka = "plany/plan1";
        DUMP sciezka;
        
        
        
Powyższy przykład jest kompletnym skryptem tworzący plan zajęć.

Na start definiujemy jednostki zajęciowe typu CLASS po czym dodajemy je do planu w datach 5. kwietnia 2023 oraz 12. kwietnia 2023.

Następne definiowany jest dzień, klasa DAY, zawierający uprzednio zdefiniowane zajęcia. W następującej instrukcji dodajemy DAY zawierający zajęcia dnia 19. kwietnia 2023.

Funkcja rektorskieGodziny usuwa z planu zajęcia w wybranej dacie oraz dodaje "przedmiot" symbolizujący godziny rektorskie. 

Instrukcją `DUMP` zapisujemy plan do pliku `plan1.json` w utworzonym wcześniej folderze `/plany`.
