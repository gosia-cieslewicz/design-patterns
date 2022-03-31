package com.behavioral.command;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor editor;
    protected History history;

    public AbstractUndoableCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}

