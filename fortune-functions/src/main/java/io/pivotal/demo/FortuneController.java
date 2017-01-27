package io.pivotal.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by azwickey on 1/26/17.
 */
@Controller
public class FortuneController {

    @Autowired
    FortuneRepository repository;

    public Iterable<Fortune> fortunes() {
        return repository.findAll();
    }

    public Fortune randomFortune() {
        List<Fortune> randomFortunes = repository.randomFortunes(new PageRequest(0, 1));
        return randomFortunes.get(0);
    }
}
