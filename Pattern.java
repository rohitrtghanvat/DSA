
// 1. solid rectangle
// *****
// *****
// *****
// *****
// import java.util.Scanner;

// public class Pattern {
// public static void main(String arg[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter how many rows you want :-");
// int n = sc.nextInt(); // n = rows

// System.out.println("Enter how many column you want :-");
// int m = sc.nextInt();// m = column

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// ----------------------------------------------------------

// 2. Hollow Recrangle
// *****
// * *
// * *
// *****
// import java.util.*;
// public class Pattern{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter how many row you want :-");
// int n= sc.nextInt();

// System.out.print("Enter how many column yoi want :-");
// int m= sc.nextInt();

// for(int i=1 ; i<=n ; i++){
// for(int j=1 ; j<=m ; j++){
// if(i==1||i==n||j==1||j==m )
// {
// System.out.print("*");
// }else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// ----------------------------------------------------------

// 3. Half Pyramid
// *
// **
// ***
// ****
// *****
// import java.util.Scanner;

// public class Pattern {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter value to print Half Pyramid format :-");
// int n = sc.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// ----------------------------------------------------------
// 4. Inverse/Inverted Half Pyramid
// Enter value to print Inverse/Inverted Half Pyramid format :-5
// *****
// ****
// ***
// **
// *
// import java.util.Scanner;

// public class Pattern {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter value to print Inverse/Inverted Half Pyramid format
// :-");
// int n = sc.nextInt();

// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }

// }

// ----------------------------------------------------------
// Inverted Half Pyramid (rotate by 180 degree)
// *
// **
// ***
// ****
// *****
// ******

// import java.util.Scanner;

// public class Pattern {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter value to print Inverted Half Pyramid (rotate by 180
// degree) :- ");
// int n = sc.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }