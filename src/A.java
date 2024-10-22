public class A {
    private String stringValue;

    // Constructor for class A
    public A(String stringValue) {
        this.stringValue = stringValue;
    }

    // Getter for stringValue
    public String getStringValue() {
        return stringValue;
    }

    // Setter for stringValue
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "A{stringValue='" + stringValue + "'}";
    }
}
