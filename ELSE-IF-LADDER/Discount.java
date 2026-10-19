class Discount{
    public static void main(String[] args) {
        double pur= 2500;
        if (pur >= 5000){
            System.out.println("20% Discount");
        }
        else if (pur>=3000){
            System.out.println("15% Discount");
        }
        else if(pur>=1000){
            System.out.println("10% Discount");
        }
        else{
            System.out.println("no discount");
        }
        }
    
    }
