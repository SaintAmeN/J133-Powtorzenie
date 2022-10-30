package pl.sda.j133.powtorzenie;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 30.10.2022
 */
public class SerwisLogowania {
    public DaneUzytkownika zwrocUzytkownikaZLoginem(String login) {
        String email = znajdzEmailUzytkownika(login);
        if (email != null){
            return znajdzUzytkownikaWBazie(email);
        }
        if (login != null){
            return znajdzUzytkownikaWBazie(login);
        }

        return null;
    }

    private String znajdzEmailUzytkownika(String login) {
        // logika szukania maila użytkownika
        return null;
    }

    private DaneUzytkownika znajdzUzytkownikaWBazie(String loginLubEmail) {
        // logika szukania użytkownika po mailu lub loginie
        return null;
    }

    public static class DaneUzytkownika {

    }
}
