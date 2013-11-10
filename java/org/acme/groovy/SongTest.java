package org.acme.groovy;

import org.junit.Test;

import junit.framework.Assert;

public class SongTest {
    
    @Test
    public void testToString(){
     Song sng = new Song();
     sng.setArtist("Village People");
     sng.setName("Y.M.C.A");
     sng.setGenre("Disco");
            
     Assert.assertEquals("Y.M.C.A, Village People, DISCO", 
       sng.toString());
    }

}