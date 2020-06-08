package rw.rwandamovie.ratingdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rw.rwandamovie.ratingdataservice.models.Rating;
import rw.rwandamovie.ratingdataservice.models.UserRating;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingsResource {


    //private UserRating UserRating;

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRatingByUserID(@PathVariable("userId") String movieId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("100", 4),
                new Rating("200", 3)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);

        return  userRating;
    }



}
