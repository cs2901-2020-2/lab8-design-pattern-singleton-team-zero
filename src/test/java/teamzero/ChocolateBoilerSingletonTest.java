package teamzero;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Test
public class ChocolateBoilerSingletonTest {
    ChocolateBoilerSingleton test = ChocolateBoilerSingleton.getInstance();

    public void fillTest() throws Exception {
        test.fill();
        boolean result = false;
        if(test.isEmpty() == false && test.isBoiled() == false) {
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "true");
    }

    public void boilTest() throws Exception {
        test.boil();
        boolean result = false;
        if(test.isBoiled() == true) {
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "false");
    }

    public void drainTest() throws Exception {
        test.drain();
        boolean result = false;
        if(test.isBoiled() == false && test.isEmpty() == false) {
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "false");
    }
}
