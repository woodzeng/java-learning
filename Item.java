import java.util.Scanner;

public class Item {
    String name;
    Float price;

    // 启动，无返回值
    void start(String name) {
        System.out.println(name + "启动");
    }

    // 获取价格，有返回值
    float getPrice() {
        return price;
    }

    // 提高价格
    void addPrice(int add) {
        price = price + add;
    }

    public static void main(String[] args) {
        Item car = new Item();
        car.name = "汽车";
        car.price = 10000.23f;

        Item bike = new Item();
        bike.name = "单车";
        bike.price = 100.23f; // 小数默认是double类型，加f转换为float类型
        bike.addPrice(10);

        bike.start(bike.name);

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数: " + a);
        int b = s.nextInt();
        System.out.println("第二个整数: " + b);
        s.close();
    }
}