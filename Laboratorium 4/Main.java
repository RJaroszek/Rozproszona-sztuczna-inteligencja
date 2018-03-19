import java.util.Scanner;
import java.util.InputMismatchException; //do wyjatku

//drukarnia
public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int ilosc;
        int pokaz;

        Ksiazka k[] = new Ksiazka[2];
        Gazeta g[] = new Gazeta[2];
        k[0]= new Ksiazka("Ciekawa ksiazka", "Ciekawy Autor", 39.99, 10,
                    "Ciekawe wydawnictwo");
        k[1]= new Ksiazka("Nieciekawa ksiazka", "Nieciekawy Autor", 19.99, 10,
                "Ciekawe wydawnictwo");

        g[0] = new Gazeta("Nudny tygodnik", 20, 3.70, 200,
                    "Nieciekawe wydawnictwo");
        g[1] = new Gazeta("Programuj z nami!", 2, 13.99, 500,
                "TutajNieMaWydawnictwa");

        Kalendarz kal1 = new Kalendarz("Strazacki", "Strazacy", 2.99, 500,
                            2020);
        Inne plakat = new Inne(10.00, 1, "Plakat z kotem", 50,100);

        System.out.println("\nKtore ksiazki chcesz drukowac?");
        try
        {
            pokaz = scanner.nextInt();
            System.out.println("Ile ksiazek wydrukowac?");

            ilosc = scanner.nextInt();
            k[pokaz].drukuj(ilosc);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Tablica z ksiazkami nie ma az tylu elementow!");
        }


        System.out.println("\nKtore gazety chcesz drukowac?");
        try
        {
            pokaz = scanner.nextInt();
            System.out.println("Ile gazet wydrukowac?");

            ilosc = scanner.nextInt();
            g[pokaz].drukuj(ilosc);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Tablica z gazetami nie ma az tylu elementow!");
        }
        finally
        {
            System.out.println("Koniec obslugi wyjatkow dla gazet");
        }


        System.out.println("\nPodaj nowa ilosc plakatow:");
        ilosc = scanner.nextInt();
        try
        {
            plakat.nowaIlosc(ilosc);
        }
        catch (Exception e)
        {
            System.out.println("Blad: "+e);
        }

    }
}
