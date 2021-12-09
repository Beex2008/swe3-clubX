
import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Server{
  
    public static void main(String[] args){

      try{
        ServerSocket server = new ServerSocket(5555);
        System.out.println(" Server gestartet !");

        // Client erstellen         
        Socket client = server.accept();

        //Streams
        OutputStream out = client.getOutputStream();
        PrintWriter writer = new PrintWriter(out);

        InputStream in = client.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String s = null;
        while((s = reader.readline())!= null){
          System.out.println("Empfangen von Client :"+s);
        }
        
        writer.close();
        reader.close();


      }catch (IOException e){
        e.printStackTrace();
      }
    }

}
