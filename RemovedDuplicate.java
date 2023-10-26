public class Recursion2 {

      
  
    //Remove duplicates in a String
    public static boolean[] map= new boolean[26];
    public static void removeDuplicates(String str, int idx, int count, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, count, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
             removeDuplicates(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccd";
        removeDuplicates(str, 0, 0, "");
        
    }
    
}

