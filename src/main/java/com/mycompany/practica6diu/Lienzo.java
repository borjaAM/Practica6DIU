package com.mycompany.practica6diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author Grupo06
 */
public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public Lienzo() {
        
        //this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }
    
    public void setImagen(File file) throws IOException{
        imagen = ImageIO.read(file);
    }
}
