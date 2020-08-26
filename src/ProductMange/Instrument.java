package ProductMange;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

//    String getDescription() {
//        String instrumentClass = getOrDefault(spec.getInstrumentClass());
//        String instrumentBand  = getOrDefault(spec.getInstrumentBrand());
//        String instrumentCPU = getOrDefault(spec.getInstrumentCPU());
//        return instrumentClass+" "+instrumentBand+" "+instrumentCPU ;
//    }

    private String getOrDefault(Enum item) {
        return item == null ? "" : (item.toString() + " ");
    }

    String getTotalInfo() {
        return "您可能会对此感兴趣：\n" +getOrDefault(spec.getInstrumentBrand())+
                getOrDefault(spec.getInstrumentClass()) +getOrDefault(spec.getInstrumentCPU()) + "价格为" +
                getPrice() + "元\n---";
    }

    private String getIntro() {
        return  "\n" +
                this.getTotalInfo();
    }

    public void printIntro() {
        System.out.println(getIntro());
    }

}
