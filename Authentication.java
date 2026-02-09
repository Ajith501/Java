public class Authentication {
    
    public static void main(String[] args){
            System.out.println("Hello! World.");
            Authentication authobject = new Authentication();
            authobject.Login();
            authobject.CreateAccount();
            authobject.ResetPassword();

    }
    
    public void Login(){
        System.out.println("Login SUccess");
    }
    public void CreateAccount(){
        System.out.println("Account Created!");
    }
    public void ResetPassword(){
        System.out.println("ResetPassword");
    }
}
