import java.util.Random;
import java.util.Scanner;


public class zahlenraten {
    public static void main(String[] args) {
        
        
        //Variabeln deklarieren / 
        Scanner scanner = new Scanner(System.in);
        
        Random zufallZahl = new Random();
        int geheimzahl = 0;
        
        boolean zahlErraten = false;
        int benutzerEingabe = 1;
        String erneutSpielen = "y";
        int anzVersuche = 0;
        
        //Schleife, solange Benutzer spielen möchte
        do {
            geheimzahl = zufallZahl.nextInt(100 + 1) + 1;
            System.out.print("Es wurde eine zufällige Zahl zwischen 1 und 100 kreiert.\nErraten Sie die Zahl: ");
            zahlErraten = false;
            while(zahlErraten == false) {
                try {
                    anzVersuche++;
            
                   benutzerEingabe = Integer.parseInt(scanner.nextLine());
                    //Vergleichen der Geheimzahl mit der geratenen Zahl
                    if (benutzerEingabe > geheimzahl) {
                        System.out.println("Ihre Eingabe ist grösser als die Geheimzahl");
                    }
                    else if (benutzerEingabe < geheimzahl) {
                        System.out.println("Ihre Eingabe ist kleiner als die Geheimzahl");
                    }
                    else if (benutzerEingabe == geheimzahl) {
                        System.out.println("Sie haben die Geheimzahl erraten!\nDazu haben Sie " + anzVersuche + " Versuche benötigt."
                                + "\nWenn Sie erneut spielen möchten, geben Sie 'y' ein.");
                        erneutSpielen = scanner.nextLine();
                        anzVersuche = 0;
                        zahlErraten = true;
                   }
                //Fehlermeldung
                } catch (Exception e) {
                    System.out.println("Ihre Eingabe ist ungültig!");
                    anzVersuche--;
                }
            }
        } while (erneutSpielen.equals("y"));
        scanner.close();
    } 
}
