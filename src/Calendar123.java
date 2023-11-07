import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Calendar123 {

    /**
     * Calendar日历(抽象类)的使用
     */
    @Test
    public void Calendar1(){
        //1.实例化
        //方式一:创建其子类(GregorianCalendar)的对象
        //方式二:调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);  //获取当前月的多少号  2022/6/20
        System.out.println(days); //20
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));  //171

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);  //改成当月的22号
        int days1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);  //22

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        int days2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days2);  //22+3=25

        //getTime():日历类--->Date
        Date date = calendar.getTime();
        System.out.println(date);  //Sat Jun 25 09:50:49 CST 2022

        //setTime():Date--->日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        int date2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(date2);  //20


    }
}
