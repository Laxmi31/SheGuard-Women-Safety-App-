package com.android.sheguard.api;

import com.android.sheguard.model.NotificationSenderModel;
import com.android.sheguard.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAPZ64ja4:APA91bGea3-1Rc17RSI10uh1hZCOBw4PRd8yUhsftKmEFSU8SQhau-wErINKjE4glgBeOHdN0ZuDcqui6W2Hca6Vh-lHCzbltKzqPMbOvzVce9we2UVcolq9clyuw83WbphlqFRsnbsQ" // Replace with your server key from Firebase Console
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);

}
