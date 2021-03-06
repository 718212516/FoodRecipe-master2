package app.com.ark.android.foodrecipe.retrofit;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ark on 4/24/17.
 */
public interface GetFoodApi {

    @GET("/search")
    Food getFoods(
            @Query("q") String searchParam,
            @Query("_app_id") String appID,
            @Query("_app_key") String appKey
    );

}
