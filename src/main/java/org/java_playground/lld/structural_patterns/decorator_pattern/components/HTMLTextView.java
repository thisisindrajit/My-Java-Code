package org.java_playground.lld.structural_patterns.decorator_pattern.components;

public class HTMLTextView extends TextView {
    public HTMLTextView(String text) {
        super(text);
    }

    @Override
    public String formatText() {
        return "<p>" + this.getText() + "</p>"; // Minor HTML formatting
    }
}