package teamzero;
import java.util.logging.Logger;

public class ChocolateBoilerSingleton extends ChocolateBoiler {
    private static ChocolateBoilerSingleton instance;
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
}
