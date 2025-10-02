package org.java_playground.lld.structural_patterns.decorator_pattern.decorators;

import org.java_playground.lld.structural_patterns.decorator_pattern.components.TextView;

public abstract class BaseDecorator extends TextView {
    private final TextView component;

    public BaseDecorator(TextView component) {
        super(component.getText());
        this.component = component;
    }

    public TextView getComponent() {
        return this.component;
    }
}
