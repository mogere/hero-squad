package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void NewHeroObjectInstanciatesCorrectly_true(){
        Hero hero = new Hero("superhero", "swooshing", 30, "resilience");
        assertEquals(true, hero instanceof Hero);
    }
    @Test
    public void NewHeroObjectWithParameterInstanciatesCorrectly_true(){
        Hero hero = new Hero("VegMan");
        assertEquals(true, hero instanceof Hero);
    }
    @Test
    public void getNameReturnsName_true(){
        Hero hero = new Hero("vegman");
        assertEquals("vegman", hero.getName());
    }
}