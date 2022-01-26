package om.eternal.petclinic.controllers;

import om.eternal.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//Just Changed my git name
@RequestMapping("owners")
@Controller
public class OwnerController {
    private  final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","index.html"})
    public String listOwners(Model model) {


        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";

    }
}
