package notused;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbcToken {

	String tokenValue;
	Enums.AbcTypes tokenType;
	
    /**
     * Constructor method of a AbcToken
     * @param abcToken - An AbcToken Value
     * @throws IllegalArgumentException thrown if the the AbcToken is improperly formatted
     */
    public AbcToken(String abcToken) throws IllegalArgumentException{
        
        this.tokenValue = abcToken;
        //check for token type and assign appropriately
        for(Enums.AbcTypes abcType : Enums.AbcTypes.values()) {
        	
            Matcher abcTypeChecker = Pattern.compile(abcType.regexPattern).matcher(abcToken); 
            if(abcTypeChecker.matches())
            {
                this.tokenType = abcType;
                break;
            }
        }
        
        if(this.tokenType == null)
        {
        	String exception = String.format("Invalid Abc Toke found: %s", abcToken);
        	throw new IllegalArgumentException(exception);
        }
    }	
	
}
