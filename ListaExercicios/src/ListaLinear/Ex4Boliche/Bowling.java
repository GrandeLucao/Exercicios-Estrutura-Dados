package ListaLinear.Ex4Boliche;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Bowling {
    private Queue<String> players;
    private Queue<Integer> balls;

    public Bowling() {
        players = new LinkedList<>();
        balls = new LinkedList<>();
    }

    public void startGame() {

        players.add("Playa 1");
        players.add("Playa 2");
        players.add("Playa 3");

        for(int i = 0; i < 5; i++){
            balls.add(new Random().nextInt(3)+1);
        }
        
        for (int round=1;round<=3;round++){
            System.out.println("Rodada " + round);
            int playNum=0;

            while(playNum<3){
                String currentPlayer=players.poll();

                for (int roll=1;roll<=2;roll++) {
                    int pinsDown=rollBall();
                    System.out.println(currentPlayer+" fez o lance "+roll+" e derrubou "+pinsDown +" pinos.");
                    balls.add(new Random().nextInt(3)+1);                    
                }
                players.add(currentPlayer);
                playNum++;

            }
            System.out.println("Reposicionando os pinos.\n");
        }
        System.out.println("Game Over");
    }

    private int rollBall() {
        int ballNumber=balls.poll();
        double randomValue=Math.random();

        if(randomValue<0.2*ballNumber) {
            return 0;
        }else{
            int pinsDown=new Random().nextInt(11);
            return pinsDown;
        }
    }

    public static void main(String[] args) {
        Bowling BGame = new Bowling();
        BGame.startGame();
    }
}
  
