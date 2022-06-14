package commands.commands;

import collection.helpers.StorageService;
import commands.CommandsManager;
import utils.UserInterface;

import java.io.IOException;
import java.util.ArrayList;


public class CountLessThanLocation extends AbstractCommand {

    public CountLessThanLocation(){
        command = "count_less_than_location";
        helpText = "Вывести количество элементов, значение поля location которых меньше заданного.";
        argumentsCount = 1;
    }

    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        if (argumentsCount == args.length) {
            double V;
            try {
                V = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                CommandsManager.getInstance().printToClient("Неправильный формат аргумента");
                return null;
            }
            CommandsManager.getInstance().printToClient(ss.CountLessThanLocation(V));
            return null;
        }
        //logger.warn("Команда не были переданы аргументы");
        CommandsManager.getInstance().printToClient("Команде не был указан агрумент или был неправильного формата!");
        return null;
    }
}
