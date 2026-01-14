package co.istad.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", "This is my data");
        map.put("message", "Data is retrieved successfully");
        map.put("status", true);
        map.put("timestamp", LocalDateTime.now());

        // Testing
        try {
            validateMap(map);
            System.out.println(map);
        } catch (KeyInvalidException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void validateMap(Map<String, Object> map) {
        // Valid Keys
        String[] validKeys = {"data", "message", "status", "timestamp"};

        // Validate on key size
        if (map.size() != validKeys.length) {
            throw new KeyInvalidException("Key size is invalid");
        }

        for (String key : validKeys) {
            if (!map.containsKey(key)) {
                throw new KeyInvalidException("Key " + key + " not exist");
            }
        }
    }
}
