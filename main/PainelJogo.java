package main;

import java.awt.Color; //extensão para cor
import java.awt.Dimension; //extensão para dimensões

import javax.swing.JPanel;

public class PainelJogo extends JPanel implements Runnable{

    //CONFIGURAÇÕES DA TELA
    final int originalTileSize = 16; //titulo 16x16
    final int scale = 3; // Redimensionar o tamanho da tela e do que é mostrado 16x3 = 48

    final int tileSize = originalTileSize * scale; //vai dimensionar tudo multiplicado pelo scale
    final int maxScreenCol = 16; //largura da tela
    final int maxScreenRow = 12; //altura da tela
    final int screenWidth = tileSize * maxScreenCol; //760 pixels
    final int screeHeight = tileSize * maxScreenRow; //576 pixels

    Thread gameThread;

    public PainelJogo() {

        this.setPreferredSize(new Dimension(screenWidth, screeHeight)); //Defina o tamanho da jpanel
        this.setBackground(Color.GREEN); //cor de fundo da janela
        this.setDoubleBuffered(true);
    }

    public void starGameThread() {

        gameThread = new Thread(this);
        gameThread.start(); //Vai chamar metodo run
    }
        @Override
    public void run() {

        while(gameThread != null){
            System.out.println("teste apenas");

        }
    }
}