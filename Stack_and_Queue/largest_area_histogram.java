import java.util.*;
public class largest_area_histogram {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int hts[] = new int[n];

    for(int i=0;i<n;i++) hts[i] = sc.nextInt();
    
    Stack<Integer> st = new Stack<>(); // hts
    int lb [] = new int[n]; // hts indices
    // lb[0]=0;
    // st.push(0);
    for(int i=0;i<n;i++){
        while(!st.empty() && hts[st.peek()] >= hts[i])
            st.pop();
        if(st.empty())
            lb[i]=0;
        else    
            lb[i]=st.peek()+1;
        st.push(i);
    }
    
    
    st = new Stack<>(); // clear
    while(!st.empty()) st.pop(); // or clear
    st.clear(); // or clear 
    
    int rb [] = new int[n]; // hts indices 
    // rb[n-1]=n;
    // st.push(n-1);
    for(int i=n-1;i>=0;i--){
        while(!st.empty() && hts[st.peek()] >= hts[i]) // >= only
            st.pop();
        if(st.empty())
            rb[i]=n-1;
        else    
            rb[i]=st.peek()-1;
        st.push(i);
    }
    
    int areaMax=0;
    for(int i=0;i<n;i++){
        int areai = hts[i] * ((lb[i] - rb[i]) + 1);
        areaMax = areai > areaMax ? areai : areaMax;

    }
    System.out.println(areaMax);
}

// TC : O(N)
// SC : O(N)