package Ex1;

import java.util.ArrayList;

public class UserMain {
public static boolean checkTripplets (int a[])
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==a[i+1])
		{
			if((a[i]+a[i+1]+a[i+2])/3==a[i]);
			return true;
			break;
				
		}
	}
	
	return false;	
}
}
