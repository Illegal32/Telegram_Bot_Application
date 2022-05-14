package az.iktlab.telegram_bot_application.Service.impl;

import az.iktlab.telegram_bot_application.Service.AgroService;
import az.iktlab.telegram_bot_application.client.AgroServiceClient;
import az.iktlab.telegram_bot_application.dao.model.Body;
import az.iktlab.telegram_bot_application.dao.model.CodeBeautify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class AgroServiceImpl implements AgroService {

    @Autowired
    private AgroServiceClient client;

    @Override
    public CodeBeautify getAgroServices() {

        System.out.println(client);
//        return client.getAgroServices();
        return null;
    }

//    public void onUpdateReceived(Update update) {
//
//
//        System.out.println("----------");
//        System.out.println(update.getMessage().getText());
//        System.out.println(update.getMessage().getFrom().getFirstName());
//
//        String command = update.getMessage().getText();
//
//        update.getMessage().getChatId();
//
//        if (command.equals("/start")) {
//
//            String[] data1 = {"Kənd Təsərüfatı Telegram Botuna Xoş Gəlmisiz!",
//                    "Salam, mən Lava, Ağıllı Bot. Proses müddətində sizin yardımcınız olacağam.",
//                    "Zəhmət olmasa qeyd olunan komandalardan istifadə edin!"};
//
//            for (String str1 : data1) {
//                SendMessage response = new SendMessage();
//                response.setChatId(update.getMessage().getChatId().toString());
//                response.setText(str1);
//
//                try {
//                    execute(response);
//                } catch (TelegramApiException E) {
//                    E.printStackTrace();
//                }
//            }
//        }
//        if (command.equals("/list")) {
//
////            List<Object> data2 = (List<Object>) client.getAgroServices().getAGRO_SERVICES().getBody();
//
//            System.out.println(client);
//            System.out.println(client.getAgroServices());
//            Body body=  client.getAgroServices().getAGRO_SERVICES().getBody();
//
////            System.out.println(body);
//
////            System.out.println(Arrays.toString(data2.toArray()));
////            for (String str1 : data2) {
//
//            System.out.println(client);
//
//            System.out.println(client.getAgroServices());
//            SendMessage response = new SendMessage();
//            response.setChatId(update.getMessage().getChatId().toString());
//            response.setText(String.valueOf(body));
//
//            try {
//                execute(response);
//            } catch (TelegramApiException E) {
//                E.printStackTrace();
//            }
//        }
//    }
//
}
