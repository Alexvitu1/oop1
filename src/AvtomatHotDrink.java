import java.util.List;

public class AvtomatHotDrink extends AvtomatDrink{
    public AvtomatHotDrink(List<Product> product) {
        super(product);
    }
    public String twoName(){
        System.out.println("Please name product ");
        String twoName = sc.next();
        return twoName;
    }

    public Integer twoVolume(){
        System.out.println("Please Volume drink ");
        Integer twoVolume = sc.nextInt();
        return twoVolume;
    }
    public Integer twoTemperatura(){
        System.out.println("Please temperatura drink ");
        Integer twoTemperatura = sc.nextInt();
        return  twoTemperatura;
    }

    public Product GetProduct(String name, int volume, int temperatura){
        for (Product product : product) {
            if (!(product instanceof ProductHotDrink)) {
                continue;
            }
            if (product.GetName().equals (name)){
                if ((product.GetVolume() == volume) &&
                ((ProductHotDrink) product).GetTemperatura() == temperatura){
                    return product;
                }
            }
            else{
                System.out.println("Sorry, product not found");
            }
        }
        throw new IllegalStateException("Product not found!");
    }
}
