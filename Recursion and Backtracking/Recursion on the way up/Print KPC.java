import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str,"");
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printKPC(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ss = str.substring(1);
        String cfc = codes[ch-'0'];
        for(int i=0;i<cfc.length();i++){
            char cc = cfc.charAt(i);
            printKPC(ss,ans+cc);
        }
    }

}
