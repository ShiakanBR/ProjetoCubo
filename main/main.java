package main;

public class Main{
    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Isso ira fechar a janela
        window.setResizable(false); //Impedir que seja possivel redimensionar a janela
        window.setTittle("Amakoto"); //Titulo da janela

        window.setLocationRelativeTo(null); //não especifica onde ficara a janela
        window.setVisible(true); //Visibilidade da janela

    }
}