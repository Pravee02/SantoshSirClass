package ProblemSolving;

public class StackOverFlow
{
 static void a()
 {
    b();
 }

 static void b()
 {
    c();
 }

 static void c()
 {
    a();
 }

 public static void main(String[] args) 
 {
  
    c();
 }
    
}
