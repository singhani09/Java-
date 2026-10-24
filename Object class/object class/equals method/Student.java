class Student{
    char sec;
    String Stdname;
    double fees;
    Student(char sec,String Stdname,double fees){
        this.sec = sec;
        this.Stdname = Stdname;
        this.fees = fees;
    }
    public boolean equals(Object obj){
        Student std2 = (Student) obj;
        return this.sec==std2.sec;
    }
    public static void main(String[] args) {
        Student std1 = new Student('A',"Ani",26000);
        Student std2 = new Student('A',"Ani",26000);
        if(std1.equals(std2)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        }
    }
    

    
