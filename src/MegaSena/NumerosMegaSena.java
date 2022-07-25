package MegaSena;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosMegaSena {
    public static void main(String[] args) {
        List<Integer> numeros =  new ArrayList<>();

        for(int i =1; i <=60; i++) {
            numeros.add(i);
        }
        int contador = 0;
        String flag = "";
        do {
            contador++;
            Collections.shuffle(numeros);
            List<Integer> escolhidos = numeros.subList(0, 6);

            Collections.sort(escolhidos);

            for (Integer escolhido : escolhidos) {
                if (escolhido < 10) {
                    System.out.print("0" + escolhido + " ");
                } else {
                    System.out.print(escolhido + " ");
                }
            }
            System.out.println("");
            flag = JOptionPane.showInputDialog("Deseja gerar outro jogo? \n(S) Sim \n(N)Não");
        }while(flag.equalsIgnoreCase("s"));

        JOptionPane.showMessageDialog(null, "Você gerou " + contador +" Jogo(s)");
    }
}
