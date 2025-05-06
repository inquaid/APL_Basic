package DependencyInversion.Using;

public class USBCharger implements Charger{
    @Override
    public void supplyPower() {
        System.out.println("Powering via USB charger");
    }
}
