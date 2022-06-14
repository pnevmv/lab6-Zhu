package commands.commands;

import commands.CommandsManager;
import utils.UserInterface;
import collection.helpers.StorageService;

import java.io.IOException;
import java.util.ArrayList;


public class PrintAscending extends AbstractCommand {

    public PrintAscending(){
        command = "print_ascending";
        helpText = "Вывести элементы коллекции в порядке возрастания.";
    }

    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        if (argumentsCount == args.length) {
            CommandsManager.getInstance().printToClient(ss.display());
            return null;
        }
        //logger.warn("Команда не принимает аргументы");
        CommandsManager.getInstance().printToClient("Команда не принимает агрументы!");
        return null;
    }
}
