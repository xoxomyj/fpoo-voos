package br.senai.sp.jandira.model;

public class Voos {

    private String empresa, destino, partida, horPartida,dataPartida;
    private int quantPassageiros, numVoo;

    public Voos(String empresa,
                String destino,
                String partida,
                String horPartida,
                String dataPartida,
                int numVoo,
                int quantPassageiros) {
        this.empresa = empresa;
        this.destino = destino;
        this.partida = partida;
        this.horPartida = horPartida;
        this.dataPartida = dataPartida;
        this.numVoo = numVoo;
        this.quantPassageiros = quantPassageiros;
    }

    public String cadastroVoo() {
        return  "Empresa: " + empresa + "\n" +
                "Partida: " + partida + "\n" +
                "Destino: " + destino + "\n" +
                "Número do Voo: " + numVoo + "\n" +
                "Data da partida: " + dataPartida + "\n" +
                "Horário da partida " + horPartida + "\n" +
                "Quantidade de Passageiros: " + quantPassageiros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorPartida() {
        return horPartida;
    }

    public void setHorPartida(String horPartida) {
        this.horPartida = horPartida;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida= dataPartida;
    }

    public int getQuantPassageiros() {
        return quantPassageiros;
    }

    public void setQuantPassageiros(int quantPassageiros) {
        this.quantPassageiros = quantPassageiros;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }
}
