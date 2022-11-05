package pl.sda.j133.powtorzenie.segregation.bad;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class Okno implements IDrzwi{
    @Override
    public void otwórz() {

    }

    @Override
    public void zamknij() {

    }

    @Override
    public void zaklucz() {
        throw new UnsupportedOperationException("Error, not supported");
    }

    @Override
    public void odklucz() {
        throw new UnsupportedOperationException("Error, not supported");
    }
}
