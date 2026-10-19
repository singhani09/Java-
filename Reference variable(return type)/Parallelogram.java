class Parallelogram{
    double area(){
        double base = 21;
        double height = 23 ;
        double areaParallelogram = base * height;
        return areaParallelogram;
    }
    public static void main (String[]args){
        Parallelogram p1 = new Parallelogram();
        double x = p1.area();
        System.out.println(x);

    }
        
    }
