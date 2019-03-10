import java.util.*;



public class Main {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        HashSet<String> array2 = new HashSet<>();

        {
            array1.add("Стол");
            array1.add("Стул");
            array1.add("Скатерть");
            array1.add("Стол");
            array1.add("Скатерть");
            array1.add("Стул");
            array1.add("Скатерть");
            array1.add("Книга");
            array1.add("Стул");
            array1.add("Стол");
            array1.add("Папка");
            array1.add("Скатерть");
            array1.add("Стул");
            array1.add("Скалка");
            array1.add("Папка");
            array1.add("Папка");
            array1.add("Кружка");
            array1.add("Папка");
            array1.add("Папка");
            array1.add("Папка");
            Iterator<String> iter = array1.iterator();
            while(iter.hasNext()){
                array2.add(iter.next());
            }
        }
        System.out.println(array2);

    }
}
