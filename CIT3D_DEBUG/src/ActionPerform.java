import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionPerform extends DebugInterface implements ActionListener
{
	private double stepHigh;
	private int motionSelect;
	private String ss;
	private String value;
	private int count=0;
		
	private int timer=0;
	private double standHigh=0.175;
	private double minUpStepHigh=0.155;
	private double maxDownStepHigh=0.180;
	private double stepIncrement=0;
	double shankHeight=0.11,thighHeight=0.14;
	private double upFootHigh=0;
	private double downFootHigh=0;
	private double Pi=3.14159;
	private double gain=3, Rdistance=-0.03, Rhigh=0.175, Ldistance=-0.03, Lhigh=0.175;
	
	private double leftStepHigh=0;
	private double leftStepLength=-0.03;
	private double angleToTurn=0;
	
	private double rightStepHigh=0;
	private double rightStepLength=-0.03;
	private double temperVariable=0;
	private double turnRightAngle=0;
	private double rightArmAngle=-105;
	private double rightElbowAngle=45;
	private double rightCoxaAngle=0;
	//private double rightThighAngle=0;
	//private double rightShankAngle=0;
	//private double rightFootAngle=0;
	private double rightAnkleAngle=0;
	
	private double turnLeftAngle=0;
	private double leftArmAngle=-105;
	private double leftElbowAngle=-45;
	private double leftCoxaAngle=0;
//	private double leftThighAngle=0;
	//private double leftShankAngle=0;
	//private double leftFootAngle=0;
	private double leftAnkleAngle=0;
	
	//private double angleToTurn=0;
	
	//private double headUpDownAngle=0;
	private double head1Angle=0;
	//private double head2Angle=0;
	//private double turnHeadAngleIncrement=7;
	
	private double cycleTime=0.1;//the time of shift and swing and load foot//0.10
	private int cycleNumber=5;
	private double currentTime=0.0;

	//private	double timeCounter=0;
	//private double pointer=0;
	
	//private double thighLength=0.14;
//	private double shankLength=0.11;
		
	private boolean leftFoot=false;
	private boolean rightFoot=true;
	
	private boolean speedUp=false;
	private boolean speedDown=false;
	
	private boolean leftHorizontalMove=false;
	private boolean rightHorizontalMove=false;
	private boolean walkFoward=true;
	private boolean walkBackward=false;
	//private boolean firstStep=true;
	//private boolean firstCreateCommand=true;
	
	//private boolean turnQuickly=false;
	//private boolean turnSlowly=true;
	//private boolean firstQuicklyTurn=true;
	//private boolean firstSlowlyTurn=true;
	
	//private boolean leftHorizontalMove=true;
	//private boolean rightHrizontalMove=false;
	
	//private	boolean turnHeadUpDown=false;
	//private	boolean turnHeadRightLeft=false;
	//private	int turnHeadTimes=34;
	//private	int turnHeadCounter=turnHeadTimes/2-1;
	/*private	int turnHeadCounterClearZeroNum=0;
	private	boolean firstTurnHead=true;
	private	boolean turnHeadToLeft=true;
	private	boolean turnHeadToRight=false;
	private	boolean canStopTurnHead=false;
	private	boolean beginFindBall=false;*/
	boolean beginTurnHead=false;
	boolean turnHeadEnable=false;
	boolean beginTurnBody=false;
	boolean adjustBodyDirection=false;
	boolean gotMyMoveDirection=false;
	
	boolean changeDirection=false;
	
	private boolean adjustBody=false; 

	/*private	boolean doBeam=true;
	private	boolean recordPoint=true;
	private	int turnIncrement=0;
	private	double maxTurnAngle=0;
	private	double turnAngle=0;*/
	
	private boolean bBeginReadDataD= false;
	private boolean IsFirstinReadData=false;
	private boolean clearCounter=true;
	private int i_SendedCount=0;
	private int i_ReceivedCount=0;
	private int CountinReadData=0;

	private BasicDate basicdate=new BasicDate();
    private MessageProcess mp=new MessageProcess();
    private ParseMessage parseMessage=new ParseMessage();
    private JointInfo forecastJiontInfo=new JointInfo();
    private JointInfo sendJointInfo1=new JointInfo();
    private JointInfo sendJointInfo2=new JointInfo();
    private JointInfo sendJointInfo3=new JointInfo();
    private JointInfo receiveJointInfo1=new JointInfo();
    private JointInfo receiveJointInfo2=new JointInfo();
    private JointInfo receiveJointInfo3=new JointInfo();
    private JointInfo delayJointInfo=new JointInfo();
    
    private double Head1a;
    private double Head2a;
    private double Larm1a;
    private double Larm2a;
    private double Larm3a;
    private double Larm4a;
    private double Lleg1a;
    private double Lleg2a;
    private double Lleg3a;
    private double Lleg4a;
    private double Lleg5a;
    private double Lleg6a;
    private double Rarm1a;
    private double Rarm2a;
    private double Rarm3a;
    private double Rarm4a;
    private double Rleg1a;
    private double Rleg2a;
    private double Rleg3a;
    private double Rleg4a;
    private double Rleg5a;
    private double Rleg6a;
    
	 public ActionPerform()   
	{	
		stepHigh=0.15;
		motionSelect=0;
		var_name1.setText("stepHigh");
		var1_value1.setText(value.valueOf(stepHigh));
		
		var_name2.setText("saaaaaa");
		var1_value2.setText(value.valueOf(Pi));
			
	}
	 public void actionPerformed(ActionEvent e)  //��д�¼����?��
	 {	    	
	        if (e.getSource()==action1)
	        {
	        	motionSelect=1;
	        }
	        else if (e.getSource()==action2)
	        {
	        	motionSelect=2;
	        }
	        else if (e.getSource()==action3)
	        {
	        	motionSelect=3;
	        }
	        else if (e.getSource()==action4)
	        {
	        	motionSelect=4;
	        }
	        else if(e.getSource()==action5)
	        {
	        	motionSelect=5;
	        }
	        else if(e.getSource()==action6)
	        {
	        	motionSelect=6;
	        }
	        else if(e.getSource()==action7)
	        {
	        	angleToTurn=-15;
	        	motionSelect=7;
	        }
	        else if(e.getSource()==action8)
	        {
	        	angleToTurn=15;
	        	motionSelect=7;
	        }
	        else if(e.getSource()==action9)
	        {
	        	motionSelect=9;
	        }
	        else if(e.getSource()==action10)
	        {
	        	motionSelect=10;
	        }
	        else if(e.getSource()==action11)
	        {
	        	motionSelect=11;
	        }
	        
	        else if(e.getSource()==var_update1)
	        {
	        	stepHigh=Double.parseDouble(var1_value1.getText());
	        	var1_value1.setText(value.valueOf(stepHigh));
	        }
	        else if(e.getSource()==var_update2)
	        {    
	        	Pi=Double.parseDouble(var1_value2.getText());
	        	var1_value2.setText(value.valueOf(Pi));
	        	System.out.println(Pi);
	        }
	        else if(e.getSource()==var_update3)
	        {
	        
	        }
	        else if(e.getSource()==var_update4)
	        {
	       
	        }
	        else if(e.getSource()==var_update5)
	        {
	        	
	        }
	        else if(e.getSource()==var_update6)
	        {
	       
	        }
	        else if(e.getSource()==var_update7)
	        {
	       
	        }
	        else if(e.getSource()==var_update8)
	        {
	       
	        }
	        else if(e.getSource()==var_update9)
	        {
	        }
	        else if(e.getSource()==var_update10)
	        {
	        }
	        else if(e.getSource()==var_update11)
	        {
	        }
	        
    }
	 public String actionSelect(byte[] msg,int msgLength)
	 {
		 
		 parseMessage.parseMessage(msg,msgLength);
		 // System.out.println("h1:"+parseMessage.nowJoint.JointInfo_Larm1+"rleg6:"+parseMessage.nowJoint.JointInfo_Rleg5);
		 if(motionSelect==0)
		 { 
			 ss=mp.toString(basicdate.standUp,1);
		 }
		 if(motionSelect==1)
		 {
			 if(count<10)
			 {
				 ss=mp.toString(basicdate.fallDownFoward,10);
				 count++;
				 if(count==10)
				 {
					 motionSelect=0;
					 count=0;
				 }
			 }
		 }
		 if(motionSelect==2)
		 {
			 if(count<10)
			 {
				 ss=mp.toString(basicdate.fallDownBack,10);
				 count++;
				 if(count==10)
				 {
					 motionSelect=0;
					 count=0;
				 }
			 }
		 }
		 if(motionSelect==3)////前进
		 {
			 speedUp=true;
			 speedDown=false;
			 walkFoward=true;
			 walkBackward=false;
			 walk();
		 }
		 if(motionSelect==4)
		 {
			 standUpFromFront();
		 }
		 if(motionSelect==5)
		 {
			 standUpFromBack();
		 }
		 if(motionSelect==6)
		 {
			 speedUp=false;
			 speedDown=true;
			 leftHorizontalMove=false;
		     rightHorizontalMove=false;
			 count++;
			 walk();
			 if(timer==5&&count>=50)
			 {
			     count=0;
				 motionSelect=0;
			 }
		 }
		 if(motionSelect==10)
		 {
			 speedUp=false;
			 speedDown=true;
			 walk();
			 leftHorizontalMove=true;
		     rightHorizontalMove=false;
		 }
		 if(motionSelect==11)
		 {
			 speedUp=false;
			 speedDown=true;
			 walk();
			 leftHorizontalMove=false;
		     rightHorizontalMove=true;
		 }
		 if(motionSelect==7)
		 {
			 walk();
		 }
		 if(motionSelect==9)
		 { 
				 walkFoward=false;
				 walkBackward=true;
				 walk();
				 speedUp=true;
				 speedDown=false;			 
		 }
		return ss;
	 }
	 public void walk()
	 {

			createGait();
			horizontalMove();
			turnBody();
			exchangeLeg();//exchange the up and down leg
			walkExecute(rightStepLength,rightStepHigh,leftStepLength,leftStepHigh,turnRightAngle,turnLeftAngle,rightCoxaAngle,leftCoxaAngle,rightAnkleAngle,leftAnkleAngle,head1Angle,0,rightArmAngle,rightElbowAngle,leftArmAngle,leftElbowAngle);
		 
	 }
	 public void horizontalMove()
	 {
		 float maxAngle=10;
		 float increment=maxAngle/cycleNumber;
		 if(leftFoot == true)
		 {
			if( leftHorizontalMove==true )
			{
				rightCoxaAngle=rightCoxaAngle-increment;
				if( rightCoxaAngle<-maxAngle )
					rightCoxaAngle=-maxAngle;
					
				leftCoxaAngle=leftCoxaAngle+increment;
				if( leftCoxaAngle>maxAngle )
					leftCoxaAngle=maxAngle;
					
				rightAnkleAngle=rightAnkleAngle+increment;
				if( rightAnkleAngle>maxAngle )
					rightAnkleAngle=maxAngle;
					
				leftAnkleAngle=leftAnkleAngle-increment;
				if( leftAnkleAngle<-maxAngle )
					leftAnkleAngle=-maxAngle;
			}
			else if( rightHorizontalMove==true )
			{
				rightCoxaAngle=rightCoxaAngle+increment;
				if( rightCoxaAngle>0 )
					rightCoxaAngle=0;
					
				leftCoxaAngle=leftCoxaAngle-increment;
				if( leftCoxaAngle<0 )
					leftCoxaAngle=0;
					
				rightAnkleAngle=rightAnkleAngle-increment;
				if( rightAnkleAngle<0 )
					rightAnkleAngle=0;
					
				leftAnkleAngle=leftAnkleAngle+increment;
				if( leftAnkleAngle>0 )
					leftAnkleAngle=0;
			}
			else
			{
				rightCoxaAngle=0;
				leftCoxaAngle=0;
				rightAnkleAngle=0;
				leftAnkleAngle=0;
			}
		}
		else if (rightFoot == true)
		{
			if( leftHorizontalMove==true )
			{
				rightCoxaAngle=rightCoxaAngle+increment;
				if( rightCoxaAngle>0 )
					rightCoxaAngle=0;
					
				leftCoxaAngle=leftCoxaAngle-increment;
				if( leftCoxaAngle<0 )
					leftCoxaAngle=0;
					
				rightAnkleAngle=rightAnkleAngle-increment;
				if( rightAnkleAngle<0 )
					rightAnkleAngle=0;
					
				leftAnkleAngle=leftAnkleAngle+increment;
				if( leftAnkleAngle>0 )
					leftAnkleAngle=0;
			}
			else if( rightHorizontalMove==true )
			{
				rightCoxaAngle=rightCoxaAngle-increment;
				if( rightCoxaAngle<-maxAngle )
					rightCoxaAngle=-maxAngle;
					
				leftCoxaAngle=leftCoxaAngle+increment;
				if( leftCoxaAngle>maxAngle )
					leftCoxaAngle=maxAngle;
					
				rightAnkleAngle=rightAnkleAngle+increment;
				if( rightAnkleAngle>maxAngle )
					rightAnkleAngle=maxAngle;
					
				leftAnkleAngle=leftAnkleAngle-increment;
				if( leftAnkleAngle<-maxAngle )
					leftAnkleAngle=-maxAngle;
			}
			else
			{
				rightCoxaAngle=0;
				leftCoxaAngle=0;
				rightAnkleAngle=0;
				leftAnkleAngle=0;
			}
		}
	 }
     public void turnBody()
     {
    	double quickTurnIncrement=1.5;//0.96
    	double quickTurnMinAngle=-7.5;//-4.8
    		
     	if(leftFoot == true)//put up the left foot
    	{
    		if( Math.abs(angleToTurn)<= 1 )
    		{
    			turnLeftAngle=0;
    			turnRightAngle=0;
    			angleToTurn=0;
    		}
    		else if(angleToTurn < 0)//turn to right
    		{	
    		
    			if(turnLeftAngle <= 0)
    				turnLeftAngle=turnLeftAngle+quickTurnIncrement;
    				
    			turnRightAngle=turnLeftAngle;
    			angleToTurn=angleToTurn+quickTurnIncrement;
    		}
    		else//turn to left
    		{
    		
    			 if(turnRightAngle >= quickTurnMinAngle)
    				turnRightAngle=turnRightAngle-quickTurnIncrement;
    				
    			turnLeftAngle=turnRightAngle;
    			angleToTurn=angleToTurn-quickTurnIncrement;
    			
    		}
    	}
    	else if(rightFoot == true)//put up the right foot
    	{
    		if( Math.abs(angleToTurn) <= 1 )
    		{
    			turnLeftAngle=0;
    			turnRightAngle=0;
    			angleToTurn=0;
    		}
    		else if(angleToTurn < 0)//turn to right
    		{	
    			if(turnLeftAngle >= quickTurnMinAngle)
    				turnLeftAngle=turnLeftAngle-quickTurnIncrement;
    			
    			turnRightAngle=turnLeftAngle;
    			angleToTurn=angleToTurn+quickTurnIncrement;
    			
    		}
    		else//turn to left
    		{
    				if(turnRightAngle <= 0)
    					turnRightAngle=turnRightAngle+quickTurnIncrement;
    				
    				turnLeftAngle=turnRightAngle;
    				angleToTurn=angleToTurn-quickTurnIncrement;
    			
    		}
    	}
     }
     public void createGait()
	 {
			double oneCycleTime=0.02;
			if( timer < cycleNumber )
			{
				timer++;
				currentTime=currentTime+oneCycleTime;
			}
			else
			{
				timer=1;
				currentTime=oneCycleTime;
				double increment=0.001;
						///step length management
				if(stepIncrement < 0.013&&speedUp==true)
				{
				   
				      stepIncrement=stepIncrement+increment;
				}
				else if(speedDown==true&&stepIncrement > increment)
				{
					//leftStepLength=-0.03;
					//rightStepLength=-0.03;
					stepIncrement=stepIncrement-increment;
				}
				if(stepIncrement < 0.001)
				{
					leftStepLength=-0.03;
					rightStepLength=-0.03;
				}
			}
			
			if(timer <= cycleNumber/2)
			{
				upFootHigh=(2*(minUpStepHigh-standHigh)*currentTime)/(cycleTime)+standHigh;
				downFootHigh=(2*(maxDownStepHigh-standHigh)*currentTime)/(cycleTime)+standHigh;
			}
			else
			{
				upFootHigh=(2*(standHigh-minUpStepHigh)*currentTime)/(cycleTime)+2*minUpStepHigh-standHigh;
				downFootHigh=(2*(standHigh-maxDownStepHigh)*currentTime)/(cycleTime)+2*maxDownStepHigh-standHigh;
			}
			//System.out.println("time:"+timer);
		if(walkFoward==true)
		{
    		if(leftFoot == true)
			{
    			leftStepLength=leftStepLength+stepIncrement+temperVariable;
				rightStepLength=rightStepLength-stepIncrement-temperVariable;
    			
					leftStepHigh=upFootHigh;
					rightStepHigh=downFootHigh;
					//System.out.println("aa"+leftStepLength+"||"+rightStepLength);
			}
			else if(rightFoot == true)
			{
				leftStepLength=leftStepLength-stepIncrement-temperVariable;
				rightStepLength=rightStepLength+stepIncrement+temperVariable;
				
					leftStepHigh=downFootHigh;
					rightStepHigh=upFootHigh;
			//		System.out.println("bb"+leftStepLength+"||"+rightStepLength);
			}
		}
		else if(walkBackward==true)
		{
			if(leftFoot == true)
			{
				leftStepLength=leftStepLength-stepIncrement-temperVariable;
				rightStepLength=rightStepLength+stepIncrement+temperVariable;
	
				leftStepHigh=upFootHigh;
				rightStepHigh=downFootHigh;
				
			}
			else if(rightFoot == true)
			{
				leftStepLength=leftStepLength+stepIncrement+temperVariable;
				rightStepLength=rightStepLength-stepIncrement-temperVariable;
	
				leftStepHigh=downFootHigh;
				rightStepHigh=upFootHigh;
				
			}
		}
	 }	
	 public void exchangeLeg()
	 {

			if(leftFoot == true && timer == cycleNumber)
			{
				leftFoot=false;
				rightFoot=true;
			}
			else if(rightFoot == true && timer == cycleNumber)
			{
				leftFoot=true;
				rightFoot=false;
			}
	 }
	 public void walkExecute(double Rdistance,double Rhigh,double Ldistance,double Lhigh,double Rleg1,double Lleg1,double Rleg2,double Lleg2,double Rleg6,double Lleg6,double head1,double head2,double Rarm1,double Rarm4,double Larm1,double Larm4)
	 {
		    double k,d,b,c,x,y,Rdatui,Rxiaotui,Ldatui,Lxiaotui;
			
			k=Rhigh*Rhigh+shankHeight*shankHeight+Rdistance*Rdistance-thighHeight*thighHeight;
			d=4.0*Rdistance*Rdistance*shankHeight*shankHeight+4.0*Rhigh*Rhigh*shankHeight*shankHeight;
			b=4.0*Rdistance*shankHeight*k;
			c=k*k-4.0*Rhigh*Rhigh*shankHeight*shankHeight;
			x=(-b+Math.sqrt(b*b-4.0*d*c))/(2.0*d);
			y=(x*shankHeight+Rdistance)/thighHeight;
			Rdatui=Math.asin(y)*180/Pi;
			Rxiaotui=Math.asin(x)*180/Pi+Rdatui;

			k=Lhigh*Lhigh+shankHeight*shankHeight+Ldistance*Ldistance-thighHeight*thighHeight;
			d=4.0*Ldistance*Ldistance*shankHeight*shankHeight+4.0*Lhigh*Lhigh*shankHeight*shankHeight;
			b=4.0*Ldistance*shankHeight*k;
			c=k*k-4.0*Lhigh*Lhigh*shankHeight*shankHeight;
			x=(-b+Math.sqrt(b*b-4.0*d*c))/(2.0*d);
			y=(x*shankHeight+Ldistance)/thighHeight;
			Ldatui=Math.asin(y)*180/Pi;
			Lxiaotui=Math.asin(x)*180/Pi+Ldatui;

			double angHead1,angHead2;
			double angLleg1,angLleg2,angLleg3,angLleg4,angLleg5,angLleg6;
			double angRleg1,angRleg2,angRleg3,angRleg4,angRleg5,angRleg6;
			double angLarm1,angLarm2,angLarm3,angLarm4;
			double angRarm1,angRarm2,angRarm3,angRarm4;

			if(clearCounter == true)
			{
				i_SendedCount=0;
				i_ReceivedCount=0;
				bBeginReadDataD=true;
				clearCounter=false;
			}
			
			Record_Received_JointSense();

			if(bBeginReadDataD==true)
			{
				bBeginReadDataD =false;
				IsFirstinReadData = true;
				CountinReadData = 0;

				angHead1 = parseMessage.nowJoint.JointInfo_Head1;
				angHead2 = parseMessage.nowJoint.JointInfo_Head2;
				
				angLleg1 = parseMessage.nowJoint.JointInfo_Lleg1;
				angLleg2 = parseMessage.nowJoint.JointInfo_Lleg2;
				angLleg3 = parseMessage.nowJoint.JointInfo_Lleg3;
				angLleg4 = parseMessage.nowJoint.JointInfo_Lleg4;
				angLleg5 = parseMessage.nowJoint.JointInfo_Lleg5;
				angLleg6 = parseMessage.nowJoint.JointInfo_Lleg6;
				
				angRleg1 = parseMessage.nowJoint.JointInfo_Rleg1;
				angRleg2 = parseMessage.nowJoint.JointInfo_Rleg2;
				angRleg3 = parseMessage.nowJoint.JointInfo_Rleg3;
				angRleg4 = parseMessage.nowJoint.JointInfo_Rleg4;
				angRleg5 = parseMessage.nowJoint.JointInfo_Rleg5;
				angRleg6 = parseMessage.nowJoint.JointInfo_Rleg6;
				
				angLarm1 = parseMessage.nowJoint.JointInfo_Larm1;
				angLarm2 = parseMessage.nowJoint.JointInfo_Larm2;
				angLarm3 = parseMessage.nowJoint.JointInfo_Larm3;
				angLarm4 = parseMessage.nowJoint.JointInfo_Larm4;
				
				angRarm1 = parseMessage.nowJoint.JointInfo_Rarm1;
				angRarm2 = parseMessage.nowJoint.JointInfo_Rarm2;
				angRarm3 = parseMessage.nowJoint.JointInfo_Rarm3;
				angRarm4 = parseMessage.nowJoint.JointInfo_Rarm4;
			}
			else
			{
				angHead1 = forecastJiontInfo.JointInfo_Head1;
				angHead2 = forecastJiontInfo.JointInfo_Head2;
			
				angLleg1 = forecastJiontInfo.JointInfo_Lleg1;
				angLleg2 = forecastJiontInfo.JointInfo_Lleg2;
				angLleg3 = forecastJiontInfo.JointInfo_Lleg3;
				angLleg4 = forecastJiontInfo.JointInfo_Lleg4;
				angLleg5 = forecastJiontInfo.JointInfo_Lleg5;
				angLleg6 = forecastJiontInfo.JointInfo_Lleg6;
			
				angRleg1 = forecastJiontInfo.JointInfo_Rleg1;
				angRleg2 = forecastJiontInfo.JointInfo_Rleg2;
				angRleg3 = forecastJiontInfo.JointInfo_Rleg3;
				angRleg4 = forecastJiontInfo.JointInfo_Rleg4;
				angRleg5 = forecastJiontInfo.JointInfo_Rleg5;
				angRleg6 = forecastJiontInfo.JointInfo_Rleg6;
			
				angLarm1 = forecastJiontInfo.JointInfo_Larm1;
				angLarm2 = forecastJiontInfo.JointInfo_Larm2;
				angLarm3 = forecastJiontInfo.JointInfo_Larm3;
				angLarm4 = forecastJiontInfo.JointInfo_Larm4;
			
				angRarm1 = forecastJiontInfo.JointInfo_Rarm1;
				angRarm2 = forecastJiontInfo.JointInfo_Rarm2;
				angRarm3 = forecastJiontInfo.JointInfo_Rarm3;
				angRarm4 = forecastJiontInfo.JointInfo_Rarm4;
			}

			if(i_SendedCount==3)
			{
				delayJointInfo.JointInfo_Head1 = receiveJointInfo3.JointInfo_Head1-sendJointInfo2.JointInfo_Head1;
				delayJointInfo.JointInfo_Head2 = receiveJointInfo3.JointInfo_Head2-sendJointInfo2.JointInfo_Head2;
				
				delayJointInfo.JointInfo_Larm1 = receiveJointInfo3.JointInfo_Larm1-sendJointInfo2.JointInfo_Larm1;
				delayJointInfo.JointInfo_Larm2 = receiveJointInfo3.JointInfo_Larm2-sendJointInfo2.JointInfo_Larm2;
				delayJointInfo.JointInfo_Larm3 = receiveJointInfo3.JointInfo_Larm3-sendJointInfo2.JointInfo_Larm3;
				delayJointInfo.JointInfo_Larm4 = receiveJointInfo3.JointInfo_Larm4-sendJointInfo2.JointInfo_Larm4;
				
				delayJointInfo.JointInfo_Rarm1 = receiveJointInfo3.JointInfo_Rarm1-sendJointInfo2.JointInfo_Rarm1;
				delayJointInfo.JointInfo_Rarm2 = receiveJointInfo3.JointInfo_Rarm2-sendJointInfo2.JointInfo_Rarm2;
				delayJointInfo.JointInfo_Rarm3 = receiveJointInfo3.JointInfo_Rarm3-sendJointInfo2.JointInfo_Rarm3;
				delayJointInfo.JointInfo_Rarm4 = receiveJointInfo3.JointInfo_Rarm4-sendJointInfo2.JointInfo_Rarm4;
				
				delayJointInfo.JointInfo_Lleg1 = receiveJointInfo3.JointInfo_Lleg1-sendJointInfo2.JointInfo_Lleg1;
				delayJointInfo.JointInfo_Lleg2 = receiveJointInfo3.JointInfo_Lleg2-sendJointInfo2.JointInfo_Lleg2;
				delayJointInfo.JointInfo_Lleg3 = receiveJointInfo3.JointInfo_Lleg3-sendJointInfo2.JointInfo_Lleg3;
				delayJointInfo.JointInfo_Lleg4 = receiveJointInfo3.JointInfo_Lleg4-sendJointInfo2.JointInfo_Lleg4;
				delayJointInfo.JointInfo_Lleg5 = receiveJointInfo3.JointInfo_Lleg5-sendJointInfo2.JointInfo_Lleg5;
				delayJointInfo.JointInfo_Lleg6 = receiveJointInfo3.JointInfo_Lleg6-sendJointInfo2.JointInfo_Lleg6;
				
				delayJointInfo.JointInfo_Rleg1 = receiveJointInfo3.JointInfo_Rleg1-sendJointInfo2.JointInfo_Rleg1;
				delayJointInfo.JointInfo_Rleg2 = receiveJointInfo3.JointInfo_Rleg2-sendJointInfo2.JointInfo_Rleg2;			
				delayJointInfo.JointInfo_Rleg3 = receiveJointInfo3.JointInfo_Rleg3-sendJointInfo2.JointInfo_Rleg3;
				delayJointInfo.JointInfo_Rleg4 = receiveJointInfo3.JointInfo_Rleg4-sendJointInfo2.JointInfo_Rleg4;
				delayJointInfo.JointInfo_Rleg5 = receiveJointInfo3.JointInfo_Rleg5-sendJointInfo2.JointInfo_Rleg5;
				delayJointInfo.JointInfo_Rleg6 = receiveJointInfo3.JointInfo_Rleg6-sendJointInfo2.JointInfo_Rleg6;
		
			}
			else
				delayJointInfo.clear();

			if(IsFirstinReadData)
			{
				delayJointInfo.clear();
				CountinReadData++;
				if(CountinReadData>=10)
					IsFirstinReadData = false;
			}
			
			Head1a=head1-angHead1-delayJointInfo.JointInfo_Head1;
			Head2a=-35-angHead2-delayJointInfo.JointInfo_Head2;

			Larm1a=Larm1-angLarm1-delayJointInfo.JointInfo_Larm1;
			Larm2a=5-angLarm2-delayJointInfo.JointInfo_Larm2;
			Larm3a=-90-angLarm3-delayJointInfo.JointInfo_Larm3;
			Larm4a=Larm4-angLarm4-delayJointInfo.JointInfo_Larm4;

			Rarm1a=Rarm1-angRarm1-delayJointInfo.JointInfo_Rarm1;
			Rarm2a=-5-angRarm2-delayJointInfo.JointInfo_Rarm2;
			Rarm3a=90-angRarm3-delayJointInfo.JointInfo_Rarm3;
			Rarm4a=Rarm4-angRarm4-delayJointInfo.JointInfo_Rarm4;

			Lleg1a=Lleg1-angLleg1-delayJointInfo.JointInfo_Lleg1;
			Lleg2a=Lleg2-angLleg2-delayJointInfo.JointInfo_Lleg2;
			Lleg3a=Ldatui-angLleg3-delayJointInfo.JointInfo_Lleg3;
			Lleg4a=-Lxiaotui-angLleg4-delayJointInfo.JointInfo_Lleg4;
			Lleg5a=Lxiaotui-Ldatui-angLleg5-delayJointInfo.JointInfo_Lleg5;
			Lleg6a=Lleg6-angLleg6-delayJointInfo.JointInfo_Lleg6;

			Rleg1a=Rleg1-angRleg1-delayJointInfo.JointInfo_Rleg1;
			Rleg2a=Rleg2-angRleg2-delayJointInfo.JointInfo_Rleg2;
			Rleg3a=Rdatui-angRleg3-delayJointInfo.JointInfo_Rleg3;
			Rleg4a=-Rxiaotui-angRleg4-delayJointInfo.JointInfo_Rleg4;
			Rleg5a=Rxiaotui-Rdatui-angRleg5-delayJointInfo.JointInfo_Rleg5;
			Rleg6a=Rleg6-angRleg6-delayJointInfo.JointInfo_Rleg6;

			forecastJiontInfo.JointInfo_Head1= head1;
			forecastJiontInfo.JointInfo_Head2 = -35;

			forecastJiontInfo.JointInfo_Lleg1= Lleg1;
			forecastJiontInfo.JointInfo_Lleg2 = Lleg2;
			forecastJiontInfo.JointInfo_Lleg3= Ldatui;
			forecastJiontInfo.JointInfo_Lleg4 = -Lxiaotui;
			forecastJiontInfo.JointInfo_Lleg5 = Lxiaotui-Ldatui;
			forecastJiontInfo.JointInfo_Lleg6 = Lleg6;
			
			forecastJiontInfo.JointInfo_Rleg1 = Rleg1;
			forecastJiontInfo.JointInfo_Rleg2 = Rleg2;
			forecastJiontInfo.JointInfo_Rleg3 = Rdatui;
			forecastJiontInfo.JointInfo_Rleg4 = -Rxiaotui;
			forecastJiontInfo.JointInfo_Rleg5= Rxiaotui-Rdatui;
			forecastJiontInfo.JointInfo_Rleg6 = Rleg6;

			forecastJiontInfo.JointInfo_Larm1 = Larm1;
			forecastJiontInfo.JointInfo_Larm2 = 5;
			forecastJiontInfo.JointInfo_Larm3= -90;
			forecastJiontInfo.JointInfo_Larm4 = Larm4;

			forecastJiontInfo.JointInfo_Rarm1= Rarm1;
			forecastJiontInfo.JointInfo_Rarm2 = -5;
			forecastJiontInfo.JointInfo_Rarm3= 90;
			forecastJiontInfo.JointInfo_Rarm4 = Rarm4;

			Record_Sended_JointSense();	
			if(Math.abs(Lleg3a) > 7.0354)
			{
				if(Lleg3a > 0)
					Lleg3a = 7.1;
				else
					Lleg3a = -7.1;
			}
			if(Math.abs(Lleg4a) > 7.0354)
			{
				if(Lleg4a > 0)
					Lleg4a = 7.1;
				else
					Lleg4a = -7.1;
			}
			if(Math.abs(Lleg5a) > 7.0354)
			{
				if(Lleg5a > 0)
					Lleg5a = 7.1;
				else
					Lleg5a = -7.1;
			}
			if(Math.abs(Rleg3a) > 7.0354)
			{
				if(Rleg3a > 0)
					Rleg3a = 7.1;
				else
					Rleg3a = -7.1;
			}
			if(Math.abs(Rleg4a) > 7.0354)
			{
				if(Rleg4a > 0)
					Rleg4a = 7.1;
				else
					Rleg4a = -7.1;
			}
			if(Math.abs(Rleg5a) > 7.0354)
			{
				if(Rleg5a > 0)
					Rleg5a = 7.1;
				else
					Rleg5a = -7.1;
			}

		ss=
				      mp.HJHead_1Rad((Head1a*Pi*50)/180)
					+ mp.HJLarm_1Rad((Larm1a*Pi*50)/180)
					+ mp.HJLarm_2Rad((Larm2a*Pi*50)/180)
					+ mp.HJLarm_3Rad((Larm3a*Pi*50)/180)
					+ mp.HJLarm_4Rad((Larm4a*Pi*50)/180)
					+ mp.HJLleg_1Rad((Lleg1a*Pi*50)/180)
					+ mp.HJLleg_2Rad((Lleg2a*Pi*50)/180)
					+ mp.HJLleg_3Rad((Lleg3a*Pi*50)/180)
					+ mp.HJLleg_4Rad((Lleg4a*Pi*50)/180)
					+ mp.HJLleg_5Rad((Lleg5a*Pi*50)/180)
					+ mp.HJLleg_6Rad((Lleg6a*Pi*50)/180)
					+ mp.HJHead_2Rad((Head2a*Pi*50)/180)
					+ mp.HJRarm_1Rad((Rarm1a*Pi*50)/180)
					+ mp.HJRarm_2Rad((Rarm2a*Pi*50)/180)
					+ mp.HJRarm_3Rad((Rarm3a*Pi*50)/180)
					+ mp.HJRarm_4Rad((Rarm4a*Pi*50)/180)
					+ mp.HJRleg_1Rad((Rleg1a*Pi*50)/180)
					+ mp.HJRleg_2Rad((Rleg2a*Pi*50)/180)
					+ mp.HJRleg_3Rad((Rleg3a*Pi*50)/180)
					+ mp.HJRleg_4Rad((Rleg4a*Pi*50)/180)
					+ mp.HJRleg_5Rad((Rleg5a*Pi*50)/180)
					+ mp.HJRleg_6Rad((Rleg6a*Pi*50)/180);
		//System.out.println(ss);
	 }
	 public void Record_Sended_JointSense()
	 {
		if(i_SendedCount==0)
			sendJointInfo1.setValue(forecastJiontInfo.JointInfo_Head1,forecastJiontInfo.JointInfo_Rarm1,forecastJiontInfo.JointInfo_Rarm2,
					                forecastJiontInfo.JointInfo_Rarm3,forecastJiontInfo.JointInfo_Rarm4,forecastJiontInfo.JointInfo_Rleg1,
					                forecastJiontInfo.JointInfo_Rleg2,forecastJiontInfo.JointInfo_Rleg3,forecastJiontInfo.JointInfo_Rleg4,
					                forecastJiontInfo.JointInfo_Rleg5,forecastJiontInfo.JointInfo_Rleg6,forecastJiontInfo.JointInfo_Head2,
					                forecastJiontInfo.JointInfo_Larm1,forecastJiontInfo.JointInfo_Larm2,forecastJiontInfo.JointInfo_Larm3,
					                forecastJiontInfo.JointInfo_Larm4,forecastJiontInfo.JointInfo_Lleg1,forecastJiontInfo.JointInfo_Lleg2,
					                forecastJiontInfo.JointInfo_Lleg3,forecastJiontInfo.JointInfo_Lleg4,forecastJiontInfo.JointInfo_Lleg5,
					                forecastJiontInfo.JointInfo_Lleg6);
		else if(i_SendedCount==1)
			sendJointInfo2.setValue(forecastJiontInfo.JointInfo_Head1,forecastJiontInfo.JointInfo_Rarm1,forecastJiontInfo.JointInfo_Rarm2,
	                forecastJiontInfo.JointInfo_Rarm3,forecastJiontInfo.JointInfo_Rarm4,forecastJiontInfo.JointInfo_Rleg1,
	                forecastJiontInfo.JointInfo_Rleg2,forecastJiontInfo.JointInfo_Rleg3,forecastJiontInfo.JointInfo_Rleg4,
	                forecastJiontInfo.JointInfo_Rleg5,forecastJiontInfo.JointInfo_Rleg6,forecastJiontInfo.JointInfo_Head2,
	                forecastJiontInfo.JointInfo_Larm1,forecastJiontInfo.JointInfo_Larm2,forecastJiontInfo.JointInfo_Larm3,
	                forecastJiontInfo.JointInfo_Larm4,forecastJiontInfo.JointInfo_Lleg1,forecastJiontInfo.JointInfo_Lleg2,
	                forecastJiontInfo.JointInfo_Lleg3,forecastJiontInfo.JointInfo_Lleg4,forecastJiontInfo.JointInfo_Lleg5,
	                forecastJiontInfo.JointInfo_Lleg6);
		else if(i_SendedCount==2)
			sendJointInfo3.setValue(forecastJiontInfo.JointInfo_Head1,forecastJiontInfo.JointInfo_Rarm1,forecastJiontInfo.JointInfo_Rarm2,
	                forecastJiontInfo.JointInfo_Rarm3,forecastJiontInfo.JointInfo_Rarm4,forecastJiontInfo.JointInfo_Rleg1,
	                forecastJiontInfo.JointInfo_Rleg2,forecastJiontInfo.JointInfo_Rleg3,forecastJiontInfo.JointInfo_Rleg4,
	                forecastJiontInfo.JointInfo_Rleg5,forecastJiontInfo.JointInfo_Rleg6,forecastJiontInfo.JointInfo_Head2,
	                forecastJiontInfo.JointInfo_Larm1,forecastJiontInfo.JointInfo_Larm2,forecastJiontInfo.JointInfo_Larm3,
	                forecastJiontInfo.JointInfo_Larm4,forecastJiontInfo.JointInfo_Lleg1,forecastJiontInfo.JointInfo_Lleg2,
	                forecastJiontInfo.JointInfo_Lleg3,forecastJiontInfo.JointInfo_Lleg4,forecastJiontInfo.JointInfo_Lleg5,
	                forecastJiontInfo.JointInfo_Lleg6);
		else if(i_SendedCount==3)
		{
			sendJointInfo1.setValue(sendJointInfo2.JointInfo_Head1,sendJointInfo2.JointInfo_Rarm1,sendJointInfo2.JointInfo_Rarm2,
					sendJointInfo2.JointInfo_Rarm3,sendJointInfo2.JointInfo_Rarm4,sendJointInfo2.JointInfo_Rleg1,
					sendJointInfo2.JointInfo_Rleg2,sendJointInfo2.JointInfo_Rleg3,sendJointInfo2.JointInfo_Rleg4,
					sendJointInfo2.JointInfo_Rleg5,sendJointInfo2.JointInfo_Rleg6,sendJointInfo2.JointInfo_Head2,
					sendJointInfo2.JointInfo_Larm1,sendJointInfo2.JointInfo_Larm2,sendJointInfo2.JointInfo_Larm3,
					sendJointInfo2.JointInfo_Larm4,sendJointInfo2.JointInfo_Lleg1,sendJointInfo2.JointInfo_Lleg2,
					sendJointInfo2.JointInfo_Lleg3,sendJointInfo2.JointInfo_Lleg4,sendJointInfo2.JointInfo_Lleg5,
					sendJointInfo2.JointInfo_Lleg6);
			sendJointInfo2.setValue(sendJointInfo3.JointInfo_Head1,sendJointInfo3.JointInfo_Rarm1,sendJointInfo3.JointInfo_Rarm2,
					sendJointInfo3.JointInfo_Rarm3,sendJointInfo3.JointInfo_Rarm4,sendJointInfo3.JointInfo_Rleg1,
					sendJointInfo3.JointInfo_Rleg2,sendJointInfo3.JointInfo_Rleg3,sendJointInfo3.JointInfo_Rleg4,
					sendJointInfo3.JointInfo_Rleg5,sendJointInfo3.JointInfo_Rleg6,sendJointInfo3.JointInfo_Head2,
					sendJointInfo3.JointInfo_Larm1,sendJointInfo3.JointInfo_Larm2,sendJointInfo3.JointInfo_Larm3,
					sendJointInfo3.JointInfo_Larm4,sendJointInfo3.JointInfo_Lleg1,sendJointInfo3.JointInfo_Lleg2,
					sendJointInfo3.JointInfo_Lleg3,sendJointInfo3.JointInfo_Lleg4,sendJointInfo3.JointInfo_Lleg5,
					sendJointInfo3.JointInfo_Lleg6);
			sendJointInfo3.setValue(forecastJiontInfo.JointInfo_Head1,forecastJiontInfo.JointInfo_Rarm1,forecastJiontInfo.JointInfo_Rarm2,
	                forecastJiontInfo.JointInfo_Rarm3,forecastJiontInfo.JointInfo_Rarm4,forecastJiontInfo.JointInfo_Rleg1,
	                forecastJiontInfo.JointInfo_Rleg2,forecastJiontInfo.JointInfo_Rleg3,forecastJiontInfo.JointInfo_Rleg4,
	                forecastJiontInfo.JointInfo_Rleg5,forecastJiontInfo.JointInfo_Rleg6,forecastJiontInfo.JointInfo_Head2,
	                forecastJiontInfo.JointInfo_Larm1,forecastJiontInfo.JointInfo_Larm2,forecastJiontInfo.JointInfo_Larm3,
	                forecastJiontInfo.JointInfo_Larm4,forecastJiontInfo.JointInfo_Lleg1,forecastJiontInfo.JointInfo_Lleg2,
	                forecastJiontInfo.JointInfo_Lleg3,forecastJiontInfo.JointInfo_Lleg4,forecastJiontInfo.JointInfo_Lleg5,
	                forecastJiontInfo.JointInfo_Lleg6);
		}
		i_SendedCount++;
		if(i_SendedCount==5)
		{
			i_SendedCount=0;
			sendJointInfo1.clear();
			sendJointInfo2.clear();
			sendJointInfo3.clear();
		}
	}
     public void Record_Received_JointSense()
    {
    	if(i_ReceivedCount==0)
    		receiveJointInfo1.setValue(parseMessage.nowJoint.JointInfo_Head1,parseMessage.nowJoint.JointInfo_Rarm1,parseMessage.nowJoint.JointInfo_Rarm2,parseMessage.nowJoint.JointInfo_Rarm3,
    				parseMessage.nowJoint.JointInfo_Rarm4,parseMessage.nowJoint.JointInfo_Rleg1,parseMessage.nowJoint.JointInfo_Rleg2,parseMessage.nowJoint.JointInfo_Rleg3,
    				parseMessage.nowJoint.JointInfo_Rleg4,parseMessage.nowJoint.JointInfo_Rleg5,parseMessage.nowJoint.JointInfo_Rleg6,parseMessage.nowJoint.JointInfo_Head2,
    				parseMessage.nowJoint.JointInfo_Larm1,parseMessage.nowJoint.JointInfo_Larm2,parseMessage.nowJoint.JointInfo_Larm3,parseMessage.nowJoint.JointInfo_Larm4,
    				parseMessage.nowJoint.JointInfo_Lleg1,parseMessage.nowJoint.JointInfo_Lleg2,parseMessage.nowJoint.JointInfo_Lleg3,parseMessage.nowJoint.JointInfo_Lleg4,
    				parseMessage.nowJoint.JointInfo_Lleg5,parseMessage.nowJoint.JointInfo_Lleg6);
    	else if(i_ReceivedCount==1)
    		receiveJointInfo2.setValue(parseMessage.nowJoint.JointInfo_Head1,parseMessage.nowJoint.JointInfo_Rarm1,parseMessage.nowJoint.JointInfo_Rarm2,parseMessage.nowJoint.JointInfo_Rarm3,
    				parseMessage.nowJoint.JointInfo_Rarm4,parseMessage.nowJoint.JointInfo_Rleg1,parseMessage.nowJoint.JointInfo_Rleg2,parseMessage.nowJoint.JointInfo_Rleg3,
    				parseMessage.nowJoint.JointInfo_Rleg4,parseMessage.nowJoint.JointInfo_Rleg5,parseMessage.nowJoint.JointInfo_Rleg6,parseMessage.nowJoint.JointInfo_Head2,
    				parseMessage.nowJoint.JointInfo_Larm1,parseMessage.nowJoint.JointInfo_Larm2,parseMessage.nowJoint.JointInfo_Larm3,parseMessage.nowJoint.JointInfo_Larm4,
    				parseMessage.nowJoint.JointInfo_Lleg1,parseMessage.nowJoint.JointInfo_Lleg2,parseMessage.nowJoint.JointInfo_Lleg3,parseMessage.nowJoint.JointInfo_Lleg4,
    				parseMessage.nowJoint.JointInfo_Lleg5,parseMessage.nowJoint.JointInfo_Lleg6);
    	else if(i_ReceivedCount==2)
    		receiveJointInfo3.setValue(parseMessage.nowJoint.JointInfo_Head1,parseMessage.nowJoint.JointInfo_Rarm1,parseMessage.nowJoint.JointInfo_Rarm2,parseMessage.nowJoint.JointInfo_Rarm3,
    				parseMessage.nowJoint.JointInfo_Rarm4,parseMessage.nowJoint.JointInfo_Rleg1,parseMessage.nowJoint.JointInfo_Rleg2,parseMessage.nowJoint.JointInfo_Rleg3,
    				parseMessage.nowJoint.JointInfo_Rleg4,parseMessage.nowJoint.JointInfo_Rleg5,parseMessage.nowJoint.JointInfo_Rleg6,parseMessage.nowJoint.JointInfo_Head2,
    				parseMessage.nowJoint.JointInfo_Larm1,parseMessage.nowJoint.JointInfo_Larm2,parseMessage.nowJoint.JointInfo_Larm3,parseMessage.nowJoint.JointInfo_Larm4,
    				parseMessage.nowJoint.JointInfo_Lleg1,parseMessage.nowJoint.JointInfo_Lleg2,parseMessage.nowJoint.JointInfo_Lleg3,parseMessage.nowJoint.JointInfo_Lleg4,
    				parseMessage.nowJoint.JointInfo_Lleg5,parseMessage.nowJoint.JointInfo_Lleg6);
    	else if(i_ReceivedCount==3)
    	{
    		receiveJointInfo1.setValue(receiveJointInfo2.JointInfo_Head1,receiveJointInfo2.JointInfo_Rarm1,receiveJointInfo2.JointInfo_Rarm2,
    				receiveJointInfo2.JointInfo_Rarm3,receiveJointInfo2.JointInfo_Rarm4,receiveJointInfo2.JointInfo_Rleg1,
    				receiveJointInfo2.JointInfo_Rleg2,receiveJointInfo2.JointInfo_Rleg3,receiveJointInfo2.JointInfo_Rleg4,
    				receiveJointInfo2.JointInfo_Rleg5,receiveJointInfo2.JointInfo_Rleg6,receiveJointInfo2.JointInfo_Head2,
    				receiveJointInfo2.JointInfo_Larm1,receiveJointInfo2.JointInfo_Larm2,receiveJointInfo2.JointInfo_Larm3,
    				receiveJointInfo2.JointInfo_Larm4,receiveJointInfo2.JointInfo_Lleg1,receiveJointInfo2.JointInfo_Lleg2,
    				receiveJointInfo2.JointInfo_Lleg3,receiveJointInfo2.JointInfo_Lleg4,receiveJointInfo2.JointInfo_Lleg5,
    				receiveJointInfo2.JointInfo_Lleg6);
    		receiveJointInfo2 .setValue(receiveJointInfo3.JointInfo_Head1,receiveJointInfo3.JointInfo_Rarm1,receiveJointInfo3.JointInfo_Rarm2,
    				receiveJointInfo3.JointInfo_Rarm3,receiveJointInfo3.JointInfo_Rarm4,receiveJointInfo3.JointInfo_Rleg1,
    				receiveJointInfo3.JointInfo_Rleg2,receiveJointInfo3.JointInfo_Rleg3,receiveJointInfo3.JointInfo_Rleg4,
    				receiveJointInfo3.JointInfo_Rleg5,receiveJointInfo3.JointInfo_Rleg6,receiveJointInfo3.JointInfo_Head2,
    				receiveJointInfo3.JointInfo_Larm1,receiveJointInfo3.JointInfo_Larm2,receiveJointInfo3.JointInfo_Larm3,
    				receiveJointInfo3.JointInfo_Larm4,receiveJointInfo3.JointInfo_Lleg1,receiveJointInfo3.JointInfo_Lleg2,
    				receiveJointInfo3.JointInfo_Lleg3,receiveJointInfo3.JointInfo_Lleg4,receiveJointInfo3.JointInfo_Lleg5,
    				receiveJointInfo3.JointInfo_Lleg6);
    		receiveJointInfo3.setValue(parseMessage.nowJoint.JointInfo_Head1,parseMessage.nowJoint.JointInfo_Rarm1,parseMessage.nowJoint.JointInfo_Rarm2,parseMessage.nowJoint.JointInfo_Rarm3,
    				parseMessage.nowJoint.JointInfo_Rarm4,parseMessage.nowJoint.JointInfo_Rleg1,parseMessage.nowJoint.JointInfo_Rleg2,parseMessage.nowJoint.JointInfo_Rleg3,
    				parseMessage.nowJoint.JointInfo_Rleg4,parseMessage.nowJoint.JointInfo_Rleg5,parseMessage.nowJoint.JointInfo_Rleg6,parseMessage.nowJoint.JointInfo_Head2,
    				parseMessage.nowJoint.JointInfo_Larm1,parseMessage.nowJoint.JointInfo_Larm2,parseMessage.nowJoint.JointInfo_Larm3,parseMessage.nowJoint.JointInfo_Larm4,
    				parseMessage.nowJoint.JointInfo_Lleg1,parseMessage.nowJoint.JointInfo_Lleg2,parseMessage.nowJoint.JointInfo_Lleg3,parseMessage.nowJoint.JointInfo_Lleg4,
    				parseMessage.nowJoint.JointInfo_Lleg5,parseMessage.nowJoint.JointInfo_Lleg6);;
    	}
    	i_ReceivedCount++;
    	if(i_ReceivedCount==5)
    	{
    		i_ReceivedCount=0;
    		receiveJointInfo1.clear();
    		receiveJointInfo2.clear();
    		receiveJointInfo3.clear();
    	}
    }
	 public void standUpFromFront()
	{
		count++;
		if(count<=10)
		{
			if(count==1)
			  difference(basicdate.standUpForward[0]);
			ss=mp.toString(basicdate.temp,10);
		}
		else if(count<=25)
		{
			if(count==11||count==16||count==21)
			    difference(basicdate.standUpForward[1]);
			ss=mp.toString(basicdate.temp,5);
		}
		else if(count<=45)
		{
			if(count==26)
			    difference(basicdate.standUpForward[2]);
			ss=mp.toString(basicdate.temp,20);
		}

		else if(count<=65)
		{
			if(count==46)
			     difference(basicdate.standUpForward[3]);
			ss=mp.toString(basicdate.temp,20);
		}
		else if(count<=75)
		{
			if(count==66)
			    difference(basicdate.standUpForward[3]);
			ss=mp.toString(basicdate.temp,10);
		}
		else if(count<116)
		{
			// calculateMotion();
			 //ss=mp.toString(basicdate.temp,1);
			if(count==76)
			   difference(basicdate.beforStart);
			//int aa=(int)num;
			ss=mp.toString(basicdate.temp,40);
			 
		}
		else
		{
			 // difference(basicdate.beforStart);
				//ss=mp.toString(basicdate.temp,1);
			  motionSelect=0;
		    count=0;
		}
	}
	public void standUpFromBack()
	{
		count++;
		if(count<=30)
		{
			if(count==1||count==11||count==21)
			    difference(basicdate.standUpBack[0]);
			ss=mp.toString(basicdate.temp,10);
		}
		else if(count<=55)
		{
			if(count==31||count==51)
			     difference(basicdate.standUpBack[1]);
			ss=mp.toString(basicdate.temp,20);
		}
		else if(count<=75)
		{
			if(count==56||count==66)
			  difference(basicdate.standUpBack[2]);
			ss=mp.toString(basicdate.temp,10);
		}
		else if(count<=88)
		{
			if(count==76||count==85)
			  difference(basicdate.standUpBack[3]);
			ss=mp.toString(basicdate.temp,9);
		}
		else if(count<=115)
		{
			ss=mp.toString(basicdate.standUp,1);				//
		}
		else if(count<155)
		{
			 		if(count==116)
			     difference(basicdate.beforStart);
			  // int aa=(int)num;
		  	ss=mp.toString(basicdate.temp,40);
		}
		else
		{
					count=0;
		   	motionSelect=0;
		}
		
	}
    public void difference(double arry[])
	{
		basicdate.temp[0]=arry[0]-parseMessage.nowJoint.JointInfo_Head1;
		
		basicdate.temp[1]=arry[1]-parseMessage.nowJoint.JointInfo_Rarm1;
		basicdate.temp[2]=arry[2]-parseMessage.nowJoint.JointInfo_Rarm2;
		basicdate.temp[3]=arry[3]-parseMessage.nowJoint.JointInfo_Rarm3;
		basicdate.temp[4]=arry[4]-parseMessage.nowJoint.JointInfo_Rarm4;
		
		basicdate.temp[5]=arry[5]-parseMessage.nowJoint.JointInfo_Rleg1;
		basicdate.temp[6]=arry[6]-parseMessage.nowJoint.JointInfo_Rleg2;
		basicdate.temp[7]=arry[7]-parseMessage.nowJoint.JointInfo_Rleg3;
		basicdate.temp[8]=arry[8]-parseMessage.nowJoint.JointInfo_Rleg4;
		basicdate.temp[9]=arry[9]-parseMessage.nowJoint.JointInfo_Rleg5;
		basicdate.temp[10]=arry[10]-parseMessage.nowJoint.JointInfo_Rleg6;
		
        basicdate.temp[11]=arry[11]-parseMessage.nowJoint.JointInfo_Head2;
		
		basicdate.temp[12]=arry[12]-parseMessage.nowJoint.JointInfo_Larm1;
		basicdate.temp[13]=arry[13]-parseMessage.nowJoint.JointInfo_Larm2;
		basicdate.temp[14]=arry[14]-parseMessage.nowJoint.JointInfo_Larm3;
		basicdate.temp[15]=arry[15]-parseMessage.nowJoint.JointInfo_Larm4;
		
		basicdate.temp[16]=arry[16]-parseMessage.nowJoint.JointInfo_Lleg1;
		basicdate.temp[17]=arry[17]-parseMessage.nowJoint.JointInfo_Lleg2;
		basicdate.temp[18]=arry[18]-parseMessage.nowJoint.JointInfo_Lleg3;
		basicdate.temp[19]=arry[19]-parseMessage.nowJoint.JointInfo_Lleg4;
		basicdate.temp[20]=arry[20]-parseMessage.nowJoint.JointInfo_Lleg5;
		basicdate.temp[21]=arry[21]-parseMessage.nowJoint.JointInfo_Lleg6;
	}
    public void calculateMotion()
    {
    	double k,d,b,c,x,y,Rdatui,Rxiaotui,Ldatui,Lxiaotui;  	 	
    	k=Rhigh*Rhigh+shankHeight*shankHeight+Rdistance*Rhigh-thighHeight*thighHeight;
    	d=4.0*Rdistance*Rdistance*shankHeight*shankHeight+4.0*Rhigh*Rhigh*shankHeight*shankHeight;
    	b=4.0*Rdistance*shankHeight*k;
    	c=k*k-4.0*Rhigh*Rhigh*shankHeight*shankHeight;
    	x=(-b+Math.sqrt(b*b-4.0*d*c))/(2.0*d);
    	y=(x*shankHeight+Rdistance)/thighHeight;
    	Rdatui=Math.asin(y)*180/Pi;
    	Rxiaotui=Math.asin(x)*180/Pi+Rdatui;
    		
    	k=Lhigh*Lhigh+shankHeight*shankHeight+Ldistance*Ldistance-thighHeight*thighHeight;
    	d=4.0*Ldistance*Ldistance*shankHeight*shankHeight+4.0*Lhigh*Lhigh*shankHeight*shankHeight;
    	b=4.0*Ldistance*shankHeight*k;
    	c=k*k-4.0*Lhigh*Lhigh*shankHeight*shankHeight;
    	x=(-b+Math.sqrt(b*b-4.0*d*c))/(2.0*d);
    	y=(x*shankHeight+Ldistance)/thighHeight;
    	Ldatui=Math.asin(y)*180/Pi;
    	Lxiaotui=Math.asin(x)*180/Pi+Ldatui;
    	
    	//System.out.println(Rhigh+"//"+Rhigh+"//"+Lhigh+"//"+Ldistance);
    	
        basicdate.temp[0]=(basicdate.beforStart[0]-parseMessage.nowJoint.JointInfo_Head1)*gain;
		
		basicdate.temp[1]=(basicdate.beforStart[1]-parseMessage.nowJoint.JointInfo_Rarm1)*gain;
		basicdate.temp[2]=(basicdate.beforStart[2]-parseMessage.nowJoint.JointInfo_Rarm2)*gain;
		basicdate.temp[3]=(basicdate.beforStart[3]-parseMessage.nowJoint.JointInfo_Rarm3)*gain;
		basicdate.temp[4]=(basicdate.beforStart[4]-parseMessage.nowJoint.JointInfo_Rarm4)*gain;
		
		basicdate.temp[5]=(basicdate.beforStart[5]-parseMessage.nowJoint.JointInfo_Rleg1)*gain;
		basicdate.temp[6]=(basicdate.beforStart[6]-parseMessage.nowJoint.JointInfo_Rleg2)*gain;
		basicdate.temp[7]=(Rdatui-parseMessage.nowJoint.JointInfo_Rleg3)*gain;
		basicdate.temp[8]=(-Rxiaotui-parseMessage.nowJoint.JointInfo_Rleg4)*gain;
		basicdate.temp[9]=(Rxiaotui-Rdatui-parseMessage.nowJoint.JointInfo_Rleg5)*gain;
		basicdate.temp[10]=(basicdate.beforStart[10]-parseMessage.nowJoint.JointInfo_Rleg6)*gain;
		
        basicdate.temp[11]=(basicdate.beforStart[11]-parseMessage.nowJoint.JointInfo_Head2)*gain;
		
		basicdate.temp[12]=(basicdate.beforStart[12]-parseMessage.nowJoint.JointInfo_Larm1)*gain;
		basicdate.temp[13]=(basicdate.beforStart[13]-parseMessage.nowJoint.JointInfo_Larm2)*gain;
		basicdate.temp[14]=(basicdate.beforStart[14]-parseMessage.nowJoint.JointInfo_Larm3)*gain;
		basicdate.temp[15]=(basicdate.beforStart[15]-parseMessage.nowJoint.JointInfo_Larm4)*gain;
		
		basicdate.temp[16]=(basicdate.beforStart[16]-parseMessage.nowJoint.JointInfo_Lleg1)*gain;
		basicdate.temp[17]=(basicdate.beforStart[17]-parseMessage.nowJoint.JointInfo_Lleg2)*gain;
		basicdate.temp[18]=(Ldatui-parseMessage.nowJoint.JointInfo_Lleg3)*gain;
		basicdate.temp[19]=(-Lxiaotui-parseMessage.nowJoint.JointInfo_Lleg4)*gain;
		basicdate.temp[20]=(Lxiaotui-Ldatui-parseMessage.nowJoint.JointInfo_Lleg5)*gain;
		basicdate.temp[21]=(basicdate.beforStart[21]-parseMessage.nowJoint.JointInfo_Lleg6)*gain;
    }
}