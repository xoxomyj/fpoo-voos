package br.senai.sp.jandira.model;

public class VoosEmirates extends Voos{

    public VoosEmirates(String empresa, String destino, String partida, String horPartida, String dataPartida, int nubVoo, int quantPassageiros) {
        super ("Emirates","Seoul", "Congonhas", "00:00", "19/12/22", 333, 333);
    }

    public String exibirTela() {
        return "******* Voo Emirates *******\n" + super.cadastroVoo();
    }
}
