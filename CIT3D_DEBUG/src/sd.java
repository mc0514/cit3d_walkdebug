public class sd
{
	private ParseMessage aas;
	//String s="    (time (now 35.86))(GS (t 10.24) (pm PlayOn))(GYR (n torso) (rt -11.62 0.71 -25.06))(See (G1L (pol 3.45 -76.39 -20.16)) (G2L (pol 3.50 -73.39 -43.23)) (G2R (pol 8.75 85.16 24.33)) (G1R (pol 8.73 84.44 33.50)) (F1L (pol 5.10 -89.56 19.27)) (F2L (pol 5.31 -100.17 -81.09)) (F1R (pol 9.50 90.20 54.02)) (F2R (pol 9.61 91.21 4.54)) (B (pol 2.68 91.01 27.09)))(HJ (n hj1) (ax 0.00))(HJ (n hj2) (ax 0.00))(HJ (n raj1) (ax -105.00))(HJ (n raj2) (ax -5.00))(HJ (n raj3) (ax 90.00))(HJ (n raj4) (ax 45.00))(HJ (n laj1) (ax -105.00))(HJ (n laj2) (ax 5.00))(HJ (n laj3) (ax -90.00))(HJ (n laj4) (ax -45.00))(HJ (n rlj1) (ax -9.00))(HJ (n rlj2) (ax -0.01))(HJ (n rlj3) (ax 30.35))(HJ (n rlj4) (ax -94.33))(HJ (n rlj5) (ax 63.98))(FRP (n rf) (c 0.04 -0.08 0.01) (f 15.59 -0.87 -22.07))(HJ (n rlj6) (ax -0.00))(HJ (n llj1) (ax -9.01))(HJ (n llj2) (ax 0.01))(HJ (n llj3) (ax 28.88))(HJ (n llj4) (ax -93.89))(HJ (n llj5) (ax 65.00))(FRP (n lf) (c -0.04 -0.08 0.01) (f -5.35 18.84 -23.28))(HJ (n llj6) (ax 0.00))";
    //System.out.println(s.length());	
	public sd()
	{
         aas=new ParseMessage();
         String s="    (time (now 35.86))(GS (t 10.24) (pm PlayOn))(GYR (n torso) (rt -11.62 0.71 -25.06))(See (G1L (pol 3.45 -76.39 -20.16)) (G2L (pol 3.50 -73.39 -43.23)) (G2R (pol 8.75 85.16 24.33)) (G1R (pol 8.73 84.44 33.50)) (F1L (pol 5.10 -89.56 19.27)) (F2L (pol 5.31 -100.17 -81.09)) (F1R (pol 9.50 90.20 54.02)) (F2R (pol 9.61 91.21 4.54)) (B (pol 2.68 91.01 27.09)))(HJ (n hj1) (ax 0.00))(HJ (n hj2) (ax 0.00))(HJ (n raj1) (ax -105.00))(HJ (n raj2) (ax -5.00))(HJ (n raj3) (ax 90.00))(HJ (n raj4) (ax 45.00))(HJ (n laj1) (ax -105.00))(HJ (n laj2) (ax 5.00))(HJ (n laj3) (ax -90.00))(HJ (n laj4) (ax -45.00))(HJ (n rlj1) (ax -9.00))(HJ (n rlj2) (ax -0.01))(HJ (n rlj3) (ax 30.35))(HJ (n rlj4) (ax -94.33))(HJ (n rlj5) (ax 63.98))(FRP (n rf) (c 0.04 -0.08 0.01) (f 15.59 -0.87 -22.07))(HJ (n rlj6) (ax -0.00))(HJ (n llj1) (ax -9.01))(HJ (n llj2) (ax 0.01))(HJ (n llj3) (ax 28.88))(HJ (n llj4) (ax -93.89))(HJ (n llj5) (ax 65.00))(FRP (n lf) (c -0.04 -0.08 0.01) (f -5.35 18.84 -23.28))(HJ (n llj6) (ax 0.00))";
         //System.out.println(s.length());
         byte[] bt=s.getBytes();
         aas.parseMessage(bt,994);
         System.out.println(aas.nowJoint.JointInfo_Head1);
         System.out.println(aas.nowJoint.JointInfo_Larm2);
         System.out.println(aas.nowJoint.JointInfo_Rleg6);
         String st="    (time (now 35.88))(GS (t 10.26) (pm PlayOn))(GYR (n torso) (rt 19.90 14.00 -1.87))(See (G1L (pol 3.45 -76.53 -19.95)) (G2L (pol 3.50 -73.80 -43.06)) (G2R (pol 8.75 85.04 24.02)) (G1R (pol 8.73 84.25 33.19)) (F1L (pol 5.10 -89.39 19.57)) (F2L (pol 5.31 -102.31 -80.74)) (F1R (pol 9.50 89.71 53.74)) (F2R (pol 9.61 91.22 4.28)) (B (pol 2.68 90.87 26.85)))(HJ (n hj1) (ax -0.00))(HJ (n hj2) (ax 0.00))(HJ (n raj1) (ax -105.00))(HJ (n raj2) (ax -5.00))(HJ (n raj3) (ax 90.00))(HJ (n raj4) (ax 45.00))(HJ (n laj1) (ax -105.00))(HJ (n laj2) (ax 5.34))(HJ (n laj3) (ax -90.00))(HJ (n laj4) (ax -45.00))(HJ (n rlj1) (ax -7.50))(HJ (n rlj2) (ax -0.00))(HJ (n rlj3) (ax 32.03))(HJ (n rlj4) (ax -99.34))(HJ (n rlj5) (ax 67.30))(FRP (n rf) (c 0.04 -0.08 0.01) (f -5.09 9.09 -56.04))(HJ (n rlj6) (ax -0.00))(HJ (n llj1) (ax -7.51))(HJ (n llj2) (ax -0.01))(HJ (n llj3) (ax 28.13))(HJ (n llj4) (ax -92.45))(HJ (n llj5) (ax 64.31))(FRP (n lf) (c -0.04 -0.08 0.02) (f 19.78 13.35 25.27))(HJ (n llj6) (ax 0.75))";
         byte[] b=st.getBytes();
         aas.parseMessage(b,st.length()-4);
         System.out.println(aas.nowJoint.JointInfo_Head1);
         System.out.println(aas.nowJoint.JointInfo_Rleg5);
         System.out.println(aas.nowJoint.JointInfo_Rleg4);

	   	
	}
	public static void main(String[] args)
	{
		new sd();
		//String s="    (time (now 35.86))(GS (t 10.24) (pm PlayOn))(GYR (n torso) (rt -11.62 0.71 -25.06))(See (G1L (pol 3.45 -76.39 -20.16)) (G2L (pol 3.50 -73.39 -43.23)) (G2R (pol 8.75 85.16 24.33)) (G1R (pol 8.73 84.44 33.50)) (F1L (pol 5.10 -89.56 19.27)) (F2L (pol 5.31 -100.17 -81.09)) (F1R (pol 9.50 90.20 54.02)) (F2R (pol 9.61 91.21 4.54)) (B (pol 2.68 91.01 27.09)))(HJ (n hj1) (ax 0.00))(HJ (n hj2) (ax 0.00))(HJ (n raj1) (ax -105.00))(HJ (n raj2) (ax -5.00))(HJ (n raj3) (ax 90.00))(HJ (n raj4) (ax 45.00))(HJ (n laj1) (ax -105.00))(HJ (n laj2) (ax 5.00))(HJ (n laj3) (ax -90.00))(HJ (n laj4) (ax -45.00))(HJ (n rlj1) (ax -9.00))(HJ (n rlj2) (ax -0.01))(HJ (n rlj3) (ax 30.35))(HJ (n rlj4) (ax -94.33))(HJ (n rlj5) (ax 63.98))(FRP (n rf) (c 0.04 -0.08 0.01) (f 15.59 -0.87 -22.07))(HJ (n rlj6) (ax -0.00))(HJ (n llj1) (ax -9.01))(HJ (n llj2) (ax 0.01))(HJ (n llj3) (ax 28.88))(HJ (n llj4) (ax -93.89))(HJ (n llj5) (ax 65.00))(FRP (n lf) (c -0.04 -0.08 0.01) (f -5.35 18.84 -23.28))(HJ (n llj6) (ax 0.00))";
        //System.out.println(s.length());	
		//
		
	}
}