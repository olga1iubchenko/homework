package com.ciklum.automation;

public class homework1 {
	  static int a = -2;
	  static int b = 5;
	  static  int min = 0;    
public static void main(String[] args) {

  minValue();
  }
 //1
  public static void minValue() {
      if (a > b) {
      int  min = b; 
      }
      else 
        min = a;
    System.out.println(min);
  }

//2
public static void sumDevidedByK(){
int array [] = {1,4,3,5,7,6};
int k = 3;
int sum = 0;
for (int element: array) {
  if(element%k==0){
    sum = sum + element;
  }
}
 System.out.println(sum);
}


//3
public static void arrayWithZeros() {
int array [] = {1,4,0,3,0,5,0};
int a=0;
for(int i=0 ; i <=array.length; i++){
    if(array[i]==0)
      a++;
}
int array2 [a]; 
int j=0;
for (int i = 0; i < array.length; i++) {
  if(array[i]==0){
    int array2 [j] = i;
    j++;
  }
   }
   System.out.println(array2);
}

//4
public static void isPositiveOrNegative(){
int array [] = {1,4,0,-3,0,-5,0};
for (int i = 0; i < array.length; i++) {
  if(array[i] > 0){
    System.out.println("the positive first");
  }
  else if (array[i]<0){
      System.out.println("the nevative first");
  }
  } 
}


//5
public static void isArrayOrdered(){
int array [] = {1,4,2,-3,0,-5,11};
for (int i = 0; i < array.length; i++) {
  if(array[i] > array[i+1])
      break;
   System.out.println("array isn't ordered by asc rule");
 } 
System.out.println("array is ordered by asc rule");
}


//6
public static void newArrayWithEvenNumbers(){
    int array [] = {1,4,-2,3,7,5,13};
    int arrayWithEvenNum []; 
    int num = 0;
    for (int i = 0; i < array.length; i++) {
      if(array[i]%2 == 0){
        num++;  
      }
       }
      int arrayWithEvenNum[num];
      int j = 0;
       for (int i = 0; i < array.length; i++) {
        if(array[i]%2 == 0){
          arrayWithEvenNum [j] = array[i];
          j++;
        }
        else
          System.out.println("there is no even numbers in array");          
          }
           System.out.println(arrayWithEvenNum);        
        }
        


//7 

public static void newArrayWithElementsMoreZ(){
int array [] = {1,4,-2,3,7,5,13};
int z = 5;
int count = 0;
for (int i = 0; i < array.length; i++) {
  if(array[i] > z){
    array[i] = z;
    count++;
  }
   System.out.println(count);   
}
   }


//8

public static void countOfElements(){
int array [] = {1,4,0,-3,0,-5,0};
int countPositive = 0;
int countNegative = 0;
int countZeros = 0;
for (int i = 0; i < array.length; i++) {
  if(array[i] > 0){
    countPositive++;
  }
  else if (array[i]<0){
    countNegative++;
  }
  else if (array[i] == 0){
    countZeros++; 
  } 
   System.out.println("Count of positive:" + countPositive);
   System.out.println("Count of negative:" + countNegative);
   System.out.println("Count of zeros:" + countNegative);
}
}

//9

public static void minMaxChangedPositions(){
int array [] = {1,4,-2,3,7,5,13};
int min = array[0];
int minPosition = 0;
int max = array[0]; 
int maxPosition = 0;
for (int i = 1; i < array.length; i++) {
  if(array[i] > max ){
    max = array[i];
    maxPosition = i;
  }
  if(array[i] < min ){
    min = array[i];
    minPosition = i;
  }
   }
array[maxPosition] = min;
array[minPosition] = max;
System.out.println(array);
}


//10
public static void onlyNumbersWith Condition(){
int array [] = {1,4,-2,3,7,5,13};
for (int i = 0; i < array.length; i++) {
  if(array[i] <= i  ){
System.out.println(array[i]);
  }
 }
}


//11

public static void elevenMethod(){
int array [] = {1,4,-2,3,7,5,13};
int m = 3;
int l = 7;
for (int i = 0; i < array.length; i++) {
  if(array[i]%m == l ){
    System.out.println(array[i]);
  }
  else
   System.out.println("no such elements");
  }
 }


//12
public static void changePosition(){
int array [] = {1,4,-2,3,7,5,13};
for (int i = 1; i < array.length; i=i+2) {
 array[i] = array[i-1];
 array[i-1] = array[i];
  }
 }


//13
public static void changePosition(){
int array [] = {1,4,-2,3,7,5,13};
int min = array[0];
int max = array[0]; 
for (int i = 1; i < array.length; i++) {
  if(array[i] > max ){
    max = array[i];
  }
  for (int i = 0; i < array.length; i++) {
     do{
   System.out.println(array[i]);  
     } while (array[i]!=0);
  
  }
   }
 }


//14.

public static void sumOfMinMax(){
int array [] = {1,4,-2,3,7,5,13,16,5};
int min = array[1];
int max = array[0];
  for (int i = 4; i < array.length; i=i+2) {
   if(array[i-2] > max ){
      max = array[i]; 
  }
   if(array[i-1] < min ){
      max = array[i]; 
   }
 }
  int sum = max +min;
 }

//15. 

public static void multipleArrElements(){
int array [] = {1,4,-2,3,7,5,13};
int m = 5;
int multiple = 1;
for (int i = 0; i < array.length; i++) {
  if(array[i]>m ){
    multiple = multiple*array[i];
  }
  else
   System.out.println("no elements more then defined m =" + m);
  }
}
 }


//16.

public static void maxMod(){
int array [] = {1,4,-2,3,7,5,13,16,5};
int max = array[0];
  for (int i = 1; i < array.length; i++) {
   if(array[i] > max ){
      max = array[i]; 
  }
  }
   
 for (int i = 0; i < array.length; i++) {  
   if(Math.abs(array[i]) > max ){
     array[i] = 0; 
   }
 }
 System.out.println(array);
 }
}


//17.

public static void modComparing(){
int array [] = {1,4,13,-3,9,-5,0};
int p1 = 1;
int p2 = 1;
for (int i = 0; i < array.length; i++) {
  if(array[i] > 0){
    p2 = p2 * Math.abs(array[i]);
  }
  else if (array[i] < 0){
    p1 = p1 * Math.abs(array[i]);
  }
}
  if(p1 > p2) {
 System.out.println("p1 more then p2");   
  } 
  else if (p2 > p1){
 System.out.println("p2 more then p1"); 
 }
  else{
System.out.println("No p2 nor p1 is more");     
  }
 }
}

//18. 

public static void maxSingleValue(){
int array [] = {1,4,-2,13,7,5,13,7,5};
int max = array[0];
  for (int i = 1; i < array.length; i++) {
    if (array[i - 1] > array[i + 1] && array[i - 1] > array[i]) {
          int max = array[i - 1];
      }
    max = 0;      
 }
}





