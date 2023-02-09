import java.security.spec.RSAOtherPrimeInfo;

public class Sesons {
    public season favoriteSeason = season.summer;

    enum season{
        winter{

        },
        spring,
        summer,
        autumn;
        double middleTemp;

    }

    public Sesons(double temp){

    }


    public static void loveSeason(season time_season){
        switch (time_season) {
            case winter -> System.out.println("Я люблю зиму!");
            case spring -> System.out.println("Я люблю весну!");
            case summer -> System.out.println("Я люблю лето!");
            case autumn -> System.out.println("Я люблю осень!");
            default -> System.out.println("Таккого времени года нет");
        }
    }

}
