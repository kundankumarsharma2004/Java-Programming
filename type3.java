package methods;

public class type3 {
        int a;
        int b;
        int res;

        void add(int x,int y) {

            res = x + y;
            System.out.println(res);
        }
    }
    class Lunch2
    {
        public static void main(String[] args) {
            methods.type3 calc = new type3();
           int a = 10;
            int b = 20;
            calc.add(a,b);
        }
    }

