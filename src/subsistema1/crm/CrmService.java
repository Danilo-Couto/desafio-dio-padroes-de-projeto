package subsistema1.crm;

public class CrmService {
    private CrmService() { super();}
    public static CrmService saveClient(String nome, String cep, String cidade, String estado) {
         System.out.println("Cliente salvo no CRM: " + nome + " " + cep + " " + cidade + " " + estado);
        return null;
    }
}
