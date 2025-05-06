package DependencyInversion.Using;

public class LightningCharger implements Charger{
    @Override
    public void supplyPower() {
        System.out.println("Powering via Lightning charger");
    }
}
