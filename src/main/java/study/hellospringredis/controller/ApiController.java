package study.hellospringredis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import study.hellospringredis.dto.UserProfile;
import study.hellospringredis.service.UserService;

@RestController
public class ApiController {

    private final UserService userService;

    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{userId}/profile")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable(value = "userId") String userId) {
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }
}
