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
        System.out.println(s1.sName);
        System.out.println(s1.sGrade);
        System.out.println(s1.sStre);
    }
}