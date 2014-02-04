import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Service;

public class ITsocialnetwork2 {

        public static void main( String[] args )
                throws Exception
        {
            VelocityEngine ve = new VelocityEngine();
            ve.init();
            VelocityContext vc = new VelocityContext(); // создание контекста Velocity




        }

    @Controller
    public class MyControllerClass {

        String name = "hello word";

        @Autowired
        public String detail()  {

            return "detail";
        }



    }

}
