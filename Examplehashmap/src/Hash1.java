import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashMap;
public class Hash1 {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of employees");
	int noofemployees=s.nextInt();
HashMap<Integer,String> h1=new HashMap<Integer,String>();
     for(int i=0;i<noofemployees;i++)
     {
    	 h1.put(s.nextInt(),s.next());
     }
     //int noofemployees2=s.nextInt();
     HashMap<Integer,String> h2=new HashMap<Integer,String>();
     System.out.println("enter no of employees:");
     int noofemployees2=s.nextInt();
     for(int i=0;i<noofemployees2;i++)
     {
    	 h2.put(s.nextInt(),s.next());
     }
	System.out.println(h1);
	System.out.println(h2);
	Set q=h1.keySet();
	System.out.println(q);
	Iterator i=q.iterator();
	while(i.hasNext())
	{
		int a=(int) i.next();
		String id=h1.get(a);
		System.out.println(id);
		if(id.equals("manager"))
		{
			
		}
	}
	//HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	 //increasesalary(h1,h2,hm);
	}
}
/*public static void increasesalary(HashMap<Integer,String> h1,HashMap<Integer,String> h2,HashMap<Integer,Integer> hm)	{
	Set s1=h1.entrySet();
	Iterator i=s1.iterator();
	while(i.hasNext())
	{
		Map.Entry v=(Map.Entry)i.next();
		if(v.getValue().equals("accountant"))
		{
			Set s2=h2.entrySet();
			Iterator i1=s2.iterator();
			while(i1.hasNext())
			{
				Map.Entry v1=(Map.Entry)i1.next();
	            if(v1.getKey().equals(v.getKey()))
	            { 
	            	int x=Integer.parseInt(v1.getValue())+5000;
	            	hm.put((Integer) v1.getKey(),x);
	            }
			}
	}
	}
System.out.println(hm);
}
}*/
