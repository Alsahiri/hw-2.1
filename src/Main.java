public class Main {

    public static void separator() {
        System.out.println("===================");
        System.out.println();
    }
    public static void compareStudentsFromGryffindor(Gryffindor student1, Gryffindor student2) {

        System.out.println("У " + student1.getName() + ":" + "\n" +
                "Благородство - " + student1.getQuality1() + "\n" +
                "Честь - " + student1.getQuality2() + "\n" +
                "Храбрость - " + student1.getQuality3());

        System.out.println("У " + student2.getName() + ":" + "\n" +
                "Благородство - " + student2.getQuality1() + "\n" +
                "Честь - " + student2.getQuality2() + "\n" +
                "Храбрость - " + student2.getQuality3());

        int sum1 = student1.getQuality1()+student1.getQuality2()+student1.getQuality3();
        int sum2 = student2.getQuality1()+student2.getQuality2()+student2.getQuality3();

        System.out.println("У " + student1.getName() + " сумма баллов равна " + sum1 + " , а у " + student2.getName() + " сумма баллов равна " + sum2);

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
        if (sum1==sum2) {
            System.out.println(student1.getName()+" и "+student2.getName() + " оба лучшие Гриффиндорцы");
        }
    }
    public static void compareStudentsFromSlytherin(Slytherin student1, Slytherin student2) {

        System.out.println("У " + student1.getName() + ":" + "\n" +
                "Хитрость - " + student1.getQuality1() + "\n" +
                "Решительость - " + student1.getQuality2() + "\n" +
                "Амбициозность - " + student1.getQuality3()+ "\n"+
                "Находчивсоть - "+ student1.getQuality4()+"\n"+
                "Жажда власти - "+student1.getQuality5());

        System.out.println("У " + student2.getName() + ":" + "\n" +
                "Хитрость - " + student2.getQuality1() + "\n" +
                "Решительость - " + student2.getQuality2() + "\n" +
                "Амбициозность - " + student2.getQuality3()+ "\n"+
                "Находчивсоть - "+ student2.getQuality4()+"\n"+
                "Жажда власти - "+student2.getQuality5());

        int sum1 = student1.getQuality1() + student1.getQuality2() + student1.getQuality3() + student1.getQuality4() + student1.getQuality5();
        int sum2 = student2.getQuality1() + student2.getQuality2() + student2.getQuality3() + student2.getQuality4() + student2.getQuality5();

        System.out.println("У " + student1.getName() + " сумма баллов равна " + sum1 + " , а у " + student2.getName() + " сумма баллов равна " + sum2);

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
        if (sum1==sum2) {
            System.out.println(student1.getName()+" и "+student2.getName() + " оба лучшие Слизеринцы");
        }
    }
    public static void compareStudentsFromRavenclaw(Ravenclaw student1, Ravenclaw student2) {

        System.out.println("У " + student1.getName() + ":" + "\n" +
                "Умственные способности - " + student1.getQuality1() + "\n" +
                "Мудрость - " + student1.getQuality2() + "\n" +
                "Остроумие - " + student1.getQuality3()+"\n"+
                "Творчество - "+student1.getQuality4());

        System.out.println("У " + student2.getName() + ":" + "\n" +
                "Умственные способности - " + student2.getQuality1() + "\n" +
                "Мудрость - " + student2.getQuality2() + "\n" +
                "Остроумие - " + student2.getQuality3()+"\n"+
                "Творчество - "+student2.getQuality4());

        int sum1 = student1.getQuality1()+student1.getQuality2()+student1.getQuality3();
        int sum2 = student2.getQuality1()+student2.getQuality2()+student2.getQuality3();

        System.out.println("У " + student1.getName() + " сумма баллов равна " + sum1 + " , а у " + student2.getName() + " сумма баллов равна " + sum2);

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
        if (sum1==sum2) {
            System.out.println(student1.getName()+" и "+student2.getName() + " оба лучшие Когтевранцы");
        }
    }
    public static void compareStudentsFromHufflepuff(Hufflepuff student1, Hufflepuff student2) {

        System.out.println("У " + student1.getName() + ":" + "\n" +
                "Трудолюбие - " + student1.getQuality1() + "\n" +
                "Верность - " + student1.getQuality2() + "\n" +
                "Честность - " + student1.getQuality3());

        System.out.println("У " + student2.getName() + ":" + "\n" +
                "Трудолюбие - " + student2.getQuality1() + "\n" +
                "Верность - " + student2.getQuality2() + "\n" +
                "Честность - " + student2.getQuality3());

        int sum1 = student1.getQuality1()+student1.getQuality2()+student1.getQuality3();
        int sum2 = student2.getQuality1()+student2.getQuality2()+student2.getQuality3();

        System.out.println("У " + student1.getName() + " сумма баллов равна " + sum1 + " , а у " + student2.getName() + " сумма баллов равна " + sum2);

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффиндуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффиндуец, чем " + student1.getName());
        }
        if (sum1 == sum2) {
            System.out.println(student1.getName() + " и " + student2.getName() + " оба лучшие Пуффиндуйцы");
        }
    }
    public static void compareStudentsSpellPower(Hogwarts student1, Hogwarts student2) {
        if (student1.getSpellPower() > student2.getSpellPower()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName());
        } else if (student2.getSpellPower() > student1.getSpellPower()) {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " обладают одинаковой мощностью магии");
        }
    }
        public static void compareStudentsTransgressionDistance(Hogwarts student1, Hogwarts student2) {
            if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
                System.out.println(student1.getName() + " может трансгрессиоровать на бОльшее расстояние, чем " + student2.getName());
            } else if (student2.getTransgressionDistance() > student1.getTransgressionDistance()) {
                System.out.println(student2.getName() + " может трансгрессиоровать на бОльшее расстояние, чем " + student1.getName());
            } else {
                System.out.println(student1.getName() + " и " + student2.getName() + " могут трансгрессиоровать на одинаковое расстояние");
            }
    }
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 10, 10, 10, 20, 12);
        Gryffindor germoinGrendger = new Gryffindor("Гермиона Грейнджер", 20, 20, 10, 10, 10);
        Gryffindor ronUizli = new Gryffindor("Рон Уизли", 7, 7, 10, 10, 15);

        Slytherin drakoMalfou = new Slytherin("Драко Молфой", 11, 9, 10, 21, 12,13,14);
        Slytherin grahamMontegu = new Slytherin("Грехем Монтегю", 9, 50, 10, 13, 10,14,19);
        Slytherin gregoriGoil = new Slytherin("Грегори Гоил", 7, 25, 10, 10, 10,20,20);

        Ravenclaw chjoChang = new Ravenclaw("Чжоу Чанг", 5, 11, 11, 20, 12,20);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 16, 10, 10, 20, 10,22);
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус Белби", 8, 17, 10, 10, 35,5);

        Hufflepuff zahariyaSmit = new Hufflepuff("Захария Смит", 11, 10, 10, 20, 22);
        Hufflepuff sedricDigori = new Hufflepuff("Седрик Дигори", 20, 10, 10, 40, 10);
        Hufflepuff djastinFinchFletchli = new Hufflepuff("Джастин Финч-Флетчли", 7, 47, 10, 33, 15);

        System.out.println(harryPotter);
        separator();
        compareStudentsFromGryffindor(harryPotter, germoinGrendger);
        separator();
        compareStudentsSpellPower(chjoChang,sedricDigori);
        separator();
        compareStudentsTransgressionDistance(grahamMontegu,marcusBelbi);
        separator();
        compareStudentsFromHufflepuff(zahariyaSmit, djastinFinchFletchli);
        separator();
        compareStudentsFromRavenclaw(padmaPatil, marcusBelbi);
        separator();
        compareStudentsFromSlytherin(drakoMalfou, gregoriGoil);
        separator();
        compareStudentsSpellPower(germoinGrendger,drakoMalfou);
    }

}