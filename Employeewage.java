import java.util.Scanner;

public class Employeewage {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter working hours");
        int working= sc.nextInt ();
        int wage= sc.nextInt ();
        if(working<8){
            System.out.println ("If part time employee   :-  "+working*wage/2);
        }
        else{
            System.out.println ("Full time work employee    :-   "  +working*wage);
        }
    }
}
