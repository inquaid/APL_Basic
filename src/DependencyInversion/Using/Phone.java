package DependencyInversion.Using;

public class Phone {
    private Charger charger;

    Phone(Charger charger) {
        this.charger = charger;
    }

    void charge() {
        charger.supplyPower();
    }
}
