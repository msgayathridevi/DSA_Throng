import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class stock_span {
    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i:arr) sb.append(i);

        System.out.print(sb+" ");
    }

    public static int[] solve(int[] arr) // arr na price
    {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        st.push(0); // index 0
        span[0]=1; // span of index 0 is 1

        for(int i=1;i<arr.length;i++){
            while(!st.empty() && arr[st.peek()]<= arr[i])
                st.pop();
            if(st.empty())
                span[i]=i+1; // in middle of processing st can be empty
            else
                span[i]=i-st.peek();

            st.push(i);
        }
       
        return span;
    }

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());

        int[] span = solve(arr);
        display(span);
        br.close();

    }
}


// TC : O(N)
// SC : O(N)