package commands.commands;

import collection.helpers.StorageService;
import commands.CommandsManager;
import utils.UserInterface;

import java.io.IOException;
import java.util.ArrayList;


public class Clear extends AbstractCommand {

    public Clear(){
        command =  "clear";
        helpText = "Очистить коллекцию.";
    }

    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        if (argumentsCount == args.length) {
            int count = ss.size();
            ss.clear();
            CommandsManager.getInstance().printToClient("Коллекция успешно очищенна! Элементов удалено " + count);
            return null;
        }
        //logger.warn("Команда не принимает аргументы");
        CommandsManager.getInstance().printToClient("Команда не принимает агрументы!");
        return null;
    }
}
