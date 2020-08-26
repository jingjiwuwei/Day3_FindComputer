package ProductMange;

import Enums.*;

import java.util.Random;

public class FindProduceTester {

    public static void main(String[] args) {
        // 建立产品仓库
        initializeInventory();

        //设置搜索条件
        InstrumentSpec whatBryanLikes = new InstrumentSpec()
                .setInstrumentClass(InstrumentClass.LAPTOP)
                .setInstrumentBrand(InstrumentBrand.DELL);
        //搜索
        Inventory.searchFor(whatBryanLikes);

        //打印搜索条件


    }

    private static Inventory initializeInventory() {
        Inventory inventory = new Inventory();

        InstrumentSpec instrument1 = getLenovoServer();
        inventory.addInstrument("7010826", 4895, instrument1);

        InstrumentSpec instrument2 = getHuaweiDesktop();
        inventory.addInstrument("6546421", 3789, instrument2);

        InstrumentSpec instrument3 = getDellDesktop();
        inventory.addInstrument("345r693", 2499, instrument3);

        InstrumentSpec instrument4 = getHuaweiServer();
        inventory.addInstrument("VA95693", 6599, instrument4);

        InstrumentSpec instrument5 = getDellLaptop();
        inventory.addInstrument("VB9SDF3", 3699, instrument5);

        return inventory;
    }

    private static InstrumentSpec getDellLaptop() {

        return new InstrumentSpec()
                .setInstrumentCPU(InstrumentCPU.Corei9)
                .setInstrumentBrand(InstrumentBrand.DELL)
                .setInstrumentClass(InstrumentClass.LAPTOP);
    }

    private static InstrumentSpec getDellDesktop() {
        return new InstrumentSpec()
                .setInstrumentCPU(InstrumentCPU.AMD)
                .setInstrumentBrand(InstrumentBrand.DELL)
                .setInstrumentClass(InstrumentClass.DESKTOP);
    }

    private static InstrumentSpec getDellServer() {
        return new InstrumentSpec()
                .setInstrumentCPU(InstrumentCPU.AMD)
                .setInstrumentBrand(InstrumentBrand.DELL)
                .setInstrumentClass(InstrumentClass.SERVER);
    }

    private static InstrumentSpec getLenovoServer() {
        return new InstrumentSpec()
                .setInstrumentBrand(InstrumentBrand.LENOVO)
                .setInstrumentCPU(InstrumentCPU.Corei7)
                .setInstrumentClass(InstrumentClass.SERVER);

    }



    private static InstrumentSpec getHuaweiServer() {
        return new InstrumentSpec()
                .setInstrumentBrand(InstrumentBrand.HUAWEI)
                .setInstrumentClass(InstrumentClass.SERVER);
    }



    private static InstrumentSpec getHuaweiDesktop() {
        return new InstrumentSpec()
                .setInstrumentBrand(InstrumentBrand.HUAWEI)
                .setInstrumentClass(InstrumentClass.DESKTOP);
    }

    private static InstrumentSpec getHuaweiLaptop() {
        return new InstrumentSpec()
                .setInstrumentCPU(InstrumentCPU.Corei7)
                .setInstrumentBrand(InstrumentBrand.HUAWEI)
                .setInstrumentClass(InstrumentClass.LAPTOP);
    }
}
