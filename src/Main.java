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

        System.out.println("Задача №3");

        short bananasWeight = 80 * 5;
        System.out.println("Общий вес бананов " + bananasWeight + " грамм или " + bananasWeight * 0.001 + " кг.");
        short milkWeight = 105 * 2;
        System.out.println("Общий вес молока " + milkWeight + " грамм или " + milkWeight * 0.001 + " кг.");
        short icecreamWeight = 100 * 2;
        System.out.println("Общий вес мороженного " + icecreamWeight + " грамм или " + icecreamWeight * 0.001 + " кг.");
        short eggsWeight = 70 * 4;
        System.out.println("Общий вес яиц " + eggsWeight + " грамм или " + eggsWeight * 0.001 + " кг.");
        int totabreakfastlWeight = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        System.out.println("Общий вес завтрака " + totabreakfastlWeight * 0.001 + " кг. или " + totabreakfastlWeight + " грамм");

        System.out.println("Задача №4");

        float firstGoalWeight = (float) (250 * 0.001);
        System.out.println("Если каждый день терять " + firstGoalWeight + " кг.");
        float firstCase = 7 / firstGoalWeight;
        System.out.println("7 кг. удастся сбросить за " + firstCase + " дней");
        float secondGoalWeight = (float) (500 * 0.001);
        System.out.println("Если каждый день терять " + secondGoalWeight + " кг.");
        float secondCase = 7 / secondGoalWeight;
        System.out.println("7 кг. удастся сбросить за " + secondCase + " дней");
        int mean = (int) (firstCase + secondCase) / 2;
        System.out.println("Усреднённое колличество времени похудения " + mean + " день");

        System.out.println("Задача №5");

        int Masha = 67760;
        System.out.println("Зарплата Маши без ежегодной надбавки - " + Masha + " рублей");
        int Denis = 83690;
        System.out.println("Зарплата Дениса без ежегодной надбавки - " + Denis + " рублей");
        int Kristina = 76230;
        System.out.println("Зарплата Кристины без ежегодной надбавки - " + Kristina + " рублей");
        float MashaPlus = (float) ((float) 67760 + (67760 * 0.1));
        System.out.println("Зарплата Маши с учётом надбавки 10% - " + MashaPlus + " рублей");
        float DenisPlus = (float) ((float) 83690 + (83690 * 0.1));
        System.out.println("Зарплата Дениса с учётом надбавки 10% - " + DenisPlus + " рублей");
        float KristinaPlus = (float) ((float) 76230 + (76230 * 0.1));
        System.out.println("Зарплата Кристины с учётом надбавки 10% - " + KristinaPlus + " рублей");
        float differentSalaryMasha = MashaPlus + Masha;
        System.out.println("На " + differentSalaryMasha + " рублей получит Маша в следующем году");
        float differentSalaryDenis = DenisPlus + Denis;
        System.out.println("На " + differentSalaryDenis + " рублей получит Денис в следующем году");
        float differentSalaryKristina = KristinaPlus + Kristina;
        System.out.println("На " + differentSalaryKristina + " рублей получит Маша в следующем году");


    }
}