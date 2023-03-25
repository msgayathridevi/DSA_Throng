package OOP;

public class Wrapper_example {
    public static void main(String[] args) {
        // 'a' is primitive
        int a = 10;
        int b = 20;

        // noneed just Integer num = 45; suffice
        // num is object, has so many functions
        Integer num = new Integer(45);  
        System.out.println(num);
        
        swap(a,b);
        
        // java has no pass by reference only pass by value
        // won't swap
        // System.out.println(a + " " + b);
        
        // no same variable name though diff dtype
        // char a;

        // pass by reference value
        // still won't swap --> b'coz Integer is a final class
        Integer x = 20, y = 100;
        swap(x,y);
        System.out.println(x + " " + y);

        final int bb = 300;
        // bb = 500;

        
        final A g3 = new A("Gayathri Devi");
        g3.name = "other name"; // changing values is allowed
        System.out.println(g3.name);
        // when a non-primitive is final, you cannot re-assign it
        // g3 = new A("new object"); // error; it points to the smae object
        System.out.println(g3.name);

        
        // for finalize method
        A obj;
        for(int i=0;i<1000000000;i++){ // for less # it won't call GC - Garbage Collector
            obj = new A("Random name");
        }
        // error cannot call manually
        // obj.finalize();

    }

    static void swap (int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    static void swap (Integer a, Integer b) {
        // int or Integer t no prob
        int t = a;
        a = b;
        b = t;
    }

    
}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    // any object of class A is freed from memory then this finalize method will be called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed!");
    }
}