import java.util.Arrays;

public class B {
    private A aObject;       // Object of class A
    private C[] cArray;      // Array of objects of class C

    // Constructor for class B
    public B(A aObject, C[] cArray) {
        this.aObject = aObject;
        this.cArray = cArray;
    }

    // Function 1: Update the value of stringValue in the A object
    public void updateAValue(String newValue) {
        this.aObject.setStringValue(newValue);
    }

    // Function 2: Summarize the values of all C objects in the cArray
    public String summarizeCValues() {
        StringBuilder summary = new StringBuilder("Summary of C Values: ");
        for (C cObj : cArray) {
            summary.append(cObj.getCValue()).append(" ");
        }
        return summary.toString().trim();
    }

    // Getter for aObject
    public A getAObject() {
        return aObject;
    }

    // Getter for cArray
    public C[] getCArray() {
        return cArray;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "B{aObject=" + aObject + ", cArray=" + Arrays.toString(cArray) + "}";
    }
}
