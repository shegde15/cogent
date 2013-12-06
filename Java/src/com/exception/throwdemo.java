package com.exception;
class throwdemo{

static void demo(){

try{
throw new NullPointerException("demo");
}catch(NullPointerException e){

System.out.println("caught inside the demo");
throw e;
}
}

public static void main(String sr[]){
try{
demo();
}catch(NullPointerException e){
System.out.println("recaught:"+e);
}
}
}
