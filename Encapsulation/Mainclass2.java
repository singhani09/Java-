class Instagram{
    private String pwd ="Animesh@27";

        public String getpwd(){
            return pwd;
        }
        public void setpwd(String pwd){
            this.pwd=pwd;
        }

    }
    class Mainclass2{
        public static void main(String[] args) {
            Instagram insta = new Instagram();
            System.out.println(insta.getpwd());
            insta.setpwd("Ani@143");
            System.out.println(insta.getpwd());
            
        }
    }
