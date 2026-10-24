class Cloth{
    String cloCo;
    double co;
    char cloSi;
    Cloth(String cloCo, double co, char cloSi){
        this.cloCo = cloCo;
        this.co = co;
        this.cloSi = cloSi;
    }
    public String toString(){
        return cloCo + " " + co + " " + cloSi;
    }
    public static void main(String[] args) {
        Cloth c1 = new Cloth("black",2400,'D');
        System.out.println(c1);
       

    }
    }
