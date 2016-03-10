package api;
import org.apache.commons.lang3.math.Fraction;

public class Duration {

	private Fraction fraction;
	
    public Duration(int numerator, int denominator) {
    
    	fraction = Fraction.getFraction(numerator, denominator);
        
    }    
    
}
