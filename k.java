public class welcome {
    public static void main(String[] args) {
       

        int n = 4;
        int m = 4;
       
  for(int i=1; i<=n; i++){

    // k print
    //Upper part
    for(int j=1; j<=m; j++){
        System.out.print("*");
    }
   //spaces 
   for(int j=1; j<=m-i; j++){
       System.out.print(" ");
   }
   //star
   for(int j=1; j<=4; j++){
    System.out.print("*");
   }
   System.out.println();

    }
    // lower part
    for(int i=n; i>=1; i--){
    //first part
    for(int j=1; j<=m; j++){
        System.out.print("*");
    }
   //spaces 
   for(int j=1; j<=n-i; j++){
       System.out.print(" ");
   }
   //star
   for(int j=1; j<=4; j++){
    System.out.print("*");
   }
   System.out.println();

 }
}
}