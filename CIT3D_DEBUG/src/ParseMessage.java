public class ParseMessage
{
	private boolean startRecord=false;
	private int count;
	private int voluationCount;
	public JointInfo nowJoint=new JointInfo();
	//private int msgLength=0;
	public ParseMessage()
	{	
		count=0;	
	}
	public void parseMessage(byte[] msg,int msglength)
	{
		voluationCount=1;
		for(int i=4;i<msglength+4;i++)
		{
			if(msg[i]==120)
			{
				if(msg[i+1]==32)
				{
					startRecord=true;
				}
			}
			if(startRecord==true)
				count++;
			if(msg[i]==41&&startRecord==true)
			{
				//System.out.println(count);
				//System.out.println(i);
				byte[] value=new byte[8];
				for(int j=0;j<count-3;j++)
				{
					value[j]=msg[i-count+j+3];
				}
				String str=new String(value);
				voluation(str);
			   // System.out.println(str);
				startRecord=false;
				count=0;
			}
		}
		
	}
	public void voluation(String val)
	{
		double value=Double.parseDouble(val);
		switch(voluationCount)
		{
		    case 1:nowJoint.JointInfo_Head1=value;break;
		    case 2:nowJoint.JointInfo_Head2=value;break;
		    
		    case 3:nowJoint.JointInfo_Rarm1=value;break;
		    case 4:nowJoint.JointInfo_Rarm2=value;break;
		    case 5:nowJoint.JointInfo_Rarm3=value;break;
		    case 6:nowJoint.JointInfo_Rarm4=value;break;
		    
		    case 7:nowJoint.JointInfo_Larm1=value;break;
		    case 8:nowJoint.JointInfo_Larm2=value;break;
		    case 9:nowJoint.JointInfo_Larm3=value;break;
		    case 10:nowJoint.JointInfo_Larm4=value;break;
		    
		    case 11:nowJoint.JointInfo_Rleg1=value;break;
		    case 12:nowJoint.JointInfo_Rleg2=value;break;
		    case 13:nowJoint.JointInfo_Rleg3=value;break;
		    case 14:nowJoint.JointInfo_Rleg4=value;break;
		    case 15:nowJoint.JointInfo_Rleg5=value;break;
		    case 16:nowJoint.JointInfo_Rleg6=value;break;
		    
		    case 17:nowJoint.JointInfo_Lleg1=value;break;
		    case 18:nowJoint.JointInfo_Lleg2=value;break;
		    case 19:nowJoint.JointInfo_Lleg3=value;break;
		    case 20:nowJoint.JointInfo_Lleg4=value;break;
		    case 21:nowJoint.JointInfo_Lleg5=value;break;
		    case 22:nowJoint.JointInfo_Lleg6=value;break;
		}
		voluationCount++;
	}
	/*public static void main(String[] args)
	{
		ParseMessage ap=new ParseMessage();
		String ceshi="(time (now 35.86))(GS (t 10.24) (pm PlayOn))(GYR (n torso) (rt -11.62 0.71 -25.06))(See (G1L (pol 3.45 -76.39 -20.16)) (G2L (pol 3.50 -73.39 -43.23)) (G2R (pol 8.75 85.16 24.33)) (G1R (pol 8.73 84.44 33.50)) (F1L (pol 5.10 -89.56 19.27)) (F2L (pol 5.31 -100.17 -81.09)) (F1R (pol 9.50 90.20 54.02)) (F2R (pol 9.61 91.21 4.54)) (B (pol 2.68 91.01 27.09)))(HJ (n hj1) (ax 0.00))(HJ (n hj2) (ax 0.00))(HJ (n raj1) (ax -105.00))(HJ (n raj2) (ax -5.00))(HJ (n raj3) (ax 90.00))(HJ (n raj4) (ax 45.00))(HJ (n laj1) (ax -105.00))(HJ (n laj2) (ax 5.00))(HJ (n laj3) (ax -90.00))(HJ (n laj4) (ax -45.00))(HJ (n rlj1) (ax -9.00))(HJ (n rlj2) (ax -0.01))(HJ (n rlj3) (ax 30.35))(HJ (n rlj4) (ax -94.33))(HJ (n rlj5) (ax 63.98))(FRP (n rf) (c 0.04 -0.08 0.01) (f 15.59 -0.87 -22.07))(HJ (n rlj6) (ax -0.00))(HJ (n llj1) (ax -9.01))(HJ (n llj2) (ax 0.01))(HJ (n llj3) (ax 28.88))(HJ (n llj4) (ax -93.89))(HJ (n llj5) (ax 65.00))(FRP (n lf) (c -0.04 -0.08 0.01) (f -5.35 18.84 -23.28))(HJ (n llj6) (ax 0.00))";
		byte[] msg=ceshi.getBytes();
		boolean startRecord=false;
		int msgLength=ceshi.length();
		int count=0;
		//System.out.println(msgLength);
		for(int i=0;i<msgLength;i++)
		{
			if(msg[i]==120)  //120  ascii  x
			{
				if(msg[i+1]==32)  //space
				{
					startRecord=true;
				}
			}
			if(startRecord==true)
				count++;
			if(msg[i]==41&&startRecord==true)
			{
				System.out.println(count);
				System.out.println(i);
				byte[] value=new byte[8];
				
			    
				for(int j=0;j<count-3;j++)
				{
					
					value[j]=msg[i-count+j+3];
					//double num=Double.parseDouble(str);
				    //System.out.println(num);
				}
				String str=new String(value);
			    System.out.println(str);
				 startRecord=false;
				    count=0;
			}
		}
	}*/
}