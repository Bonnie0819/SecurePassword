public class SecurePassword {
    // instance variable
    private String password;

    // constructor
    public SecurePassword(String password) {
        this.password = password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }


    /* Returns true if password:
       - Is at least 8 characters long
       - Contains at least one uppercase letter
       - Contains at least one lowercase letter
       - Contains at least one numeric digit
       - Contains at least one of these "special symbols":  ! @ # $ % ^ & * ?
       Must satisfy ALL FIVE categories for password to be "secure"
       Return false if any of the above security requirements are not fulfilled.
    */
    public boolean isSecure() {
        return false;
        /* to be implemented */
        // You should first write the six private "helper" methods
        // below and use them as needed in this method’s implementation
    }


    /* Returns a String that contains information about the security status of the
       current password.

       If isSecure() is true, this method returns the string "Password is secure"
       If isSecure() is false, this methods should return a single String that informs the
       user of which security requirements are not currently being met.

       For example, the password 3WrT6tH does not meet length or special symbol
       requirements, so this method should return the following String (using a line
       break \n):

       "The password must be at least 8 characters
        The password must contain a special symbol: ! @ # $ % ^ & * ?"
    */
    public String status() {
        return "";
        /* to be implemented */

        // You should first write the six private "helper" methods
        // below and use them as needed in this method’s implementation
    }



    // PRIVATE "HELPER" METHODS
    //Checks to see if the password is long enough
    private boolean isLongEnough() {
        if(password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }


    // Returns true if the password has at least one uppercase letter and false otherwise.
    private boolean containsUppercase() {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return checkString(upperCaseLetters);  // this method implemented below
    }

    // Returns true if the password has at least one lowercase letter and false otherwise.
    private boolean containsLowercase() {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        return checkString(lowerCaseLetters);   //this method implemented below
    }


    /* Returns true if the password has at least one digit and false otherwise.
     */
    private boolean containsDigit() {
        if(password.indexOf(0) != -1) {
            return true;
        }
        if(password.indexOf(1) != -1) {
            return true;
        }
        if(password.indexOf(2) != -1) {
            return true;
        }
        if(password.indexOf(3) != -1) {
            return true;
        }
        if(password.indexOf(4) != -1) {
            return true;
        }
        if(password.indexOf(5) != -1) {
            return true;
        }
        if(password.indexOf(6) != -1) {
            return true;
        }
        if(password.indexOf(7) != -1) {
            return true;
        }
        if(password.indexOf(8) != -1) {
            return true;
        }
        if(password.indexOf(9) != -1) {
            return true;
        }
        return false;
    }


    /* Returns true if the password has at least one of these special symbols:
       ! @ # $ % ^ & * ?    and false otherwise.
     */
    private boolean containsSpecialSymbol() {
        /* to be implemented */
        return false;
    }

    /* Checks characterString to see if password contains at least one
       character from that string. Returns true if so, false otherwise. */

    private boolean checkString(String characterString) {
        for(int i = 0; i < password.length(); i ++) {
            if(characterString.indexOf(password.substring(i, i + 1)) != -1) {
                return true;
            }
        }
        return false;
    }
}
