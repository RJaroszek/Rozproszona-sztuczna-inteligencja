import java.util.Scanner;

//drukarnia
public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int ilosc;

        Ksiazka k1 = new Ksiazka("Ciekawa ksiazka", "Ciekawy Autor", 39.99, 10,
                    "Ciekawe wydawnictwo");
        Gazeta g1 = new Gazeta("Nudny tygodnik", 20, 3.70, 200,
                    "Nieciekawe wydawnictwo");
        Kalendarz kal1 = new Kalendarz("Strazacki", "Strazacy", 2.99, 500,
                            2020);
        Inne plakat = new Inne(10.00, 1, "Plakat z kotem", 50,100);

        System.out.println("\nIle ksiazek wydrukowac?");
        ilosc = scanner.nextInt();
        k1.drukuj(ilosc);

        System.out.println("\nIle gazet wydrukowac?");
        ilosc = scanner.nextInt();
        g1.drukuj(ilosc);

        System.out.println("\nEdycja plakatu");
        plakat.edytuj();

        System.out.println("\nNowy plakat:");
        System.out.println("Cena: "+plakat.cena);
        System.out.println("Ilosc: "+plakat.ilosc);
        System.out.println("Opis: "+plakat.opis);
        System.out.println("Wymiary:"+plakat.wymiarX+"x"+plakat.wymiarY+" cm.");

    }
}
