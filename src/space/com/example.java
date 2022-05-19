package space.com;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class example {
    public static void main(String[] args) {
        int Textint;
        try (FileInputStream Ts=new FileInputStream("test123.txt");FileOutputStream fot = new FileOutputStream("newtest.txt")){
            do {
                Textint = Ts.read();//read from user
                if ((char)Textint==' '){
                    Textint='-';
                }
                if (        Textint != -1) {

                    fot.write(Textint);
                }
            }
            while (Textint != -1);
            System.out.println("Successfully copied");
        }
        catch (FileNotFoundException e) {e.printStackTrace();}

        catch (IOException e) {
            e.printStackTrace();
        }
    }



}
