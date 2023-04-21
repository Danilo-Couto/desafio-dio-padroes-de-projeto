package subsistema2.cep;

import singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() { return instance;}

    public static String getCidade(String cep) { return "cidade";}
    public static String getEstado(String cep) { return "estado";}

}

