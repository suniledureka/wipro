import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest1 {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
		String formattedDate = formatter.format(d);
		System.out.println(formattedDate);
		System.out.println();
		
		Date date1=null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter check-in date (dd/mm/yy):");
        String cinput = input.nextLine();
        if(null != cinput && cinput.trim().length() > 0){
             date1 = format.parse(cinput);
        }
        
        System.out.print(format.format(date1)); 

	}

}
