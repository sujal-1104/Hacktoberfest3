//Strings
// used to represent sequence of characters in js. 
//It is immutable data structure.
//lets start 
var firstString=new String('Hello');
//Avoid to use new keyword for creating objects because it slows down the execution of programme and also makes the code more complicated.
//Second disadvantage of new keyword is that It produces unexpected results or output.
let secondString="Jay Ho";
console.log(firstString);
console.log(secondString);
//String Methods
//1. legth:- It used for get the length of string.
let someString="Wow, This is amazing";
console.log(someString.length);
//2.trim():- It used for removing spaces from front as well as back.It will return a new string because strings are immutable so changes will not reflect into main string.
let  exampleString="   Hello  ";
console.log(exampleString.length);
console.log(exampleString);
let resultedString=exampleString.trim();
console.log(resultedString.length);
console.log(resultedString);
//3. toUpperCase():- It will return a new string with all characters in uppercase.
let secondExampleString="om namh shivay";
console.log(secondExampleString.toUpperCase());
//4. toLowerCase():- It will return a new string with all characters in lowercase.
let thirdExampleString="JAY HO";
console.log(thirdExampleString.toLowerCase());
let fourthExample="Slicing Of String";
console.log(fourthExample.slice(0,5));
console.log(fourthExample.slice(-5,-1));
console.log(fourthExample.slice(-17));
console.log(fourthExample.slice(-1,-17));
console.log(fourthExample.slice(3,8));
//Converting from String to Number there is a trick which I generally use in js.

var number="34";
console.log(typeof number);
var number=+number;
console.log(typeof number);

//Converting from number to string .

var str=34;
console.log(typeof str);
var str=34+"";
console.log(typeof str);

//Another way to change from number to string
var numb=34;
console.log(typeof numb);
numb=String(numb);
console.log(typeof numb);

//Another way to change from string to number
var number1="34";
console.log(typeof number1);
number1=Number(number1);
console.log(typeof number1);
//5.Concatination:- Here, we can use + operator for concatinating two strings.
let str1="Hello";
let str2="Javascript";
console.log(str1+str2);

//Note:- when we create a variable and will not assign any value to them then the data type of that variable  will be undefine.

//Template Strings:- It is a type of string formating where we use curly braces with dollar sign to print something in a specific formate.
let pahla=10;
let dusra=20;
console.log(`${pahla} aur ${dusra} milakar ${pahla+dusra} hote hai!!`);

