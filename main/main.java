package main;

import javax.swing.JFrame;

public class main{
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Isso ira fechar a janela
        window.setResizable(false); //Impedir que seja possivel redimensionar a janela
        window.setTitle("Amakoto"); //Titulo da janela

        PainelJogo gamePanel = new PainelJogo();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null); //não especifica onde ficara a janela
        window.setVisible(true); //Visibilidade da janela

    }
}