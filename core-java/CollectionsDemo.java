import java.util.ArrayList;



public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Three");
        arrayList.add("Three");
        arrayList.add(0, "Zero");
        arrayList.remove("Three");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        for(var e : arrayList) {
            System.out.println(e);
        }
    }
}
