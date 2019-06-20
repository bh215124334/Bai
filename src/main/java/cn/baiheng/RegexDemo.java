package cn.baiheng;
import javax.print.DocFlavor;
import java.awt.peer.SystemTrayPeer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {
    private static String REGEX = "a*b*c";
    private static String INPUT = "abcdacfbce";
    private static String REPLACE = "_";

    public static void main(String[] args){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        StringBuffer s = new StringBuffer();

        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);

    }

}
