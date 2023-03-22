import java.io.*;
import java.util.*;

public class balanced_brackets {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String str = br.readLine();
        
        Stack<Character> st = new Stack<>();
        // not '' 
        char ch='\0'; // else ' ' || '\u0000' || Character.MIN_VALUE
        for(int i =0;i<str.length();i++){
            ch=str.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else {
                if (ch==')'){
                    boolean val = handle_close(st, '(' );
                    if(val==false){
                        System.out.println(false);
                        return;
                    }
                } else if (ch=='}'){
                    boolean val = handle_close(st, '{' );
                    if(val==false){
                        System.out.println(false);
                        return;
                    }
                } else if (ch==']'){
                    boolean val = handle_close(st, '[' );
                    if(val==false){
                        System.out.println(false);
                        return;
                    }
                } else {
                    
                }
            }
        }
        if(st.size()!=0) System.out.println(false);
        else System.out.println(true);

        br.close();

    }

    public static boolean handle_close(Stack<Character> st, char open_br){
        if (st.size()==0) {
            return false;
        }

        /*/
        else if(st.peek()==open_br){ // if stack empty -> peek error
            st.pop();
            return true;
        }
        else 
            return false;
            */

        else if(st.peek()!=open_br){
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }

} 

// TC : 2*O(N) = O(N)
// SC : O(N) auxiliary space
