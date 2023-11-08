package br.senai.sp.jandira.model;

public class VoosDelta extends Voos{

    public VoosDelta(String empresa, String destino, String partida, String horPartida, String dataPartida, int nubVoo, int quantPassageiros) {
        super("Delta", "Los Angeles", "Guarulhos", "22:45", "12/04/2023", 222, 122);
    }

    public String exibirTela() {
        return "******** Voo Delta *********\n" + super.cadastroVoo();
    }
}
