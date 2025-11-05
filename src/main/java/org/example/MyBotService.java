package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {
    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("choose another one of this manu");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Order");
        row1.add(button1);
        rowList.add(row1);
        return  sendMessage;
    }
}
