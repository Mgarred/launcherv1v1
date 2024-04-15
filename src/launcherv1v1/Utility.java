/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package launcherv1v1;

import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 aqui creamos las utilidades
 */
public class Utility {
    

    public static void resizeImage(JLabel label, int width, int height) {
        ImageIcon icon = (ImageIcon) label.getIcon();
        if (icon != null) {
            Image img = icon.getImage();
            Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(resizedImage));
        }
    }
    
    public static void resetImageSize(JLabel label) {
        ImageIcon icon = (ImageIcon) label.getIcon();
        if (icon != null) {
            Image img = icon.getImage();            
            Image resizedImage = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(resizedImage));
        }
    }
   
}
