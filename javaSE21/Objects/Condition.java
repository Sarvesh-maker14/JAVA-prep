package Objects;

public enum Condition {
    HOT("Warning HOT"),
    WARM("Just right"),
    COLD("Warning COLD");
    private String caution;

    private Condition(String caution){
        this.caution = caution;
    }

    public String getCaution(){
        return caution;
    }


}
