public class Emailer {
    public static void main(String[] args) {
        //Email 
        // Send Grid
        // AWS SES
        // Flipkart -> PAssword reset email (Subject, body, to email) -> 
        // SendGrid (secret keys) -> ajit@gmail.com -> their server
        // 2 seconds
        // Email -> DB check -> Send password reset email -> OK response -> Error MEssage  


        System.out.println("Email received");
        System.out.println("Check -DB");
        
        System.out.println("please check your email");

        SendGridEmailer sg = new SendGridEmailer();
        Thread th = new Thread(sg);
        th.start();
    }
}
