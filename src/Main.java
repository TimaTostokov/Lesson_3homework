import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       double[] apple = {15.3, -1.5, 1.3, 3.5, 5.7, 6.6, -9.9, 7.5, -3, 4.4, 6.8, 1.2, 1.6 , -1.7, -1.3};
       boolean test = false;
       double som = 0;
       int num = 0;
       for (double a: apple){
           if (a < 0){
               test = true;

            } else if (test && a > 0) {
               som = som + a;
               num++;
           }
       }
       som = som / num;
        System.out.println(Arrays.toString(apple) + " = " + som);
        }
    }
