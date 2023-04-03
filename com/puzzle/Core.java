package com.puzzle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;
        
import com.puzzle.panel.Design;
import com.puzzle.component.Time;


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
        start();	
    }
    public static void start(){
        /**
        *   @since 2.0
        */
        
        initalTime = Time.setTime();
        Collections.shuffle(list);
        
        try{
            frame = new JFrame("Puzzle");
            frame.add(new Design(list.toArray()));
        } catch(Exception e){
            System.out.println("\n\n\n"+e+"\n\n\n");
            return;
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(403,473);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static ArrayList<String> iterator(ArrayList<String> list){
    	/**
        *	@since 2.0
        */
        for(int index = 0 ; index < 16; index++){
            list.add(Integer.toString(index));
        }
        return list;
    }

    public static void end(){
        /**
        *	@since 2.0
        */
        frame.setVisible(false);
        if(JOptionPane.showConfirmDialog(null, "Você venceu!! Deseja jogar novamente?", "Fim de jogo", JOptionPane.YES_NO_OPTION ) == 0){
            start();
            return;
        }
        JOptionPane.showMessageDialog(null, "Volte sempre!", "Fim de jogo", 1);
        System.exit(0);
        
    }

}
