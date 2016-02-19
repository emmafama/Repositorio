
package repositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Emmanuel
 */
public class Main {

    private static final String TEXT_TO_SHARE = "Hola estoy compartiendo desde un repositorio undec. Estoy probando Dependencia" +
                " utilizando un ejemplo de intercambio social.vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvx";
    
    public static void main(String[] args) {
         final ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        
        MobilePhone mobilePhone = ctx.getBean("mobilePhone", MobilePhone.class);
        mobilePhone.share(TEXT_TO_SHARE);
    }
    
}
