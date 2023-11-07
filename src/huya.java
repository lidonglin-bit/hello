import org.junit.Test;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class huya {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
    1.两个操作:
    1.1 格式化:日期 ---> 字符串
    1.2 解析: 格式化逆过程， 字符串 ---> 日期
     */
    @Test
    public void test() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //格式化:日期 ---> 字符串
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        //解析: 格式化逆过程， 字符串 ---> 日期
        String str = "2022-06-18";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

    }

}




