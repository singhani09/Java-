class Cloth{
    String cloCo;
    double co;
    char cloSi;
    Cloth(String cloCo, double co, char cloSi){
        this.cloCo = cloCo;
        this.co = co;
        this.cloSi = cloSi;
    }
    public static void main(String[] args) {
        Cloth c1 = new Cloth("black",2400,'D');
        System.out.println(c1.cloCo);
        System.out.println(c1.co);
        System.out.println(c1.cloSi);

    }
    }
