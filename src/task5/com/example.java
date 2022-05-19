package task5.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
public class example {

    public static void main(String []args) throws IOException {
        System.out.println("Please enter the first three numbers of your credit card");
        BufferedReader tf = new BufferedReader(new InputStreamReader(System.in));
        String digits= tf.readLine();
        URL url = new URL("https://=lilian kamanzi@.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("please wait ...Searching ...");
            while((line= br.readLine())!=null){

                String[] words=line.split("\\t+");
                String bankNumberkama57094=words[0].trim();
                String bankNamekama57094=words[1].trim();
                if(bankNumberkama57094.equals(digits)){
                    System.out.println("successful ");
                    System.out.println("Bank numerals : " +bankNumberkama57094 + "\nBank Name : " +bankNamekama57094);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Information successful");
        }

    }



}
