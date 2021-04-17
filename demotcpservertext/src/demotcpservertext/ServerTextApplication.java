/*
 *This program run as server side to accept request and count number of words in the text  
 *
 *@author SyaqirahSazalee
 */
package demotcpservertext;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 */

public class ServerTextApplication {

	public static void main(String[] args)throws IOException
	{
		ServerTextFrame serverFrame = new ServerTextFrame();
		serverFrame.setVisible(true);
		
		int portNo = 4228;
		ServerSocket serverSocket = new ServerSocket(portNo);
		
		TextGenerator textGenerator = new TextGenerator();
		
		int totalRequest = 0;
		
		while (true) 
		{
			
			// Message to indicate server is alive
			serverFrame.updateServerStatus(false);
			
			
			// Accept client request for connection
			Socket clientSocket = serverSocket.accept();
			
			// Generate current text
			int currentText = TextGenerator.calculateText("hello babe! What's up");
			
			// Create stream to write data on the network
			DataOutputStream outputStream = 
					new DataOutputStream(clientSocket.getOutputStream());
			
			String count1 = String.valueOf(currentText);
			
			// Send current date back to the client
			outputStream.writeBytes(count1);
			
			// Close the socket
			clientSocket.close();
		
			// Update the request status
			serverFrame.updateRequestStatus(
					"Data sent to the client: " + currentText);
			serverFrame.updateRequestStatus("Accepted connection to from the "
					+ "client. Total request = " + ++totalRequest );
			
		}
	}
}
