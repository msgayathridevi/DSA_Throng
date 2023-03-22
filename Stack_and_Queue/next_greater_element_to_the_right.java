import java.util.*;

public class next_greater_element_to_the_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();   
        }

        int[] nge = new int[arr.length];
        Stack< Integer> st = new Stack< >();
        
        nge[arr.length-1]=-1;
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            // less than equal to
            
            // while(st.peek()<=arr[i] && st.size()>0){  // error; cant find y

            while(st.size()> 0 &&  st.peek()<=arr[i] ){
                st.pop();
            };
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();

            st.push(arr[i]);
            
        }
        // for(int i :arr){ 
        //     System.out.print(arr[i]+ " ");
        // }
        sc.close();
      
        
    }
}


// TC : O(N)
// SC : O(N)