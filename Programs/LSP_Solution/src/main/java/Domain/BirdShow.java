package Domain;

import Services.Bird;
import Services.FlyingBird;

/**
 * Created by student on 2016/03/27.
 */
public class BirdShow {
    public String birdFlying(FlyingBird bird){
        return bird.fly();
    }
    public String birdWalking(Bird bird){
        return bird.walk();
    }
    public String birdEating(Bird bird){
        return bird.eat();
    }
}
