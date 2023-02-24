import java.util.Scanner;

public class workingday {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter working Day");
        int workingDay = sc.nextInt ();
        System.out.println ("How many hours");
        int workinghourse = sc.nextInt ();
        System.out.println ("Per hours wage");
        int wage = sc.nextInt ();

            if (workingDay >= 20) {
                System.out.println (" 20Day wage   :-  " + (workingDay *8)*wage);
            }
            if (workinghourse >= 100) {
                System.out.println (" 100hours wage" + workinghourse * wage);
            } else {
                System.out.println ("Pls contact with Maneger");
            }
        }
    }
