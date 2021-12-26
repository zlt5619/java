/*
 定义一个“点”（Point）类用来表示二维空间中的点（有两个坐标）。
要求如下：
  可以生成具有特定坐标的点对象。
  提供可以计算该“点”距另外一点距离的方法
 */

public class TestPoint {
    double x, y;

    TestPoint(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double getDistance(TestPoint p) {
        double d = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        return d;
    }

    public static void main(String[] args) {
        TestPoint p1 = new TestPoint(3.0, 4.0);
        TestPoint origin_p = new TestPoint(0, 0);
        System.out.println(p1.getDistance(origin_p));
    }
}
