import java.io.*;
import java.util.*;

public class example1{
    public static void main(String[] args) throws IOException{
        DataOutputStream out =new DataOutputStream(new FileOutputStream("example1"));
        int size;
        

        Scanner inp=new Scanner(System.in);
        System.out.println("enter size");
        size=inp.nextInt();

         double[] prices=new double[size]; 
        int[] units=new int[size];
        String[] descs=new String[size];

        for(int i=0;i<size;i++){

            prices[i]=inp.nextDouble();
            units[i]=inp.nextInt();
            descs[i]=inp.next();
            

        }

        for (int i = 0; i < size; i ++) {
            out.writeDouble(prices[i]);
            out.writeChar('\t');
            out.writeInt(units[i]);
            out.writeChar('\t');
            out.writeChars(descs[i]);
            out.writeChar('\n');
        }
    

    out.close();

    DataInputStream in =new DataInputStream(new FileInputStream("example1"));
     double price;
        int unit;
        StringBuffer desc;
        double total = 0.0;

        String lineSepString = System.getProperty("line.separator");
        char lineSep = lineSepString.charAt(lineSepString.length()-1);
       
        try {
            while (true) {
                price = in.readDouble();
                in.readChar();       // throws out the tab
                unit = in.readInt();
                in.readChar();       // throws out the tab
                char chr;
                desc = new StringBuffer(20);
                while ((chr = in.readChar()) != lineSep)
                    desc.append(chr);
                System.out.println("You've ordered " +
                        unit + " units of " +
                        desc + " at $" + price);
                total = total + unit * price;
            }
        } catch (EOFException e) {
        }
        System.out.println("For a TOTAL of: $" + total);
        in.close();
    }

}