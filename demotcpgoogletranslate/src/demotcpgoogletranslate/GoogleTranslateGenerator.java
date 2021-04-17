/*
 * This class will generate the translator for the word or text insert from the client side
 * 
 * @author SyaqirahSazalee
 */
package demotcpgoogletranslate;

public class GoogleTranslateGenerator {

	public static String text;
	public static String translateText;
	
	public GoogleTranslateGenerator()
	{
		this.text = text;
		this.translateText = translateText;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void setTranslateText(String translateText)
	{
		this.translateText = translateText;
	}
	
	public String getTranslateText()
	{
		return translateText;
	}
	
	public static String translateText (String text)
	{
		
		if (text == "Selamat pagi")
		{
			translateText = "Good morning";
		}
		if (text == "Selamat malam")
		{
			translateText = "Good night";
		}
		if (text == "Apa khabar?")
		{
			translateText = "How are you?";
		}
		if (text == "Terima kasih")
		{
			translateText = "Thank you";
		}
		if (text == "Selamat tinggal")
		{
			translateText = "Goodbye";
		}
		if (text == "Ada apa?")
		{
			translateText = "What's up?";
		}
		
		return translateText;
	}
}
