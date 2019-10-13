package heanaadmin.heenacreations.com.heenaadmin.common.web;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import heanaadmin.heenacreations.com.heenaadmin.common.model.User;

public class ApiResponseModel {


    public class LoginResponse {
        @SerializedName("message")
        String message;

        @SerializedName("data")
        User user;


        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

    public class AddRegisterResponse {
        @SerializedName("message")
        String message;

        @SerializedName("data")
        User user;


        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

    public static class OrderResponse {

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


        public OrderResponse(String user_id, String deliveryDate, int advance, int amount, int balance, String paymentStatus, String orderStatus) {
            this.user_id = user_id;
            this.deliveryDate = deliveryDate;
            this.advance = advance;
            this.amount = amount;
            this.balance = balance;
            this.paymentStatus = paymentStatus;
            this.orderStatus = orderStatus;
        }
    }

    public static class UpdateOrderResponse {

        @SerializedName("order_id")
        int orderId;

        @SerializedName("order_status")
        String orderStatus;


        public UpdateOrderResponse(int orderId, String orderStatus) {
            this.orderId = orderId;
            this.orderStatus = orderStatus;
        }
    }

    public static class AddProductResponse {

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

        public AddProductResponse(String productId, String productName, String productDescription, int orderId, String productStatus, String workerId) {
            this.productId = productId;
            this.productName = productName;
            this.productDescription = productDescription;
            this.orderId = orderId;
            this.productStatus = productStatus;
            this.workerId = workerId;
        }
    }

    public static class UpdateProductResponse {
        @SerializedName("product_id")
        String productId;

        @SerializedName("product_status")
        String productStatus;

        @SerializedName("worker_id")
        String workerId;

        public UpdateProductResponse(String productId, String productStatus, String workerId) {
            this.productId = productId;
            this.productStatus = productStatus;
            this.workerId = workerId;
        }
    }

    public static class GetAllProductsResponse {
        @SerializedName("order_id")
        String orderId;

        public GetAllProductsResponse(String orderId) {
            this.orderId = orderId;
        }
    }
}