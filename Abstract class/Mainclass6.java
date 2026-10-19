abstract class Sector{
    abstract void Sec();
}
class Mac extends Sector{
    void Sec(){
        double r = 8.5;
        double theta = Math.PI/2;
        System.out.println(0.5*r*r*theta);
    }
}
class Mainclass6{
    public static void main(String[] args) {
        Mac m1 = new Mac();
        m1.Sec();
    }
}