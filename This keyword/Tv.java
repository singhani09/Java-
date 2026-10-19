class Tv{
    double tCost;
    String tBrand;
    String tTy;
    Tv(double tCost,String tBrand, String tTy){
        this.tCost = tCost;
        this.tBrand = tBrand;
        this.tTy = tTy;
    }
    public static void main(String[] args){
        Tv s1 = new Tv(25000,"Samsung","LED");
        System.out.println(s1.tCost);
        System.out.println(s1.tBrand);
        System.out.println(s1.tTy);

    }
}