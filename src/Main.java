public class Main {
    public static void main(String[] args) {
        Toyota camry = createObjects("Camry");
        Toyota crown = createObjects("Crown");
        Toyota prado = createObjects("Prado");
        Printable[] printables = {camry,crown,prado};
        for (Printable printable : printables) {
            if (printable instanceof Printable) {
                printable.print();
            }
        }
    }
    public static Toyota createObjects(String className){

        if (className=="Camry" || className=="Crown" || className=="Prado") {
            switch (className) {
                case "Camry":
                    return new Camry("Camry", "front", 3.0, 1500,TypeBodyEnum.SEDAN,
                            250, 5, "Available");

                case "Crown":
                    return new Crown(className, "Rear", 4.0, 1300, TypeBodyEnum.SEDAN,
                            300, "Turbo charging");

                case "Prado":
                    return new Prado(className, "Four-wheel", 3, 2000, TypeBodyEnum.OFF_ROAD,
                            200, 2000.0);
                default:
                    System.out.println("ERROR!!!!!");

            }
        }
        return null;
    }
}
/*
В классе Main создать возвращаемый метод createObject(String className),
который умеет создавать объекты класса 2й, 3й и 4й и после создания и
задания свойств объекту метод возвращает ссылку на объект (пульт).
Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
Например если в параметре передается “2й” метод должен создать объект именно этого типа.
 */