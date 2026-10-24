class Employee{
    int empId;
    double empSal;
    char empGr;
    Employee(int empId, double empSal,char empGr){
        this.empId = empId;
        this.empSal = empSal;
        this.empGr = empGr;
    }
    public boolean equals(Object obj){
        Employee e2 = (Employee) obj;
        
        
        return this.empId==e2.empId;
        

    }
    
    public static void main(String[] args) {
        
    
        Employee e1 = new Employee(23,45000,'B');
        Employee e2 = new Employee(23,45000,'B');
        if(e1.equals(e2)){
            System.out.println("Same");
        } else{
            System.out.println("not same");
        }
        
      

    }
}



