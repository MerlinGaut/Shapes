package postalcode;

public class WonderlandPostalCode extends PostalCode {
    
    public WonderlandPostalCode(String code) throws PostalCodeException {
        super(code);
    }

    public void validate() throws PostalCodeException {
        String postCode = getCode();

        boolean twoLettersThenSpace =
            Character.isLetter(postCode.charAt(0)) &&
            Character.isLetter(postCode.charAt(1)) &&
            Character.isSpaceChar(postCode.charAt(2));

        boolean oneLetterThenSpace =
            Character.isLetter(postCode.charAt(0)) &&
            Character.isSpaceChar(postCode.charAt(1));

        if (!(twoLettersThenSpace || oneLetterThenSpace)) {
            throw new PostalCodeException("Invalid Wonderland postal code format.");
        }
        if (twoLettersThenSpace && (Character.isDigit(postCode.charAt(3)) || Character.isDigit(postCode.charAt(4)))) {
            // Valid format
        } else {
            throw new PostalCodeException("Invalid Wonderland postal code format.");
        }
        if (oneLetterThenSpace && (Character.isDigit(postCode.charAt(2)) || Character.isDigit(postCode.charAt(3)))) {
            // Valid format
        } else {
            throw new PostalCodeException("Invalid Wonderland postal code format.");
        }
    }
    public String getCountry() {
        return "Wonderland";
    }
}
