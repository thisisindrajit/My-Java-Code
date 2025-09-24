package org.java_playground.lld.creational_patterns.abstract_factory_pattern.products;

public class WindowsCheckbox implements Checkbox {
    private boolean checked;

    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows checkbox clicked.");
        checked = !checked; // Toggle the checked state
    }

    @Override
    public boolean isChecked() {
        return checked;
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
