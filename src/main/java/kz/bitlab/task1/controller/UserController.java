package kz.bitlab.task1.controller;

import kz.bitlab.task1.model.User;
import kz.bitlab.task1.model.UserBuilder;
import kz.bitlab.task1.service.Observer;
import kz.bitlab.task1.service.impl.UserSubject;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserSubject subject;

    @PostMapping
    public void add(@RequestBody User user) {
        UserBuilder userBuilder = new UserBuilder();
        Observer observer = userBuilder
                .email(user.getEmail())
                .name(user.getName())
                .phone(user.getPhone())
                .build();

        subject.addObserver(observer);
    }
}
