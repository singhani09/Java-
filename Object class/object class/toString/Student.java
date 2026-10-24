
class Student{
    char sec;
    String Stdname;
    double fees;
    Student(char sec,String Stdname,double fees){
        this.sec = sec;
        this.Stdname = Stdname;
        this.fees = fees;
    }
    public String toString(){
        return sec + " " + Stdname + " " + fees;

    }
    public static void main(String[] args) {
        Student std1 = new Student('A',"Ani",26000);
        System.out.println(std1);
        
    }
    }

    
