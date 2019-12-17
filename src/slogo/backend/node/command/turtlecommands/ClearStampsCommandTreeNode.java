package slogo.backend.node.command.turtlecommands;

import slogo.backend.Controller;

public class ClearStampsCommandTreeNode extends TurtleCommandTreeNode {
    public ClearStampsCommandTreeNode(Controller controller, String commandType, String word, Integer index) {
        super(controller, commandType, word, index);
        this.setInputSize(0);
    }

    @Override
    double doTurtleCommand() {
        if (getMyController().getStampsMap().size() == 0) {
            return 0;
        }
        getMyController().getStampsMap().clear();
        return 1;
    }
}
