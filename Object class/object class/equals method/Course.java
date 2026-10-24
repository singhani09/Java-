class Course{
    String courseNa;
    String uniNa;
    double exCost;
    Course(String courseNa, String uniNa, double exCost){
        this.courseNa = courseNa;
        this.uniNa = uniNa;
        this.exCost = exCost;
    }
    public boolean equals(Object obj){
        Course c2 = (Course) obj;
        return this.courseNa==c2.courseNa;
    }
    public static void main(String[] args) {
        Course c1 = new Course("jspider","techpy", 5000);
        Course c2 = new Course("jspider","techpy", 5000);
        if(c1.equals(c2)){
            System.out.println("same");
        } else{
            System.out.println("not same");
        }
}
}