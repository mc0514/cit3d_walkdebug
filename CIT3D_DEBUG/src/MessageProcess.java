public class MessageProcess
{
	double PI=3.1415927;
	public String toString(double[] motion,int cycle)
	{
		String str="";
	    str=HJHead_1Rad((motion[0]/cycle*PI*50)/180)
		
		 +HJLarm_1Rad((motion[12]/cycle*PI*50)/180)
		+ HJLarm_2Rad((motion[13]/cycle*PI*50)/180)
		+ HJLarm_3Rad((motion[14]/cycle*PI*50)/180)
		+ HJLarm_4Rad((motion[15]/cycle*PI*50)/180)
		
		+ HJLleg_1Rad((motion[16]/cycle*PI*50)/180)
		+ HJLleg_2Rad((motion[17]/cycle*PI*50)/180)
		+ HJLleg_3Rad((motion[18]/cycle*PI*50)/180)
		+ HJLleg_4Rad((motion[19]/cycle*PI*50)/180)
		+ HJLleg_5Rad((motion[20]/cycle*PI*50)/180)
		+ HJLleg_6Rad((motion[21]/cycle*PI*50)/180)
		
		+ HJHead_2Rad((motion[11]/cycle*PI*50)/180)
		
		+ HJRarm_1Rad((motion[1]/cycle*PI*50)/180)
		+ HJRarm_2Rad((motion[2]/cycle*PI*50)/180)
		+ HJRarm_3Rad((motion[3]/cycle*PI*50)/180)
		+ HJRarm_4Rad((motion[4]/cycle*PI*50)/180)
		
		+ HJRleg_1Rad((motion[5]/cycle*PI*50)/180)
		+ HJRleg_2Rad((motion[6]/cycle*PI*50)/180)
		+ HJRleg_3Rad((motion[7]/cycle*PI*50)/180)
		+ HJRleg_4Rad((motion[8]/cycle*PI*50)/180)
		+ HJRleg_5Rad((motion[9]/cycle*PI*50)/180)
		+ HJRleg_6Rad((motion[10]/cycle*PI*50)/180);
		return str;
	}
	public String HJHead_1Rad(double angle)
	{
		String str="(he1 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJHead_2Rad(double angle)
	{
		String str="(he2 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLarm_1Rad(double angle)
	{
		String str="(lae1 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLarm_2Rad(double angle)
	{
		String str="(lae2 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLarm_3Rad(double angle)
	{
		String str="(lae3 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLarm_4Rad(double angle)
	{
		String str="(lae4 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLleg_1Rad(double angle)
	{
		String str="(lle1 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLleg_2Rad(double angle)
	{
		String str="(lle2 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLleg_3Rad(double angle)
	{
		String str="(lle3 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLleg_4Rad(double angle)
	{
		String str="(lle4 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLleg_5Rad(double angle)
	{
		String str="(lle5 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJLleg_6Rad(double angle)
	{
		String str="(lle6 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRarm_1Rad(double angle)
	{
		String str="(rae1 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRarm_2Rad(double angle)
	{
		String str="(rae2 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRarm_3Rad(double angle)
	{
		String str="(rae3 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRarm_4Rad(double angle)
	{
		String str="(rae4 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRleg_1Rad(double angle)
	{
		String str="(rle1 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRleg_2Rad(double angle)
	{
		String str="(rle2 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRleg_3Rad(double angle)
	{
		String str="(rle3 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRleg_4Rad(double angle)
	{
		String str="(rle4 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRleg_5Rad(double angle)
	{
		String str="(rle5 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
	public String HJRleg_6Rad(double angle)
	{
		String str="(rle6 ";
		float temp=(float)angle;
		String str2=")";
		return str+str.valueOf(temp)+str2; 
	}
}