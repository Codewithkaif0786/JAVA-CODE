import java.util.ArrayList;
public class Recursion3 {
    
    //Qs. Place Tiles of size 1*m in a floor of size n*m
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        //vertically 
        int vertPlacement = placeTiles(n-m, m);

        //horzontally
        int horzPlacement = placeTiles(n-1, m);

        return vertPlacement + horzPlacement;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
        
    }

}
