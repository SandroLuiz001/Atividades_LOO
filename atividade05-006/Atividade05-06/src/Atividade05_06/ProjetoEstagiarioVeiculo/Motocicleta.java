package Atividade05_06.ProjetoEstagiarioVeiculo;

public class Motocicleta extends BaseVeiculos {
    private String codigoRenavam;

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, Double pesoLiquido, Double pesoTotal, int assentos, int rodas, String fabricante,
            Double potencia, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUf,
            String tipoVeiculo, int qtdeMotores, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos,
                rodas, fabricante, potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUf, tipoVeiculo,
                qtdeMotores);
        this.codigoRenavam = codigoRenavam;
    }

    public void Imprimir(){
        System.out.println("codigo: " + this.codigo );
        System.out.println("nome: " + this.nome );
        System.out.println("modelo: " + this.modelo );
        System.out.println("cor: " + this.cor );
        System.out.println("chassi: " + this.chassi );
        System.out.println("placa: " + this.placa );
        System.out.println("Ano Modelo: " + this.anoModelo );
        System.out.println("Ano Fabricação: " + this.anoFabricacao );
        System.out.println("Peso Liquido: " + this.pesoLiquido );
        System.out.println("Peso Total: " + this.pesoTotal );
        System.out.println("Assentos: " + this.assentos );
        System.out.println("rodas: " + this.rodas );
        System.out.println("fabricante: " + this.fabricante );
        System.out.println("Potencia: " + this.potencia );
        System.out.println("Tipo Combustivel: " + this.tipoCombustivel );
        System.out.println("Nome Proprietario: " + this.nomeProprietario );
        System.out.println("Estado UF: " + this.estadoUF );
        System.out.println("cidade UF: " + this.cidadeUf );
        System.out.println("Tipo Veiculo: " + this.tipoVeiculo );
        System.out.println("Qtde Motores: " + this.qtdeMotores );
        System.out.println("Codigo Renavam: " + this.codigoRenavam );
        System.out.println("------------------------------------");
    }
    
}
