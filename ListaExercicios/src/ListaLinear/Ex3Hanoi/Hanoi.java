package ListaLinear.Ex3Hanoi;

import java.util.Scanner;

import ListaLinear.Ex1.Stack;

public class Hanoi {
    private Stack<Disk> tower1,tower2,tower3;
    private Disk disco1,disco2,disco3,disco4;
    private boolean hasWon;

    public Hanoi(){
        tower1=new Stack<>();
        tower2=new Stack<>();
        tower3=new Stack<>();
        disco1=new Disk(1);
        disco2=new Disk(2);
        disco3=new Disk(3);
        disco4=new Disk(4);
        hasWon=false;
    }

    public void start(){
        tower1.push(disco4);
        tower1.push(disco3);
        tower1.push(disco2);
        tower1.push(disco1); 
    }

    public boolean checkVictory(){
        //Fiz por count pq n tem como ter 4 discos na torre 3 sem ser na ordem correta
        return tower3.count()>=4;
    }

    public boolean compare(Disk disk1, Disk disk2){
        if(disk1.getValue()<disk2.getValue()){return true;}
        else{return false;}
    }

    public void move(Stack<Disk> towerOG, Stack<Disk> towerNew){
        if(towerNew.peek()==null){towerNew.push(towerOG.pop());printGame();}
        else if(compare(towerOG.peek(), towerNew.peek())){
            towerNew.push(towerOG.pop());
            printGame();
        }else{
            System.out.println("Nao pode por "+towerOG.peek()+" sobre o "+towerNew.peek());
        }

        if(checkVictory()){GameWin();}
    }

    public void GameWin(){
        hasWon=true;
        System.out.println("Todos os discos empilahdos, vitoria!");
        printGame();
    }

    public Stack<Disk> choiceConvert(int choice){
        switch(choice){
            case 1:
                return tower1;
            case 2:
                return tower2;
            case 3:
                return tower3;
            default:
                return null;
        }
    }


    void printGame(){
        System.out.println("Torre 1: ");
        System.out.println(" ");
        tower1.display();
        System.out.println(" ");
        System.out.println("Torre 2: ");
        System.out.println(" ");
        tower2.display();
        System.out.println(" ");
        System.out.println("Torre 3: ");
        System.out.println(" ");
        tower3.display();
        System.out.println(" ");
    }




    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Hanoi hanoi=new Hanoi();
        hanoi.start();

        while (!hanoi.hasWon) {
            System.out.println("Qual torre deseja escolher?");
            int choice1=input.nextInt();
            System.out.println("Para qual torre deseja mover?");
            int choice2=input.nextInt();
            hanoi.move(hanoi.choiceConvert(choice1), hanoi.choiceConvert(choice2));
        }
    }


}
