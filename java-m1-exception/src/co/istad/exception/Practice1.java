package co.istad.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", "My Data");
        map.put("status", true);
        map.put("message", "Data is retrieved successfully");
        map.put("timestamp", LocalDateTime.now());

        // Validate => throw InvalidKeyException

        System.out.println(map);
    }
}
