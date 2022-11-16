package projetos.explorandopadroesdecodigo.facade.subsytem.crm;

public class CrmService {
    //CRM: Customer Relationship Management
    private CrmService () {
        super();
    }
    public static void saveClient(String name, String zipCode, String city, String state) {
        System.out.printf("Client saved in CRM system: %s, %s, %s, %s\n", name, zipCode, city, state);

    }
}
