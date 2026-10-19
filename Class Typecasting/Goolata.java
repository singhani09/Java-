class Cool{
    void add(){
        System.err.println("fir fir");
    }
}
    class Goolata extends Cool{
        void dispu(){
            System.out.println("nahh naahh");
        }
        public static void main(String[] args) {
            Cool c1 = new Goolata();
            c1.add();
            Goolata g1 = (Goolata)c1;
            g1.dispu();
        }


    
}