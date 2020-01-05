/*Experiment 2

Queue using java
*/

import java.lang.System;
import java.util.Scanner;


class Queue
{

  int max=50;
    int stackArray[] =new int[max];
    int front=-1;
    int rear=-1;
    Scanner in =new Scanner(System.in);//To create a Scanner Object

void Insert(Queue Q)
{
  if (this.rear == (max-1))
  {
    System.out.print("Object Cannot be Inserted QUEUE is Full");
  }
  else if(this.rear==-1 && this.front==-1) {

    int num;
      this.rear++;
      this.front++;
      System.out.print("Please Enter the Number to be Inserted:");
      num=in.nextInt();
      this.stackArray[this.rear]=num;

  }
  else
  { int num;
    this.rear++;
    System.out.print("Please Enter the Number to be Inserted:");
    num=in.nextInt();
    this.stackArray[this.rear]=num;
  }
} //End of Insert function

void Delete(Queue Q)
{
  if(this.front==-1 && this.rear==-1)
  {
      System.out.print("Object Cannot be Deleted Queue is Empty");
  }
  else
  {
    int pr=this.stackArray[this.front];
    System.out.println("The Deleted Number is:" + pr );
    this.front++;

  }
}//End of Delete function

void Display(Queue Q)
{
    int i;
    System.out.println("The Current Queue items are as follow:");
    int pr;
    for(i=Q.front;i<=Q.rear;i++)
    {
      if(i==Q.rear)
      {
        pr=Q.stackArray[i];
        System.out.print(pr);
      }
        else
      {
          pr=Q.stackArray[i];
          System.out.print(pr +" <-- ");
      }
    }
}//END of Display function

  public static void main(String args[]) {
    int choice;
    Queue Q =new Queue();
    Scanner in =new Scanner(System.in);

    do{
      System.out.println("------------------QUEUE MENU------------------");
      System.out.println("1.INSERT");
      System.out.println("2.DELETE");
      System.out.println("3.DISPLAY");
      System.out.println("4.EXIT");
      System.out.print("Please Enter your choice:");
      choice =in.nextInt();
      switch(choice)
      {
        case 1:{Q.Insert(Q);}
        break;
        case 2:{Q.Delete(Q);}
        break;
        case 3:{Q.Display(Q);
                System.out.println(" ");    }
        break;
        default:{
          if(choice == 4 )
          ;
          else
          {
            System.out.println("Wrong INPUT Provided");
          }
        }


      }//End of Switch block
    }while(choice!=4); //End of Do While Loop
  }//End of  main function
}
