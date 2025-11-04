import java.util.Scanner;
public class HitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)

        System.out.println("Masukkan bilangan bulat positif");
        int n = input.nextInt()

        long faktorial = 1;

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i; // faktorial = faktorial * i
            }

            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
