package jsonData;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import commons.GlobalConstants;

import java.io.File;

public class PaymentInfoData {
    public static PaymentInfoData getUserInfo() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.RESOURCE_PATH + "userData.json"), PaymentInfoData.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @JsonProperty("visa")
    private String visa;
    @JsonProperty("date")
    private String date;
    @JsonProperty("cvc")
    private String cvc;
    @JsonProperty("checkout")
    checkout checkout;
    static class checkout {
        @JsonProperty("discount")
        private String discount;
    }
    public String getDiscount() {
            return checkout.discount;
    }
    public String getVisa() {
        return visa;
    }
    public String getDate() {
        return date;
    }
    public String getCvc() {
        return cvc;
    }
}
