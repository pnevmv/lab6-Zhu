package commands.commands;

import collection.helpers.StorageService;
import utils.UserInterface;

import java.io.IOException;
import java.util.ArrayList;


public class Exit extends AbstractCommand {

    public Exit(){
        command = "exit";
        helpText = "Завершение работы программы без сохранения";
    }

    @Override
    public ArrayList<String> execute(UserInterface userInterface, StorageService ss, String[] args) throws IOException {
        System.exit(-1);
        return null;
    }
}
