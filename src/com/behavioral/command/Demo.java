package com.behavioral.command;

public class Demo {
    public static void demo(String[] args) {
        var editor = new VideoEditor();
        var history = new History();
        var textCommand = new SetTextCommand("New Text", editor, history);
        textCommand.execute();

        var contrastCommand = new SetContrastCommand(10, editor, history);
        contrastCommand.execute();
        contrastCommand.undo();

        System.out.println(editor);
    }
}
