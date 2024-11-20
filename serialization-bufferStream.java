import java.io.*;
import java.util.*;

//Sample Input 
// E
// -----------
// Sample OutPUT
// recieved data: 14
// passed hex value: E
// Default object value: 10000
// Un - serialized object value as passed : 14
// -----------

class Main implements Serializable{
    int m = 10000;
    
    public static void main(String[] arg)throws IOException,ClassNotFoundException{
        BufferedReader rd = new BufferedReader( new InputStreamReader(System.in));
        byte b = Byte.parseByte(rd.readLine(),16);
        System.out.println("recieved data: "+b);
        System.out.println("passed hex value: "+Integer.toString(b,16).toUpperCase());
        
        
        Main obj = new Main();
        obj.m = b;
        
        
        String path = "obj.ser";
        ObjectOutputStream outs = new ObjectOutputStream( new FileOutputStream(path));
        outs.writeObject(obj);
        outs.close();
        
        ObjectInputStream ins = new ObjectInputStream(new FileInputStream(path));
        Main newObj = (Main)ins.readObject();
        ins.close();
        System.out.println("Default object value: "+ new Main().m);
        System.out.println("Un - serialized object value as passed : "+newObj.m);
        
    }
    
    
}
