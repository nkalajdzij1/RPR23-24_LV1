package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int x,y;
    Scanner unos=new Scanner(System.in);
    System.out.println("Unesite prvi broj: ");
    x=unos.nextInt();
    System.out.println("Unesite prvi broj: ");
    y=unos.nextInt();
    int k=x+y;
    System.out.println("Zbir dva unesena broja je: "+k);
    }
}
