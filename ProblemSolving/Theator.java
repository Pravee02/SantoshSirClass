package ProblemSolving;
public class Theator
{
    public static void main(String[] args)
    {
        int totalpeople = 199;
        int seats = 12;
        System.err.println("total people in theators "+ totalpeople);
        System.err.println("total seats in a row "+seats);

        int Completerows = totalpeople/seats;
         System.err.println("total complete rows filled 12 seats row "+Completerows);

         int PeopleInLastRow = totalpeople%seats;
         System.err.println("peoples are  filled in last row "+ PeopleInLastRow); 
    }
}
