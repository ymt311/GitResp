package cmdorder;

abstract class Command {
    protected Device device;

    public abstract void execute();
}
