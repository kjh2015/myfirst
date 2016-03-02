import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/3/2.
 */
public class HelloAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Hello");
        return super.execute();
    }
}
