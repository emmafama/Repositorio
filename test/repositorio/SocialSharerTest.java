/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Emmanuel
 */
public class SocialSharerTest {
    
    public SocialSharerTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void x()
    {
        SocialSharer sharer = mock(SocialSharer.class);
        when(sharer.isLogger()).thenReturn(Boolean.FALSE);
        
        MobilePhone mobile = new MobilePhone(sharer);
        assertTrue(mobile.isLogged());
        
        verify(sharer).isLogger();
        
    }
    
    @Test
    public void x2()
    {
        SocialSharer sharer = mock(SocialSharer.class);        
        MobilePhone mobile = new MobilePhone(sharer);
        
        mobile.share("emmanuel");
        verify(sharer).share("emmanuelx"); 
    }
}
