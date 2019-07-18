import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String str = "0.34";
		/*double strs = Double.valueOf(str);
		System.out.println(strs);
		BigDecimal b = new BigDecimal(str);
		BigDecimal b1 = new BigDecimal(strs);
		System.out.println(b);
		System.out.println(b1);*/
		
		Test t = new Test();
		String date = t.dateAddOne("20200230", 1);
		System.out.println(date);
		

	}
	
	private String dateAddOne(String sDate,Integer a){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
			Date endDate = sdf.parse(sDate);
            Calendar c = Calendar.getInstance();  
            c.setTime(endDate);  
            c.add(Calendar.DAY_OF_MONTH, a);           
            endDate = c.getTime();
            sDate = sdf.format(endDate);
            return sDate;
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
			return "";
		}
	}
}
