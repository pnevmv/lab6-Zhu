package commands.commands;

import collection.helpers.StorageService;
import commands.CommandsManager;
import utils.UserInterface;

import java.io.IOException;
import java.util.ArrayList;


public class Info extends AbstractCommand{

    public Info(){
        command = "info";
        helpText = "Выводит в стандартный потор информацию о коллекции.";
    }

    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        if (argumentsCount == args.length) {
            CommandsManager.getInstance().printToClient(ss.info());
            return null;
        }
        //logger.warn("Команда не принимает аргументы");
        CommandsManager.getInstance().printToClient("Команда не принимает агрументы!");
        return null;
    }
}
