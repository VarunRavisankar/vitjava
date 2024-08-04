public class Main
{
public static void main(String args[])
{
StringBuffer sb = new StringBuffer("Hello");
sb.append("Java");
System.out.println(sb);
}
}
/*public class Main
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Hello");
sb.insert(1,"Java");
System.out.println(sb);
}
}
public class Main
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Hello");
sb.replace(1,3,"Java");
System.out.println(sb);
}
}

public class Main
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Hello");
sb.delete(1,3);
System.out.println(sb);

}
}

public class Main
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Hello");
sb.reverse();
System.out.println(sb);
}
}

public class Main
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
sb.append("Hello");
System.out.println(sb.capacity());
sb.append("java is my favourite language");
System.out.println(sb.capacity());
}
}

public class Main
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
sb.append("Hello");
System.out.println(sb.capacity());
sb.append("java is my favourite language");
System.out.println(sb.capacity());
sb.ensureCapacity(10);
System.out.println(sb.capacity());
sb.ensureCapacity(50);
System.out.println(sb.capacity());
}

}

import java.util.StringTokenizer;
public class Main
{
public static void main(String args[])
{
StringTokenizer st = new StringTokenizer("my name is khan"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}

import java.util.StringTokenizer;
public class Main
{
public static void main(String args[])
{
StringTokenizer st = new StringTokenizer("my,name,is,khan");
System.out.println("Next Token is : "+st.nextToken(","));
}
}

import java.util.StringTokenizer;
public class Main
{
public static void main(String args[])
{
StringTokenizer st = new StringTokenizer("Demonstrating strings from String Tokenizer class","");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());

}
}
}

import java.util.StringTokenizer;
public class Main
{
public static void main(String args[])
{
StringTokenizer st = new StringTokenizer("Hello I am a Java developer","");
while(st.hasMoreElements())
{
System.out.println(st.nextToken());
}
}
}

import java.util.StringTokenizer;
public class Main
{
public static void main(String args[])
{
StringTokenizer st = new StringTokenizer("Hello everyone have a nice day","");
while(st.hasMoreTokens())
{
System.out.println(st.nextElement());
}
}
}

import java.util.StringTokenizer;
public class Main
{
public static void main(String args[])
{
StringTokenizer st = new StringTokenizer("Hello everyone have a nice day"," ");

System.out.println("Total number of tokens are : "+st.countTokens());

}
}

public class Main
{
public static void main ( String[] args )
{
int[] arr;
arr = new int[ 5 ];
arr[0]=10;

arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;
for(int i = 0;i<5;i++)
{
System.out.print(arr[i]);
}
}
}

class Main
{
public int roll_no;
public String name;
Student(int roll_no,String name)
{
this.roll_no=roll_no;
this.name=name;
}
}
public class ex2
{
public static void main(String args[])
{
Student arr[];
arr = new Student[5];
arr[0] = new Student(1,"aman");
arr[1] = new Student(2,"vaibhav");
arr[2] = new Student(3,"shikar");
arr[3] = new Student(4,"dharmesh");
arr[4] = new Student(5,"mohit");
for(int i = 0;i<arr.length;i++)
{
System.out.println("Element at " + i + ":" + arr[i].roll_no + " " + arr[i].name );
}
}
}*/
