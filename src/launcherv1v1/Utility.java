/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package launcherv1v1;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Utility {
    // Almacenar las imágenes originales para cada JLabel
    private static final Map<JLabel, ImageIcon> originalIcons = new HashMap<>();

    // Método para aumentar el tamaño de la imagen
    public static void zoomImage(JLabel label, double scale) {
        ImageIcon icon = (ImageIcon) label.getIcon();
        if (icon != null) {
            // Guardar el icono original si aún no está guardado
            originalIcons.putIfAbsent(label, icon);

            int newWidth = (int) (icon.getIconWidth() * scale);
            int newHeight = (int) (icon.getIconHeight() * scale);
            Image img = icon.getImage();
            Image resizedImage = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(resizedImage));
        }
    }
    
    // Método para restablecer el tamaño original de la imagen
    public static void resetImageSize(JLabel label) {
        ImageIcon originalIcon = originalIcons.get(label);
        if (originalIcon != null) {
            label.setIcon(originalIcon);
        }
    }
}

