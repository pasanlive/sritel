package com.sritel.service.controller;

import com.sritel.service.domain.Vas;
import com.sritel.service.domain.VasList;
import com.sritel.service.domain.VasUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Maleen Chethiya
 */
@Controller
@RequestMapping("/vas")
public class VasController {

    private final static Logger log = LoggerFactory.getLogger(VasController.class);

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    VasList getVasList() {
        log.debug(" Get all vas service list");
        VasList vasList = new VasList();
        return vasList;
    }

    @RequestMapping(value = "/{vasCode}", method = RequestMethod.GET)
    public
    @ResponseBody
    Vas getVas(@PathVariable("vasCode") int vasId, @RequestParam("phoneNumber") String phoneNumber) {
        log.debug(" Get single vas service data for vasCode {}", vasId);
        Vas vas = new Vas();
        return vas;
    }

    //subject to change
    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    Vas addVas(@RequestBody VasUpdate vasUpdate) {
        log.debug(" Add vas service data for vasCode {}", vasUpdate.getVasCode());
        Vas vas = new Vas();
        return vas;
    }

    //subject to change
    @RequestMapping(method = RequestMethod.PUT)
    public
    @ResponseBody
    Vas updateVas(@RequestBody VasUpdate vasUpdate) {
        log.debug(" Update vas service data for vasCode {}", vasUpdate.getVasCode());
        Vas vas = new Vas();
        return vas;
    }

    //subject to change
    @RequestMapping(value = "/{vasCode}", method = RequestMethod.DELETE)
    public
    @ResponseBody
    Boolean removeVas(@PathVariable("VasCode") int vasId) {
        log.debug("Delete vas service data for vasCode {}", vasId);
        return true;
    }
}
