public class Main {
    public static void main(String[] args) {
        //Password Validation
        //1. Password MUST be at least 8 characters
        //2. Password should at least contain one uppercase letter 3. Password should at least contain one lowercase letter 4. Password should at least contain one special characters 5. Password should at least contain a digit
        //if all requirements above are met, the password is valid, if not all are met it is invalid

        String password = "a?G6jdsaja";
        boolean length = password.length() >= 8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean special = password.matches(".*[!@#$%^&*()_+].*");
        boolean digit = password.matches(".*[0-9].*");
         boolean valid = length && lower && upper && special && digit;
         if (valid){
             System.out.println("Valid Password");
            }else{
             System.out.println("Invalid Password");
            }

}
}