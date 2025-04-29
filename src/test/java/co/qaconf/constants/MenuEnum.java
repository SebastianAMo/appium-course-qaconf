package co.qaconf.constants;

public enum MenuEnum {
    HOME("Home", "Principal"),
    SHORTS("Shorts", "Shorts"),
    SUSCRIPTIONS("Subscriptions", "Suscripciones"),
    YOU("Tú", "Tú"),
    LIBRARY("Library", "Library");


    private final String englishValue;
    private final String spanishValue;

    MenuEnum(String englishValue, String spanishValue) {
        this.spanishValue = spanishValue;
        this.englishValue = englishValue;
    }

    public String getValueByPlataform(String plataform) {
        if ("moto72".equals(plataform)) {
            return spanishValue;
        } else {
            return englishValue;
        }
    }
}