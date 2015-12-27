import java.io.*;
import java.util.*;



public class Solution {

	/*public int addString(int[] f,int[] s)
	{
		
	}*/
	int sum=0;
	 int tr=0;
	 int power(int a,int b) 
     {
		 
         if(a<0 || b<0)
             {
             //System.out.println("java.lang.Exception: n and p should be non-negative");
             try {
				throw new Exception ("java.lang.Exception: n and p should be non-negative");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
         }
         int n=b;
     while(n>0)
         {
    	 
         sum=sum+a*a;
         n--;
         throw new ArithmeticException();
     }
     return sum;
 }
	
	public static void main(String[] args) 
	{	try {
		Scanner sc=new Scanner(System.in);
		int  aws=sc.nextInt();
		int g=-1;int sum=1;
		/* while(g>0)
         {
         sum=sum*aws;
         g--;
     }*/
		 if(aws<0 || g<0)
         {
         //System.out.println("java.lang.Exception: n and p should be non-negative");
         
			throw new InputMismatchException ();
		}} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("java.util.InputMismatchException");
		}
		// System.out.println(sum);
		int tee=123;
		//int sum=0;
		int temp;
		int divSum=0;
		
		
		if(tee%2==0)
		{
			divSum=tee+2;
		}
		else
		{	ArrayList<Integer> arr=new ArrayList<>();
			int div=tee;int n=3;
			while(n<=div)
			{	
				if(div%n==0)
				{
					arr.add(n);
				}
				n=n+2;
			}
			int size=arr.size();
			//while(size>0)
			for(int i=0;i<arr.size();i++)
			{
				divSum=divSum+arr.get(i);
			}
		}
		System.out.println(divSum);
		
	/*	Scanner scan = new Scanner(System.in);
		//System.out.println("enter first no");
		String a=scan.next();
		//System.out.println("enter second no");
		String b=scan.next();
		 if(( a.equals("0")) || (b.equals("0")))
         {
         if(a.equals(0))
           System.out.println(a);
         else 
              System.out.println(b);
		       System.out.println("0");
         }
		//JavaApplication5 mult=new JavaApplication5();
		Solution sol=new Solution();
		int [] f = convert(a);
		 
		int [] s = convert(b);
		String [] result = sol.multiply(f, s);
		String [] mresult = arrange(result);
		String sum="0";
        String addition="";
		for(int k=0;k<mresult.length;k++)
		{
		sum = add(sum,mresult[k]);
		}
     //   addition = addString(f,s);
        System.out.println(addition);
		System.out.println(sum);
		}
		public static String add(String a1, String b1)
		{
		int [] a = convert(a1);
		int [] b = convert(b1);
		int l = a.length-1;
		int m = b.length-1;
		int sum =0;
		int carry = 0;
		int rem = 0;
		String temp = "";
		if(a.length>b.length)
		{
		while(m>=0)
		{
		sum = a[l] + b[m] + carry;
		carry = sum/10;
		rem = sum%10;
		temp = rem + temp;
		m--;
		l--;
		}
		while(l>=0)
		{
		sum = a[l] + carry;
		carry = sum/10;
		rem = sum%10;
		temp = rem + temp;
		l--;
		}
		if(carry>0)
		{
		temp = carry + temp;
		}
		}
		else
		{
		while(l>=0)
		{
		sum = a[l] + b[m] + carry;
		carry = sum/10;
		rem = sum%10;
		temp = rem + temp;
		m--;
		l--;
		}
		while(m>=0)
		{
		sum = b[m] + carry;
		carry = sum/10;
		rem = sum%10;
		temp = rem + temp;
		m--;
		}
		if(carry>0)
		{
		temp = carry + temp;
		}
		}
		return temp;
		 
		}
		 

		public static int [] convert(String a)
		{
		int [] temp = new int[a.length()];
		for(int i=0;i<a.length();i++)
		{
		temp[i] = Character.digit(a.charAt(i), 10);
		 
		}
		 
		return temp;
		}
		public static String [] arrange(String [] result)
		{
		for(int i=0;i<result.length;i++)
		{
		int j=0;
		while(j<i)
		{
		result[i] = result[i] + "0";
		j++;
		}
		}
		return result;
		}
		 
		public String[] multiply(int [] a,int [] b)
		{
		String [] temp = new String[b.length];
		for(int i=b.length-1;i>=0;i--)
		{
		 
		int carry=0;
		int result=0;
		int rem=0;
		temp[b.length-i-1]="";
		for(int j=a.length-1;j>=0;j--)
		{
		result = a[j]*b[i] + carry;
		carry = result/10;
		rem = result%10;
		temp[b.length - i-1]= rem + temp[b.length - i-1];
		}
		if(carry>0)
		{
		temp[b.length -i-1] = carry + temp[b.length -i -1];
		}
		}
		return temp;

		
		
		
		
		
*/		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		int len=s.length();
		ArrayList<String> arr=new ArrayList();
		while(len>0)
		{
			String[] s_arr= s.split(" ");
			String[] build=s_arr;
			int a= s_arr.length;
			int index=a;
			boolean flag;
			for(int i=0;i<s_arr.length;i++){
				//arr.add(s_arr[i]);
				String addS="";
				if(s_arr[i].contains("?") ||s_arr[i].contains("'")||s_arr[i].contains("!")||s_arr[i].contains(",")||s_arr[a-1].contains(".")||s_arr[i].contains("+")||s_arr[i].contains("@"))
				{
					char[] ch = new char[s_arr[i].length()];
					s_arr[i].getChars(0, s_arr[i].length(), ch, 0);
					int count=ch.length;
					int j=0;
					while(count>0)
					{
						if((ch[j]=='?') || (ch[j]=='!')|| (ch[j]==',')|| (ch[j]=='.')|| (ch[j]=='+')|| (ch[j]=='@'))
						{
							for(int k=0;k<j;k++)
							{
								addS=addS+ch[k];
								
							}
							arr.add(addS);
							flag=false;
						}
						j++;
						count--;
					}
				}
				if(true)
				{
					addS=s_arr[i];
					arr.add(addS);
				}
				
			}
			len--;
		}
		System.out.println(arr);
	}
}


/*import java.io.*;
import java.util.*;

public class Solution {
    
    static String sortString(String rev)
        {
        char[] tq=new char[rev.length()];
      	for(int i=0;i<rev.length();i++ ){
    		//  c= rev.substring(i, i+1);
    		  rev.getChars(0, rev.length(), tq, 0);
        }
      	for(int i=0;i<rev.length();i++ ){
      	//System.out.print(tq[i]);
      	for(int j=i+1;j<rev.length();j++ ){
      		String	 qwe="";
      	qwe=qwe+tq[i];
      String asd="";	
      	asd=asd+tq[j];
      	int ar=qwe.compareToIgnoreCase(asd);
      	if(ar>0)
      //	if(tq[i]>tq[j])
            {
      		char temp=tq[j];
      		tq[j]=tq[i];
      		tq[i]=temp;
      	}}
      	
      	}
      	    	
      	String sort="";
      	for(int i=0;i<rev.length();i++ ){
        sort=sort+tq[i];  
      	}
      	//System.out.println("sort :"+sort);
        return sort;
    }
   static boolean isAnagram(String A, String B) {
      //Complete the function
   String sortA= Solution.sortString(A);
       String sortB= Solution.sortString(B);
       if(sortA.equalsIgnoreCase(sortB))
           {
           return true;
       }
       else
           {
           return false;
       }
       
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
*/
/*
import java.util.*;
import java.io.*;



class Solution{
	public String reverse(String rev)
	{
		String B="";
      //  int j=rev.length();
        for(int i=0;i<rev.length();i++)
        {
      	  String c=rev.substring(i,i+1);
      	 for(int j=i+1;j<rev.length();j++)
      	 {
      	  if(rev.charAt(i)>rev.charAt(j)){
      		  char temp=rev.charAt(i);
      		 rev= rev.replace(rev.charAt(i), rev.charAt(j));
      		rev=  rev.replace( rev.charAt(j), temp);
      		
      		
      		 // rev.replace
      	  }
      	
      	 }
         
        
           
	}return rev;
	}
    public static void main(String []argh) 
    {
    	String rev="eHllo";
    	String rev1="ehllo";
    	if(rev.equalsIgnoreCase(rev1))
    	{
    		System.out.println("hi");
    	}
    	 char[] tq=new char[rev.length()];
       	for(int i=0;i<rev.length();i++ ){
     		//  c= rev.substring(i, i+1);
     		  rev.getChars(0, rev.length(), tq, 0);
         }
       	for(int i=0;i<rev.length();i++ ){
       	//System.out.print(tq[i]);
       	for(int j=i+1;j<rev.length();j++ ){
       		String	 qwe="";
       	qwe=qwe+tq[i];
       	String asd="";	
       	asd=asd+tq[j];
       	int ar=qwe.compareToIgnoreCase(asd);
       	if(ar>0)
       	{
       		char temp=tq[j];
       		tq[j]=tq[i];
       		tq[i]=temp;
       	}}
       	
       	}
       	    	
       	String sort="";
       	for(int i=0;i<rev.length();i++ ){
         sort=sort+tq[i];  
       	}
       	//System.out.println("sort :"+sort);
     //    return sort;
    	  Scanner sc1=new Scanner(System.in);
          String A=sc1.next();
          String B=new Solution().reverse(A);
          System.out.println("B "+B);
       
           Enter your code here. Print output to STDOUT. 
          //[] B=new char[A.length()];
          
         Enter your code hukfhere. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 

    	Scanner scan =new Scanner(System.in);
    	try{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line=scan.nextLine();
        int l=scan.nextInt();
        System.out.println(l);
        int i=0;
        int len=line.length();
        int k=l;
        String minString="";
        String maxString="";
        minString=line.substring(0,k);
          maxString=line.substring(0,k);
      while(len-k>=0)
          {
          String sub_string=line.substring(i,i+k);
         int val= sub_string.compareTo(minString);
          if(val<=0)
          {
              minString=sub_string;
          }
          val= sub_string.compareTo(maxString);
          if(val>0)
              {
              maxString=sub_string;
          }
        i++;  
        len--;
      }
      System.out.println(minString);
      System.out.println(maxString);
      }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
      
     



      
    	
    	
    	 String a="a";
         String b="b";
        int e= a.compareToIgnoreCase(b);
        String c=a.substring(0, 1);
        System.out.println(c);
         System.out.println(e);
    
       String A="hello";
       String B="java";
    	   A=A.replace(A.substring(0, 1), A.substring(0, 1).toUpperCase());
           B=B.replace(B.substring(0, 1), B.substring(0, 1).toUpperCase());
           String add=A+" " +B;
           System.out.println(add);
    	String input = "Cricket!";
    	String upper = input.toUpperCase(); //stores "CRICKET!"
    	String lower = input.toLowerCase();
    
    	String src="Hello";
        System.out.printf("%1s", src);
        String qw="hellohi";
        qw.toUpperCase();
        System.out.println(upper +" "+lower);
        
       
       c.toUpperCase();
       a.substring(0, 1).toUpperCase();
       String z=a;
       String ti=a.replace(a.substring(0, 1), a.substring(0, 1).toUpperCase());
       BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
       
       String line;
  while ((line = fileReader.readLine()) != null)   {
   System.out.println(line);}
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {

            try
            {
                long x=sc.nextLong();
                
                //Complete the code
            
            System.out.println(x+" can be fitted in:");
                if (x>=-128 && x<=127)
                {System.out.println("* byte");
                 System.out.println("* short");
                      System.out.println("* int"); 
                 System.out.println("* long");}
                 else if(x>=-32768 && x<=32767)
                 {
                       System.out.println("* short");
                      System.out.println("* int"); 
                    System.out.println("* long");
                }
                else if((x>=-((int) Math.pow(2, 31))-1) && (x<=(int) Math.pow(2, 31)))
                 {
               
                    System.out.println("* int"); 
                    System.out.println("* long"); 
                   
             }
           else  if((x>=-((long) Math.pow(2, 63))-1) && (x<=(long) Math.pow(2, 63)))
                 {
                      System.out.println("* long"); 
             }
                
           else System.out.println(x+" can't be fitted anywhere.");
            
            
              
            }
            
            catch(Exception u)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}*/