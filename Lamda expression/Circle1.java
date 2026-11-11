/*  ---------lamba expression with default method type---------- */
// interface Circle{
//     void area();
// }
// class Circle1{
//     public static void main(String[] args) {
//         Circle c1 = ()->{
//             double pie = 3.14;
//             int r = 5;
//             double res = pie * r * r;
//             System.out.println(res);

        
//     };
//     c1.area();
// }
// }




/*  ---------lamba expression with parameter---------- */
// interface Circle{
//     void area(int r);

// }
// class Circle1{
//     public static void main(String[] args) {
//         Circle c1 = (int r)-> {
//             double pie = 3.14;
//             double res = pie * r * r;
//             System.out.println(res);
//         };
//         c1.area(7);
//     }


/*  ---------lamba expression with return type---------- */
// interface Circle{
//     double area();
// }
// class Circle1{
//     public static void main(String[] args) {
//         Circle c1 = ()-> {
//             int r = 9;
//             double pie = 3.14;
//             double res = pie * r * r;
//             return res;
//         };
//         System.out.println(c1.area());
//     }
// }