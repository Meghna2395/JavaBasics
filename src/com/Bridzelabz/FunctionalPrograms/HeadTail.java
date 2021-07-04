package com.Bridzelabz.FunctionalPrograms;
public class HeadTail

{

public static void main(String[] args)

{

int loopCount = 1;

double result;

int heads = 0;

while(loopCount <= 10)

{

result = Math.random();

if(result <= .5)

System.out.println(" heads");

if(result <= .5)

heads = heads++;

else

System.out.println(" tails.");

loopCount = loopCount + 1;

}

double percentHeads = heads/10*100;

double percentTails = (10-heads)/10*100;

System.out.println(" heads : " +percentHeads);

System.out.println(" tails: " +percentTails);

}

}


