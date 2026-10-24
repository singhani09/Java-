class Mobile{
    double mCost;
    String mName;
    String mColour;
    Mobile(double mCost, String mName, String mColour){
       this.mCost = mCost;
       this.mName = mName;
       this.mColour = mColour;
    }
    public String toString(){
        return mCost + " " + mName + " " + mColour;
        
    }
    public static void main(String[] args) {
   Mobile m1 = new  Mobile(25000,"apple","black");
   System.out.println(m1);
   


    }}

