package slogo.backend.node;

import slogo.backend.Controller;
import slogo.backend.UserCommand;
import slogo.backend.node.command.CommandTreeNode;

public class PlaceHolderUserCommandTreeNode extends CommandTreeNode {
    private Controller myController;
    private int inputSize;
    private String myUserCommandName;
    private UserCommand userCommand;

    public PlaceHolderUserCommandTreeNode(Controller controller, String word, String myCommandName, Integer index) {
        super(controller, word, word, index);
        this.myController = controller;
        this.myUserCommandName = myCommandName;
//        this.inputSize = myCommand.getVariables().size();
//        System.out.println("\n\n\n Numeber of inputs: " +this.inputSize+"\n\n\n\n\n");
    }

    @Override
    public void doAction() {
        this.setReturnValue(executeUserCommand());
    }

    public int getInputSize() {
        return inputSize;
    }

    private double executeUserCommand() {
//        System.out.println("Size of variable list: " + myUserCommand.getVariables().size());
//        System.out.println("Number of Children: " + getChildren().size());
        if (userCommand == null){
            this.myController.getCommand(this.myUserCommandName).getVariables();
        }
        for (int i = 0; i <userCommand.getVariables().size(); i++) {
            myController.setVariable(userCommand.getVariables().get(i), getChildren().get(i).getReturnValue());
        }
        userCommand.executeCommandTree();
        return 0;
    }
}
