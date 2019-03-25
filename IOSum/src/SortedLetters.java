import java.util.Arrays;
import java.util.Comparator;

public class SortedLetters {
    public static void main(String[] args) {
        String [] a = {"aaa","bbbb","a","bb"};
        Comparator<String> strLegthCom= new StringComporator();
        Arrays.sort(a, strLegthCom);
        for (String str:a) {
            System.out.println(str);
            
        }

    }
}
