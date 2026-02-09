public class StringVariables {
    public static void main(String[] args) {
        String userName = "Ajith";
        System.out.println(userName.length());

        String userpPassword = "abcd@12345";
        System.out.println(userpPassword.length());
        // #,@

        System.out.println(userpPassword.contains("@"));

        String UserMail = "   ajith@gmail.com  ";
        System.out.println(UserMail);
        System.out.println(UserMail.length());
        UserMail = UserMail.trim();
        System.out.println(UserMail);
        System.out.println(UserMail.length());

        String firstName = "Ajith";
        String lastName = "Kumar";
        System.out.println(firstName + " " + lastName);
        String fullName = firstName = " " + lastName;
        System.out.println(fullName);

        String orgCouponCode = "FEB50";
        String userCouponCode = "feb50";
         orgCouponCode = orgCouponCode.toLowerCase();
       userCouponCode =  userCouponCode.toLowerCase();
        System.out.println(orgCouponCode == userCouponCode);
        System.out.println(orgCouponCode.equals(userCouponCode));
    }
}
