/*
 * This main class will run as the server side 
 * This program will accept request from teh client to translate the text
 * 
 * @author SyaqirahSazalee
 */
package demotcpgoogletranslate;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import demotcpgoogletranslate.GoogleTranslateGenerator;

public class ServerGoogleTranslateApplication {

	public static void main(String[] args) throws IOException
	{
		
		ServerSocket serverSocket = null;
				
		try
		{
			//Bind ServerSocket to a port
			int portNo = 4228;
			serverSocket = new ServerSocket(portNo);
			
			//Create new object for googleTranslateGenerator
			GoogleTranslateGenerator googleTranslateGenerator = new GoogleTranslateGenerator();

			System.out.println("Waiting for request");
			
			while(true)
			{
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Create input stream
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(clientSocket.getInputStream()));
				
				//Read and print from the network and display the translation
				String text = bufferedReader.readLine();
				System.out.println(text);

				//Close everything 
				bufferedReader.close();
				
				//Close the socket
				clientSocket.close();
				
			}
			
		}
		
		catch (IOException ioe)
		{
			if(serverSocket != null)
				serverSocket.close();
			
			ioe.printStackTrace();
		}

	}

}
