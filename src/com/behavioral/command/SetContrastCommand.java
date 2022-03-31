package com.behavioral.command;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float prevContrast;
    private float contrast;

    public SetContrastCommand(float contrast, VideoEditor editor, History history){
        super(editor, history);
        this.contrast = contrast;
        prevContrast = editor.getContrast();
    }

    @Override
    protected void doExecute() {
        editor.setContrast(contrast);
    }

    @Override
    public void undo() {
        editor.setContrast(prevContrast);
    }
}
