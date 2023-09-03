package kz.bitlab.task1.controller;

import kz.bitlab.task1.service.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final Subject subject;

    @PostMapping("/news")
    public void changePrice(@RequestBody String message) {
        subject.setMessage(message);
        subject.notifyObservers();
    }
}
