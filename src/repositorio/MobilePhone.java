
package repositorio;

/**
 *
 * @author Emmanuel
 */
public class MobilePhone {
    private final SocialSharer socialSharer;

    public MobilePhone(SocialSharer socialSharer) {
        this.socialSharer = socialSharer;
    }
    
    public void share(String text)
    {
        this.socialSharer.share(text);
    }
    
    public boolean isLogged()
    {
        return this.socialSharer.isLogger();
    }
}
