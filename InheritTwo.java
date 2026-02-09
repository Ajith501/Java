public class InheritTwo extends InheritanceOne{
    public static void main(String[] args) {
        InheritTwo objOne = new InheritTwo();
        objOne.Login();
        objOne.SignUp();
        objOne.ResetPassword();
        System.out.println(objOne.email);
        System.out.println(objOne.password);
        
    }
// InheritanceOne -> Parent Class
// InheritTwo -> is a Child class
    public void ResetPassword(){
        System.out.println("Reset Pasword");
    }
}
