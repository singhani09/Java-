interface Sector
{
    double area(int r, int theta);
}

class Sector1
{
    public static void main(String[] args)
    {
        Sector s1 = (int r, int theta) -> {
            double res = 0.5 * r * r * theta;
            return res;
        };
        System.out.println(s1.area(5, 40));
    }
}

//

// interface Sector
// {
//     void area(int r);
// }

// class Sector1
// {
//     public static void main(String[] args)
//     {
//         Sector s1 = (int r) -> {
//             double theta = 90;
//             double res = 0.5 * r * r * theta;
//             System.out.println(res);
//         };
//         s1.area(5);
//     }
// }
//
// interface Sector
// {
//     void area();
// }

// class Sector1
// {
//     public static void main(String[] args)
//     {
//         Sector s1 = () ->
//         {
//             int r = 2;
//             int theta = 60;
//             double res = 0.5 * r * r * theta;
//             System.out.println(res);
//         };
//         s1.area();
//     }
// }
