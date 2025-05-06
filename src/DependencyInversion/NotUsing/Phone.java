package DependencyInversion.NotUsing;

public class Phone {
    USBCharger charger = new USBCharger();

    void charge(){
        charger.supplyPower();
    }
}
