public class OOPsOne {
    String userEmail = "";
    String userPassword = "";

    //COnstructor method
    public OOPsOne(String inpEmail, String inpPassword){
            userEmail = inpEmail;
            userPassword = inpPassword;
    }
    public static void main(String[] args) {
        
        OOPsOne objone = new OOPsOne("ajit@dbs.com","123456");
        // objone.Login();
        // objone.SignUp();
        // objone.ResetPassword();
        // System.out.println(objone.userEmail);
        // objone.userEmail = "ss@gmail.com";
        // objone.userPassword = "obj 1 password";
        System.out.println(objone.userEmail);
        System.out.println(objone.userPassword);

        OOPsOne objTwo = new OOPsOne("ss@dbs.com","234567");
        // objTwo.userEmail = "as@gmail.com";
        // objTwo.userPassword = "obj 2 password";
        System.out.println(objTwo.userEmail);
        System.out.println(objTwo.userPassword);

    }

    public void Login(){
        System.out.println("Invalid Login Credentials");
    }

    public void SignUp(){
        System.out.println("Account created: please check your email.");
    }

    public void ResetPassword(){
        System.out.println("New password sent to your email.");
    }
}
