import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, count = 0, sum= 0;

        System.out.print("Lutfen bir sayi giriniz: ");
        n = input.nextInt();

        for(int i=1; i<=n ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                count++;
                sum += i;
            }
        }
        if(count == 0){
            System.out.println("Girilen sayıya kadar hiçbir sayı 3 ve 4'e tam bölünmez. ");
        }else{
            double average = sum/count;
            System.out.println("Girilen sayıya kadar olan sayilarin ortalamasi:" + average);
        }
    }
}
