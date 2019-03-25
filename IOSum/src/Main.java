import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("numbers1.txt"));
       String line;
       int sum = 0;
       while ((line = br.readLine())!= null){
           try{
               sum+= Integer.parseInt(line);
           }
           catch (Exception ex){

           }
       } System.out.println("sum = " + sum);

       try(BufferedReader br1 = new BufferedReader(new FileReader("numbers1.txt"))){
           System.out.println("Sum  " + sumUp(br1));
       }catch (Exception ex){

       }


    }
    public static int sumUp(BufferedReader br){
        return br.lines().filter(s -> isDigit(s)).mapToInt(Integer::parseInt).sum();
    }
    public static boolean isDigit(String s){
        try{
            Integer.parseInt(s);
        }catch (Exception ex){
            return false;
        }return true;
    }

}
