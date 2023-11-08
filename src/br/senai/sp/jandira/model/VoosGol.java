package br.senai.sp.jandira.model;

public class VoosGol extends Voos{

    public VoosGol(String empresa, String destino, String partida, String horPartida, String dataPartida, int nubVoo, int quantPassageiros) {
        super ("Gol","Rio de Janeiro", "Viracopos", "13:00", "31/12/24", 444, 1234);
    }
    public String exibirTela() {
        return "******** Voo Gol *******\n" + super.cadastroVoo();
    }

}
