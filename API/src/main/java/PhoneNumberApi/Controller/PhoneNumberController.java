package PhoneNumberApi.Controller;

import PhoneNumberApi.PhoneNumberPojo.PhoneNumber;
import PhoneNumberApi.Service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneNumberController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @RequestMapping(method = RequestMethod.GET,value = "/phoneNumberApi/{number}")
    public PhoneNumber getPhoneNumber(@PathVariable String number) {
        return phoneNumberService.getPhoneNUmber(number);
    }


}
