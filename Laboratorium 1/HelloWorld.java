import java.util.Scanner;

public class HelloWorld
{

    public static void main(String[] args)
    {
        String imie; 
	
	System.out.println("Podaj imie:");
	
      	Scanner odczyt = new Scanner(System.in); 
 
      	imie = odczyt.nextLine();
 	
        System.out.println("Hello World \nWitaj "+imie);
    }

}