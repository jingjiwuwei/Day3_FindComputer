package ProductMange;

import Enums.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;


//该类在设计时严格按照SRP的模式进行了设计，包括获取和设置品牌，类别和CPU类型在内的多个函数按照单一责任原则进行划分
public class InstrumentSpec {
    private Map<String, Object> properties = new HashMap<>();

    public InstrumentSpec() {

    }

    public Map<String, Object> getProperties() {
        return properties;
    }

//    public InstrumentType getInstrumentType() {
//        return (InstrumentType) get("InstrumentType");
//    }
//
//    public InstrumentSpec setInstrumentType(InstrumentType instrumentType) {
//        put(instrumentType);
//        return this;
//    }

    public InstrumentClass getInstrumentClass() {
        return (InstrumentClass) get("InstrumentClass");
    }

    public InstrumentSpec setInstrumentClass(InstrumentClass instrumentClass) {
        put(instrumentClass);
        return this;
    }
    public InstrumentBrand getInstrumentBrand() {
        return (InstrumentBrand) get("InstrumentBrand");
    }

    public InstrumentSpec setInstrumentBrand(InstrumentBrand instrumentBrand) {
        put(instrumentBrand);
        return this;
    }
    public InstrumentCPU getInstrumentCPU() {
        return (InstrumentCPU) get("InstrumentCPU");
    }

    public InstrumentSpec setInstrumentCPU(InstrumentCPU instrumentCPU) {
        put(instrumentCPU);
        return this;
    }
    private String getNameOf(Object property) {
        return property.getClass().getSimpleName();
    }

    Object get(String key) {
        return properties.get(key);
    }

    private void put(Object value) {
        properties.put(getNameOf(value), value);
    }

    boolean matches(InstrumentSpec otherSpec) {
        return otherSpec.properties
                .keySet()
                .stream()
                .allMatch(valuesMatch(otherSpec));
    }

    private Predicate<String> valuesMatch(InstrumentSpec otherSpec) {
        return otherKey -> otherSpec.get(otherKey).equals(properties.get(otherKey));
    }
}
