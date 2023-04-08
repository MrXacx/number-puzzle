package com.puzzle.panel;

// ARRAY'S CLASS
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

// LOCAL'S CLASSES
import com.puzzle.component.MoveOn;
import com.puzzle.component.Time;

/**
*	@author Ariel Santos
*	@author Italo Cerqueira
*	@author Pedro Santana
*	@version 3.0
*	@since 1.0
*/

public class Design extends JPanel {
    private JButton[] button;
    private JLabel clickCounter, timeCounter;
    
    public Design(Object[] order) {
      /**
      * @since 1.0
      */
      
      initComponents(order);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(Object[] order) {
      /**
      * @since 1.0
      */
	  
	  // Inicia configuração da label de contagem de cliques
      clickCounter = new JLabel();
      clickCounter.setText("Cliques: 0");
      clickCounter.setName("clicks");
      add(clickCounter);
	  // Finaliza configuração da label de contagem de cliques
	  
	  // Inicia configuração da label de contagem de tempo
	  timeCounter = new JLabel();
      timeCounter.setName("timer");
      add(timeCounter);
      // Finaliza configuração da label de contagem de tempo
      
      // inicia configuração dos botões
      button = new JButton[16];
	  for(int index = 0; index < 16; index++){
          button[index] = new JButton();
          button[index].setText(order[index].toString().equals("0") ? " " : order[index].toString());
          button[index].setName("B"+(index+1));
	  }
	  setButtonListeners();
  	  // Finaliza configuração dos botões
  	  
  	  // Inicia configuração do layout
      setBorder(BorderFactory.createEtchedBorder());
	  GroupLayout layout = new GroupLayout(this);
      setLayout(layout);
      setHorizontalAlign(layout);
      setVerticalAlign(layout);
      // Finaliza configuração do layout

	  // Inicia timer
      Time time = new Time();
      time.start(timeCounter);
    }

    private void setButtonListeners(){
      /**
      * @since 3.0
      */
      button[0].addActionListener(new ActionListener() { // Adiciona listenner
        public void actionPerformed(ActionEvent evt){
          MoveOn move = new MoveOn(button[0]);
          move.fetchEmptyButton(button[1], button[4]); // Tenta realizar jogada
          clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks())); // Atualiza número de jogadas
        }
	  });

      button[1].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[1]);
            move.fetchEmptyButton(button[0], button[2], button[5]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
          
      });

      button[2].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[2]);
            move.fetchEmptyButton(button[1], button[3], button[6]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });
      
      button[3].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[3]);
            move.fetchEmptyButton(button[2], button[7]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[4].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[4]);
            move.fetchEmptyButton(button[0], button[5], button[8]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[5].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[5]);
            move.fetchEmptyButton(button[4], button[1], button[6], button[9]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[6].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[6]);
            move.fetchEmptyButton(button[5], button[7], button[2], button[10]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });
      
      button[7].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[7]);
            move.fetchEmptyButton(button[6], button[3], button[11]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[8].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[8]);
            move.fetchEmptyButton(button[9], button[4], button[12]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[9].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[9]);
            move.fetchEmptyButton(button[8], button[5], button[10], button[13]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[10].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[10]);
            move.fetchEmptyButton(button[9],button[11],button[6], button[14]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });
      
      button[11].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[11]);
            move.fetchEmptyButton(button[10],button[7], button[15]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[12].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[12]);
            move.fetchEmptyButton(button[13],button[8]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[13].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[13]);
            move.fetchEmptyButton(button[12],button[14],button[9]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });

      button[14].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[14]);
            move.fetchEmptyButton(button[13],button[15], button[10]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
          }
      });
      
      button[15].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            MoveOn move = new MoveOn(button[15]);
            move.fetchEmptyButton(button[14],button[11]);
            clickCounter.setText("Cliques: " +Integer.toString(MoveOn.getClicks()));
            
            if(button[15].getText().isBlank()){
              MoveOn.fetchWin(button, button[15]); // Checa se todos os botões estão posicionados corretamente
            }
          }
      });
    }
    
    private void setHorizontalAlign(GroupLayout layout){
      /**
      * @since 3.0
      */
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
            .addGroup(layout.createSequentialGroup()
              .addComponent(clickCounter, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
              .addGap(170, 236, 236)
              .addComponent(timeCounter, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
          )
      ));
    }
    
    private void setVerticalAlign(GroupLayout layout){
      /**
      * @since 3.0
      */
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
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(clickCounter, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
            .addComponent(timeCounter, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        )
      );
    }
  }
