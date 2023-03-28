package study.hellospringredis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    Map<String, String > localSessionStorage = new HashMap<>();

    // /login?name=Jay
    @GetMapping("/login")
    public String login(HttpSession session, @RequestParam String name) {
//        localSessionStorage.put(session.getId(), name);
        session.setAttribute("name", name);

        return "saved.";
    }

    // /myName
    @GetMapping("/myName")
    public String myName(HttpSession session) {
//        return localSessionStorage.get(session.getId());
        return (String) session.getAttribute("name");
    }
}
