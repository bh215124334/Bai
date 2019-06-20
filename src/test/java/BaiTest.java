import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import cn.baiheng.Practice;



public class BaiTest {
    @Test
    public void test(){
        assertEquals(true, new Practice().TestJunit());
//        Assert.assertEquals(true, new Practice().TestJunit());
    }

}
