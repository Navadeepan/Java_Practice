public class forAndNestedFor {
    public static void main(String[] args) {
        // for loop prints upto 5
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // Nested for loop 1st loop a will run then b loop will till the condition
        for(int a = 1; a <= 2; a++){
            for(int b = 1; b <= 2; b++){
                System.out.println(a+ " " +b);
            }
        }
    }
}
