public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 3");

        dog = dog -3.5;
        cat = - 1.6;
        paper = - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");

        var firtsBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeightBoxers = firtsBoxer + secondBoxer;

        System.out.println("Общая масса боксеров равна " + totalWeightBoxers + " кг.");

        var differenceBetweenTheMassesOfBoxers = secondBoxer - firtsBoxer;
        System.out.println("Разница между массами боксеров " + differenceBetweenTheMassesOfBoxers + " кг.");

        System.out.println("Задание 7");

        var остатокОтДеления = (secondBoxer / firtsBoxer) % firtsBoxer;
        System.out.println(остатокОтДеления);
        ///Я не совсем понял, что и как. Но вроде так.

        System.out.println("Задание 8");

        System.out.println("Задача 1");

        var общееКоличествоЧасов = 640;
        var каждыйСотрудникПосвещаетРаботе = 8;
        var всегоСотрудников = общееКоличествоЧасов / каждыйСотрудникПосвещаетРаботе;

        System.out.println("Всего работников в компании " + всегоСотрудников + " человек");

        System.out.println("Задача 2");

        var сталоСотрудников = всегоСотрудников + 94;
        var сталоЧасовРаботы = сталоСотрудников * каждыйСотрудникПосвещаетРаботе;

        System.out.println("Если в компании работает " + сталоСотрудников + " человек, то всего " + сталоЧасовРаботы + "часов работы может быть поделено между сотрудниками");






    }
}