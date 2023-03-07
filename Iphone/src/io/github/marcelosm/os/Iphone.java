package io.github.marcelosm.os;

import java.util.Scanner;

import io.github.marcelosm.menu.Itunes;
import io.github.marcelosm.menu.Safari;
import io.github.marcelosm.menu.Telefone;

public class Iphone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Acessando Menu...");
        System.out.println("Selecione um aplicativo:\n"
        +"Itunes\n"
        +"Safari\n"
        +"Telefone\n");
        String comando = sc.nextLine();

        switch (comando.toUpperCase()){
            case "ITUNES":
                System.out.println("Abrindo Itunes...");
                Itunes itunes = new Itunes();
                itunes.MudarMusica();
                itunes.Tocar();
                itunes.Pausar();
                break;
            case "SAFARI":
                System.out.println("Abrindo Safari...");
                Safari safari = new Safari();
                safari.exibirPagina();
                safari.adicionarNovaAba();
                safari.atualizarPagina();
                break;
            case "TELEFONE":
                System.out.println("Abrindo Telefone...");
                Telefone telefone = new Telefone();
                telefone.ligar();
                telefone.atender();
                telefone.iniciarCorreioVoz();
                break;
            default:
                break;
        }
    }
}
