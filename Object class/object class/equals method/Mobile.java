class Mobile{
    double mCost;
    String mName;
    String mColour;
    Mobile(double mCost, String mName, String mColour){
       this.mCost = mCost;
       this.mName = mName;
       this.mColour = mColour;
    }
    public boolean equals(Object obj){
        Mobile m2 = (Mobile) obj;
        return this.mColour==m2.mColour;
    }
    public static void main(String[] args) {
   Mobile m1 = new  Mobile(25000,"apple","black");
   Mobile m2 = new  Mobile(25000,"apple","black");
   if(m1.equals(m2)){
    System.out.println("same");
   }else{
    System.out.println("not same");
   }


    }}

