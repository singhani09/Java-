class Zerodha{
    private int portfolio = 43000;

    public int getportfolio(){
        return portfolio;
    }
    public void setportfolio(int portfolio){
        this.portfolio=portfolio;
    }
}
class Mainclass3{
    public static void main(String[] args){
        Zerodha zero = new Zerodha();
        zero.getportfolio();
        zero.setportfolio(54000);
        System.out.println(zero.getportfolio());

    }
    
}
    

