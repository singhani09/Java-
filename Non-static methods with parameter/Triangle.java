class Triangle{
     void area( double base, double height){
        double area = 0.5 * base* height;
        System.out.println(area);

    }
    public static void main(String[] args) {
        new Triangle().area(4,5);
        
    }
    
}

