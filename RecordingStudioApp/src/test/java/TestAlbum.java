import danescu.miruna.project.model.Album;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAlbum {
    @Test
    void testConstructor() {
        Album album = new Album("album");
        assertEquals("album",album.getName());
    }

    @Test
    void testToString() {
        Album album = new Album("album");
        assertEquals("album",album.toString());
    }
}
