class School{
    String sName;
    char sGrade;
    double sStre;
    School(String sName,char sGrade,double sStre){
        this.sName = sName;
        this.sGrade = sGrade;
        this.sStre = sStre;

    }
    public static void main(String[] args){
        School s1 =  new School(" de nobili ",'A',5000);
        School s2 =  new School(" de nobili ",'A',5000);
        if(s1.equals(s2)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}