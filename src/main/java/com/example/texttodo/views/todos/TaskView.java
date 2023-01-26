package com.example.texttodo.views.todos;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class TaskView extends VerticalLayout {
    // reminder could be a potential new object class contained within
    private Checkbox checkbox;
    Button remind = new Button("Remind");
    public TaskView(String text) {
        checkbox = new Checkbox(text);
        //this.setAlignItems(Alignment.BASELINE);
        this.setSpacing(false);
        add(checkbox,
            remind);

    }
}
