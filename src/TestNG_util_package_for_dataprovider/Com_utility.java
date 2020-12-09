package TestNG_util_package_for_dataprovider;

import java.util.ArrayList;
import com.excel.utility.Xls_Reader;
public class Com_utility {
	Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromeExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try{
			
			reader = new Xls_Reader(
					System.getProperty("user.dir")
					+"C://Users//Yogi//workspace//Selenium concepts//src//TestNG_Parameter_cocept//facebook.xlsx");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		for(int rowCount =2; rowCount <= reader.getRowCount("PRSCrossRef"); rowCount++)
		{
			
				String phone = reader.getCellData("LoginTestData", "Phone", rowCount);
				String pass = reader.getCellData("LoginTestData", "pass", rowCount);
				myData.add(new Object[]{phone,pass});
				
		
		}
		return myData;
		
		
		
		
	}
}
