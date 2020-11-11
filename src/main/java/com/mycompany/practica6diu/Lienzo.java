package com.mycompany.practica6diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 * @author Grupo06
 */
public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public Lienzo() {
        this.setPreferredSize(new Dimension(1024, 768));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }
    
    public void setImagen(BufferedImage imagen){
        this.imagen = imagen;
        setPreferredSize(new Dimension(imagen.getHeight(), imagen.getWidth()));
        repaint();
    }
}
