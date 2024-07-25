import java.util.Arrays;
class convStrChar{
    static public void main(String... args){
        String s = "abc";
        char c = s.charAt(1); // <- assigns c = b
        System.out.println(c);       

        char tostr = 't';
        s = String.valueOf(tostr);
        System.out.println(Integer.valueOf(tostr));    
    }   
}