public class Product {
    private String TypePD;
    private String NamePD;
    private Integer VolumePD;
    private Integer CashPD;
    public Product(String typePD, String namePD, int volumePD, int cashPD) {
        this.TypePD = typePD;
        this.NamePD = namePD;
        this.VolumePD = volumePD;
        this.CashPD = cashPD;
    }
    public String GetType(){
        return TypePD;
    }
    public String GetName(){
        return NamePD;
    }

    public Integer GetVolume(){
        return VolumePD;
    }
    public Integer GetCash(){
        return CashPD;
    }

    public String toString() {
        return "Product{" + "Type= " + TypePD + ", Name= " + NamePD + ", Volume = " + VolumePD +  ", Cash= " + CashPD + "}";
    }
}

