// interface Triangle{
//     void area();
// }
// class Triangle1{
//     public static void main(String[] args) {
        
    
//     Triangle t1 = ()->{
//         int b = 5;
//         int h = 3;
//         double res = b*h;
//         System.out.println(res);
//     };
//     t1.area();
// }
// }

// with return type

// interface Triangle{
//     double area();
// }
// class Triangle1{
//     public static void main(String[] args) {
        
    
//     Triangle t1 = ()->{
//         int b = 5;
//         int h = 3;
//         int res = b*h;
//         return res;
//     };
//    System.out.println(t1.area());
// }
// }



// with parameter

interface Triangle{
    void area(int a , int b);
}
class Triangle1{
    public static void main(String[] args) {
        
    
    Triangle t1 = (int a , int b)->{
       
        int res = a*b;
        System.out.println(res);
    };
   t1.area(5,7);
}
}

