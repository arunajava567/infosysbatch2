import MyMsg.*; 
 
import static MyMsg.Msg.*;  
 
class StaticImportDemo 
{
	public static void main(String args[])
	{
		Msg m = new Msg("Testing static import."); 

		m.showMsg(MIXED); 
		m.showMsg(LOWER); 
		m.showMsg(UPPER); 
	}  
}