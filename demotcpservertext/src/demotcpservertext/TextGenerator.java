package demotcpservertext;

/*
 * This class generate text
 * @author SyaqirahSazalee (B031910082)
 */

public class TextGenerator {

	protected static String currentText;
	
	public TextGenerator()
	{
		this.currentText = currentText;
	}
	
	public void setCurrentText(String currentText)
	{
		this.currentText = currentText;
	}
	
	public static String getCurrentText()
	{	
		return currentText;
	}
	
   public static int calculateText(String currentText)
   {
        int count = 1;
        for(int i=0; i<=currentText.length()-1; i++)
        {
            if(currentText.charAt(i) == ' ' && currentText.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        
        return count;
    }
}
