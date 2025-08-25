package methods;

public class type2 {
        int a;
        int b;
        int res;

        int add(int x,int y) {

            res = x + y;
            return res;
        }
    }
    class Lunch1
    {
        public static void main(String[] args) {
            type2 calc = new type2();
            int a = 10;
            int b = 20;
            int sum = calc.add(a,b);
            System.out.println(sum);

        }
    }

