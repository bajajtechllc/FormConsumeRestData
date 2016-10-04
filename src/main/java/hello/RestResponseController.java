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
        Quote result = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        model.addAttribute("quote", result);
        return "restResponse";
    }

}
