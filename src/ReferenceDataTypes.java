public abstract class ReferenceDataTypes {
    // Dereferencing happens with the "." operator.

    public void dereference() {
        // Dereferencing follows the memory address stored in a reference, to the place in memory where the actial object resides.
        // When the object is found, the requested method is called.

        // - Object is a reference type.
        // - obj is the variable to store the new reference in.
        // - Object() is the call to the constructor.
        Object obj = new Object();
        String text = obj.toString();
        // What happened:
        // - Space in memory is allocated for the object
        // - The constructor Object() is called to initialize the memory space.
        // The memory address is stored in obj, so that it references the newly created object.

        // This is different from primitives, where the actual value 10 is stored in i.
        int i = 10;

        // When a reference has the value null, dereferencing results in a NullPointerException
        Object obj2 = null;
        // obj2.toString(); // Throws an exception
    }
}
