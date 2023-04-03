package com.puzzle.panel;

import java.util.ArrayList;

// GUI'S CLASSES
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.BorderFactory;

// EVENT'S CLASSES
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.puzzle.component.MoveOn;
import com.puzzle.Core;

/**
*	@author Ariel Santos
*	@author Italo Cerqueira
*	@author Pedro Santana
*	@version 3.0
*	@since 1.0
*/

public class Design extends JPanel {
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton[] button;
    private JLabel countClicks = new JLabel();
    // End of variables declaration//GEN-END:variables
    
    public Design(Object[] order) {
        initComponents(order);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(Object[] order) {
    	button = new JButton[16];
    	for(int index = 0; index < 16; index++){
            button[index] = new JButton();
            button[index].setText(order[index].toString().equals("0") ? " " : order[index].toString());
            button[index].setName("B"+(index+1));
    	}
        setBorder(BorderFactory.createEtchedBorder());

        button[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
              MoveOn move = new MoveOn(button[0]);
              move.fetchEmptyButton(button[1], button[4]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });

        button[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[1]);
              move.fetchEmptyButton(button[0], button[2], button[5]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
            
        });

        button[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[2]);
              move.fetchEmptyButton(button[1], button[3], button[6]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
        
        button[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[3]);
              move.fetchEmptyButton(button[2], button[7]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });

        button[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[4]);
              move.fetchEmptyButton(button[0], button[5], button[8]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
		
        button[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[5]);
              move.fetchEmptyButton(button[4], button[1], button[6], button[9]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
		
        button[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[6]);
              move.fetchEmptyButton(button[5], button[7], button[2], button[10]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
        
        button[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[7]);
              move.fetchEmptyButton(button[6], button[3], button[11]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });

        button[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[8]);
              move.fetchEmptyButton(button[9], button[4], button[12]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
		
        button[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[9]);
              move.fetchEmptyButton(button[8], button[5], button[10], button[13]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });

        button[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[10]);
              move.fetchEmptyButton(button[9],button[11],button[6], button[14]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
        
        button[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[11]);
              move.fetchEmptyButton(button[10],button[7], button[15]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });

        button[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[12]);
              move.fetchEmptyButton(button[13],button[8]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });

        button[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[13]);
              move.fetchEmptyButton(button[12],button[14],button[9]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
		
        button[14].addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[14]);
              move.fetchEmptyButton(button[13],button[15], button[10]);
              countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            }
        });
        
       	button[15].addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
              MoveOn move = new MoveOn(button[15]);
              move.fetchEmptyButton(button[14],button[11]);
              Core.countTime(Core.setTime());
              if(button[15].getText().isBlank()){
                MoveOn.fetchWin(button, button[15]);
                countClicks.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
              }
            }
        });
        countClicks.setText("Cliques: 0");
        countClicks.setName("clicks");
        add(countClicks);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        //setLayout(new javax.swing.BoxLayout(this, java.awt.BorderLayout.PAGE_END));
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button[0], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button[1], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button[2], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button[3], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button[4], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button[5], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE) 
                        .addComponent(button[6], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE) 
                        .addComponent(button[7], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button[8], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)    
                        .addComponent(button[9], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)   
                        .addComponent(button[10], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button[11], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button[12], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)  
                        .addComponent(button[13], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)                    
                        .addComponent(button[14], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)            
                        .addComponent(button[15], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addComponent(countClicks, GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
            ));

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(button[0], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[3], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[1], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[2], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(button[4], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[7], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[5], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[6], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(button[8], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[11], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[9], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[10], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(button[12], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[15], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[13], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button[14], GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(countClicks))
            )
        );
    }// </editor-fold>//GEN-END:initComponents
}
