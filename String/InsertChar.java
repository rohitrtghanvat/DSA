package String;
import java.util.*;
public class InsertChar {
    public static String insertin(String s , char c, int pos){
        StringBuilder res = new StringBuilder();

        for(int i=0 ; i<s.length();i++){
            if(i == pos){
                res.append(c);
            }
            res.append(s.charAt(i));
        }
            if(pos >= s.length()){
                res.append(c);
            }
        
        return res.toString();
    }
    public static void main(String args[]){
        String s = "Don't give up";
        char c = 'A';
        int pos = 3;
        System.out.println(insertin(s,c,pos));
    }
}

// mistake i do
// | Situation                              | Fix                                         |
// | -------------------------------------- | ------------------------------------------- |
// | You call it like `InsertChar.method()` | ✅ Make the method `static`                  |
// | You keep method non-static             | ❗ Create an object and call: `obj.method()` |
