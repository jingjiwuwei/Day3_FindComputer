package ProductMange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private static List<Instrument> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, double price,
                              InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument getBySerialNumber(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    private static List<Instrument> search(InstrumentSpec searchSpec) {
        return inventory.stream()
                .filter(instrument -> instrument.getSpec().matches(searchSpec))
                .collect(Collectors.toList());
    }

    public static void searchFor(InstrumentSpec inputSpec) {

        List<Instrument> matchingInstruments = search(inputSpec);
        System.out.println(getSelectInfo(inputSpec));
        if (matchingInstruments.isEmpty()) {
            System.out.println("对不起，没有找到您希望的商品.");
            return;
        }

        matchingInstruments.forEach(Instrument::printIntro);
    }

    private static String getOrDefault(Enum item) {
        return item == null ? "" : (item.toString() + " ");
    }

    static String getSelectInfo(InstrumentSpec spec) {
        return "您的筛选条件为：\n" +getOrDefault(spec.getInstrumentBrand())+
                getOrDefault(spec.getInstrumentClass()) +getOrDefault(spec.getInstrumentCPU()) + "\n---";
    }
}
