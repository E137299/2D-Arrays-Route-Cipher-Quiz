import java.beans.Transient;

import org.junit.*;

public class MainTest{
    @Test
    public void testFillBlock1(){
        RouteCipher test = new RouteCipher(4,4);
        test.fillBlock("MEET AT MIDNIGHT");
        String result = test.encryptBlock();
        Assert.assertEquals(result, "M MIEAIGETDHT NT");
    }

    @Test
    public void testFillBlock2(){
        RouteCipher test = new RouteCipher(3, 2);
        test.fillBlock("MOON");
        String result = test.encryptBlock();
        Assert.assertEquals(result, "MOAONA");
    }

    @Test 
    public void testEncryptMessage1(){
        RouteCipher test = new RouteCipher(2, 3);
        String result = test.encryptMessage("Meet at midnight");
        Assert.assertEquals(result, "Mte eati dmnitgAhA");
    }

    @Test 
    public void testEncryptMessage2(){
        RouteCipher test = new RouteCipher(2, 2);
        String result = test.encryptMessage("Go Maroons");
        Assert.assertEquals(result, "G oMaoronAsA");
    }
}