package notepad.itcast.cn.notepad.utils;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DBUtils {
    public static final String DATABASE_NAME = "Notepad";
    public static final String DATAbASE_TABLE = "Note";
    public static final int DATABASE_VERION = 1;
    public static final String NOTEPAD_ID = "id";
    public static final String NOTEPAD_CONTENT = "content";
    public static final String NOTEPAD_TIME = "notetime";

    public static final String getTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }
}
