package PhoneNumberApi.Regex;

public class PhoneNumberRegex {

  public static final String PHONE_NUMBER_REGEX = "\\{(?:(?<indiaCode>[+91]{3})[\\s]?)(?:(?<operatorCode>\\d{4})[-\\s]?)(?<subscriberCode>\\d{6})\\}";
}
