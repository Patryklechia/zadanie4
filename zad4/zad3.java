import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        String[] jedzenie = {"Kanapki","Ziemniaczki","Bigos","Makaron","Jajecznica","naleśniki","Bulion"};
        Random x = new Random();
        int śniadanie = x.nextInt(jedzenie.length);
        int obiad = x.nextInt(jedzenie.length);
        int kolacja = x.nextInt(jedzenie.length);

        System.out.println("Na śniadanie zjem: "+jedzenie[śniadanie]+", na obiad: "+jedzenie[obiad]+", a na kolację: "+jedzenie[kolacja]);
    }
}