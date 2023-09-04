int n = 4;
//upper
for(int i=1; i<=n; i++){
  package solutions;


public class Solutions {

    
    public static void main(String[] args) { 

 //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
        
    }
    // stars
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    } 
    System.out.println("");
}
//Lower
for(int i=n; i>=1; i--){
    //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
        
    }
    // stars
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    } 
    System.out.println("");
}

    }
}