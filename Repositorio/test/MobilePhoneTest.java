
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
        System.out.println("test01");
    }
    
    @Test
    public void x2()
    {
        SocialSharer sharer = mock(SocialSharer.class);        
        MobilePhone mobile = new MobilePhone(sharer);
        
        mobile.share("emmanuel");
        verify(sharer).share("emmanuel");
        
        System.out.println("test02");
    }
}
