import java.util.Scanner;

public class greate_common_factor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a= sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();
        for (int i =a; i>=1; i--){
            if (a%i==0){
                if(b%i==0){
                    System.out.println("uoc chung lon nhat la:"+i);
                    break;
                }
            }
        }
    }
}
