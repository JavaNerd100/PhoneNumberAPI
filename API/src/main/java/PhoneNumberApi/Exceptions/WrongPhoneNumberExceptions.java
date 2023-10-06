package PhoneNumberApi.Exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Data
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class WrongPhoneNumberExceptions extends RuntimeException{

    List<String> messages;


    public WrongPhoneNumberExceptions(String message){
        super(message);
    }
    public WrongPhoneNumberExceptions(List<String> messages) {
        this.messages = messages;
    }
}
