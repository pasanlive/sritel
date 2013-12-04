package com.sritel.service.controller;

import com.sritel.service.domain.Vas;
import com.sritel.service.domain.VasList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;

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

    @RequestMapping(value = "/{vasId}", method = RequestMethod.GET)
    public
    @ResponseBody
    Vas getVas(@PathVariable("vasId") int vasId) {
        log.debug(" Get single vas service data for vasId {}", vasId);
        Vas vas = new Vas();
        return vas;
    }

    //subject to change
    @RequestMapping(value = "/{vasId}", method = RequestMethod.POST)
    public
    @ResponseBody
    Vas addVas(@PathVariable("vasId") int vasId) {
        log.debug(" Add vas service data for vasId {}", vasId);
        Vas vas = new Vas();
        return vas;
    }

    //subject to change
    @RequestMapping(value = "/{vasId}", method = RequestMethod.PUT)
    public
    @ResponseBody
    Vas updateVas(@PathVariable("vasId") int vasId) {
        log.debug(" Update vas service data for vasId {}", vasId);
        Vas vas = new Vas();
        return vas;
    }

    //subject to change
    @RequestMapping(value = "/{vasId}", method = RequestMethod.DELETE)
    public
    @ResponseBody
    Vas removeVas(@PathVariable("vasId") int vasId) {
        log.debug("Delete vas service data for vasId {}", vasId);
        Vas vas = new Vas();
        return vas;
    }
}
