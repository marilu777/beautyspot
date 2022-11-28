
class Morada {
    private String rua:
    int numero;
    String andar;
    String freguesia;
    String localidade;

    CodigoPostal codigo postal;
    String pais;

    void alterarRua(String valor){
        // toda a validaçao tem so é aceita num certo formato
        // entao ai valida se o campo e atualiza se os dados
        rua = valor;
    }