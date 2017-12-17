import com.sun.corba.se.spi.orb.Operation;
import org.omg.CORBA.UNKNOWN;

public class Calculator {


    public int add ( int x, int y ) {
        return x + y;
    }

    public int minus ( int x, int y ) {
        return x - y;
    }

    public int mnozenie ( int x, int y ) {
        return x * y;
    }

    public int substract ( int x, int y ) {
        //if (y == 0) {
        System.out.println ( "!!! Pamiętaj że, nie dzielimy przez zero!!!" );
        //return;
        //} else
        return x / y;

    }
}