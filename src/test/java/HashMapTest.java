import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapTest {

    @Test
    public void testGet(){
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "AAA");

        assertEquals("AAA", map.get("a"));
    }

    @Test
    public void testReplace(){
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "AAA");
        map.put("a", "BBB");

        assertEquals("BBB", map.get("a"));
    }

    @Test
    public void testClear(){

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "AAA");
        map.put("b", "BBB");
        map.put("c", "CCC");

        map.clear();

        assertTrue(map.isEmpty());

    }

    @Test
    public void testNullAsKey(){

        HashMap<String, String> map = new HashMap<>();
        map.put(null, "AAA");

        assertTrue(map.containsKey(null));

    }

}
