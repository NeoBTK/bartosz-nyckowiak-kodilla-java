package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("38126359");
        Country germany = new Country("829824715");
        Country usa = new Country("365135465");
        Country china = new Country("1459378561");
        Country brasil = new Country("215997243");
        Country nigeria = new Country("208464812");

        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        Continent asia = new Continent();
        Continent southAmerica = new Continent();
        Continent africa = new Continent();

        World world = new World();

        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        northAmerica.addCountry(usa);
        asia.addCountry(china);
        southAmerica.addCountry(brasil);
        africa.addCountry(nigeria);

        world.addContinent(europe);
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3116927155");
        Assertions.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());
    }
}
