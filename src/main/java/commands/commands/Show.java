package commands.commands;

import commands.CommandsManager;
import utils.UserInterface;
import collection.helpers.StorageService;

import java.io.IOException;
import java.util.ArrayList;


public class Show extends AbstractCommand{

    public Show(){
        command = "show";
        helpText = "Вывести в стандартный поток вывода все элементы коллекции в строковом представлении.";
    }

    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        if (argumentsCount == args.length) {
            CommandsManager.getInstance().printToClient(ss.show());
            return null;
        }
        //logger.warn("Команда не принимает аргументы");
        CommandsManager.getInstance().printToClient("Команда не принимает агрументы!");
        return null;
    }
}
