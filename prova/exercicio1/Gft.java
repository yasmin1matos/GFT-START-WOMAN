package prova.exercicio1;

import java.util.HashMap;
import java.util.Map;
public class Gft {


    private Map<String, Integer> tabelaNumeroTelefone() {

        Map<String, Integer> tabelaNumero = new HashMap<>();
        tabelaNumero.put("ABC", 2);
        tabelaNumero.put("DEF", 3);
        tabelaNumero.put("GHI", 4);
        tabelaNumero.put("JKL", 5);
        tabelaNumero.put("MNO", 6);
        tabelaNumero.put("PQRS", 7);
        tabelaNumero.put("TUV", 8);
        tabelaNumero.put("WXYZ", 9);

        return tabelaNumero;

    }

    private String retornarNumero(String caractere) {

        String resultado = "";

        for (Map.Entry<String, Integer> entry : tabelaNumeroTelefone().entrySet()) {
            if (entry.getKey().contains(caractere)) {
                resultado = entry.getValue().toString();
            }
        }
        if (resultado == "") {
            return caractere;
        } else {
            return resultado;
        }
    }

    private String retornaTexto(String expressao) {
        String resultado = "";
        for (int i = 0; i < expressao.length(); i++) {
            resultado = resultado + retornarNumero(String.valueOf(expressao.charAt(i)));
        }
        return resultado;
    }


    public static void main(String[] args) {

        Gft gft = new Gft();

        String texto1 = "1-HOME-SWEET-HOME";
        String texto2 = "MY-MISERABLE-JOB";

        System.out.println(gft.retornaTexto(texto1));

        System.out.println(gft.retornaTexto(texto2));

    }

}

