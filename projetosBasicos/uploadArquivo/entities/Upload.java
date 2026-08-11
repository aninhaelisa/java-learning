package projetosBasicos.uploadArquivo.entities;

public class Upload extends Arquivo{

    public Upload() {
    }

    public Upload(String nome, double tamanho) {
        super(nome, tamanho);
    }

    public void carregando() {
        System.out.println("Carregando arquivo...");
        double tamanho = getTamanho();
        tamanho = Math.ceil(tamanho); // arredonda para cima
        try {
            for(int i = 0; i<10; i++){
                System.out.print("#");
                Thread.sleep((int)tamanho * 100); // tempo de espera proporcional ao tamanho do arquivo
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
       
    }
}
