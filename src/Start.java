public class Start {
    public static void main(String[] args) {


        int a = 15;
        System.out.println(a += 5);
        System.out.println(a -= 4);

        int b = a;
        System.out.println(++b);

        if (b % 2 == 0) {
            System.out.println("b is an even number!");
        } else {
            System.out.println("b is an odd number!");

        }
        int result1 = b*(b+1);
        if (result1 %3 == 0){
            System.out.println("true");
        }









    }
}
