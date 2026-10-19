class Course{
    String courseNa;
    String uniNa;
    double exCost;
    Course(String courseNa, String uniNa, double exCost){
        this.courseNa = courseNa;
        this.uniNa = uniNa;
        this.exCost = exCost;
    }
    public static void main(String[] args) {
        Course c1 = new Course("jspider","techpy", 5000);
        System.out.println(c1.courseNa);
        System.out.println(c1.uniNa);
        System.out.println(c1.exCost);
    }
}