public class unaryOperation {
    public static void main(String[] args){
        int a=10, b=20;

        System.out.println("postive and increment operator");
        // +a is same as a, it is to represent positive value
        System.out.println(+a);
        System.out.println(a);

        // both ++a and a++ is increment operator a = a+1
        System.out.println(++a);
        System.out.println(a++);

        System.out.println("negative and decrement operator");
        // -b is to represent negative value
        System.out.println(-b);
        System.out.println(b);

        // both --b and b-- is decrement operator b = b-1
        System.out.println(--b);
        System.out.println(b--);

    }
}
