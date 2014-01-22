package com.sritel.service.controller;

import com.sritel.service.domain.BillStatus;
import com.sritel.service.domain.MonthlyBill;
import com.sritel.service.domain.UpdateBill;
import java.util.Calendar;
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
@RequestMapping("/bill")
public class BillingController {

    private final static Logger log = LoggerFactory.getLogger(BillingController.class);

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    BillStatus getBillStatus(@RequestParam("phoneNumber") String phoneNumber) {
        log.debug(" Get current bil status");
        BillStatus billStatus = new BillStatus();
        billStatus.setPhoneNumber(phoneNumber);
        return billStatus;
    }

    @RequestMapping(value = "/{month}", method = RequestMethod.GET)
    public
    @ResponseBody
    MonthlyBill getDetailedBill(@RequestParam("phoneNumber") String phoneNumber, @PathVariable("month") int month,
            @RequestParam(value = "year", defaultValue = "0") int year) {
        if (year == 0) {
            year = Calendar.getInstance().get(Calendar.YEAR);
        }
        log.debug(" Getting detailed bill of specified month : {}", month);
        MonthlyBill monthlyBill = new MonthlyBill();
        monthlyBill.setBillingMonth(month);
        monthlyBill.setPhoneNumber(phoneNumber);
        if (year > 0) {
            monthlyBill.setBillingYear(year);
        }
        return monthlyBill;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public
    @ResponseBody
    BillStatus updateBillAmount(@RequestBody UpdateBill updateBill) {
        log.debug(" Get current bill status");
        BillStatus billStatus = new BillStatus();
        billStatus.setLastPaidAmount(updateBill.getUpdatingAmount());
        billStatus.setOutstandingAmount(billStatus.getOutstandingAmount() - updateBill.getUpdatingAmount());
        billStatus.setPhoneNumber(updateBill.getPhoneNumber());
        return billStatus;
    }
}
