package org.example.lld.creational_patterns.abstract_factory_pattern.products;

public class HTMLCheckbox implements Checkbox {
    private boolean checked;

    @Override
    public void render() {
        System.out.println("Rendering a HTML checkbox.");
    }

    @Override
    public void onClick() {
        System.out.println("HTML checkbox clicked.");
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
