import java.util.Scanner;

//temat: drukarnia
public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int ilosc=5;
        boolean wyjscie=false;
        double cena=12.99;
        double suma=0;
        char[] nazwa ={'B','a','r','d','z','o',' ','c','i',
                       'e','k','a','w','a',' ','k','s','i',
                       'a','z','k','a'};
        short[][] iloscWMagazynach = new short[2][3];
        int gdzie;

        for(int i=0; i<3; i++)
        {
            iloscWMagazynach[0][i]=0;
            iloscWMagazynach[1][i]=0;
        }

        do
        {
            System.out.println(".:|Drukarnia|:.");
            System.out.println("Wybierz opcje z menu:");
            System.out.println("1. Wyjscie");
            System.out.println("2. Porozdzielaj ksiazki do magazynow");
            System.out.println("3. Sprawdz stan magazynow i wartosc ksiazek");
            System.out.println("4. Wyswietl tytul ksiazki");

            switch(scanner.nextInt())
            {
                case 1:
                    System.out.println("Wyjscie z programu");
                    wyjscie=true;
                    break;
                case 2:
                    System.out.println("Wpisz wartosc 0 by wyjsc");
                    System.out.println("Podaj odpowiednia [wartosc] aby przydzielic ksiazke do magazynu:");
                    System.out.println("Magazyn 1: Dzial 1[11]; Dzial 2[12] Dzial 3[13]");
                    System.out.println("Magazyn 2: Dzial 1[21]; Dzial 2[22] Dzial 3[23]");


                    do
                    {
                        System.out.println("\nKsiazek pozostalo:"+ilosc);
                        gdzie=scanner.nextInt();

                        if(((gdzie>=11) && (gdzie <=13)) || ((gdzie>=21) && (gdzie <=23)))
                        {
                            iloscWMagazynach[(gdzie/10)-1][(gdzie%10)-1]++;
                            ilosc--;
                            System.out.println("Dodano do magazynu");
                        }
				        else
                        {
                            if(gdzie==0)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("Podaj poprawna wartosc");
                            }
                        }

                    }while(ilosc>0);
                    break;

                case 3:
                    System.out.println("Stan magazynow:");
                    for(int j=0; j<2; j++)
                    {
                        System.out.println("\nMagazyn "+(j+1)+": ");
                        for(int i=0; i<3; i++)
                        {
                            System.out.println("    Dzial "+(i+1)+": "+iloscWMagazynach[j][i] + " ksiazki");
                            suma+=(iloscWMagazynach[j][i]*cena);
                        }
                    }
                    System.out.println("\nKsiazki w sumie sa warte:"+suma+"zl");
                    break;

                case 4:
                    System.out.println("Ksiazka ma tytul: ");
                    for(int i=0; i<22; i++)
                        System.out.print(nazwa[i]);
                    break;
                default:
                    break;
            }
            if(wyjscie==false)
            {
                System.out.println("\nPodaj dowolna wartosc aby kontynuowac");
                scanner.next();
            }
        }while(!wyjscie);

    }

}