package hello.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();

        // 한국 시간
        ZonedDateTime koreaTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        response.put("koreaTime", koreaTime.toString());
        response.put("timestamp", System.currentTimeMillis());
        response.put("message", "Hello, World!");

        return response;
    }
}