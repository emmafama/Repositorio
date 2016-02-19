
import repositorio.MobilePhone;
import repositorio.SocialSharer;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 *
 * @author Emmanuel
 */
public class MobilePhoneTest {
    
    public MobilePhoneTest() {
    }
    
    @Test
    public void x()
    {
        SocialSharer sharer = mock(SocialSharer.class);
        when(sharer.isLogger()).thenReturn(Boolean.TRUE);
        
        MobilePhone mobile = new MobilePhone(sharer);
        assertTrue(mobile.isLogged());
        
        verify(sharer).isLogger();
    }
    
}
