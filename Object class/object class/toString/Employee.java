class Employee{
    int empId;
    double empSal;
    char empGr;
    Employee(int empId, double empSal,char empGr){
        this.empId = empId;
        this.empSal = empSal;
        this.empGr = empGr;
    }
    public String toString(){
        return empId + " " + empSal + " " + empGr;
    }
    public static void main(String[] args) {
        
    
        Employee e1 = new Employee(23,45000,'B');
        System.out.println(e1);
      

    }
}