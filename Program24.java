import java.util.*;
public class gender {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender in capital letter");
        String gen=sc.nextLine();
        System.out.println("enter the age in decimal");
        int age=sc.nextInt();
        if (age<=1 && age>=58)
        {
           age='f';
        }
        else if (age<58 && age>=100){
            age='k';
        }
        System.out.println(age);
    }
}
