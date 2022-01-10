package om.eternal.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//Just Changed my git name
@RequestMapping("owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
