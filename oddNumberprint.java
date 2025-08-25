package loops;

public class oddNumberprint {
    public static void main(String[] args) {
        System.out.println("All odd no. are : ");
        //100 rounds
//        for(int i=1;i<=100;i++){
//           if(i%2!=0) System.out.print(i+" ");
//        }
//      50 iterations
//        for(int i=1;i<=100;i+=2){
//            if(i%2!=0) System.out.print(i+" ");
//        }


        for(int i=1;i<=100;i++){
            if(i%2==0) {
                continue;
            }
                System.out.print(i+" ");
        }
    }
}
