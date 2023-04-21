package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrateClient(String name, String cep) {

        String cidade = CepApi.getInstance().getCidade(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.saveClient(name, cep, cidade, estado);
    }
}
