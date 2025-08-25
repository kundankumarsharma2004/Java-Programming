package methods;

public class type4 {
    int a;
    int b;
    int res;

    int add(int x,int y) {

        res = x + y;
        return res;
    }
}
class Lunch3 {
    public static void main(String[] args) {
        methods.type4 calc = new type4();
        int a = 10;
        int b = 20;
        int sum = calc.add(a,b);
        System.out.println(sum);

    }
}
