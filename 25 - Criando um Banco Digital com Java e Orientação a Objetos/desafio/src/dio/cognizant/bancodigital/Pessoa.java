package dio.cognizant.bancodigital;

public class Pessoa {

    public enum TipoPessoa {FISICA, JURIDICA;}
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    protected String nome;
    protected String documento;
    protected TipoPessoa tipoPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        try {
            if (documento == null || documento.isEmpty()) {
                throw new NullPointerException("Documento deve conter informação correta.");
            }

            if (documento.length() == TAMANHO_CPF) {
                setDocumento(documento, tipoPessoa.FISICA);
            } else if (documento.length() == TAMANHO_CNPJ) {
                setDocumento(documento, tipoPessoa.JURIDICA);

//            } else {
//                throw new RuntimeException("Tamanho de documento informado é inválido.");
//            }
            this.documento = documento;
            }
        }
        catch (IllegalStateException | NullPointerException ex){
            System.out.println("Documento inválido!!!");
        }
    }

    private void setDocumento(String documento, TipoPessoa tipoPessoa) {
        this.documento = documento;
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
