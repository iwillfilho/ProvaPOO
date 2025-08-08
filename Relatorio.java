import java.util.Scanner;

public class Relatorio {
    Veiculo [] vetor;

    Relatorio(int tamanho){
        vetor = new Veiculo[tamanho];
    }

    public static void main(String[] args) {
        String placa;
        int ano,ano_veiculo,especify;        
        int type=0,len=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do relatório");
        len=sc.nextInt();

        Veiculo[] vetor = new Veiculo[len];

        for(int i=0;i<len;i++){
            System.out.println("Digite: 0 para adicionar um caminhão e 1 para onibus");
            type = sc.nextInt();
            if(type==1){
                System.out.println("Digite a placa,ano atual,ano do veículo e os assentos com enter");

                placa= sc.next();
                ano = sc.nextInt();
                ano_veiculo =sc.nextInt();
                especify = sc.nextInt();
                vetor[i]= new Onibus(placa,ano,ano_veiculo,especify);
            }
            else{
                System.out.println("Digite a placa,ano atual,ano do veículo e os eixos com enter");

                placa= sc.next();
                ano = sc.nextInt();
                ano_veiculo =sc.nextInt();
                especify = sc.nextInt();
                vetor[i]=new Caminhao(placa,ano,ano_veiculo,especify);
            }
        }

        double sum =0;

        for(int i=0;i<len;i++){
            sum+= vetor[i].alugar();
        }

        System.out.println("O valor final será de :"+sum+" reais.");
    }
    
}
