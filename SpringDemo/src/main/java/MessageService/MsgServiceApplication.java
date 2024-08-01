package MessageService;

import MessageService.service.MsgService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MsgServiceApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MsgServiceApplication.class);
        MsgService msgService = applicationContext.getBean(MsgService.class);
        System.out.println(msgService.getMsg());
    }
}
