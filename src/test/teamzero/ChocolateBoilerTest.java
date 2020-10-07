package teamzero;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Test
public class ChocolateBoilerTest : extends ChocolateBoiler {
    ChocolateBoiler test = new ChocolateBoiler();

    public void fillTest() throws Exception {
        test.fill();
        boolean result = false;
        if(test.empty == false && test.boiled == false) {
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "true");
    }

    public void boilTest() throws Exception {
        test.boil();
        boolean result = false;
        if(test.boiled == true) {
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "false");
    }

    public void drainTest() throws Exception {
        test.drain();
        boolean result = false;
        if(test.boiled == false && test.empty == false) {
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "false");
    }
}