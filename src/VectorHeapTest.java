import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Clase Main
 * @author Jonnathan Juarez, 15377
 * @author Julio Barahona, 141206
 * @since 02/10/2016
 * @version 1.0
 */
public class VectorHeapTest {

    @Test
    public void add() throws Exception {
        VectorHeap<String> vector = new VectorHeap<>();
        vector.add("S");
        assertEquals("S",vector.getFirst());
    }
    @Test
    public void remove() throws Exception {
        VectorHeap<String> vecto2 = new VectorHeap<>();
        vecto2.add("L");
        vecto2.add("O");
        vecto2.add("A");
        vecto2.add("R");
        vecto2.add("T");
        assertEquals("A",vecto2.remove());
    }

}