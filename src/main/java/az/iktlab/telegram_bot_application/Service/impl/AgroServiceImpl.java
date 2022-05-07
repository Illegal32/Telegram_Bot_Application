package az.iktlab.telegram_bot_application.Service.impl;

import az.iktlab.telegram_bot_application.Service.AgroService;
import az.iktlab.telegram_bot_application.client.AgroServiceClient;
import az.iktlab.telegram_bot_application.dao.model.CodeBeautify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgroServiceImpl implements AgroService {

    @Autowired
    private AgroServiceClient client;

    @Override
    public CodeBeautify getAgroServices() {
        return (CodeBeautify) client.getAgroServices();
    }
}
