class Home{
    String hoNa;
    double hoCo;
    String hoCol;
    Home(String hoNa,double hoCo,String hoCol){
    this.hoNa = hoNa;
    this.hoCo = hoCo;
    this.hoCol = hoCol;
}
public static void main(String[] args) {
    
    Home h1 = new Home ("om shanti", 40000,"white");
    System.out.println(h1.hoNa);
    System.err.println(h1.hoCo);
    System.out.println(h1.hoCol);

}
}