package com.puzzle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;
        
import com.puzzle.panel.Design;
//import com.puzzle.component.Time;


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
    private static ArrayList<String> list;
    private static int[] initalTime;
    
    public static void main(String[] args){
        list = iterator(new ArrayList<String>());
        new Core();	
    }
    public Core(){
        /**
        *   @since 2.0
        */
        
        //initalTime = Time.setTime();
        Collections.shuffle(list); // Embaralha lista
        
        try{
            frame = new JFrame("Puzzle"); // Inicia frame com título Puzzle
            frame.add(new Design(list.toArray())); // Adiciona painel com botôes e labels ao frame
        } catch(Exception e){
            System.out.println("\n\n\n"+e+"\n\n\n"); // Exibe qualquer exceção lançadas no instaciamento
            return;
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(403,473); // Define dimensões do frame (width, height)
        frame.setLocationRelativeTo(null); // Centraliza frame na tela
        frame.setVisible(true); // Torna frame visível
    }
    
    public static ArrayList<String> iterator(ArrayList<String> iterable){
    	/**
        *	@since 2.0
        *   @param ArrayList<String> vazio
        *   @return ArrayList<String> com 16 posições preenchidas com inteiros de 0 a 15 não repetidos
        */

        for(int index = 0 ; index < 16; index++){
            iterable.add(Integer.toString(index)); // Adiciona String ao fim da lista
        }

        return iterable;
    }

    public static void end(){
        /**
        *	@since 2.0
        */
        frame.setVisible(false); // desabilita frame

        // Informa vitória e inquere recomeço do jogo
        if(JOptionPane.showConfirmDialog(null, "Você venceu!! Deseja jogar novamente?", "Fim de jogo", JOptionPane.YES_NO_OPTION ) == 0){
            new Core(); // reinicia jogo
            return;
        }
        JOptionPane.showMessageDialog(null, "Volte sempre!", "Fim de jogo", 1); // informa fim de execução
        System.exit(0); // finaliza execução de código com código 0
    }

}
