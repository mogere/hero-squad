package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void NewSquadObjectInstanciatesCorrectly_true(){
        Squad squad = new Squad("Super");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void causeSetterWorks_cause(){
        Squad squad = new Squad("Super");
        squad.setCause("climate");
        assertEquals("climate", squad.getCause());
    }
}