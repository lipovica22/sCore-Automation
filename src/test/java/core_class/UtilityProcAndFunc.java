package core_class;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class UtilityProcAndFunc {

    private static boolean isEmptyString(String string) {

        return string == null || string.isEmpty();
    }

    public static String GetRandomString(int length) throws Exception {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        byte[] data = new byte[length];

        try{
            SecureRandom random = new SecureRandom();
            random.nextBytes(data);
            StringBuilder result = new StringBuilder(length);

            for (byte b: data){
                result.append(chars[b % (chars.length)]);
            }

            return result.toString();

        }catch (Exception ex){
            throw new Exception("GetRandomString: " + ex.getMessage());
        }
    }

    public static String GetRandomNumber(int length) throws Exception {
        char[] chars = "0123456789".toCharArray();
        byte[] data = new byte[length];

        try {
            SecureRandom random = new SecureRandom();
            random.nextBytes(data);
            StringBuilder result = new StringBuilder(length);

            for (byte b: data){
                result.append(chars[b % (chars.length)]);
            }

            return result.toString();

        }catch (Exception ex){
            throw new Exception("GetRandomNumber: " + ex.getMessage());
        }
    }

    public static String TodayDate(String format)
    {
        Date date = new Date();
        SimpleDateFormat formatterDMY = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formatterParameter = new SimpleDateFormat();

        return isEmptyString(format) ? formatterDMY.format(date) : formatterParameter.format(format);
    }

    public static String NextDayAnnex(int day) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();

        try{
            calendar.add(Calendar.DAY_OF_MONTH, day);
            return formatter.format(calendar.getTime());
        }catch(Exception ex){
            throw new Exception("NextDayAnnex: " + ex.getMessage());
        }
    }
}
