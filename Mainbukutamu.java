package latihan5;
import java.util.Scanner;
public class Mainbukutamu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n, a;
        bukutamu buku[] = new bukutamu[bukutamu.jumlah];
        for (int i = 0; i < bukutamu.jumlah; i++) {
            System.out.println("=========================");
            System.out.print("Nama: ");
            n = in.next();
            System.out.print("Asal: ");
            a = in.next();
            buku[i] = new bukutamu(n, a);
            buku[i].showMessages();
        }
        System.out.println("=========================");
    }
}