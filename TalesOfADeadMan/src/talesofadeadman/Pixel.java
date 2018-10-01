/////////////////////////////////////////////////////////////////////////////
//
//  Name: Pixel
//  Author: Kevin
//  Description: This class contains all the data that will fill each cell in
//  a scene object and act as psudo-pixels.
//
//  Fields:     BufferedImage texture
//  Functions:  public Pixel(String pathName)
//              protected void paintComponent(Graphics g)
//  Parent:     JPanel
//  Children:   none
//
/////////////////////////////////////////////////////////////////////////////

package talesofadeadman;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public class Pixel extends JPanel{
    
    private BufferedImage texture;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Pixel
    //  class.
    //
    //  Inputs: A String containing the image to serve as the pixel's texture.
    //  
    //
    //  Outputs: A Pixel Object
    //////////////////////////////////////////////////////////////////////////////
    public Pixel(String pathName)
    {
        try
        {
            texture = ImageIO.read(new File(pathName));
        }
        catch(IOException e)
        {
            System.out.println("THERE IS NO SUCH IMAGE " + pathName);
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function overrides the default paint component function
    //  and allows the Pixel object to be painted.
    //
    //  Inputs: A Graphics object g.
    //
    //  Outputs: nothing
    //////////////////////////////////////////////////////////////////////////////
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(texture, 0, 0, this);
    }


}

