package projetos.explorandopadroesdecodigo.facade;

import projetos.explorandopadroesdecodigo.facade.subsytem.crm.CrmService;
import projetos.explorandopadroesdecodigo.facade.subsytem.zipcode.ZipCodeApi;

public class Facade {

    public void migrateClient(String name, String zipCode) {
        String city = ZipCodeApi.getInstance().retrieveCity(zipCode);
        String state = ZipCodeApi.getInstance().retrieveState(zipCode);
        CrmService.saveClient(name, zipCode, city, state);
    }
}
