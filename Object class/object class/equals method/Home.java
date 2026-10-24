class Home{
    String hoNa;
    double hoCo;
    String hoCol;
    Home(String hoNa,double hoCo,String hoCol){
    this.hoNa = hoNa;
    this.hoCo = hoCo;
    this.hoCol = hoCol;
}
public boolean equals(Object obj){
    Home h2 = (Home) obj;
    return this.hoNa==h2.hoNa;
}
public static void main(String[] args) {
    
    Home h1 = new Home ("om shanti", 40000,"white");
    Home h2 = new Home ("om shanti", 40000,"white");
    if(h1.equals(h2)){
        System.out.println("SAME");
    }else{
        System.out.println("not same");
    }

}
}