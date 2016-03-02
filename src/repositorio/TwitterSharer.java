
package repositorio;

/**
 *
 * @author Emmanuel
 */
public class TwitterSharer implements SocialSharer
{
    @Override
    public void share(String text) {
     /*   if(text.length() > 140)
        {
            text = text.substring(0, 140);
        }*/
        text = (text.length() > 140) ? text.substring(0, 140) : text;
        System.out.println(text);
    }

    @Override
    public boolean isLogger() {
        return true;
    }
    
}
