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

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Kevin
 */
public class Frame extends JFrame{
    
    Pixel test;
    
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
        
        test = new Pixel("blackPixel.jpg");
        
        this.setLayout(new GridLayout(50,50));
        this.add(test);
        test.setVisible(true);
    }

}
