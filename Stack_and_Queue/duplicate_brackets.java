import java.util.*;

public class duplicate_brackets {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i=0;i<s.length();i++) {
            char c= s.charAt(i);
            if (c == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    return;
                }
                else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(c);
            }
        }
        System.out.println(false);
        sc.close();
    }

}

// TC : 2*O(N) = O(N)
// SC : O(N) auxiliary space