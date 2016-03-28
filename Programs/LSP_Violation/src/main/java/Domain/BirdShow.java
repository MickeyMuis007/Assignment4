package Domain;

import Services.Bird;

import java.util.List;

/**
 * Created by student on 2016/03/27.
 */
public class BirdShow {
    public String birdFlying(Bird bird){
        return bird.fly();
    }
    public String birdEating(Bird bird){
        return bird.eat();
    }
    public String birdWalking(Bird bird){
        return bird.walk();
    }
}
