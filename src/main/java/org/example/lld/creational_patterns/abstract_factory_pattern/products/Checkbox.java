package org.example.lld.creational_patterns.abstract_factory_pattern.products;

public interface Checkbox {
    void render();
    void onClick();
    boolean isChecked();
    void setChecked(boolean checked);
}
