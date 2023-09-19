package main;

import java.awt.Color; //extensão para cor
import java.awt.Dimension; //extensão para dimensões

import javax.swing.JPanel;

public class PainelJogo extends JPanel {
    //CONFIGURAÇÕES DA TELA
    final int originalTileSize = 16; //titulo 16x16
    final int scale = 3; // Redimensionar o tamanho da tela e do que é mostrado 16x3 = 48

    final int tileSize = originalTileSize * scale; //vai dimensionar tudo multiplicado pelo scale
    final int maxScreenCol = 16; //largura da tela
    final int maxScreenRow = 12; //altura da tela
    final int screenWidth = tileSize * maxScreenCol; //760 pixels
    final int screeHeight = tileSize * maxScreenRow; //576 pixels

    public PainelJogo() {

        this.setPreferredSize(new Dimension(screenWidth, screeHeight)); //Defina o tamanho da jpanel
        this.setBackground(Color.GREEN); //cor de fundo da janela
        this.setDoubleBuffered(true);
    }
}