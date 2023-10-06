package PhoneNumberApi.PhoneNumberPojo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class PhoneNumber {


   @Id
   private String countryCode;
    private String OperatorCode;
    private String subscriberCode;

    public PhoneNumber(String countryCode, String operatorCode, String subscriberCode) {
        this.countryCode = countryCode;
        OperatorCode = operatorCode;
        this.subscriberCode = subscriberCode;
    }

    public PhoneNumber(){

    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getOperatorCode() {
        return OperatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        OperatorCode = operatorCode;
    }

    public String getSubscriberCode() {
        return subscriberCode;
    }

    public void setSubscriberCode(String subscriberCode) {
        this.subscriberCode = subscriberCode;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", OperatorCode='" + OperatorCode + '\'' +
                ", subscriberCode='" + subscriberCode + '\'' +
                '}';
    }
}
