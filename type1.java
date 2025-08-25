package methods;

public class type1 {
    int a;
    int b;
    int res;

    void add() {
        a = 10;
        b = 20;
        res = a + b;
        System.out.println(res);
    }
}
class Lunch
{
    public static void main(String[] args) {
        type1 calc = new type1();
        calc.add();
    }
}
