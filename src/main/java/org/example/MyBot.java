package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {


    private final MyBotService myBotService;

    public MyBot(MyBotService myBotService) {
        this.myBotService = myBotService;
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String username = update.getMessage().getFrom().getUserName();

            
            info(chatId, username, message);
            if (message.equals("/start")) {
                try {
                    execute(MyBotService.menu(chatId));

                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
          
            }
        }
        

    @Override
    public String getBotUsername() {
        return "LifeTrack Bot";
    }
    @Override
    public String getBotToken() {
        return "8347639042:AAFXcwdcWL3pTnCVBUNdWf2XBS9IBN_DXlM";
    }
    public void info(Long chatId, String username, String message) {
        System.out.println(chatId + " " + username + " " + message + " ");
    }
}

