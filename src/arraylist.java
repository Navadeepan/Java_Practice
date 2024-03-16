import java.util.ArrayList;

public class arraylist {
    public static void main (String[] args){

        // any type of data can be added
        ArrayList list1 = new ArrayList();

        String s1 = "nanna";
        int as = 2001;
        // add item to list
        list1.add(12);
        list1.add(11);
        list1.add(122);
        list1.add(1233);
        list1.add(s1);
        list1.add(as);

        // only string can be added
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Nava");
        list2.add("Navadeepan");
        list2.add("Naveen");
        list2.add("Navan");

        System.out.println("list1 - " + list1);
        System.out.println("list2 - " + list2);

        System.out.println("_____________________________________");

        // get the item from list
        // Object is like calling all the data types instead of specifying String or int
        Object x = list1.get(1);
        System.out.println("Second item from list1 is " + x);

        String q = list2.get(1);
        System.out.println("Second item from list2 is " + q);

        System.out.println("_____________________________________");

        // update a item in list
        list1.set(4, "Hi Nana");
        System.out.println(list1);

        System.out.println("_____________________________________");

        //remove a item in list
        String w = list2.remove(1);
        System.out.println(list2);

        System.out.println("_____________________________________");

        // iterate al the items in list
        for( int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

        System.out.println("_____________________________________");




    }
}
