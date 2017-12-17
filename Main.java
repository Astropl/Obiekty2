import java.util.Scanner;

public class Main {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Podaj pierwszą liczbę" );
        int a = sc.nextInt ();
        System.out.println ( "Podaj drugą liczbę" );
        int b = sc.nextInt ();
        System.out.println ( "Podaj opercaje" );
        Calculator calculator = new Calculator ();
        int x = a;
        int y = b;

        char wybor;
        wybor = (char) sc.next ().charAt ( 0 );
        Operations operation = Operations.getOperation ( wybor );
        int result = 0;
        switch (operation) {
            case ADD:
                result = calculator.add ( x, y );
                //System.out.println (calculator.add ( 2,8 ));
                break;
            case MINUS:
                result = calculator.minus ( x, y );
                //System.out.println (calculator.minus ( 8,2 ));
                break;
            case MNOZENIE:
                result = calculator.mnozenie ( x, y );
                //System.out.println (ca);
                break;
            case SUBSTRACT:
                result = calculator.substract ( x, y );
                break;
        }
        System.out.println ( "Wynik to: " + result );
    }

}
