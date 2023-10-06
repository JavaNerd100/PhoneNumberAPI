package PhoneNumberApi.Service;

import PhoneNumberApi.Exceptions.ExceptionsConstants;
import PhoneNumberApi.Exceptions.WrongPhoneNumberExceptions;
import PhoneNumberApi.PhoneNumberPojo.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static PhoneNumberApi.Regex.PhoneNumberRegex.PHONE_NUMBER_REGEX;

@Service
public class PhoneNumberService {

    @Autowired
    private MessageSource messageSource;


    public String setMessage(String message) {
        return messageSource.getMessage(message, null, LocaleContextHolder.getLocale());
    }

    public String getMessage(String message, Object[] args) {
        return messageSource.getMessage(message, args, LocaleContextHolder.getLocale());
    }


    public PhoneNumber getPhoneNUmber(String number) {
        Pattern phoneNumberRegex = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = phoneNumberRegex.matcher(number);
        PhoneNumber phoneNumber = new PhoneNumber();

        if (matcher.matches()) {
            phoneNumber.setCountryCode(matcher.group("indiaCode"));
            phoneNumber.setSubscriberCode(matcher.group("subscriberCode"));
            phoneNumber.setOperatorCode(matcher.group("operatorCode"));
        } else {
            throw new WrongPhoneNumberExceptions(
                    getMessage(ExceptionsConstants.WRONG_PHONE_NUMBER_ENTERED, null));
        }
        return phoneNumber;
    }




    }

