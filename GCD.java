import java.util.Scanner;
 public class exercies {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" ");
        if(n>1){
            //find 9th term

            for(int i=2; i<=n; i++){
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a+b;
                a = temp;

            }
            System.out.println();
        }
    }
}