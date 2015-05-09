
import java.net.*;
import java.io.*;

public class socket
{
                           
    private Socket client;
    private Message stringMessage=new Message();
    private BasicDate basicdate=new BasicDate();
    private MessageProcess mp=new MessageProcess();
    private ActionPerform actionperform=new ActionPerform();
    
    private int sendCount=0;
    private int messageLength;
    private String sendMessage;
    private byte[] receivedMessage=new byte[2048];
	private int msgLength=0;
    boolean ifFinishedInit=false;
    byte[] msg;
    private OutputStream out;
    private InputStream in;
    public socket(String host, int port)
    {
        try
        {
            client = new Socket(host,port);               
            in=client.getInputStream();
            out=client.getOutputStream();                                             
           // System.out.println("connecting:"+client.getLocalPort()+"aa"+client.getPort());
            msg = intToBEByte(stringMessage.createAgent);
            out.write(msg);
            do                                             
            {
                //System.out.println("start cycle!");
                receiveMessage();
            	if(ifFinishedInit==false)
            	{
            	    sendCount++;
                    if (sendCount>=10&&sendCount<=15)
                    {
                    	  msg = intToBEByte(stringMessage.InitParameter);
                    	  out.write(msg);
                    }
                    else if(sendCount==16)
                    {
                    	msg= intToBEByte(stringMessage.InitBeamPos);
                        out.write(msg); 
                    }
                    else if(sendCount>16&&sendCount<57)
                    {
                    	 sendMessage=mp.toString(basicdate.beforStart,40);
                 	     msg= intToBEByte(sendMessage);
                 	    //System.out.println(sendMessage);
                 	     out.write(msg);
                    }
                    else if(sendCount==57)
                    {
                    	ifFinishedInit=true;
                    }
            	}
            	if(ifFinishedInit==true)
            	{
                   sendMessage=actionperform.actionSelect(receivedMessage,msgLength);
           	       msg= intToBEByte(sendMessage);
           	       //System.out.println(sendMessage);
           	       out.write(msg);
            	}
            }while(receivedMessage!=null);

            in.close();
           // System.out.println("connection closed!");
            out.close();
            client.close();                               
        }
        catch(IOException e) {}
    }
    public byte[] intToBEByte(String str)
    {
    	messageLength=str.length();
        byte[] bt = new byte[4+messageLength];
        byte[] tempbt=intToByte(messageLength);
      	bt[3] =tempbt[0];
  		bt[2] = tempbt[1];
  		bt[1] = tempbt[2];
  		bt[0] = tempbt[3];
  		byte[] buf=str.getBytes();
  		for(int i=0;i<messageLength;i++)
  		{
           bt[i+4] =buf[i];
  		}
  		return bt;
    }
    public void receiveMessage()
    {
    
      	byte[] bt=new byte[4];
    	//byte[] message=new byte[2048];
    	try
    	{
    		in.read(receivedMessage);
    	}
    	catch(IOException e) {}
    	bt[0]=receivedMessage[3];
    	bt[1]=receivedMessage[2];
    	bt[2]=receivedMessage[1];
    	bt[3]=receivedMessage[0];
    	msgLength=byteToInt(bt);
    }
	 public int byteToInt(byte[] bArray)
	 {  
	        int a = 0;  
	        for (int i=0; i<bArray.length; i++)
	        {  
	            a += (bArray[i] & 0XFF) << (8 * i);  
	        }     
	        //System.out.println("byteToInt:"+a);
	        return a;
	  }  
	 public byte[] intToByte(int a)
	 {  
	        byte[] bArray= new byte[4];  
	          
	        for(int i=0; i<bArray.length; i++){  
	            bArray[i] = new Integer(a & 0XFF).byteValue();  
	            a >>= 8;  
	          //  System.out.print(bArray[i] +"***");  
	        }  
	        //System.out.println();
	        return bArray;
    }

    public static void main(String args[])
    {
        new socket("127.0.0.1",3100);       
    }
}
