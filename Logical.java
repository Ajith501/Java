public class Logical {
    public static void main(String[] args) {
        // String usermail = "ajit@gmail.com";
        // String userPword = "abcd1234";
        // String dbMail = "ajit@gmail.com";
        // String dbPword = "abcd1234";
        // System.out.println( dbMail == usermail);
        // System.out.println(dbPword == userPword);
        // System.out.println( dbPword == userPword && dbMail == usermail);
        //OR operatior
        final int adminId = 10;
       final  int editorId = 15;
       final  int loggeddInUserId = 23; 
       final  int viewId = 11;
        // System.out.prifinalntln( adminId == loggeddInUserId);
        // System.out.println(editorId == loggeddInUserId);
        // System.out.println(adminId == loggeddInUserId || editorId == loggeddInUserId);
        // if(adminId == loggeddInUserId){
        // System.out.println("Welcome Admin");
        // }
        // else if(editorId == loggeddInUserId){
        //     System.out.println("Welcome Editor");
        // }else if (viewId == loggeddInUserId){
        //     System.out.println("You can only view.");
        // }
        // else {
        //     System.out.println("You dont have access");
        // }

        switch (loggeddInUserId) {
            case   adminId:
                System.out.println("Welcome Admin");
                
                break;
            case editorId:
                System.out.println("Welcome Editor");
                break;
            case viewId:
                System.out.println("View Access only");
        
            default:
                System.out.println("You don't have access");
                break;
        }
    }
}
