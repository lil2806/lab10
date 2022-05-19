package modify.com;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class example {

    public static void main(String[] args) throws IOException {

        FileInputStream fis;
        int bajt;
        try{
            fis=new FileInputStream("test123.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }



        //read bytes until EOF encountered
        try{
            do{
                bajt=fis.read();//read from file
                if (bajt!= -1){System.out.print((char)bajt);}
            }
            while(bajt!= -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
        finally {
            try{
                fis.close();
                System.out.println("File Closed");
            }
            catch (IOException e) {
                System.out.println("Error Closing ile");
            }
        }



    }
}


