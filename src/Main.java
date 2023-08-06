public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int iInt = 1_200_000_000;
        byte bByte = 120;
        short sShort = 32_000;
        long lLong = 6_120_999_999_999L;
        float fFloat = 0.55555555f;
        double dDouble = 1.0000000055555555505;
        System.out.println("Значение переменной iInt с типом int равно " + iInt);
        System.out.println("Значение переменной bByte с типом byte равно " + bByte);
        System.out.println("Значение переменной sShort с типом short равно " + sShort);
        System.out.println("Значение переменной lLong с типом long равно " + lLong);
        System.out.println("Значение переменной fFloat с типом long равно " + fFloat );
        System.out.println("Значение переменной dDouble с типом long равно " + dDouble);

        System.out.println("Задача 2.");
        double dDouble1 = 27.12;
        long lLong1 = 987_678_965_549L;
        double dDouble2 = 2.786;
        short sShort1 = 569;
        short sShort2 = -159;
        short sShort3 = 27897;
        byte bByte1 = 67;
        System.out.println(dDouble1);
        System.out.println(lLong1);
        System.out.println(dDouble2);
        System.out.println(sShort1);
        System.out.println(sShort2);
        System.out.println(sShort3);
        System.out.println(bByte1);

        System.out.println("Задача 3.");
        byte LudPavl = 23;
        byte AnnSerg = 27;
        byte EkatAndrey = 30;
        short ListPaper = 480;
        System.out.println("На каждого ученика рассчитано " + (ListPaper / (LudPavl + AnnSerg + EkatAndrey)) + " листов бумаги");

        System.out.println("Задача 4.");
        byte bottle = 16;
        int minute2 = 2;
        int minute20 = 20;
        int day = 24*60;
        int day3 = 24*60*3;
        int month = 24*60*30;
        System.out.println("За " + minute2 + " минуты машина произвела " + bottle * minute2 +" штук бутылок");
        System.out.println("За " + minute20 + " минут машина произвела " + bottle * (minute20 / minute2) +" штук бутылок");
        System.out.println("За " + day + " минут машина произвела " + bottle * (day / minute2) +" штук бутылок");
        System.out.println("За " + day3 + " минут машина произвела " + bottle * (day3 / minute2) +" штук бутылок");
        System.out.println("За " + month + " минут машина произвела " + bottle * (month / minute2) +" штук бутылок");

        System.out.println("Задача 5.");
        int TotalCans = 120;
        byte BWhite = 2;
        byte BBrow = 4;
        System.out.println("В школе, где " + TotalCans / (BWhite + BBrow) +
                " классов, нужно " + (TotalCans / (BWhite + BBrow)) * BWhite +
                " банок белой краски и " + + (TotalCans / (BWhite + BBrow)) * BBrow + " банок коричневой краски");

        System.out.println("Задача 6.");
        double banana = 5 * 80.0;
        double milk = 2 * 105.0;
        double IceCrem = 2 * 100.0;
        double egg = 4 * 70.0;
        System.out.println("Вес спортзавтрака составляет " + (banana + milk + IceCrem + egg) + " граммов, или " +
                (banana + milk + IceCrem + egg ) /1000 + " килограмм");

        System.out.println("Задача 7.");
        float norm = 7;
        float min = 0.25f;
        float max = 0.5f;
        System.out.println("При норме похудения 250г в день, потребуется " + norm / min + " дней");
        System.out.println("При норме похудения 500г в день, потребуется " + norm / max + " дней");
        System.out.println("При средней норме похудения в день, потребуется " + (norm / (min + max)) + " дней");

        System.out.println("Задача 8.");
        int SalMash = 67760;
        int SalDenis = 83690;
        int SalKristina = 76230;
        System.out.println("Маша теперь получает " + (SalMash * 1.1) +
                " рублей. Годовой доход вырос на " + ((SalMash * 1.1) - SalMash) + " рублей");
        System.out.println("Денис теперь получает " + (SalDenis * 1.1) +
                " рублей. Годовой доход вырос на " + ((SalDenis * 1.1) - SalDenis) + " рублей");
        System.out.println("Кристина теперь получает " + (SalKristina * 1.1) +
                " рублей. Годовой доход вырос на " + ((SalKristina * 1.1) - SalKristina) + " рублей");


            }
}