package pl.com.bottega.qdockw.preparation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PreparationController {

    PreparationFacade facade;

    @PostMapping("/fsfsd/sdfsdf")
    public String doCreate(@RequestBody @Valid DoCreateQDocDraft command) {
        facade.handle(command);
        return "";
    }
}
