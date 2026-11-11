interface Parallelogram1
{
    void area(int b, int h);
}

class Parallelogram
{
    public static void main(String[] args)
    {
        Parallelogram1 p1 = (int b, int h) -> {
            int res = b * h;
            System.out.println(res);
        };
        p1.area(2, 3);
    }
}
//
// interface Parallelogram
// {
//     int area(int b, int h);
// }

// class para
// {
//     public static void main(String[] args)
//     {
//         Parallelogram p1 = (int b, int h) -> {
//             int res = b * h;
//             return res;
//         };
//         System.out.println(p1.area(8, 9));
//     }
// }

// //

// interface Parallelogram
// {
//     void area();
// }

// class Parallelogram1
// {
//     public static void main(String[] args)
//     {
//         Parallelogram p1 = () ->
//         {
//             int b = 8;
//             int h = 6;
//             int res = b * h;
//             System.out.println(res);
//         };
//         p1.area();
//     }
// }