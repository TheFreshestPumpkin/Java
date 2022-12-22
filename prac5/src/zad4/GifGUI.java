package zad4;

import javax.swing.*;

public class GifGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ваша анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JPanel image_panel = new JPanel();
        JLabel img = new JLabel( new ImageIcon("C:\\gif_1.gif"));
        image_panel.add(img);
        frame.getContentPane().add(image_panel);
        frame.pack();
        frame.setVisible(true);

    }
}

