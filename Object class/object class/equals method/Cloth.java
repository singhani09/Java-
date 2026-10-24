class Cloth{
    String cloCo;
    double co;
    char cloSi;
    Cloth(String cloCo, double co, char cloSi){
        this.cloCo = cloCo;
        this.co = co;
        this.cloSi = cloSi;
    }
    public boolean equals(Object obj){
        Cloth c2 = (Cloth) obj;
        return this.cloCo==c2.cloCo;
    }
    public static void main(String[] args) {
        Cloth c1 = new Cloth("black",2400,'D');
        Cloth c2 = new Cloth("black",2400,'D');
        if(c1.equals(c2)){
            System.err.println("same");
        }else{
            System.err.println("not same");
        }
        
    }
    }
