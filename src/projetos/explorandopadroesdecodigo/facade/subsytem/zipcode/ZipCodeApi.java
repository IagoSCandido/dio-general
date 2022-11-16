package projetos.explorandopadroesdecodigo.facade.subsytem.zipcode;

public class ZipCodeApi {
    private static ZipCodeApi instance = new ZipCodeApi();
    private ZipCodeApi() {
        super();

    }
    public static ZipCodeApi getInstance() {
        return instance;
    }
    public String retrieveCity (String zipCode) {
        return "Your city";
    }
    public String retrieveState (String zipCode) {
        return "Your state";
    }
}
