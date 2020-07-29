package Optional_demerging;

import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Queue<Person> queueFemale = new LinkedList<>();
        Queue<Person> queueMale = new LinkedList<>();

        ArrayList<Person> arrayList = setPerson();

        for (Person person : arrayList) {
            String name = "NU";
            if (person.getRender().equals(name)) {
                queueFemale.add(person);
            } else {
                queueMale.add(person);
            }
        }

//        System.out.println("Hiển thị queue NU: ");
//        for (Person person : queueFemale){
//            System.out.println(person);
//        }
//
//        System.out.println("Hiển thị queue NAM: ");
//        for (Person person : queueMale){
//            System.out.println(person);
//        }

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("female.txt"));
            for (Person person : queueFemale) {
                objectOutputStream.writeObject(person);
            }
            for (Person person : queueMale) {
                objectOutputStream.writeObject(person);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        try {
            readFile();
        } catch (IOException | ClassNotFoundException ioe) {
            System.out.println(ioe.getMessage());
        }

//        System.out.println("List đã sắp xếp: ");
//        sortListByRenderAndBirthday(arrayList);
    }

    private static void readFile() throws IOException, ClassNotFoundException, EOFException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("female.txt"));
        Person person;
        Queue<Person> personQueue = null;
        while ((person = (Person) objectInputStream.readObject()) != null) {
            System.out.println(person);
        }
    }

    private static void sortListByRenderAndBirthday(ArrayList<Person> arrayList) {
        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getRender().equals(p2.getRender())) {
                    return p1.getBirthday() - (p2.getBirthday());
                }
                return p2.getRender().compareTo(p1.getRender());
            }
        });

        for (Person person : arrayList) {
            System.out.println(person);
        }
    }

    private static ArrayList<Person> setPerson() {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Hoa", "NU", 16));
        arrayList.add(new Person("Linh", "NU", 19));
        arrayList.add(new Person("Thuy", "NU", 11));
        arrayList.add(new Person("Anh", "NU", 26));
        arrayList.add(new Person("Tung", "NAM", 28));
        arrayList.add(new Person("Huy", "NAM", 31));
        arrayList.add(new Person("Dung", "NAM", 8));
        arrayList.add(new Person("Minh", "NAM", 5));
        return arrayList;
    }
}
