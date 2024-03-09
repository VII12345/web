public class TestInit {

    int x;

    public static void main(String[] args) {
        TestInit init = new TestInit();
        int x = (int) (Math.random() * 100);
        int y = 0;
        int z;
        if (x > 50) {
            y = 9;
        }
        z = x + y + init.x;
        // The local variable y may not have been initialized
        // 错误: 可能尚未初始化变量y

        System.out.println("x=" + x + "y=" + y + "z=" + z);
        System.out.println();
        System.out.printf("x=%d, y=%d, z=%d", x, y, z);
    }

}
