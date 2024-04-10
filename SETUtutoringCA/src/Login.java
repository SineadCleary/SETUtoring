public class Login {
    public String verify(User user, String email, String password){

        if(user.getEmail() == email) {
            if(user.getPassword() == password){
                return "Login Successful";
            }
            return "Incorrect Password";
        }
        return "Unknown user";
    }

}
