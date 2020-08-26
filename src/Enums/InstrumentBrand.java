package Enums;

public enum InstrumentBrand {
    // 电脑品牌类型枚举

    HUAWEI, DELL,LENOVO;

    public String toString() {
        switch(this) {
            case HUAWEI: return "华为";
            case DELL: return "戴尔";
            case LENOVO: return "联想";
            default:       return "unspecified";
        }
    }
}