import java.util.Scanner;
 
public class ScannerInputOutput {
    public static void main (String args[]){
        String message;
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("메세지를 입력해 주시오");
        
        message = scan1.nextLine();
        
        System.out.println("message : " + message);
        
        int num;
        Scanner scan2 = new Scanner(System.in);
        
        System.out.println("정수를 입력해 주시오");
        num = scan2.nextInt();
        
        System.out.println("num :" + num);
    }
}