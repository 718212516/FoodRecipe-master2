package app.com.ark.android.foodrecipe.retrofit;

import java.util.List;

/**
 * Created by ark on 4/24/17.
 */
public class FoodRecipe {
    public List<MatchSet> matches;

    public class MatchSet{
        public String id;
        public String sourceDisplayName;
    }
}
