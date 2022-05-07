package az.iktlab.telegram_bot_application.client;

import az.iktlab.telegram_bot_application.dao.model.CodeBeautify;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "open-Data", url = "https://sc.opendata.az/file")
public interface AgroServiceClient {

    @GetMapping("/476")
    CodeBeautify getAgroServices();

}
