package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Doe");
        User melon = new YGeneration("Melon Usk");
        User justin = new ZGeneration("Justin Time");

        //When
        String johnSharesOn = john.sharePost();
        System.out.println("John shares post on " + johnSharesOn);
        String melonSharesOn = melon.sharePost();
        System.out.println("Melon shares post on " + melonSharesOn);
        String justinSharesOn = justin.sharePost();
        System.out.println("Justin shares post on " + justinSharesOn);

        //Then
        assertEquals("Facebook", johnSharesOn);
        assertEquals("Twitter", melonSharesOn);
        assertEquals("Snapchat", justinSharesOn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Doe");

        //When
        String johnSharesOn = john.sharePost();
        System.out.println("John shares post on " + johnSharesOn);
        john.setSocialPublisher(new TwitterPublisher());
        johnSharesOn = john.sharePost();
        System.out.println("John shares post on " + johnSharesOn);

        //Then
        assertEquals("Twitter", johnSharesOn);
    }
}
