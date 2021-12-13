import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExperationQ1 {
    public static void main(String[] args) {
        Pattern P=Pattern.compile("[b]+");
        Matcher M=P.matcher("acdhbbdjfhhbbkhbb");
        Scanner sc=new Scanner(System.in);
        Pattern P=Pattern.compile("[baa]+");
        System.out.println("entre the target string ");
        Matcher M=P.matcher(sc.nextLine());
        int co=0;
        while (M.find()){
            co++;
