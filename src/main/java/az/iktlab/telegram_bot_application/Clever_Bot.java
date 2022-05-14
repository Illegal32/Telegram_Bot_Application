package az.iktlab.telegram_bot_application;

import az.iktlab.telegram_bot_application.client.AgroServiceClient;
import az.iktlab.telegram_bot_application.dao.model.Body;
import az.iktlab.telegram_bot_application.dao.model.CodeBeautify;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class Clever_Bot extends TelegramLongPollingBot {

   private final AgroServiceClient client;

    public Clever_Bot(AgroServiceClient client) {
        this.client = client;
    }


    @Override
    public void onUpdateReceived(Update update) {

        System.out.println("----------");
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();

        update.getMessage().getChatId();

        if (command.equals("/start")) {

            String[] data1 = {"Kənd Təsərüfatı Telegram Botuna Xoş Gəlmisiz!",
                    "Salam, mən Lava, Ağıllı Bot. Proses müddətində sizin yardımcınız olacağam.",
                    "Zəhmət olmasa qeyd olunan komandalardan istifadə edin!"};

            for (String str1 : data1) {
                SendMessage response = new SendMessage();
                response.setChatId(update.getMessage().getChatId().toString());
                response.setText(str1);

                try {
                    execute(response);
                } catch (TelegramApiException E) {
                    E.printStackTrace();
                }
            }
        }
        if (command.equals("/list")) {

            CodeBeautify result = client.getAgroServices();

            StringBuilder builder = new StringBuilder();
            result.getAGRO_SERVICES().getBody().getAGRO_SERVICE().forEach(builder::append);


            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(builder.toString());

            try {
                execute(response);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }
        }
    }


    @Override
    public String getBotUsername() {
        // TODO
        return "CS12123CleverBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5328736305:AAG5jxVjnxcG5Ws-RNbzkbwjRZLve3NI06w";
    }

}
