// interface Triangle1{
//     void area();
// }
// class Triangle{
//     public static void main(String[] args) {
//         Triangle1 t1 = ()-> { int b = 5 ;
//             int h = 7;
//             double res = 0.5 * b * h;
//             System.out.println(res);

//         };
//         t1.area();
//     }
// }



// interface Triangle1{
//     void area(int b,int h);
// }
// class Triangle{
//     public static void main(String[] args) {
//         Triangle1 t1 = (int b , int h)-> {
            
//             double res = 0.5 * b * h;
//             System.out.println(res);

//         };
//         t1.area(4,7);
//     }
// }



// interface Triangle1{
//     double area();
// }
// class Triangle{
//     public static void main(String[] args) {
//         Triangle1 t1 = ()-> { int b = 5 ;
//             int h = 7;
//             double res = 0.5 * b * h;
//             return res;

//         };
//         System.out.println(t1.area());
//     }
// }