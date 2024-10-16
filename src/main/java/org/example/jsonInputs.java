package org.example;

public class jsonInputs {

    public static String baseURI() {
        String baseURI;
        baseURI = "https://restful-booker.herokuapp.com";
        return baseURI;
    }

    public static String createBooking() {
        String jsonPayload = "{\n" +
                "    \"firstname\" : \"Shalini\",\n" +
                "    \"lastname\" : \"S\",\n" +
                "    \"totalprice\" : 1000,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-10-16\",\n" +
                "        \"checkout\" : \"2024-10-17\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        return jsonPayload;
    }

    public static String createToken() {
        String jsonPaylod = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        return jsonPaylod;
    }

}
