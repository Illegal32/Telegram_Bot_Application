package az.iktlab.telegram_bot_application;

import az.iktlab.telegram_bot_application.client.AgroServiceClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.annotation.PostConstruct;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class TelegramBotApplication {

    private final AgroServiceClient client;

    public TelegramBotApplication(AgroServiceClient client) {
        this.client = client;
    }

    public static void main(String[] args) {
        SpringApplication.run(TelegramBotApplication.class, args);

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Clever_Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @PostConstruct
    public void test() {
        System.out.println(client);
    }
}


