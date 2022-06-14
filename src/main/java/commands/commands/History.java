package commands.commands;

import collection.helpers.StorageService;
import commands.CommandsManager;
import utils.UserInterface;

import java.io.IOException;
import java.util.ArrayList;

public class History extends AbstractCommand{

    public History(){
        command = "history";
        helpText = "Вывести последние 15 команд (без аргументов).";
    }
    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        if (argumentsCount == args.length) {
            CommandsManager.cmdList();
            return null;
        }
        //logger.warn("Команда не принимает аргументы");
        CommandsManager.getInstance().printToClient("Команда не принимает агрументы!");
        return null;
    }
}
