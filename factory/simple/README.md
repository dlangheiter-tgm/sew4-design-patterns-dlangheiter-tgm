# Simple Factory
Dies is eigentlich kein Pattern. Es lagert jegendlich das erstellen der Instanz in eine eigene Klasse aus.
Damit man eben nur einen Ort hat wo man etwas ändern muss um etwas hinzuzufügen oer zu entfernen.

`createCar` nimmt einen String und gibt eine Instanz eines Autos zurück.
```java
public static Car createCar(String brand) {
    Car car = null;
    if(brand.equalsIgnoreCase("tesla")) {
        car = new TeslaCar();
    } else if(brand.equalsIgnoreCase("audi")) {
        car = new AudiCar();
    }
    return car;
}
```

![Simple Factory UML](./resources/SimpleFactoryUML.svg)