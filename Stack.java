/*Experiment 1
Implimentation of stack using java */
import java.lang.System;
import java.util.Scanner;

class Stack
{ int max=50;
  int stackArray[] =new int[max];
  int top=-1;

  Scanner in =new Scanner(System.in);//To create a Scanner Object

  void push(Stack S)
  {if(this.top==this.max)
    {
      System.out.print("Object Cannot be pushed Stack is Full");

    }

    else{
      int num;
      this.top++;
      System.out.print("Please Enter the Number to be Pushed:");
      num=in.nextInt();
      this.stackArray[this.top]=num;
      }
    }//End of Push

    void pop(Stack S)
    {
      if(top==-1)
      {
        System.out.print("Object Cannot be popped Stack is Empty");
      }
      else{
        int pr=this.stackArray[this.top];
        System.out.println("The Popped Number is:" + pr );
        this.top--;
      }
    }//End of pop


    void Display(Stack S)
    {int i;
      System.out.println("The Current stack items are as follow:");
      int pr;
      for(i=0;i<=S.top;i++)
      {
        if(i==S.top)
        {
          pr=S.stackArray[i];
          System.out.print(pr);
        }
          else
        {
            pr=S.stackArray[i];
            System.out.print(pr +" --> ");
        }
      }
      }//End of Display


      public static void main(String args[]) {
        int choice;
        Stack S =new Stack();
        Scanner in =new Scanner(System.in);

        do{
          System.out.println("------------------MENU------------------");
          System.out.println("1.Push");
          System.out.println("2.Pop");
          System.out.println("3.Display");
          System.out.println("4.Exit");
          System.out.print("Please Enter your choice:");
          choice =in.nextInt();
          switch(choice)
          {
            case 1:{S.push(S);}
            break;
            case 2:{S.pop(S);}
            break;
            case 3:{S.Display(S);
                    System.out.println(" ");    }
            break;
            default:{
              if(choice == 4 )
              ;
              else
              {
                System.out.println("Wrong INPUT provided");
              }
            }


          }//End of Switch block
        }while(choice!=4); //End of Do While Loop
      }//End of  main function

    }//End of class stack
