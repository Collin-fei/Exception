/**
 * Created by Administrator on 2020/9/2.
 */
public class Sleep {
    int time;
    public void stayUp(Sleep s) throws Late{
        if(s.time == 24){
            throw new Late( " 十二点了该睡觉了，别熬夜了" );
        }
    }

    public static void main(String[] args) {
        Sleep s = new Sleep();
        s.time=24;
        try {
            s.stayUp(s);
        } catch (Late late) {
            System.out.println("异常的具体原因:"+late.getMessage());
            late.printStackTrace();
        }

    }
    class Late extends Exception{
        public Late() {
        }
        public  Late(String msg) {
           super(msg) ;
        }
    }
}
