package cn.zuo.util;

import cn.zuo.constant.Const;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zuohui
 * @date 2020/12/6 - 17:52
 * @note 通用工具类
 */
public class CommonUtil {


    /**
     * 获取其他月份的当前时间
     * @param offset  偏移量,负数代表向前获取日期,正数代表向后获取日期
     * @param regex 日期格式化
     */
    public static String getSameDate(int offset,String regex)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, offset);
        Date m = c.getTime();
        return sdf.format(m);
    }

    /**
     * 获取当前时间
     */
    public static String getCurrentDate(String regex)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        return sdf.format(new Date());
    }


}
