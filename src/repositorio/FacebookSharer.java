
package repositorio;


public class FacebookSharer implements SocialSharer
{
    @Override
    public void share(String text) {
        System.out.println(text);
    }    

    @Override
    public boolean isLogger() {
        return true;
    }
    
    
}
