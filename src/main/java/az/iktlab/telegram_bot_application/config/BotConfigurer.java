package az.iktlab.telegram_bot_application.config;

import az.iktlab.telegram_bot_application.Clever_Bot;
import az.iktlab.telegram_bot_application.client.AgroServiceClient;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class BotConfigurer {

    private final AgroServiceClient client;


    public BotConfigurer(AgroServiceClient client) {
        this.client = client;
    }

    @Bean
    public TelegramBotsApi telegramBot() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new Clever_Bot(client));

        return telegramBotsApi;
    }
}
