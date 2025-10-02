package org.java_playground.lld.structural_patterns.decorator_pattern.decorators;

import org.java_playground.lld.structural_patterns.decorator_pattern.components.TextView;

public class MarkdownItalicDecorator extends BaseDecorator {
    public MarkdownItalicDecorator(TextView component) {
        super(component);
    }

    @Override
    public String formatText() {
        return "_" + this.getComponent().formatText() + "_";
    }
}
