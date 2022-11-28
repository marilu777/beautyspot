
class CodigoPostal {

    private int primario;
    private int secundario;

    /**
    Contrutor da class codigoPostal
    java garante que a funçao sera invocada com os 2 partes do codigo postal
    quando  fou usado "new codigoPostal()"
     */

    CodigoPostal(int valor1, int valor2){
        //validar valor1
        boolean valido1 = false;
        boolean valido2 = false;
        if (valor1>999 && valor1<1000)
            valido1 = true;
        if (valido1 && valido2) {
            primario = valor1;
            secundario = valor2;
        }else{
            System.out.printIn("Os valores" + valor1 + "e" + valor2 + "devem ser respetivamente entre 1000 e 9999, e entre 001 e 999");
            System.out.printIn("O codigo postal não foi guardado.");
        }
    }
}