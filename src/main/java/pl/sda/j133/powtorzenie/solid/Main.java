package pl.sda.j133.powtorzenie.solid;

import pl.sda.j133.powtorzenie.Kukulka;
import pl.sda.j133.powtorzenie.Ptak;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class Main {
    public static void main(String[] args) {
        // Korzyści korzystania z zasad:
        //              - Teraz stracimy trochę czasu, ale w przyszłości nie zmarnujemy czasu na rozwijanie nowych funkcjonalności
        //              - Testy pozostają takie same - nie ma potrzemy zmiany architektury
        //              - Kod jest zrozumiały dla 95% programistów
        //              - jeśli wystąpi/pojawi się błąd to musimy poprawić tylko jedno miejsce/klasę/metodę
        //                  - naprawa bez ryzyka uszkodzenia innych funkcjonalności (ponieważ [single responsibility] są oddzielone)
        //              - Z perspektywy managera/szefa:
        //                  - mniejsze koszta utrzymania
        //                  - kod łatwiejszy w zrozumieniu
        //                  - (minus) dużo plików z kodem


        // DRY      - Don't repeat Yourself
        // KISS     - Keep it simple, stupid
        // SOLID    -
        //
        // S        - Single Responsibility - [Każda klasa/metoda powinna posiadać] Pojedyncza odpowiedzialność
        //              - (Paczka)
        //              - Klasa
        //              - Metoda
        //                  - powinna mieć swoją jedną odpowiedzialność
        //                  - powinna wykonywać jedną (jasno zadeklarowaną [np. w postaci nazwy]) rzecz
        //                  - jeśli okaże się że funkcja/klasa nie działa, to istnieje tylko jeden powód do jej zmiany
        //                  - [metoda powinna (stać się/być) prosta w testowaniu]
        //
        // O        - Open/Close Principle - [Kod powinien być] Otwarty na rozszerzenia (dziedziczenie), zamknięty na modyfikację
        //              - Twórzmy kod który łatwo dziedziczyć i twórzmy warstwy abstrakcji (klasy abstrakcyjne itp) lub interfejsy
        //                  po których później będziemy mogli odziedziczyć by rozszerzyć funkcjonalność.
        //
        // L        - Liskov Substitution Principle - Zasada Liskov (Pani Barbara)
        //              - Po lewej stronie deklaracji/przypisania stawiamy możliwie najwyższy typ [który pozwala zachowywać naszą funcjonalność].
        //              - Przykład:
        //                  -   List<Integer> nazwa = new ArrayList<>();
        //                      - NIE!!!! ArrayList<Integer> nazwa = new ArrayList<>(); NIE!!!!
        //                  -   Ptak k = new Kukulka();
        //                      - NIE!!!! Kukulka k = new Kukulka();                    NIE!!!!
        //
        // I        - Interface segregation - Segregacja interfejsów
        //              - Stosuj wiele małych interfejsów ponad niewiele dużych
        //
        // D        - Dependency Inversion Principle - Zasada odwrócenia zależności
        //              - Poinniśmy [luźno] deklarować zależności (stosować interfejsy w polach zamiast klas)
        //              - (Ta zasada ma w tym momencie niewiele sensu poza tym co zostało powiedziane w do tej pory w
        //                      poprzednich zasadach, wrócimy do tego tematu przy Spring'u)
        //

        // Deklaracja Listy (ArrayList)
        // Po lewej stronie deklaracji/przypisania stawiamy możliwie najwyższy typ [który pozwala zachowywać naszą funcjonalność].
        List<Integer> nazwa = new ArrayList<>();

        Ptak k = new Kukulka();
        k.spiewaj();
    }

}
