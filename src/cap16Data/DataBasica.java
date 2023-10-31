package cap16Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataBasica {
    public static void main(String[] args) {
        String formatString = "yyyy/MM/dd hh:mm.ss";
        // 
        Date date = Calendar.getInstance().getTime();
        // 
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
        // 
        String formattedDate = simpleDateFormat.format(date);
        // 
        System.out.println(formattedDate);
        // Linha única para o código acima
        System.out.println(new SimpleDateFormat("yyyy/MM/ddhh:mm.ss").format(Calendar.getInstance().getTime()));
    }
}
