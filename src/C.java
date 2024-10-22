public class C {
    private String cValue;

    // Constructor for class C
    public C(String cValue) {
        this.cValue = cValue;
    }

    // Getter for cValue
    public String getCValue() {
        return cValue;
    }

    // Setter for cValue
    public void setCValue(String cValue) {
        this.cValue = cValue;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "C{cValue='" + cValue + "'}";
    }
}
