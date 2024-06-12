package jsonData;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import commons.GlobalConstants;

import java.io.File;

public class UserInfoDataJson {
    public static UserInfoDataJson getUserInfo() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.RESOURCE_PATH + "userData.json"), UserInfoDataJson.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @JsonProperty("emailaddress")
    private String emailAddress;
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @JsonProperty("firstname")
    private String firstName;
        @JsonProperty("lastname")
    private String lastName;
        @JsonProperty("password")
    private String password;
        @JsonProperty("birthday")
    private String birthDay;
        @JsonProperty("birthmonth")
    private String birthMonth;
        @JsonProperty("birthyear")
    private String birthYear;
        @JsonProperty("company")
    private String company;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getCompany() {
        return company;
    }
}
