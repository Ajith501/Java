public class ErrorHandling {
    public static void main(String[] args) {
        
        try{
            String[] emails = {"ajit@gmail.com","john@gmail.com"};
            System.out.println(emails[1]);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            
        }
    }
}
