class Sam2{
    static void print(int s, int e){
        for(int i = s; i<=e; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = s ; i<= e/2; i++){
            System.out.print( i + "  ");
        }
        System.out.println();
        for(int i = e/2; i >= s; i--){
            System.out.print( i+ " ");
        }
    }
            public static void main(String[] args){
                print (1,6);
            

            }
        }


    
