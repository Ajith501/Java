public class VideoActions implements VideoActionINterface {
    public static void main(String[] args) {
        System.out.println("Video Funtions");
        VideoActions vaobj = new VideoActions();
        vaobj.Like(); // Method actions
        vaobj.Dislike();
        // Authentication auth = new Authentication();
        // auth.Login();
        // Cart  cart = new Cart();
        // cart.AddToCart();

        
    }
    public void Like(){
        System.out.println("Video Liked " + VideoCategory.MUSIC);
    }
    public void Dislike(){
        System.out.println("Video Disliked");
    }
    
    public void Download() {
        // TODO Auto-generated method stub
        System.out.println("Download is in PRogress");
    }
    
    public void Save() {
        // TODO Auto-generated method stub
        System.out.println("Video saved to your playlist.");
    }
    
    public void Report() {
        // TODO Auto-generated method stub
        System.out.println("Your action has been saved.");
    }
    
    public void Clip() {
        // TODO Auto-generated method stub
        System.out.println("You clicked the video");
    }
}
