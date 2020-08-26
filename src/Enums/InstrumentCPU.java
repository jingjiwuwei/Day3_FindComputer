package Enums;

public enum InstrumentCPU {
    // 电脑品牌类型枚举

    Corei7, Corei9, AMD, Ruilong;

    public String toString() {
        switch (this) {
            case Corei7:
                return "7代酷睿";
            case Corei9:
                return "9代酷睿";
            case AMD:
                return "AMD";
            case Ruilong:
                return "锐龙";
            default:
                return "unspecified";
        }
    }
}
