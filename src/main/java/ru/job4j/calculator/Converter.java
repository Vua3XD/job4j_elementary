package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl =  value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + dollar + " dollars.");

        float inRubToDol = 120;
        float expRubToDol = 2;
        float outRubToDol = Converter.rubleToDollar(inRubToDol);
        boolean pasRubToDol = expRubToDol == outRubToDol;
        System.out.println("120 rubles are 2. Test result : " + pasRubToDol);

        float inRubToEur = 140;
        float expRubToEur = 2;
        float outRubToEur = Converter.rubleToEuro(inRubToEur);
        boolean pasRubToEur = expRubToEur == outRubToEur;
        System.out.println("140 rubles are 2. Test result : " + pasRubToEur);
    }

}
