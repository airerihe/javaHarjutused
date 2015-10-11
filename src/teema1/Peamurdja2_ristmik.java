package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        int count = 0;
        while (count < 5) {
            horisontaalne(foor3, foor4);
            vertikaalne(foor1, foor2);
            count = count + 1;
        }
    }
    public void horisontaalne(Foor foor3, Foor foor4) {

        roheliseks(foor3);
        roheliseks(foor4);
        punaseks(foor3);
        punaseks(foor4);
    };
    public void vertikaalne(Foor foor1, Foor foor2) {

        punaseks(foor1);
        punaseks(foor2);
        roheliseks(foor1);
        roheliseks(foor2);
    }
    public void roheliseks(Foor foor) {
        foor.vahetaPunast();
        foor.paus(5.0);
        foor.vahetaKollast();
        foor.paus(2.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(3.0);
        foor.vahetaRohelist();
    }
    public void punaseks(Foor foor) {
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.vahetaKollast();
        foor.paus(1.0);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.paus(2.0);
        foor.vahetaPunast();
    }
}
// alternatiiv.
    /*

    public void tsykkel(Foor foor, int suund) {

        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);
        int count = suund;
        while (count < 5) {
        if (count != 0) {
            foor.vahetaPunast();
            foor.paus(6.0);
            foor.vahetaKollast();
            foor.paus(6.0);
            foor.vahetaPunast();
            }
            else {
            foor.paus(5.0);
            foor.vahetaKollast();
            foor.paus(2.5);
            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.vahetaRohelist();
            foor.paus(3.0);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(1.0);
            foor.vahetaKollast();
            foor.vahetaPunast();
            count = count ++;
        }
    }
}
*/

