package CodeWar;

public class RegexValidatePINcode {
    /**ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

     If the function is passed a valid PIN string, return true, else return false.

     Examples (Input --> Output)
     "1234"   -->  true
     "12345"  -->  false
     "a234"   -->  false*/
    public static void main(String[] args) {
        System.out.println(RegexValidatePINcodeSolution.validatePin("1234"));
        System.out.println(RegexValidatePINcodeSolution.validatePin("123456"));
        System.out.println(RegexValidatePINcodeSolution.validatePin("12345"));
        System.out.println(RegexValidatePINcodeSolution.validatePin("12345a"));
    }
}

class RegexValidatePINcodeSolution {
    public static boolean validatePin(String pin) {
        return pin.matches("([0-9]{4}|[0-9]{6})");
    }
}
