package org.java_playground.lld.structural_patterns.decorator_pattern;

import org.java_playground.lld.structural_patterns.decorator_pattern.components.HTMLTextView;
import org.java_playground.lld.structural_patterns.decorator_pattern.components.MarkdownTextView;
import org.java_playground.lld.structural_patterns.decorator_pattern.components.TextView;
import org.java_playground.lld.structural_patterns.decorator_pattern.decorators.HTMLBoldDecorator;
import org.java_playground.lld.structural_patterns.decorator_pattern.decorators.HTMLItalicDecorator;
import org.java_playground.lld.structural_patterns.decorator_pattern.decorators.MarkdownBoldDecorator;
import org.java_playground.lld.structural_patterns.decorator_pattern.decorators.MarkdownItalicDecorator;

public class Application {
    public static void main(String[] args) {
        // Creating an HTML text view and decorating it
        TextView htmlText = new HTMLTextView("This is a sample HTML text");
        htmlText = new HTMLBoldDecorator(htmlText);
        htmlText = new HTMLItalicDecorator(htmlText);

        htmlText.render();

        // Creating a Markdown text view and decorating it
        TextView markdownText = new MarkdownTextView("This is a sample markdown text");
        markdownText = new MarkdownItalicDecorator(markdownText);
        markdownText = new MarkdownBoldDecorator(markdownText);

        markdownText.render();
    }
}
