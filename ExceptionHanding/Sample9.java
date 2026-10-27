
// try and finally block
public class Sample9 {
    public static void main(String[] args){
        System.out.println("main starts");
        try{
            int i = 1/0;
        }
        finally{
            System.out.println("hey i am finally block");
        }
        System.out.println("Main ends");


    }
    

}
