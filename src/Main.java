public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int cat = 205349;
        System.out.println("Значение переменной cat с типом int равно " +cat );
        byte dog  = 114;
        System.out.println("Значение переменной dog с типом byte равно " +dog );
        short  maus = 12654;
        System.out.println("Значение переменной maus с типом short равно " +maus );
        long cow = 900053454;
        System.out.println("Значение переменной cow с типом long равно " +cow );
        float bat = 3.105f;
        System.out.println("Значение переменной bat с типом float равно " +bat );
        double snake = 12.90000032131;
        System.out.println("Значение переменной snake с типом double равно " +snake );

        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549l;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int k = 27897;
        System.out.println(k);
        byte z = 67;
        System.out.println(z);

        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSerggeevna = 27;
        byte ekaterinaAndreevna = 30;
        short peper = 480;
        int oneStudent = peper / (ludmilaPavlovna+annaSerggeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " +oneStudent+ " листов бумаги");

        System.out.println("Задача 4");
        int min1 = 20;
        int min2 = 24*60;
        int min3 = 3*24*60;
        int min4 = 30*24*60;
        int bottle = 16;
        int min1_1 = min1*bottle;
        int min2_1 = min2*bottle;
        int min3_1 = min3*bottle;
        int min4_1 = min4*bottle;
        System.out.println("За 20 минут машина произвела " +min1_1+ " штук бутылок");
        System.out.println("За сутки машина произвела " +min2_1+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +min3_1+ " штук бутылок");
        System.out.println("За 1 месяц машина произвела " +min4_1+ " штук бутылок");

        System.out.println("Задача 5");
        int allBottles = 2+4;
        int oneBottle_classroom = 120/allBottles;
        int oneClassroom_bottleWhite = 2*oneBottle_classroom;
        int oneClassroom_bottleBrown = 4*oneBottle_classroom;
        System.out.println("В школе где "+oneBottle_classroom+ " классов, нужно "+oneClassroom_bottleWhite+" банок белой краски и "+oneClassroom_bottleBrown+ " банок коричневой краски");

        System.out.println("Задача 6");
        int banan = 5;
        int bananGramm = 80;
        int moloko = 200;
        int molokoGramm = 105;
        int morojenoe_plombir = 2;
        int morojenoe_plombirGramm = 100;
        int yaico = 4;
        int yaicoGramm = 70;
        int allGramm = (banan*bananGramm)+(moloko/100*molokoGramm)+(morojenoe_plombir*morojenoe_plombirGramm)+(yaico*yaicoGramm);
        float allKilogramm = allGramm/1000f;
        System.out.println("Грамм в спртзавтраке "+allGramm);
        System.out.println("Килограмм в спортзавтраке "+allKilogramm);

        System.out.println("Задача 7");
        int loseWeight = 7000;
        int loseWeight_250Gramm = 250;
        int loseWeight_500Gramm = 500;
        int needDayFor250Gramm = loseWeight/loseWeight_250Gramm;
        int needDayFor500Gramm = loseWeight/loseWeight_500Gramm;
        System.out.println("Для похудения на 250 грамм каждый день нужно: "+needDayFor250Gramm+ " дней");
        System.out.println("Для похудения на 500 грамм каждый день нужно: "+needDayFor500Gramm+ " дней");

        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int cashUp = 10;
        int year = 12;
        int mashaCashUp = masha*cashUp/100;
        int denisCashUp = denis*cashUp/100;
        int kristinaCashUp = kristina*cashUp/100;
        int mashaMonthNew = mashaCashUp+masha;
        int denisMonthNew = denisCashUp+denis;
        int kristinaMonthNew = kristinaCashUp+kristina;
        int mashaCash = masha*year;
        int denisCash = denis*year;
        int kristinaCash = kristina*year;
        int mashaNewCash = mashaMonthNew*year;
        int denisNewCash = denisMonthNew*year;
        int kristinaNewCash = kristinaMonthNew*year;
        int differenceMasha = mashaNewCash-mashaCash;
        int differenceDenis = denisNewCash-denisCash;
        int differenceKristina = kristinaNewCash-kristinaCash;
        System.out.println("Маша теперь получает "+mashaMonthNew+ " рублей. Годовой доход вырос на "+differenceMasha+" рублей");
        System.out.println("Денис теперь получает "+denisMonthNew+ " рублей. Годовой доход вырос на "+differenceDenis+" рублей");
        System.out.println("Кристина теперь получает "+kristinaMonthNew+ " рублей. Годовой доход вырос на "+differenceKristina+" рублей");

    }
}