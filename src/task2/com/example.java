package task2.com;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class example {
    public static  void main(String[] args) throws IOException {
        int bajt;
        try (
                FileInputStream fs=new FileInputStream("test123.txt"))
        { //READ DATA
            do{
                bajt=fs.read();//read from file
                if (bajt!= -1){System.out.print(bajt);}
            }
            while(bajt!= -1);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        catch (IOException e) {
            System.out.println("Error Reading The File");
        }

    }



}
