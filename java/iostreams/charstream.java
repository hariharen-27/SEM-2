package iostreams;

import java.io.*;

public class charstream {
   
    public static void main(String[] args) throws IOException {
       
        File inputFile = new File("Z:\\SEM 2\\java\\iostreams\\farrago.txt");
        File outputFile = new File("outagainchar.txt");
       
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
       
        while ((c = in.read()) != -1){
            System.out.println(c);
            out.write(c);
        }
       
        System.out.println("FileReader is used to read a file and FileWriter is used for writing.");
       
        in.close();
        out.close();
        
    }
}

