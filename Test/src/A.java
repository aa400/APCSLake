
public class A 
{
public A()
{
	methodOne();
}


public void methodOne()
{
	System.out.print("A");
}

public static String apcsReplaceAllString(String str, String oldStr, String newStr) 
{
	int pos = str.indexOf(oldStr);
	if(pos<0)
	{
		return str;
	}
	
	else
	{
		String firstPart = str.substring(0,pos);
		String restOfStr = str.substring(pos + oldStr.length());
	}
}



}
