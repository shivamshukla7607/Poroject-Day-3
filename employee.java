import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter working hours");
        int x= sc.nextInt ();
        if (x>=8){
            System.out.println ("Present");
        }
        else {
            System.out.println ("Absent");
        }
    }
}
