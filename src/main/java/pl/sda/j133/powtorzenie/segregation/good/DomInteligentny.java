package pl.sda.j133.powtorzenie.segregation.good;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class DomInteligentny {
    private List<IOtwieralny> otwieralneUrzadzenia = new ArrayList<>();

    public void otworzWszystko(){
        for (IOtwieralny otwieralne : otwieralneUrzadzenia) {
            otwieralne.otwórz();
        }
    }
}
