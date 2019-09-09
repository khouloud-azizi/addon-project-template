package org.exoplatform.addons.services;


import org.junit.Test;


import static org.junit.Assert.*;

public class MyServiceTest {


    @Test
    public void getMessage() {
        MyService my=new MyService();

        assertNotNull(my.getMessage());
        assertEquals("khouloud", my.getMessage());
    }
}
