package org.java_playground.lld.structural_patterns.decorator_pattern.decorators;

import org.java_playground.lld.structural_patterns.decorator_pattern.components.TextView;

public class MarkdownBoldDecorator extends BaseDecorator {
    public MarkdownBoldDecorator(TextView component) {
        super(component);
    }

    @Override
    public String formatText() {
        return "**" + this.getComponent().formatText() + "**";
    }
}
