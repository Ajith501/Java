public class Ielse {
    public static void main(String[] args) {
    // String usermail = "ajit@gmail.com";
    // String userPword = "abcd1234";
    // String dbMail = "ajit@gmail.com";
    // String dbPword = "abcd1234";
    // if (usermail == dbMail && userPword == dbPword) {
    //     System.out.println("Login Success");
    // }else{
    //     System.out.println("Invalid login Credentials");
    // }

    int orderValue = 290;
    int minOrderValue = 300;
    if(orderValue > minOrderValue){
        System.out.println("10% Discount LUCKY10");
    }else{
        int diffAmount = minOrderValue - orderValue;
        System.out.println("Add " + diffAmount + " more items to get 10% Discount");
    }
        }
    }

