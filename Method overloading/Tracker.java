class Tracker {

    public  static void studentId(String name, int rollNo){

        System.out.println("Name: " + name + ", Roll-No: " + rollNo);
    }
    public static void studentId(int rollNo, String name){
        
        System.out.println("Roll-No: " + rollNo+ ", Name: " + name);
    }
    public static void studentId(String hobby){
        System.out.println("Mine hobby is " + hobby);
    }

    
    public static void main(String[] args){
        studentId("Ani",1200);
        studentId(1200,"Ani");
        studentId("singing");
       
    }
}