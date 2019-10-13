package heanaadmin.heenacreations.com.heenaadmin.common.web;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface ApiInterface {

    @POST("user")
    Call<ApiResponseModel.AddRegisterResponse> register(@Body ApiRequestModel.RegisterRequest registerRequest);

    @POST("user/login")
    Call<ApiResponseModel.LoginResponse> login(@Body ApiRequestModel.LoginRequest loginRequest);

    @POST("order")
    Call<ApiResponseModel.OrderResponse> order(@Body ApiRequestModel.OrderRequest orderRequest);

//    @GET("order/getAllOrders")
//    Call<ApiResponseModel.FetchSchoolsResponse> fetchSchools();


    @POST("order/orderUpdate")
    Call<ApiResponseModel.UpdateOrderResponse> orderUpdate(@Query("token") String token, @Body ApiRequestModel.UpdateOrderRequest updateOrderRequest);

//    @POST("product")
//    Call<ApiResponseModel.P> changePassword(@Body ApiRequestModel.ChangePasswordRequest changePasswordRequest);
//
//
//    @POST("product/productUpdate")
//    Call<ApiResponseModel.FeedbackResponseModel> FeedbackRequestModel(@Body ApiRequestModel.FeedbackRequest feedbackRequest);

//    @POST("product/getAllProducts")
//    Call<ApiResponseModel.EditProfileResponse> editProfile(@Body ApiRequestModel.EditRequest editRequest);
//
//    @GET("product")
//    Call<ApiResponseModel.FetchProducts> fetchProducts();

}
