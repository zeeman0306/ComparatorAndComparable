import java.util.*;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ComparableInterfaceTesting {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set =  new TreeSet<Person>();

        addElements(list);
        addElements(set);

//        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);


    }

    private static void addElements(Collection<Person> col) {
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Claire"));
        col.add(new Person("Mike"));

    }

    private static void showElements(Collection<Person> col) {
        for (Person element: col){
            System.out.println(element);
        }
    }

}
