
package javaexample99linereadwritefromtofile;

import java.io.*;

public class JavaExample99LineReadWriteFromToFile {

    
    public static void main(String[] args) {
        
        String fil = "myFile.txt";
        
        try{
            // ==== Write Part =================================================
            // =================================================================
            FileWriter fw = new FileWriter(fil);
            
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Hi!");
            bw.newLine();
            bw.write("This is my first line.");
            bw.newLine();
            bw.write("bye~~~~~~");
            bw.newLine();
            
            bw.close();
            fw.close();
            
            // ==== Read Part ==================================================
            // =================================================================
            
            FileReader fr = new FileReader(fil);
            
            BufferedReader br = new BufferedReader(fr);
            
            /*
            Reads a line of text. A line is considered to be terminated by
            any one of a line feed ('\n'), a carriage return ('\r'), 
            or a carriage return followed immediately by a linefeed.
            
            Returns:
            A String containing the contents of the line, not including 
            any line-termination characters, or null if the end of the 
            stream has been reached
            */
            String str = br.readLine();
            
            while(str != null)
            {
                System.out.println(str);
                str = br.readLine();
            }
            
            br.close();
            fr.close();
            
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
