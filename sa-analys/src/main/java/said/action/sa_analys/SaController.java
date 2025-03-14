package said.action.sa_analys;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "sa",produces = MediaType.APPLICATION_JSON_VALUE)

public class SaController {
    @GetMapping
    public List<Object> search(Object elements) {
         return  List.of( new sa(1,"balle",1));
    }

}
