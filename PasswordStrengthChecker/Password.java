public class Password {

    String checkPassword(String password) {

        if (password.length() >= 8) {
            return "Strong Password";
        } else {
            return "Weak Password";
        }
    }
}
