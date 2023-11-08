package br.senai.sp.jandira;

import br.senai.sp.jandira.model.VoosDelta;
import br.senai.sp.jandira.model.VoosEmirates;
import br.senai.sp.jandira.model.VoosGol;

public class Main {

    public static void main(String[] args) {
        VoosDelta vooDelta = new VoosDelta("Delta", "Los Angeles", "Guarulhos", "22:45", "12/04/2023", 222, 122);
        VoosEmirates vooEmirates = new VoosEmirates("Emirates","Seoul", "Congonhas", "00:00", "19/12/22", 333, 333);
        VoosGol vooGol = new VoosGol("Gol","Rio de Janeiro", "Viracopos", "13:00", "31/12/24", 444, 1234);

        System.out.println("-------- Lista de Companhias ----------");
        System.out.println(vooGol.cadastroVoo());
        System.out.println();
        System.out.println(vooEmirates.cadastroVoo());
        System.out.println();
        System.out.println(vooDelta.cadastroVoo());
    }
}
