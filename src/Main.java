public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача №1");
        byte first = 123;
        System.out.println("Переменная byte - " + first);
        short second = 15687;
        System.out.println("Переменная short - " + second);
        int third = 1000000001;
        System.out.println("Переменная int - " + third);
        long fourth = -1098406546;
        System.out.println("Переменная long - " + fourth);
        float fifth = 3.14f;
        System.out.println("Переменная float - " + fifth);
        double sixth = 3.1415926535;
        System.out.println("Переменная double - " + sixth);
        System.out.println("Задача №2");

        float firstBoxer = 78.2f;
        System.out.println("Вес первого боксёра - " + firstBoxer + "кг.");
        float secondBoxer = 82.7f;
        System.out.println("Вес второго боксёра - " + secondBoxer + "кг.");
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес спортсменов - " + totalWeight + "кг.");
        float differentWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе спортсменов - " + differentWeight + "кг.");
    }
}