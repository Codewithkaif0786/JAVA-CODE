import java.util.Scanner;
class Sudoku{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name : ");
        String lastName = sc.nextLine();
        String fullName = firstName +"@"+ lastName;
        System.out.println("find of how much length : "+fullName.length());
        System.out.println("The add of two name is : "+fullName);

        // print string by throug charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}