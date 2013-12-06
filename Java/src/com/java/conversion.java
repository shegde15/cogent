package com.java;

public class conversion{
  public static void main(String[] args){
  boolean t = true;
  byte b = 2;
  short s = 100;
  char c = 'C';
  int i = 200;
  long l = 24000;
  float f = 3.14f;
  double d = 0.000000000000053;
  String g = "string";
  System.out.println("Value of all the variables like");
  System.out.println("t = " + t );
  System.out.println("b = " + b );
  System.out.println("s = " + s );
  System.out.println("c = " + c );
  System.out.println("i = " + i );
  System.out.println("l = " + l );
  System.out.println("f = " + f );
  System.out.println("d = " + d );
  System.out.println("g = " + g );
  System.out.println();
  //Convert from boolean to byte.
  b = (byte)(t?1:0);
  System.out.println("Value of b after conversion : " + b);
  //Convert from boolean to short.
  s = (short)(t?1:0);
  System.out.println("Value of s after conversion : " + s);
  //Convert from boolean to int.
  i = (int)(t?1:0);
  System.out.println("Value of i after conversion : " + i);
  //Convert from boolean to char.
  c = (char)(t?'1':'0');
  System.out.println("Value of c after conversion : " + c);
  c = (char)(t?1:0);
  System.out.println("Value of c after conversion in unicode : " + c);
  //Convert from boolean to long.
  l = (long)(t?1:0);
  System.out.println("Value of l after conversion : " + l);
  //Convert from boolean to float.
  f = (float)(t?1:0);
  System.out.println("Value of f after conversion : " + f);
  //Convert from boolean to double.
  d = (double)(t?1:0);
  System.out.println("Value of d after conversion : " + d);
  //Convert from boolean to String.
  g = String.valueOf(t);
  System.out.println("Value of g after conversion : " + g);
  g = (String)(t?"1":"0");
  System.out.println("Value of g after conversion : " + g);
  int sum = (int)(b + i + l + d + f);
  System.out.println("Value of sum after conversion : " + sum);
//convert int to float 
int   xInt = 120;
      float xFloat;

         xFloat = xInt;
System.out.println("Value of sum after conversion : " + xFloat);

//convert float to int

int   xInt1;
      float xFloat1 = 3.8644f;

         xInt1 = (int) xFloat1;
System.out.println("Value of sum after conversion : " + xInt1);
//convert double to float

double   xDouble = 3.8644951;
      float     xFloat2;

         xFloat2 = (float) xDouble;
System.out.println("Value of sum after conversion : " + xFloat2);
System.out.println("Value of boolean : " + t);

  }
} 