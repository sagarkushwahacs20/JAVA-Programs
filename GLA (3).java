class GLA
{   
           GLA()
           {
	        System.out.println("Non para cons.....");
           }
           GLA(int a)
           {
 		System.out.println("para cons....");
	   }
           public static void main(String args[])
	   {
 			GLA obj=new GLA(25);
			GLA obj2=new GLA();
	   }
  

}