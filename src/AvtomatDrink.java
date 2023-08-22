import java.util.List;
import java.util.Scanner;

public class AvtomatDrink {
    public List<Product> product;
    public Scanner sc = new Scanner(System.in);

    public AvtomatDrink(List<Product> product) {
        this.product = product;
    }

    public int numberPD() {
        System.out.println("Please number product: ");
        int numberPD = sc.nextInt();
        return numberPD;
    }
    public Product GetNumberPD (int numberPD) {
        System.out.println("Selected product: " + product.get(numberPD));
        return product.get(numberPD);
    }



    public void buyProduct (Product product) {
        System.out.println("Please cash in avtomat ");
        int check = 0;
        while (true) {
            int cash = sc.nextInt();
            check += cash;
            if (check < product.GetCash()) {
                System.out.printf("Please more cach ", product.GetCash() - check);
            } else {
                System.out.println("Please your product. Bye Bye ");
                break;
            }
        }
    }
}
