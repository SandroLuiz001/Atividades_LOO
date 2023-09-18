import Atividade05_06.ProjetoEstagiarioVeiculo.Aviao;
import Atividade05_06.ProjetoEstagiarioVeiculo.Caminhao;
import Atividade05_06.ProjetoEstagiarioVeiculo.Carro;
import Atividade05_06.ProjetoEstagiarioVeiculo.Motocicleta;
import Atividade05_06.ProjetoEstagiarioVeiculo.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
        Aviao aviao = new Aviao(0, null, null, null, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0);
        aviao.Imprimir();

        Caminhao caminhao = new Caminhao(0, null, null, null, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, null);
        caminhao.Imprimir();

        Carro carro = new Carro(0, null, null, null, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, null);
        carro.Imprimir();

        Motocicleta motocicleta = new Motocicleta(0, null, null, null, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, 0, null);
        motocicleta.Imprimir();

        Onibus onibus = new Onibus(0, null, null, null, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0);
        onibus.Imprimir();
    }
}
