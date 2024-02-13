public class switchCase {
    public static void main(String[] args){
        int age = 17;

        switch (age){
            case (18):
                System.out.println("Eligible to vote");
                break;
            case (17):
                System.out.println("Not eligible to vote");
                break;
            default:
                System.out.println("To check vote eligible");

        }
    }
}
