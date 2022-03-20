import danescu.miruna.project.model.Artist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArtist {
    @Test
    void testConstructor() {
        Artist artist = new Artist("artist");
        assertEquals("artist",artist.getName());
    }

    @Test
    void testToString() {
        Artist artist = new Artist("artist");
        assertEquals("artist",artist.toString());
    }
}
