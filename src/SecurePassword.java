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


    // Returns true if password meets all of the requirements
    public boolean isSecure() {
        if(isLongEnough() && containsLowercase() && containsUppercase() && containsDigit() &&
        containsSpecialSymbol()) {
            return true;
        } else {
            return false;
        }
    }

    /* Returns a String that contains information about the security status of the
       current password. */


    public String status() {
        String conditions = "";
        if(isSecure()) {
            conditions += "Password is secure";
        }else {
            if (!isLongEnough()) {
                conditions += "The password must be at least 8 characters \n";
            }
            if (!containsLowercase()) {
                conditions += "The password must contain at least one lower case character \n";
            }
            if (!containsUppercase()) {
                conditions += "The password must contain at least one upper case character \n";
            }
            if (!containsDigit()) {
                conditions += "The password must contain at least one digit \n";
            }
            if (!containsSpecialSymbol()) {
                conditions += "The password must contain a special symbol: ! @ # $ % ^ & * ? \n";
            }
        }
            return conditions;
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
        } else if(password.indexOf("1") != -1) {
            return true;
        } else if(password.indexOf("2") != -1) {
            return true;
        } else if(password.indexOf("3") != -1) {
            return true;
        } else if(password.indexOf("4") != -1) {
            return true;
        } else if(password.indexOf("5") != -1) {
            return true;
        } else if(password.indexOf("6") != -1) {
            return true;
        } else if(password.indexOf("7") != -1) {
            return true;
        } else if(password.indexOf("8") != -1) {
            return true;
        } else if(password.indexOf("9") != -1) {
            return true;
        } else {
            return false;
        }
    }


    /* Returns true if the password has at least one of these special symbols:
       ! @ # $ % ^ & * ?    and false otherwise. */
    private boolean containsSpecialSymbol() {
        if(password.indexOf("!") != -1) {
            return true;
        }
        if(password.indexOf("@") != -1) {
            return true;
        }
        if(password.indexOf("#") != -1) {
            return true;
        }
        if(password.indexOf("$") != -1) {
            return true;
        }
        if(password.indexOf("%") != -1) {
            return true;
        }
        if(password.indexOf("^") != -1) {
            return true;
        }
        if(password.indexOf("&") != -1) {
            return true;
        }
        if(password.indexOf("*") != -1) {
            return true;
        }
        if(password.indexOf("?") != -1) {
            return true;
        }
        if(password.indexOf(8) != -1) {
            return true;
        }
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
