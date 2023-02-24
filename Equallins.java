import java.util.Scanner;

public class Equallins {
    public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            System.out.println ("Enter working hours");
            int fristLine= sc.nextInt ();
            int secoundLine= sc.nextInt ();
            if (fristLine==secoundLine){
                System.out.println ("Equal lins");
            }
            else if (fristLine>secoundLine){
                System.out.println ("Frist line Biger than secound line");
            }
            else{
                System.out.println ("Secound line biger than frist line");
            }
    }
}
