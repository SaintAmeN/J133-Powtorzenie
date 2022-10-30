package pl.sda.j133.powtorzenie;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 30.10.2022
 */
public class MainPodstawy {
    public static void main(String[] args) {
        // tylko wartości w pamięci
        // boolean char byte short float int double long

        // typ złożony/obiektowy - ponieważ niejawnie dziedziczy po klasie Object
        // referencje w pamięci
        // Integer x;

        // Czy wszystko w Javie jest obiektem?
        MainPodstawy obiektKlasyMain;

        // Typy prymitywne nie są obiektowe (nie dziedziczą po klasie Object)!

        Ptak kukulka = new Kukulka();
        kukulka.spiewaj();
        // Paradygmat - z góry przyjęta jakaś "prawda" w danej dziedzinie.
        // - hermetyzacja
        //      - zamknięcie "dostępu" do jakiegoś fragmentu kodu - dla innych programistów
        //      - używamy modyfikatorów dostępu:
        //              -   private,                (tylko klasa)
        //              -   '' (package protected), (tylko package)
        //              -   protected,              (tylko package + klasy dziedziczące)
        //              -   public,                 (wszędzie)
        // - abstrakcja
        //      - abstrakcja w rozumieniu nie-klas i architektury - nie chodzi o klasy abstrakcyjne i metody abstrakcyjne!
        //      - twórz model przybliżony, uprość świat który tworzysz!
        // - polimorfizm
        //      - obiekt jest samym sobą, ale też tym co dziedziczy
        // - dziedziczenie
        //      - DRY - don't repeat Yourself
        //      - twórzmy warstwy abstrakcji i klasy po których możemy dziedziczyć
        //

    }
}
