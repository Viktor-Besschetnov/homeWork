public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 2");

        int dogs = 132;
        System.out.println(dogs);

        byte cat = 13;
        System.out.println(cat);

        short sugar = 6000;
        System.out.println(sugar);

        long car = 100000000L;
        System.out.println(car);

        float eggs = 13.77777f;
        System.out.println(eggs);

        double meat = 25.999999999;
        System.out.println(meat);

        System.out.println("Задание 2");

        float f = 27.12f;
        System.out.println(f);

        long l = 987678965549L;
        System.out.println(l);

        double d = 2.786;
        System.out.println(d);

        int i = 569;
        System.out.println(i);

        short s = -159;
        System.out.println(s);

        short s2 = 27897;
        System.out.println(s2);

        byte b = 67;
        System.out.println(b);

        System.out.println("Задание 3");

        byte stuntsFirstTeacher = 23;
        /// Учеников у первого учителя
        byte studentsSecondTeacher = 27;
        /// Учеников у второго учителя
        byte studentsThirdTeacher = 30;
        /// Учеников у третьего учителя;

        short sheetsOfPaper = 480;

        int totalStudents = stuntsFirstTeacher + studentsSecondTeacher + studentsThirdTeacher;
        int sheets = sheetsOfPaper / totalStudents;
        /// Листов каждому ученику

        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги" );

        System.out.println("Задание 4");

        int bottles = 16;
        ///Изготовлено бутылок за 2 минуты

        bottles = bottles / 2;
        ///Изготовлено бутылок за 1 миинуту

        byte time1 = 20;
        ///Время работы машины 20 минут
        short time2 = 1440;
        ///Время работы сутки
        int time3 = time2 * 3;
        ///Время работы 3 дня
        int time4 = time2 * 30;
        ///Врмея работы месяц

        int bottles20Min = bottles * time1;
        System.out.println("За " + time1 + " минут машина произвела " + bottles20Min + " штук бутылок");

        int bottles1Day = bottles * time2;
        System.out.println("За " + time2 + " минут машина произвела " + bottles1Day + " штук бутылок");

        int bottles3Day = bottles * time3;
        System.out.println("За " + time3 + " минут машина произвела " + bottles3Day + " штук бутылок");

        int bottlesMonth = bottles * time4;
        System.out.println("За " + time4 + " минут машина произвела " + bottlesMonth + " штук бутылок");

        System.out.println("Задание 5");

        byte totalCansOfPaint = 120;
        ///Всего краски на школу
        byte whiteCansOfPaint = 2;
        ///Банок белой краски на 1 класс
        byte brownCansOfPaint = 4;
        ///Банок коричневой краски на 1 класс

        int totalCansOfPaintFor1StClass = whiteCansOfPaint + brownCansOfPaint;
        ///Всего банок карски на 1 класс

        int totalClassesInTheSchool = totalCansOfPaint / totalCansOfPaintFor1StClass;
        /// Всего классов в школе

        int totalWhiteCansOfPaint = totalClassesInTheSchool * whiteCansOfPaint;
        ///Всего белой краски необходимо
        int totalBrownCansOfPaint = totalCansOfPaint - totalWhiteCansOfPaint;

        System.out.println("В школе, где " + totalClassesInTheSchool + " классов, нужно " + totalWhiteCansOfPaint + " банок белой карски и " + totalBrownCansOfPaint + " банок коричневой краски");


        System.out.println("Задание 6");

        byte bananas = 5;
        ///Штук бананов
        byte weightBanana = 80;
        /// Вес 1го банана в граммах
        int totalWeightBananas = bananas * weightBanana;
        ///Общий вес бананов в граммах

        short milk = 200;
        ///Всего мл молока
        byte weight10MlMilk = 105;
        ///Вес 100 мл молока в граммах
        int totalWeightMilk = weight10MlMilk * 2;
        ///Вес 200 мл молока в граммах

        byte iceCream = 2;
        ///Всего мороженного
        byte weightIceCream = 100;
        ///Вес 1го мороженного в граммах
        int totalWightIceCream = iceCream * weightIceCream;
        ///Вес 2 мороженных

        byte Eggs = 4;
        ///Всего яиц
        byte weight1Eggs = 70;
        ///Вес одного яйца в граммах
        int totalWeightEggs = Eggs * weight1Eggs;
        ///Вес всех яиц

        int weightBreakfast = totalWeightBananas + totalWeightMilk + totalWightIceCream + totalWeightEggs;
        ///Вес завтрака в граммах

        short weight1Kg = 1000;
        ///В одном 1кг 1000 грамм

        float totalWeightBreakfast = (float) weightBreakfast / weight1Kg;
        ///Вес завтрака в кг

        System.out.println("Вес завтрака " + weightBreakfast + " грамм или " + totalWeightBreakfast + " килограмм");


        System.out.println("Задание 7");

        byte weighThatAnSportsmanNeedsToLose = 7;
        ///Вес который необходимо сбросить спортсмену в килограммах
        short weightLostPerDay1 = 250;
        ///Вес который будет терять в день(Первый вариант)
        short weightLostPerDay2 = 500;
        ///Вес который будет терять в день(Второй вариант)
        short weightKg1 = 1000;
        ///В 1кг 1000 грамм

        int weighThatAnSportsmanNeedsToLoseG = weighThatAnSportsmanNeedsToLose * weight1Kg;
        ///Вес который необходимо сбросить в граммах

        int lostPerDay1 = weighThatAnSportsmanNeedsToLoseG / weightLostPerDay1;
        ///Дней понадобится, чтобы сбросить 7 кг(Первый вариант)
        int lostPerDay2 = weighThatAnSportsmanNeedsToLoseG / weightLostPerDay2;
        ///Дней понадобится, чтобы сбросить 7 кг(Первый вариант)

        int averageWeightLostPerday = (weightLostPerDay1 + weightLostPerDay2) / 2;
        ///Средний сбрасываемый вес в день

        float lostPerDayAverage = (float)  weighThatAnSportsmanNeedsToLoseG / averageWeightLostPerday;
        ////Дней понадобится, чтобы сбросить 7 кг в среднем

        System.out.println(lostPerDay1 + " Дней понадобится, чтобы сбросить " + weighThatAnSportsmanNeedsToLose + " кг, если сбрасывать " + weightLostPerDay1 + " грамм в день");
        System.out.println(lostPerDay2 + " Дней понадобится, чтобы сбросить " + weighThatAnSportsmanNeedsToLose + " кг, если сбрасывать " + weightLostPerDay2 + " грамм в день");
        System.out.println(lostPerDayAverage + " Дней понадобится, чтобы сбросить " + weighThatAnSportsmanNeedsToLose + " кr в среднем");

        System.out.println("Задание 8");

        int zpMasha = 67760;
        ///Зарплата Маши в месяц(в рублях)
        int zpDenis = 83690;
        ///Зарплата Дениса в месяц(в рублях)
        int zpKristina = 76230;
        ///Зарплата Кристины в месяц(в рублях)

        byte percent = 10;
        ///На сколько процентов необходимо увеличить зп
        float percentDecimal =  (float) percent / 100;
        ///Переведем 10% к десятичной дроби

        float zpMasha1 = (float) zpMasha * percentDecimal + zpMasha;
        ///Зп маши после повышения на 10%
        float zpDenis1 = (float) zpDenis * percentDecimal + zpDenis;
        ///Зп Дениса после повышения на 10%
        float zpKristina1 = (float)  zpKristina * percentDecimal + zpKristina;
        ///Зп Кристины после повышения на 10%

        int monthPerYear = 12;
        ///Столько месяцев в году

        int mashaHadASalary = zpMasha * monthPerYear;
        ///Годовая зарплата у Маши до повышения
        int denisHadASalary = zpDenis * monthPerYear;
        ///Годовая зарплата у Дениса до повышения
        int kristinaHadASalary = zpKristina * monthPerYear;
        ///Годовая зарплата у Кристины до повышения

        float mashaSalaryHasBecome = zpMasha1 * monthPerYear;
        ///Годовая зарплата у Маши после повышения
        float denisSalaryHasBecome =  zpDenis1 * monthPerYear;
        ///Годовая зп Дениса после повышения
        float kristinaSalaryHasBecome = zpKristina1 * monthPerYear;
        ///Гожовая зп Кристины после повышения

        float mashaSalaryIncreasedBy = mashaSalaryHasBecome - mashaHadASalary;
        ///Годовая зп у Маши выросла на...
        float denisSalaryIncreasedBy = denisSalaryHasBecome - denisHadASalary;
        ///Годавая зп у Дениса выросла на...
        float kristinaSalaryIncreasedBy = kristinaSalaryHasBecome - kristinaHadASalary;
        ///Годовая запрлата у Кристаны выросла на...

        System.out.println("Маша теперь получает " + mashaSalaryHasBecome + " рублей. Годовой доход вырос на " + mashaSalaryIncreasedBy + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryHasBecome + " рублей. Годовой доход вырос на " + denisSalaryIncreasedBy + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryHasBecome + " рублей. Годовой доход вырос на " + kristinaSalaryIncreasedBy + " рублей");






    }
}