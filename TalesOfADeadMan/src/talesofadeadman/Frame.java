/////////////////////////////////////////////////////////////////////////////
//
//  Name: Frame
//  Author: Kevin Sutton
//  Description: This class handles all visual proccessing for the game.
//
//  Fields:
//  Functions:
//  Parent:     JFrame
//  Children:   none
//
/////////////////////////////////////////////////////////////////////////////

package talesofadeadman;

import javax.swing.JFrame;

/**
 *
 * @author Kevin
 */
public class Frame extends JFrame{
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Frame
    //  class.
    //
    //  Inputs: nothing
    //
    //  Outputs: A Window on screen.
    //////////////////////////////////////////////////////////////////////////////
    public Frame()
    {
        super();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 800);
    }

}
