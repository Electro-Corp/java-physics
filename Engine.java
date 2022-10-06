import assets.Frame;

public class Engine {
    public Engine() {
        init();
    }   

    private void init() {
        // initializes a JFrame with a height of 400px and a width of 400px with the name Physics 
        // Frame can be resized
        Frame frame = new Frame(400, 400, "Physics");
        
    }
}
