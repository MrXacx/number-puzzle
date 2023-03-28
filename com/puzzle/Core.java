package com.puzzle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

import com.puzzle.panel.Design;


/**
*	@author Ariel Santos
*	@author Italo Cerqueira
*	@author Pedro Santana
*	@version 3.0
*	@since 1.0
*	@see Design
*/

public class Core {
    private static JFrame frame;
    public static void main(String[] args){
        start();	
    }
    
    public static void start(){

        try{
            frame = new JFrame("Puzzle");
            frame.add(new Design(15, Core.shuffle(15)));
        } catch(Exception e){
            System.out.println("\n\n\n"+e+"\n\n\n");
            return;
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(403,433);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static String[] shuffle(Integer length) {
        /**
        *	@since 2.0
        *	@param length --> quantidade de números sorteados
        *	@return lista de inteiros em ordem aleatória
        */
        String[] list = new String[length];
        Random r = new Random();
        String number;
        for (int index = 0; index < length; index++) {
                do{
                        number = Integer.toString(r.nextInt(length)+1);      	
                } while (Arrays.asList(list).contains(number));
                list[index] = number;
        }
        return list;
    }
    public static void end(){
        /**
        *	@since 3.0
        */
        frame.setVisible(false);
        if(JOptionPane.showConfirmDialog(null, "Você venceu!! Deseja jogar novamente?", "Fim de jogo", JOptionPane.YES_NO_OPTION) == 0)
            start();
        else
            JOptionPane.showMesssageDialog(null, "Volte sempre!", "Fim de jogo", 1);
    }

}
