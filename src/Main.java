import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать!");
        while (true) {
            System.out.println("Введите отдел");
            String ch = scanner.nextLine();
            System.out.println("Чтобы вы хотели?");
            if (Objects.equals(ch, "фрукты")) {
                System.out.println("яблоко");
                System.out.println("банан");
                System.out.println("киви");
                System.out.println("груша");
                System.out.println("клубника");
                System.out.println("мандарин");
                String prod = scanner.nextLine();
                if (Objects.equals(prod, "яблоко")) {
                    System.out.println("Цена яблоки 60сом за кг");
                    System.out.println("Сколько вам кг?");
                    int quantity = scanner.nextInt();
                    System.out.println("Яблоко\n" + "кг" + quantity + "\n" + " вас-" + 60 * quantity);
                }
                if (Objects.equals(prod, "банан")) {
                    System.out.println("Цена бананов 30сом");
                    System.out.println("Введите количество:");
                    int quantity = scanner.nextInt();
                    System.out.println("Банан\n" + "количество" + quantity + "\n" + "С вас-" + 30 * quantity);
                }
                if (Objects.equals(prod, "киви")) {
                    System.out.println("Цена киви 200сом");
                    System.out.println("Введите количество:");
                    int quantity = scanner.nextInt();
                    System.out.println("Киви\n" + "количество" + quantity + "\n" + "С вас-" + 200 * quantity);
                }
                if (Objects.equals(prod, "груша")) {
                    System.out.println("Цена груши 150сом за кг");
                    System.out.println("Сколько вам кг?");
                    int quantity = scanner.nextInt();
                    System.out.println("Груша\n" + "кг" + quantity + "\n" + "С вас-" + 150 * quantity);
                }
                if (Objects.equals(prod, "клубника")) {
                    System.out.println("Цена клубники 100сом за кг");
                    System.out.println("Сколько вам кг?");
                    int quantity = scanner.nextInt();
                    System.out.println("Клубника\n" + "кг" + quantity + "\n" + "С вас-" + 100 * quantity);
                }
                if (Objects.equals(prod, "мандарин")) {
                    System.out.println("Цена мандарина 200сом за кг ");
                    System.out.println("Сколько вам кг?");
                    int quantity = scanner.nextInt();
                    System.out.println("Мандарин\n" + "кг" + quantity + "\n" + "C вас-" + 200 * quantity);
                }
                break;


            }
            if (Objects.equals(ch, "Мыломоющие")) {
                System.out.println("Порошок");
                System.out.println("Зубная паста");
                System.out.println("Шампунь");
                System.out.println("Белизна");
                String string = scanner.nextLine();

                if (Objects.equals(string, "Порошок")) {
                    System.out.println("Цена порошка 70сом");
                    System.out.println("Сколько вам кг?");
                    int quantity = scanner.nextInt();
                    System.out.println("Порошок\n" + "кг" + quantity + "\n" + "С вас-" + 70 * quantity);
                }
                if (Objects.equals(string, "Зубная паста")) {
                    System.out.println("Цена зубной пасты 110сом");
                    System.out.println("Сколько вам шт?");
                    int quantity = scanner.nextInt();
                    System.out.println("Зубная паста\n" + "шт" + quantity + "\n" + "С вас-" + 110 * quantity);
                }
                if (Objects.equals(string, "Шампунь")) {
                    System.out.println("Цена шампуня 320сом");
                    System.out.println("Вам сколько надо?");
                    int quantity = scanner.nextInt();
                    System.out.println("Шампунь\n" + "шт" + quantity + "\n" + "C вас-" + 320 * quantity);
                }
                if (Objects.equals(string, "Белизна")) {
                    System.out.println("Цена белизны 190сом");
                    System.out.println("Сколько шт вам надо?");
                    int quantity = scanner.nextInt();
                    System.out.println("Белизна\n" + "шт" + quantity + "\n" + "С вас-" + 190 * quantity);
                }
                break;
            }
            if (Objects.equals(ch, "хлебобулочный")) {
                System.out.println("Хлеб");
                System.out.println("Булочки");
                System.out.println("Батоны");
                System.out.println("Сухарики");
                String string = scanner.nextLine();
                if (Objects.equals(string, "Хлеб")) {
                    System.out.println("Цена за один хлеб-25сом");
                    System.out.println("Сколько вам надо?");
                    int quantity = scanner.nextInt();
                    System.out.println("Хлеб\n" + "шт" + quantity + "\n" + "С вас-" + 25 * quantity);
                }
                if (Objects.equals(string, "Булочки")) {
                    System.out.println("Цена булочки 30сом");
                    System.out.println("Сколько булочек вы хотите?");
                    int quantity = scanner.nextInt();
                    System.out.println("Булочки\n" + "шт" + quantity + "\n" + "С вас-" + 30 * quantity);
                }
                if (Objects.equals(string, "Батоны")) {
                    System.out.println("Цена батона 105сом");
                    System.out.println("Сколько батонов вам надо?");
                    int quantity = scanner.nextInt();
                    System.out.println("Батоны\n" + "шт" + quantity + "\n" + "С вас-" + 105 * quantity);
                }
                if (Objects.equals(string, "Сухарики")) {
                    System.out.println("Цена сухариков 120сом");
                    System.out.println("Сколько вам надо?");
                    int quantity = scanner.nextInt();
                    System.out.println("Сухарики\n" + "шт" + quantity + "\n" + "С вас-" + 120 * quantity);
                }
                break;
                }
                if (Objects.equals(ch,"Напитки")) {
                    System.out.println("Кола");
                    System.out.println("Фанта");
                    System.out.println("Любимый");
                    System.out.println("Спрайт");
                    System.out.println("Lets go");
                    String string = scanner.nextLine();
                    if (Objects.equals(string, "Кола")) {
                        System.out.println("Цена колы 85сом");
                        System.out.println("Cколько шт вам надо?");
                        int quantity = scanner.nextInt();
                        System.out.println("Кола\n" + "шт" + quantity + "\n" + "C вас-" + 85 * quantity);
                    }
                    if (Objects.equals(string, "Фанта")) {
                        System.out.println("Цена за фанту 85сом");
                        System.out.println("Сколько вам надо шт?");
                        int quantity = scanner.nextInt();
                        System.out.println("Фанта\n" + "шт" + quantity + "\n" + "С вас-" + 85 * quantity);
                    }
                    if (Objects.equals(string, "Любимый")) {
                        System.out.println("Цена за Любимый 95сом");
                        System.out.println("Сколько вам надо?");
                        int quantity = scanner.nextInt();
                        System.out.println("Любимый\n" + "шт" + quantity + "\n" + "С вас-" + 95 * quantity);
                    }
                    if (Objects.equals(string, "Спрайт")) {
                        System.out.println("Цена за спрайт 80сом");
                        System.out.println("Cколько вам надо?");
                        int quantity = scanner.nextInt();
                        System.out.println("Спрайт\n" + "шт" + quantity + "\n" + "С вас-" + 80 * quantity);
                    }
                    if (Objects.equals(string, "Lets go")) {
                        System.out.println("Цена за Lets go 70сом");
                        System.out.println("Скольлко вам надо?");
                        int quantity = scanner.nextInt();
                        System.out.println("Lers go\n" + "шт" + quantity + "\n" + "С вас-" + 70 * quantity);
                    }
                    break;
                }
                if (Objects.equals(ch,"Молочные продукты")){
                    System.out.println("Творог");
                    System.out.println("Молоко");
                    System.out.println("Кефир");
                    System.out.println("Сметана");
                    String string=scanner.nextLine();
                    if (Objects.equals(string,"Творог")){
                        System.out.println("Цена за творог 78сом");
                        System.out.println("Сколько вам надо?");
                        int quantity=scanner.nextInt();
                        System.out.println("Творог\n"+"шт"+quantity+"\n"+"С вас-"+ 78*quantity);
                    }
                    if (Objects.equals(string,"Молоко")){
                        System.out.println("Цена за литр молока 50 сом");
                        System.out.println("Сколько литров вам надо?");
                        int quantity= scanner.nextInt();
                        System.out.println("Молоко\n"+"шт"+quantity+"\n"+" вас-"+ 50*quantity);
                    }
                    if (Objects.equals(string,"Кефир")){
                        System.out.println("Цена кефира 70сом");
                        System.out.println("Сколько коробок вам надо?");
                        int quantity= scanner.nextInt();
                        System.out.println("Кефир\n"+"шт"+quantity+"\n"+"С вас-"+ 70*quantity);
                    }
                    if (Objects.equals(string,"Сметана")){
                        System.out.println("Цена за сметану 75сом");
                        System.out.println("Сколько шт вам надо?");
                        int quantity= scanner.nextInt();
                        System.out.println("Сметана\n"+"шт"+quantity+"\n"+"С вас-"+ 75*quantity);
                    }
                    break;
            }
        }
    }
}



