package org.java_playground.lld.structural_patterns.decorator_pattern.decorators;

import org.java_playground.lld.structural_patterns.decorator_pattern.components.TextView;

public class HTMLBoldDecorator extends BaseDecorator {
    public HTMLBoldDecorator(TextView component) {
        super(component);
    }

    @Override
    public String formatText() {
        return "<bold>" + this.getComponent().formatText() + "</bold>";
    }
}
