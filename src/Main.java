import Animals.Animals;
import Animals.Herbivores;
import Animals.mammals;
import Animals.predators;
import Animals.amphibians;
import Animals.flightless;
import Animals.flying;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human ( "максим" ,"Минск", 1987, "директор");
        Human anna = new Human ("Анна", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human ("Катя", "Калининград",  1994, "методист образовательных программ");
        Human artem = new Human ("Артем","Москва" , 1995,"методист образовательных программ");
        Human vladimir = new Human ("Владимир", "Казань", 2001, "не работаю");

       // System.out.println("Привет! Меня зовут "+ maxim.name + ". Я из города " + maxim.getTown() + ". Я родился в " + maxim.getYearOfBirth() + " году." + " Я родатаю на должности " + maxim.job + ". Будем знакомы!");
        //System.out.println("Привет! Меня зовут "+ anna.name + ". Я из города " + anna.getTown() + ". Я родился в " + anna.getYearOfBirth() + " году." + " Я родатаю на должности " + anna.job + ". Будем знакомы!");
       // System.out.println("Привет! Меня зовут "+ katya.name + ". Я из города " + katya.getTown() + ". Я родился в " + katya.getYearOfBirth() + " году." + " Я родатаю на должности " + katya.job + ". Будем знакомы!");
       // System.out.println("Привет! Меня зовут "+ artem.name + ". Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() + " году." + " Я родатаю на должности " + artem.job + ". Будем знакомы!");
       // System.out.println("Привет! Меня зовут "+ vladimir.name + ". Я из города " + vladimir.getTown() + ". Я родился в " + vladimir.getYearOfBirth() + " году." + " Я  " + vladimir.job + ". Будем знакомы!");

        Car lada = new Car(
                "Lada",
                "Granta",
                "Россия",
                "желтый",
                1.7,
                2015,
                "механическая",
                "седан",
                "A123AA123",
                5,
                true,
                null,null, 0
                );
        lada.refill();

        Car audi = new Car(
                "Audi",
                "50L TDI",
                "Германия",
                "черный",
                3.0,
                2020,
                "автоматическая",
                "хечбэк",
                "А234АБ321",
                5,
                false,null,null, 0 );
        audi.refill();
        Car bmw = new Car(
                "BMW",
                "Z8",
                "Германия",
                "черный",
                3.0,
                2018,
                "автоматическая",
                "минивен",
                "А345ВА234",
                6,
                true,null,null, 0);
        bmw.refill();
        Car kia = new Car(
                "Kia",
                "Sportage",
                "Южная Корея",
                "красный",
                2.4,
                2018,
                "Автоматическая",
                "седан",
                "А768ВА876",
                5,
                false,null,null, 0);
        kia.refill();
        Car hundai = new Car(
                "Hundai",
                "Avante",
                "Южная Корея",
                "оранжевый",
                1.6,
                2016,
                "механическая",
                "Хечбэк",
                "А987Ва567",
                6,
                true,null,null, 0);
        hundai.refill();

        lada.carPrint();
        audi.carPrint();
        bmw.carPrint();
        kia.carPrint();
        hundai.carPrint();










        Flover roza = new Flover("Роза", "Голландия", 35.59, 0,null);
        Flover hrizantema = new Flover("Хризантема", null, 15, 5, null);
        Flover pion = new Flover("Пион", "Англия", 69.9, 1, null);
        Flover gipsofilla = new Flover( "Гипсофилла", "Турция", 19.5, 10, null);

        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofilla);


        Train  one = new Train ("Ласточка",
                "В-901", 2011,
                "Россия", "белый",
                301, "Белорусский вокзал",
                "Минск", 3500, 0, null, 11 );
        one.refill();

        Train two = new Train ("Ленинград",
                "Д-125", 2019,
                "Россия", "синий",
                270, "Ленинградский вокзал",
                "Ленинград-Пражский", 1700, 0, null, 8 );
        two.refill();

        one.trainPrint();
        two.trainPrint();




        Bus bus1 = new Bus("Волгабус", "С12", 2015, "Россия", "белый", 300);
        bus1.refill();
        Bus bus2 = new Bus("Волгабус", "С20", 2019, "Россия", "оранжевый", 300);
        bus2.refill();
        Bus bus3 = new Bus("Электробус", "В 312-45", 2021, "Россия", "лайм", 320);
        bus3.refill();

        bus1.busPrint();
        bus2.busPrint();
        bus3.busPrint();

        Animals gazelle = new Herbivores ("газель", 2, "саванна", 60, "растительный");
        Animals giraffe = new Herbivores("жираф", 3, "саванна", 45, "растительный");
        Animals horse = new Herbivores("лошадь", 3, "степь", 70, "растительный");
        Animals hyena = new predators ("гиена", 1, "саванна", 40, "жививотного");
        Animals tiger = new predators ("тигр", 3, "саванна", 65, "жививотного");
        Animals bear = new predators ("Медведь", 5, "лес", 60, "животного");
        Animals frog = new amphibians ("лягушка", 1, "болото");
        Animals snake = new amphibians ("уж", 1, "болото");
        Animals peacock = new flightless("павлин", 2, "джунгли", "растительный");
        Animals penguin = new flightless("пингвин", 3, "океан", "рыба");
        Animals gull = new flying("чайка", 1, "морская среда", "рыба");
        Animals albatross = new flying("альбатрос", 1, "морская среда", "рыба");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println( tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println( snake);
        System.out.println(peacock);
        System.out.println( penguin);
        System.out.println( gull);
        System.out.println( albatross);

       gazelle.eat();
       gazelle.slip();
       gazelle.moving();


























    }
}