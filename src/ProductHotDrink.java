public class ProductHotDrink extends Product{
    private int Temperatura;
    public ProductHotDrink(String typePD, String namePD, int volumePD, int cashPD, int temperatura){
        super(typePD,namePD,volumePD, cashPD);
        this.Temperatura = temperatura;
    }
    public int GetTemperatura(){
        return Temperatura;
    }
    public String GetType(){
        return super.GetType();
    }
    public String GetName(){
        return super.GetName();
    }
    public Integer GetVolume(){
        return super.GetVolume();
    }
    public Integer GetCash(){
        return super.GetCash();
    }
    public String toString() {
        String toStringHP = super.toString();
        return "Product Hot Drink {" + toStringHP + ", Temperatura= " + Temperatura + "}";
    }

}
