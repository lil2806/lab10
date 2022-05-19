package task4.com;
import java.io.*;
public class example {
    String kama57094;
    void ReadDatakama57094() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        kama57094=tv.readLine();
    }
    void WriteDataTokama57094File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(kama57094);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readDataViakama57094File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViakama57094File();
        obj.WriteDataTokama57094File();
        System.out.println();
        obj.ReadDatakama57094();
    }



}
}
