
package lab3_melvinvargas_richardpadgett;


public class RMexeptions extends Exception{

    public RMexeptions(String message) {
        
        super(message);
    }

    public RMexeptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }
    
}
