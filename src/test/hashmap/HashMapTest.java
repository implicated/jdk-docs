package test.hashmap;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.*;

public class HashMapTest {
    static final int TREEIFY_THRESHOLD = 8;
    static final int UNTREEIFY_THRESHOLD = 6;
    static final int MIN_TREEIFY_CAPACITY = 64;

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= TREEIFY_THRESHOLD; i++) {
            map.put(i, i);
        }
    }

    @Test
    public void hash() {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= TREEIFY_THRESHOLD; i++) {
            map.put(i, i);
        }
        map.forEach((k, v) -> System.out.println(k + "," + v));
        System.out.println();
        map.putAll(new HashMap<>());
        map.forEach((k, v) -> System.out.println(k + "," + v));
    }

    @Test
    public void LinkedHash() {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <= TREEIFY_THRESHOLD; i++) {
            map.put(i, i);
        }
        map.forEach((k, v) -> System.out.println(k + "," + v));
        System.out.println();
        map.putAll(new HashMap<>());
        map.forEach((k, v) -> System.out.println(k + "," + v));
    }

    @Test
    public void filed() {
        Field[] fields = HashMap.class.getDeclaredFields();
        Arrays.stream(fields)
                .map(Objects::toString)
                // .filter(e -> e.contains("static"))
                // .forEach(System.out::println);
                .forEach(e -> System.out.println("| " + e.substring(e.lastIndexOf(".") + 1) + " ||"));
    }
}
