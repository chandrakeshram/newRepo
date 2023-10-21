public class pro {
    public static int lift(int x, int y, int z) {
        int cnt = 0;
        if (x == y && y == z) {
            return 30 + x;
        }
        while (true) {
            if (x == 0 && y == 0 && z == 0)
                break;
            if (x == 0) {
                x = 0;
            } else
                x -= 2;
            if (y == 0) {
                y = 0;
            } else
                y -= 2;
            if (z == 0) {
                z = 0;
            } else
                z -= 2;
            cnt += 3;
            System.out.println("Value of x " + x + " Value of y " + y + " Value of z " + z);

        }
        return cnt + 30;
    }

    public static void main(String[] args) {
        System.out.println(lift(8, 4, 4));
    }
}