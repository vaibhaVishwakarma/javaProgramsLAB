import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class duplicateCharDetect{


    static public void main(String... args){
        HashSet<String> mySet = new HashSet<>(); 
        Scanner scnr = new Scanner(System.in);
        String str = scnr.nextLine();
        for(int i = 0 ; i<str.length(); i++ ){
            mySet.add(String.valueOf(str.charAt(i)));
        }

        System.out.println(mySet);




    }

}