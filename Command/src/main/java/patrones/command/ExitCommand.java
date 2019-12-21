package patrones.command;

import java.io.OutputStream;

/**
 */
public class ExitCommand extends AbstractCommand{

    public static final String COMMAND_NAME = "exit";
    
    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    public void exucute(String[] args, OutputStream out) {
        write(out, "Saliendo de la línea de comandos...");
        System.exit(0);
    }
    
}
