package OOP;

public class Main {

    public static void main(String[] args){

        // Object creation
        Student stud1 = new Student();
        // System.out.println(stud1.name);
        
        // Declare reference to the object
        Student g3;
        // Allocate a Student object
        g3 = new Student();

        // System.out.println(g3); // some random hash value      
        
        /* 
        g3.roll_no = 13;
        g3.name = "Gayathri Devi";
        // default it is double, so put f at the end of the value to tell compiler treat the value as float
        // g3.mark = 89.5f; 
        
        System.out.println(g3.roll_no); // default 0
        System.out.println(g3.name); 
        System.out.println(g3.mark); 
        */

        // g3.greeting();
        // g3.changeName("binge-watcher");
        // g3.greeting();

        /*
        Student dv = new Student(12,"Devi",98);
        // System.out.println(dv.roll_no); // default 0
        // System.out.println(dv.name); 
        // System.out.println(dv.mark);
         */

        /*
        // call other object in the constructor -> Student(other)
        Student dv = new Student(12,"Devi",98);
        System.out.println(random.name); 
         */
        

         /*
        // constructor from constructor  
        g3.greeting();
        System.out.println(g3.mark);
         */

         /*
        Student one = new Student();
        Student two = one;

        one.name = "blabla";
        System.out.println(two.name); // blabla
         */
    }

}

// Create a class - a template
class Student{
    String name; // default null -> object non-primitive
    int roll_no;
    float mark = 50;
    
    // we need a way to add the values of the above properties object by object
    // it cannot be done for each obj each default constructor separately like in one constructor g3.roll=  NO
    
    // we need one word to access every object
    // 'this' keyword

    /*
    // no return type, type of the class is itself a return type
    Student(){
        // when reference variable/obj g3 created,
        // this is replaced with g3, likewise for all obj creation
        this.roll_no = 13;
        this.name = "Gayathri Devi";
    } 
    */
    
    /*
    // no 2 default constructor allowed 
    Student(){
        this.mark = 30;
        this.name = "2 default constructor";
    }
     */

    Student(){
        // this is how to call a constructor from another constructor
        // calls params constructor
        // internally it is new Student(13,"Cons_Cons",100f)
        this (13,"Cons_Cons",100f);
    }
    
    Student (Student other) {
        // replace this -> random; other -> g3
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.mark = other.mark;
    }

    Student(int roll_no, String name, float markkkk){
        // default values
        // b'coz the constr variable roll_no is taken as this class variable roll_no
        // roll_no = roll_no;
        // name = name;
        // mark = mark;

        // parameters in the obj (roll_no differs from the constructor roll_no value)
        // even if diff variable name no issues
        // convention put same variable name using this keyword (not operator)
        this.roll_no = roll_no;
        this.name = name;
        this.mark = markkkk; // no iss
    }

    void greeting(){
        // System.out.println("My name is : " + name);
        System.out.println("My name is : " + this.name); // better approach though same results
    }

    void changeName(String newName){
        // name = newName;
        this.name = newName; // good convention to specify to avoid confusion
    }


}
