import java.time.LocalDate;
import java.time.Period;

public class AgeChecker {
    public static void main(String[] args) {
        
        int birthYear = 2005;
        int birthMonth = 3;
        int birthDay = 10;

        
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        
        LocalDate currentDate = LocalDate.now();

        
        Period age = Period.between(birthDate, currentDate);

        
        int years = age.getYears();

        
        if (years >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }
    }
}