public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa,int ano,int ano_veiculo,int eixos){
        super(placa,ano,ano_veiculo);
        this.eixos=eixos;
    }

    @Override
    public double alugar() {
         double aluguel;
         aluguel=(300*eixos)-(super.ano-ano_veiculo);
        return aluguel;
    }
    
}