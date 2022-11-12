import java.util.Random;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int val = 0;

        Random rand = new Random();

        for (int i = 0; i < 50; i ++) {
            val = rand.nextInt();
        }
        System.out.println(val);

        System.out.println(val + 1);

        

    }
}
