package heanaadmin.heenacreations.com.heenaadmin.common.web;

import com.google.gson.annotations.SerializedName;

public class ApiRequestModel {

    public static class LoginRequest {
        @SerializedName("phone")
        String phone = "";

        @SerializedName("password")
        String password = "";

        public LoginRequest(String phone, String password) {
            this.phone = phone;
            this.password = password;
        }
    }

    public static class RegisterRequest {

        @SerializedName("first_name")
        String firstName = "";

        @SerializedName("last_name")
        String lastName = "";

        @SerializedName("country_code")
        String countryCode = "";

        @SerializedName("phone")
        String phone = "";


        @SerializedName("password")
        String password = "";

        @SerializedName("dob")
        String dob = "";

        @SerializedName("email")
        String email = "";

        @SerializedName("fcm_id")
        String fcmId = "";

        @SerializedName("user_type")
        String userType = "";

        @SerializedName("apartment")
        String apartment = "";


        @SerializedName("street")
        String street = "";

        @SerializedName("area")
        String area = "";

        @SerializedName("city")
        String city = "";


        @SerializedName("state")
        String state = "";

        @SerializedName("pincode")
        String pincode = "";

        @SerializedName("longitude")
        String longitude = "";

        @SerializedName("latitude")
        String latitude = "";

        public RegisterRequest(String firstName, String lastName, String countryCode, String phone, String password, String dob, String email, String fcmId, String userType, String apartment, String street, String area, String city, String state, String pincode, String longitude, String latitude) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.countryCode = countryCode;
            this.phone = phone;
            this.password = password;
            this.dob = dob;
            this.email = email;
            this.fcmId = fcmId;
            this.userType = userType;
            this.apartment = apartment;
            this.street = street;
            this.area = area;
            this.city = city;
            this.state = state;
            this.pincode = pincode;
            this.longitude = longitude;
            this.latitude = latitude;
        }
    }


    public static class OrderRequest {

        @SerializedName("user_id")
        String user_id = "";

        @SerializedName("delivery_date")
        String deliveryDate = "";

        @SerializedName("advance")
        int advance = 0;

        @SerializedName("amount")
        int amount = 0;

        @SerializedName("balance")
        int balance = 0;

        @SerializedName("payment_status")
        String paymentStatus = "";

        @SerializedName("order_status")
        String orderStatus = "";


        public OrderRequest(String user_id, String deliveryDate, int advance, int amount, int balance, String paymentStatus, String orderStatus) {
            this.user_id = user_id;
            this.deliveryDate = deliveryDate;
            this.advance = advance;
            this.amount = amount;
            this.balance = balance;
            this.paymentStatus = paymentStatus;
            this.orderStatus = orderStatus;
        }
    }

    public static class UpdateOrderRequest {

        @SerializedName("order_id")
        int orderId;

        @SerializedName("order_status")
        String orderStatus;


        public UpdateOrderRequest(int orderId, String orderStatus) {
            this.orderId = orderId;
            this.orderStatus = orderStatus;
        }
    }

    public static class AddProductRequest {

        @SerializedName("product_id")
        String productId;

        @SerializedName("product_name")
        String productName;

        @SerializedName("product_description")
        String productDescription;

        @SerializedName("order_id")
        int orderId;

        @SerializedName("product_status")
        String productStatus;

        @SerializedName("worker_id")
        String workerId;

        public AddProductRequest(String productId, String productName, String productDescription, int orderId, String productStatus, String workerId) {
            this.productId = productId;
            this.productName = productName;
            this.productDescription = productDescription;
            this.orderId = orderId;
            this.productStatus = productStatus;
            this.workerId = workerId;
        }
    }

    public static class UpdateProductRequest {
        @SerializedName("product_id")
        String productId;

        @SerializedName("product_status")
        String productStatus;

        @SerializedName("worker_id")
        String workerId;

        public UpdateProductRequest(String productId, String productStatus, String workerId) {
            this.productId = productId;
            this.productStatus = productStatus;
            this.workerId = workerId;
        }
    }

    public static class GetAllProductsRequest {
        @SerializedName("order_id")
        String orderId;

        public GetAllProductsRequest(String orderId) {
            this.orderId = orderId;
        }
    }
}
