package org.java_playground.lld.structural_patterns.decorator_pattern.components;

public abstract class TextView {
    protected final String text;

    protected TextView(String text) {
        this.text = text;
    }

    public abstract String formatText();

    public String getText() {
        return this.text;
    }

    public void render() {
        System.out.println("Rendering formatted text: " + this.formatText());
    }
}
