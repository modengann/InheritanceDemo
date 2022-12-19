import javadraw.*;

public class App extends Window{
    boolean up, down, left, right = false;
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        // Hero hero = new Hero(screen, 400, 300, 20, 20);

        while(true){
            //constantly calls the move method
            // move(hero);
            screen.update();
            screen.sleep(1/30.0);
        }

    }

    public void keyDown(Key key){
        if(key == Key.UP){
            up = true;
        }
        if(key == Key.DOWN){
            down = true;
        }
        if(key == Key.LEFT){
            left = true;
        }
        if(key == Key.RIGHT){
            right = true;
        }
    }
    
    //When up/down/left/right is released, boolean equivalent is set to false
    public void keyUp(Key key){
        if(key == Key.UP){
            up = false;
        }
        if(key == Key.DOWN){
            down = false;
        }
        if(key == Key.LEFT){
            left = false;
        }
        if(key == Key.RIGHT){
            right = false;
        }

    }
}
