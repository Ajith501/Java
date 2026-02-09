public class WhileLoop {
    public static void main(String[] args) {
        // int[] price = {20000,60000,45000,12000,550000};
        // boolean moreThanFifty = false;

        // int i = 0;
        // while (moreThanFifty == false) {
        //     if(price[i] > 50000){
        //         moreThanFifty = true;
        //         System.out.println("Found more than 50,0000 at index "+ i);
        //     }
        //     i++;
        // }
        String[] emails = {"aj@gmail.com","ss@gmail.com"};
        boolean isEmailSent = false;
        int index = 0;
        while (isEmailSent == false) {
            if (emails[index] == "ss@gmail.com") {
                System.out.println("Email sent to "+ emails[index]);
                isEmailSent = true;
            }
            index++;
        }
    }
}
