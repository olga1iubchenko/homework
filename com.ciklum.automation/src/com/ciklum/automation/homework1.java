package com.ciklum.automation;

public class homework1 {
	
//1 Min of two numbers
	
	  static int a = -2;
	  static int b = 5;
	  static int min = a;
	private static int sumMinMax;    
  public static void minValue() {
      if (a > b) {
      int  min = b; 
      }
      else 
        min = a;
    System.out.println(min);
  }

//2 Sum of of numbers divided by two without  residue
  
public static void sumDividedByK(){
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

//3 Create new array with zero element from other array

public static void arrayWithZeros() {
int array [] = {1,4,0,3,0,5,0,0,0};
int count=0;
for(int i=0 ; i <=array.length-1; i++){
    if(array[i]==0)
      count++;
}
if (count > 0){
   int array2[] = new int [count]; 
   int position=0;

   for (int i = 0; i < array.length; i++) {
     if(array[i]==0){
         array2[position] = i;
        position++;
  }
   }
   for (int i=0;i<array2.length;i++)
   {
       if (i==array2.length-1)
   System.out.println(array2);
 }   
}
}

//4 What the first number we met: positive or negative?

public static void isPositiveOrNegative(){
int array [] = {1,4,0,-3,0,-5,0};
for (int i = 0; i < array.length; i++) {
  if(array[i] > 0){
    System.out.println("the positive first");
    break;
  }
  else if (array[i]<0){
      System.out.println("the nevative first");
      break;
  }
  } 
}

//5 Is the array ordered by ASC rule?

public static void isArrayOrdered(){
int array [] = {1,4,2,-3,0,-5,11};
for (int i = 0; i < array.length; i++) {
  if(array[i] > array[i+1]){
    System.out.println("array isn't ordered by asc rule");
    break;
  }
  else 
	  System.out.println("array is ordered by asc rule");
	break;  
 } 
}

//6 Is array contain even numbers? If no - print the message

public static void newArrayWithEvenNumbers(){
    int array [] = {1,4,-2,3,7,5,13};
    int num = 0;
    for (int i = 0; i < array.length; i++) {
      if(array[i]%2 == 0){
        num++;  
      }
       }
      int arrayWithEvenNum[] = new int[num];
      int j = 0;
       for (int i = 0; i < array.length-1; i++) {
        if(array[i]%2 == 0){
          arrayWithEvenNum [j] = array[i];
          j++;
        }
        else
          System.out.println("there is no even numbers in array"); 
          break;
          }
           System.out.println(arrayWithEvenNum);        
        }    


//7 If array element more then z replace it with z. Count the number of replacements

public static void newArrayWithElementsMoreZ(){
int arr [] = {1,4,-2,3,7,5,13};
int z = 5;
int count = 0;
for (int i = 0; i < arr.length; i++) {
  if(arr[i] > z){
    arr[i] = z;
    count++;
  }
}
System.out.println(arr); 
System.out.println(count);
   }  

//8 Count positive, negative array elements and count of zeros

public static void countOfElements(){
int array [] = {0,1,4,0,-3,0,-5,-1};
int countPositive = 0;
int countNegative = 0;
int countZeros = 0;
for (int i = 0; i < array.length; i++) {
  if(array[i] > 0){
    countPositive++;
  }
  else if (array[i] < 0){
    countNegative++;
  }
  else if (array[i] == 0){
    countZeros++; 
  } 
}
System.out.println("Count of positive:" + countPositive);
System.out.println("Count of negative:" + countNegative);
System.out.println("Count of zeros:" + countNegative);
}

//9 Switch Min and Max array elements

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

//10 Print only numbers with condition arr[i] ≤ i == true

public static void onlyNumbersWithCondition(){
int array [] = {1,4,-2,3,7,5,13};
for (int i = 0; i < array.length; i++) {
  if(array[i] <= i  ){
System.out.println(array[i]);
  }
 }
}

//11 Print numbers where residue on M equal L

public static void elevenMethod(){
int array [] = {1,4,-2,3,8,5,10};
int m = 3;
int l = 1;
for (int element : array) {
  if(element % m == l ){
    System.out.println(element);
  }
  else
   System.out.println("no such elements");
  break;
  }
 }  

//12 Switch neighboring elements (а[0] и а[1], а[2] и а[3], …) 

public static void changePosition(){
int array [] = {1,4,-2,3,7,5,13};
for (int i = 1; i < array.length; i=i+2) {
 array[i] = array[i-1];
 array[i-1] = array[i];
  }
System.out.println(array);
 }


//13 Print numbers till the zero (including zero)

public static void numbersWithZero(){
int array [] = {1,4,-2,3,7,0,13};
int i = 0;
     do{
   System.out.println(array[i]);
   i++;
     } while (array[i]!=0&& i <array.length);
 }


//14. Find mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).

public static void sumOfMinMax(){
int array [] = {1,4,-2,3,7,5,13,16,5};
int min = array[1];
int max = array[0];
  for (int i = 4; i < array.length; i=i+2) {
   if(array[i-2] > max ){
      max = array[i]; 
  }
   else if(array[i-1] < min ){
      min = array[i]; 
   }
 }
 sumMinMax = (max + min);
 System.out.println(sumMinMax);
 }

//15. Find the multiplication of array elements more then M

public static void multipleArrElements(){
int array [] = {1,4,2,3,7,5,13};
int m = 5;
int multiple = 1;
int count = 0;
for (int i = 0; i < array.length; i++) {
  if(array[i] > m ){
    multiple = multiple * array[i];
  }
  else 
    count++;
  }
if(count==array.length){
System.out.println("no elements more then defined m = " + m);
}
System.out.println(multiple);
 }


//16. Replace with zeros the numbers with condition (|a[i]| &gt; max{ a[0], a[1], ..., a[n]})

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

//17. Multiplication of positive P1 and negative P2 numbers. Find max from Mod(P1) and Mod(P2)

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

//18. Array has equal elements. Find the first max number and replace it with zero

public static void maxSingleValue(){
int array [] = {1,4,-2,13,7,5,13,7,5};
int max = array[0];
  for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
          max = array[i];
      }   
 }
  for (int i = 1; i < array.length; i++) {
	    if (array[i] == max) {
	          array[i] = 0;
	          break;
	      }   
	 }
  System.out.println(array);
}



//19. Create new array from other one which elements end with k

public static void arrayEndingWithK() {
int array [] = {1,4,45,3,-15,5,6,7,25};
int k = 5;
int count = 0;
for(int i=0 ; i <=array.length-1; i++){
    if(array[i]%10 == k)
      count++;
}
if (count > 0){
   int array2[] = new int [count]; 
   int position=0;

   for (int i = 0; i < array.length; i++) {
     if(array[i]%10 == k){
         array2[position] = i;
        position++;
  }
   }
   for (int i=0;i<array2.length;i++)
   {
       if (i==array2.length-1)
   System.out.println(array2);
 }   
}
}

//20. Print the substraction of sum each second element which residue = 0 and other elements

public static void calcSubstrSumEchSecEl(){
int array [] = {1,4,45,3,9,5,200,-7,0,25};
int sumOfSecondEl = array[1];
int sumOfOtherEl= array[0];
int subsctract = 0;
for(int i=2 ; i <=array.length-2; i++){
    if(i%2 != 0 && array[i]%10 == 0){
    	sumOfSecondEl = sumOfSecondEl + array[i];
    }
    else {
    	sumOfOtherEl = sumOfOtherEl + array[i];
    }
}
   subsctract = sumOfSecondEl - sumOfOtherEl;
   
   System.out.println(subsctract);
 }   

public static void main(String[] args) {

	  //1 
	  //minValue();
	  //2
	  //sumDividedByK();
	  //3
	  //arrayWithZeros();
	  //4
	  //isPositiveOrNegative();
	  //5
	  //isArrayOrdered();
	  //6
	  //newArrayWithEvenNumbers();
	  //7
	  //newArrayWithElementsMoreZ();
	  //8
	  //countOfElements();
	  //9
	  //minMaxChangedPositions();
	  //10
	  //onlyNumbersWithCondition();
	  //11
	  //elevenMethod();
	  //12
	  //changePosition();
	  //13
	  //numbersWithZero();
	  //14
	  //sumOfMinMax();
	  //15
	  //multipleArrElements();
	  //16
	  //maxMod();
	  //17
	  //modComparing();
	  //18
	  //maxSingleValue();
	  //19
	  //arrayEndingWithK();
	  //20
	  //calcSubstrSumEchSecEl();
	  }
}





