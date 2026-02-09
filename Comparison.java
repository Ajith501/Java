public class Comparison {
    public static void main(String[] args) {
        String dbMail = "ajit@gmail.com";
        String dbPassword = "abcd@1234";

        String userEmail = "ajit@gmail.com";
        String userpword = "abcd@1234";

        System.out.println(dbMail == userEmail );
        userEmail = "ajit@gmail.co";
        System.out.println(dbMail == userEmail);

        System.out.println(dbPassword == userpword);
        userpword = "asdf";
        System.out.println(dbPassword == userpword);


        int adminID = 15;
        int loggeUserId = 15;
        System.out.println(adminID == loggeUserId);

        // 
        System.out.println(adminID != loggeUserId);

        int viwewingProfileID = 5;
        System.out.println(viwewingProfileID == loggeUserId); // same user
        System.out.println(viwewingProfileID != loggeUserId); // Floow, UNfolllow

        int billAMount = 200;
        int minAMount = 300;
        System.out.println(billAMount > minAMount);
        billAMount = 200 + 100;
        System.out.println(billAMount >= minAMount);
        billAMount = 200;
        System.out.println(billAMount < minAMount);
    }
}
