package com.puzzle.component;

import javax.swing.JButton;

import com.puzzle.Core;
/**
*	@author Ariel Santos
*	@author Italo Cerqueira
*	@author Pedro Santana
*	@version 1.1
*	@since 1.0
*	@see Design
*/

public class MoveOn {
    private final JButton pressedButton;
    private static int clicks = 0;
    public MoveOn(JButton pressedButton){
        this.pressedButton = pressedButton;
    }
    
    public void fetchEmptyButton(JButton firsthirdButton, JButton secButton){
        if(firsthirdButton.getText().isBlank()) this.moveTo(firsthirdButton);
        else if(secButton.getText().isBlank()) this.moveTo(secButton);
    }
    
    public void fetchEmptyButton(JButton firsthirdButton, JButton secButton, JButton thirdButton){
        if(firsthirdButton.getText().isBlank()) this.moveTo(firsthirdButton);
        else if(secButton.getText().isBlank()) this.moveTo(secButton);
        else if(thirdButton.getText().isBlank()) this.moveTo(thirdButton);
    }
    
    public void fetchEmptyButton(JButton firsthirdButton, JButton secButton, JButton thirdButton, JButton fourthButton){
        if(firsthirdButton.getText().isBlank()) this.moveTo(firsthirdButton);
        else if(secButton.getText().isBlank()) this.moveTo(secButton);
        else if(thirdButton.getText().isBlank()) this.moveTo(thirdButton);
        else if(fourthButton.getText().isBlank()) this.moveTo(fourthButton);
    }
    
    private void moveTo(JButton to){
        to.setText(pressedButton.getText());
        this.pressedButton.setText("");
        clicks++;
    }
    public static void fetchWin(JButton[] buttons, JButton exclude){
        for(JButton button : buttons){
            if(button.equals(exclude)) continue;
            else if(!button.getName().equals("B" + button.getText())) return;
        }

        Core.end();
    }
    public static int getClicks(){
        return clicks;
    }
}
