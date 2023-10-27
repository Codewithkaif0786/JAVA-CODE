public class Recursion2 {

      
   // Qs. Print all the subsequences of a String
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be 
        subsequences(str, idx+1, newString+currChar);

        //or not be 
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
        
    }

}

