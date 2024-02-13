public class forEach {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        String[] ars = {"deepan", "Nava"};

        // for each loop prints every element in array
        for(String a : ars){
            System.out.println(a);
        }

        for (int i: arr){
            System.out.println(i);
        }
    }
}
