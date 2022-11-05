package pl.sda.j133.powtorzenie.segregation.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class DomInteligentny {
    private List<IDrzwi> drzwi = new ArrayList<>();

    public void otworzWszystko(){
        for (IDrzwi iDrzwi : drzwi) {
            iDrzwi.otwórz();
        }
    }
}
