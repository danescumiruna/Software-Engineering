import danescu.miruna.project.model.Record;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRecord {
    @Test
    void testConstructor() {
        Record record = new Record("Record1",2);
        assertEquals("Record1 2",record.toString());
    }
}
