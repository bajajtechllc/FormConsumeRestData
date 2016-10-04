package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestResponseController {

    @RequestMapping("/restResponse")
    public String restResponse(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
        model.addAttribute("content", result);
        return "restResponse";
    }

}
