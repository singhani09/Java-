class Bike{
    double biCost;
    String biBr;
    String biCo;
    Bike(double biCost,String biBr,String biCo){
        this.biCost = biCost;
        this.biBr = biBr;
        this.biCo = biCo;
    }
    public String toString(){
        return biCost + " " +biBr + " " + biCo;
    }
    public static void main(String[] args) {
        Bike b1 = new Bike(250000,"apache", "orange");
       System.out.println(b1);

    }}
