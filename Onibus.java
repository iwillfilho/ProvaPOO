public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa,int ano,int ano_veiculo,int assentos){
        super(placa,ano,ano_veiculo);
        this.assentos=assentos;
    }

    @Override
    public double alugar(){
        double aluguel=(30*assentos)-(ano-ano_veiculo)*70;
        return aluguel;
    }

}