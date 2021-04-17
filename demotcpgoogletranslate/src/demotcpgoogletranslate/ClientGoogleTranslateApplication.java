/*
 * This main program will act as the client side
 * This program will insert the text and ask request to the server to translate the text
 * 
 * @author SyairahSazalee
 * 
 */
package demotcpgoogletranslate;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class ClientGoogleTranslateApplication {
	public static void main (String[] args)
	{
		try
		{
			//connect to the server at localhost, port 4228
			Socket socket = new Socket (InetAddress.getLocalHost(), 4228);
			
			//Insert text to be translate by the server side
			String text = GoogleTranslateGenerator.translateText("Selamat malam");
			
			//Create stream to write data on the network
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			//Send current data back to the client 
			outputStream.writeBytes(text);
		
			//Close socket
			socket.close();
			
			//Print text that has been translate from the server
			System.out.println(text);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
