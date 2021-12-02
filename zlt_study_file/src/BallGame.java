import javax.swing.JFrame;
import java.awt.*;

public class BallGame extends JFrame{
    //添加小球和桌面图片的路径
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
    //指定小球的初始位置
    //小球的横坐标
    double x=100;
    //小球的纵坐标
    double y=100;
    //判断小球的方向
    boolean right = true;

    //画窗口的方法：加载小球与桌面
    public void paint(Graphics g){
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
        //改变小球坐标
        if(right){ x = x +10; }else{x = x - 10; }
        //边界检测 //856 是窗口宽度，40 是桌子边框的宽度，30 是小球的直径
        if(x>856-40-30){
            right = false;
        }
        if(x<40){
            right = true;
        }
    }

    // 窗口加载
    void launchFrame() {
        setSize(860, 500);
        setLocation(400, 400);
        setVisible(true);
        //重画窗口,每秒画 25 次
        while(true) {
            repaint();
            //调用 repaint 方法，窗口即可重画
            try {
                Thread.sleep(40); //40ms, 1 秒=1000 毫秒. 大约一秒画 25 次窗口
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(" 我是尚学堂高淇，这个游戏项目让大家体验编程的快感，" + "寓教于乐！");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
