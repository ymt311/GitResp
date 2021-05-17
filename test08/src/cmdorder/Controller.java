package cmdorder;

public class Controller {
    private Command lightsOpenCommand, lightsCloseCommand, blowerOpenCommand, blowerCloseCommand, airOpenCommand,
            airCloseCommand, multiOpenCommand, multiCloseCommand;
    public Controller(Command lightsOpenCommand, Command lightsCloseCommand, Command blowerOpenCommand,
                      Command blowerCloseCommand, Command airOpenCommand, Command airCloseCommand, Command multiOpenCommand,
                      Command multiCloseCommand) {
        this.lightsOpenCommand = lightsOpenCommand;
        this.lightsCloseCommand = lightsCloseCommand;
        this.blowerOpenCommand = blowerOpenCommand;
        this.blowerCloseCommand = blowerCloseCommand;
        this.airCloseCommand = airCloseCommand;
        this.airOpenCommand = airOpenCommand;
        this.multiCloseCommand = multiCloseCommand;
        this.multiOpenCommand = multiOpenCommand;
        }

        public void openAllLights() {
            lightsOpenCommand.execute();
        }

        public void closeAllLights() {
            lightsCloseCommand.execute();
        }

        public void openBlower() {
            blowerOpenCommand.execute();
        }

        public void closeBlower() {
            blowerCloseCommand.execute();
        }

        public void openAirCleaner() {
            airOpenCommand.execute();
        }

        public void closeAirCleaner() {
            airCloseCommand.execute();
        }

        public void openMulti() {
            multiOpenCommand.execute();
        }

        public void closeMulti() {
            multiCloseCommand.execute();
        }
    }

