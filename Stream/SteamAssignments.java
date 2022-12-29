package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


    public class SteamAssignments {
        public static void main(String args[]) {
            //Fruits------
            getFruits().stream()
                    .filter((fruits) -> fruits.getCalories() < 100).sorted(Comparator.comparingInt(Fruits::getCalories).reversed())
                    .forEach((fruits) -> System.out.println(fruits.getName()));

            System.out.println("--------------------------------------------------");
            getFruits().stream()
                    .filter((fruits) -> fruits.getColor().startsWith("Yellow"))
                    .forEach((fruits) -> System.out.println(fruits.getName()));

            System.out.println("--------------------------------------------------");
            getFruits().stream()
                    .filter((fruits) -> fruits.getColor().startsWith("Red"))
                    .forEach((fruits) -> System.out.println(fruits.getName()));

            System.out.println("--------------------------------------------------");
            getNews().stream()
                    .max(Comparator.comparing(News::getComment))
                    .ifPresent((news)->System.out.println(news));

            System.out.println("--------------------------------------------------");
            getTrader().stream().distinct().forEach(p -> System.out.println(p.getCity()));

            System.out.println("--------------------------------------------------");
            List<Trader> ob1 = getTrader().stream().filter(p -> p.getCity().equals("Pune")).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
            ob1.forEach(p->System.out.println("City - "+p.getCity()+" | Trader Name - "+p.getName()));

            System.out.println("--------------------------------------------------");
            List<Trader> ob2 = getTrader().stream().sorted(Comparator.comparing(Trader::getCity)).collect(Collectors.toList());
            ob2.forEach(p->System.out.println(p.getCity()));

            System.out.println("--------------------------------------------------");
            List<Trader> ob3 = getTrader().stream().filter(p -> p.getCity().equals("Indore")).collect(Collectors.toList());
            System.out.println(ob3);

            System.out.println("--------------------------------------------------");
            getTrader().stream().sorted(Comparator.comparing(Trader::getName)).forEach(p->System.out.println(p.getName()));
        }

        public static List<Fruits> getFruits() {
            List<Fruits> list1 = new ArrayList<Fruits>();
            list1.add(new Fruits("Apple", 80, 500, "Red"));
            list1.add(new Fruits("Banana", 150, 300, "Yellow"));
            list1.add(new Fruits("Orange", 90, 400, "Orange"));
            list1.add(new Fruits("Mango", 200, 590, "Green"));
            list1.add(new Fruits("Pineapple", 100, 700, "Yellow"));
            list1.add(new Fruits("Strawberry", 150, 300, "Red"));
            return list1;

        }

        public static List<News> getNews() {
            List<News> list2 = new ArrayList<News>();
            list2.add(new News(90070041, "Ram", "Not a useful information ,its out of budget", "Not satisfied"));
            list2.add(new News(90070032, "Sara", "Not a useful information but good news", "satisfied atleast"));
            list2.add(new News(90070053, "Sam", "Useful Information,its comes in budget", "satisfied"));
            list2.add(new News(90070024, "Mike", "Is it a news,it not working?", "Not Good atleast (T-T) "));
            list2.add(new News(90070032, "Sara", "I tried it again & it works", "Good"));
            list2.add(new News(90070024, "Mike", "I tried it again , its not working in budget", "not satisfying"));
            list2.add(new News(90070024, "Mike", "Its working", " Ok Ok "));
            return list2;
        }

        public static List<Trader> getTrader() {
            List<Trader> list3 = new ArrayList<Trader>();
            list3.add(new Trader("Ram", "U.P"));
            list3.add(new Trader("Sara", "Pune"));
            list3.add(new Trader("Mike", "Goa"));
            list3.add(new Trader("Demi", "Mumbai"));
            list3.add(new Trader("Sohan", "Pune"));
            list3.add(new Trader("Ayushi", "Kolkata"));
            return list3;
        }

        public static List<Transaction> getTransaction() {
            List<Transaction> list4 = new ArrayList<Transaction>();
            list4.add(new Transaction( 2020, 2000));
            list4.add(new Transaction(2018, 3000));
            list4.add(new Transaction(2022, 9000));
            list4.add(new Transaction(2017, 7000));
            list4.add(new Transaction(2001, 5000));
            list4.add(new Transaction(2005, 3000));
            return list4;
        }
    }