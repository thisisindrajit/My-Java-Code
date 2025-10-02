package org.java_playground.lld.structural_patterns.decorator_pattern.decorators;

import org.java_playground.lld.structural_patterns.decorator_pattern.components.TextView;

public class HTMLItalicDecorator extends BaseDecorator {
    public HTMLItalicDecorator(TextView component) {
        super(component);
    }

    @Override
    public String formatText() {
        return "<span style=\"font-style:italic\">" + this.getComponent().formatText() + "</span>";
    }
}
