package poo.model;

public class Pessoa {

    public enum TipoPessoa {FISICA, JURIDICA}

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public int codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipoPessoa;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento nao pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF ) {
            //tipoPessoa = TipoPessoa.FISICA;
            setDocumento(documento, tipoPessoa.FISICA);
        }else if (documento.length() == TAMANHO_CNPJ){
            //tipoPessoa = tipoPessoa.JURIDICA;
            setDocumento(documento, tipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Tamanho de documento informado é inválido.");
        }
        this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipoPessoa) {
        this.documento = documento;
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }
}
