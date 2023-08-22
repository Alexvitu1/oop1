import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        AvtomatDrink drinksMachine = new AvtomatDrink(Arrays.asList(
                new Product("water","Coca-Cola",5, 99),
                new Product("water", "fanta", 5,99),
                new Product("cofe", "raf_milk", 2,50),
                new Product("cofe", "late", 2, 50),
                new Product("cofe", "late", 2, 45)));

        AvtomatHotDrink hotDrinksMachine = new AvtomatHotDrink(Arrays.asList(
                new ProductHotDrink("cofe", "late", 2, 50,90),
                new ProductHotDrink("cofe", "raf-milk", 2, 80, 90),
                new ProductHotDrink("cofe", "raf-milk", 2, 80, 80),
                new ProductHotDrink("cofe", "late", 2, 45,80)));


        int number = drinksMachine.numberPD();
        Product products = drinksMachine.GetNumberPD(number);
        drinksMachine.buyProduct(products);

        String name = hotDrinksMachine.twoName();
        int volume = hotDrinksMachine.twoVolume();
        int temperature = hotDrinksMachine.twoTemperatura();
        Product product = hotDrinksMachine.GetProduct(name, volume, temperature);
        hotDrinksMachine.buyProduct(product);



    }
}