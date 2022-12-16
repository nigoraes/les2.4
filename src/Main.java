import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("John");
        names.add("Leo");
        names.add("Leo");
        names.add("Mike");
        System.out.println(names);
        names.remove("Leo");
        System.out.println(names);
        names.add("Leo");
        System.out.println(names);
        names.add(2,"Ross");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        //names.clear();
        //System.out.println(names);
        if (names.isEmpty()){
            System.out.println("Да, список пустой. Размер списка " + names.size());
        }else {
            System.out.println("Нет список не пустой. Размер списка " + names.size());
        }
        if (names.contains("Ross")){
            System.out.println("Есть" + names.get(1));
        }else {
            System.out.println("Нет");
        }
        names.set(2,"Smith");
        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Sonya");
        names2.add("Stella");

        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        names.addAll(names2);
        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        names.removeAll(names2);
        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

       /* names.retainAll(names2);
        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        */

        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("---------------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("----------------------");
        names.forEach(name ->{
                    System.out.println(name);
                });

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2323121);
        numbers.add(-313133);
        numbers.add(0);
        System.out.println(numbers);

        User user1 = new User("John",37);
        User user2 = new User("Leo",13);
        User user3 = new User("Mike",44);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user2);
        System.out.println(users);


        HashSet<String> hashSetNames = new HashSet<>();
        hashSetNames.add("John");
        hashSetNames.add("John");
        hashSetNames.add("Leo");
        hashSetNames.add("Mike");
        System.out.println(hashSetNames);


        names.add("Antony");
        names.add("Руслан");
        names.add("Николай");
        names.add(2,"Якуш");

        System.out.println(names);
        System.out.println("-------------------");
        Collections.sort(names);
        System.out.println(names);


        System.out.println(numbers);
        System.out.println("------------------");
        Collections.sort(numbers);
        System.out.println(numbers);


        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        System.out.println(users);
        users.sort(Comparator.comparing(User::getAge));
        System.out.println(users);









        //Практические задание

        System.out.println("---------------------------------------------------------------");
        ArrayList<String> color = new ArrayList<>();
        System.out.println(color);
        color.add("Black");
        color.add("White");
        color.add("Red");
        System.out.println(color);
        System.out.println("-------------");
        System.out.println(color);

        Collections.sort(color);
        System.out.println(color);

        Collections.reverse(color);
        System.out.println(color);

        Collections.shuffle(color);
        System.out.println(color);

        System.out.println("---------------");

        for (String c : color) {
            System.out.println(c);
        }
        System.out.println("-----------");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
    }
}