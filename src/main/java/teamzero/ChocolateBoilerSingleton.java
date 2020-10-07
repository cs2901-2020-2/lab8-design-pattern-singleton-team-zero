package teamzero;
import java.util.logging.Logger;

public class ChocolateBoilerSingleton {
    private static ChocolateBoilerSingleton instance;
    private boolean empty;
    private boolean boiled;
    static final Logger logger = Logger.getLogger(ChocolateBoilerSingleton.class.getName());

    private ChocolateBoilerSingleton(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance() {
        if (instance == null){
            instance = new ChocolateBoilerSingleton();
            logger.info("Instance Created");
        }else{
            logger.info("Already instance exist");
        }
        return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
