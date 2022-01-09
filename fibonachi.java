 import java.util.Scanner;
public class fibonachi{
    public static void main(String[] args) {
      Scanner giris=new Scanner(System.in);
System.out.print("SAYI GIRIN=");

int fibonachi=giris.nextInt();
  
        int birinci = 1;
        System.out.print(birinci + " ");
        int ikinci = 1;
        System.out.print(ikinci + " ");
          for (int i=3; i<=fibonachi; i++){
            int yeni = birinci + ikinci;
          birinci=ikinci;
            ikinci=yeni;
          System.out.print(yeni + " ");
        }
    }


}
