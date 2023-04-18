package iostreams;

import java.io.*;

public class iostream {
   
    public static void main(String[] args) throws IOException {
       
        File inputFile = new File("Z:\\SEM 2\\java\\iostreams\\farrago.txt");
        File outputFile = new File("outagain.txt");
       
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;
       
        while ((c = in.read()) != -1){
            System.out.println(c);
            out.write(c);
        }
       
        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");
       
        in.close();
        out.close();
    }
}

