package slogo.backend.node.command.turtlecommands;

import slogo.backend.Controller;
import slogo.backend.Turtle;

public class StampCommandTreeNode extends TurtleCommandTreeNode {
    public StampCommandTreeNode(Controller controller, String commandType, String word, Integer index) {
        super(controller, commandType, word, index);
        this.setInputSize(0);
    }

    @Override
    double doTurtleCommand() {
        Turtle stamp = new Turtle(getMyController().getTurtleX(),getMyController().getTurtleY());
        stamp.setDirection(getMyController().getTurtleDirection());
        getMyController().getStampsMap().put(getMyController().getActiveId(),stamp);
        return getMyController().getActiveId();
    }
}
