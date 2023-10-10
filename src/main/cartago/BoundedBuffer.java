import cartago.Artifact;

public class BoundedBuffer extends Artifact {
    private int bufferCount;
    private int size;

    void init(final int size) {
        this.bufferCount = 0;
        this.size = size;
    }

    /* Add your code for referencing the guard here. */
    void put() {
        this.bufferCount++;
        System.out.println(this.bufferCount);
    }

    /* Add your code for referencing the guard here. */
    void take() {
        this.bufferCount--;
        System.out.println(this.bufferCount);
    }

    /* Add your code for implementing the buffer full guard here. */

    /* Add your code for implementing the buffer empty guard here. */
}
