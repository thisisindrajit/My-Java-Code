package org.java_playground.lld.structural_patterns.decorator_pattern.components;

public class MarkdownTextView extends TextView {
    public MarkdownTextView(String text) {
        super(text);
    }

    @Override
    public String formatText() {
        return this.getText(); // No formatting needed for markdown
    }
}
