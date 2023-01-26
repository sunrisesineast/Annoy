package com.example.texttodo.views.todos;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

public class TodoForm extends FormLayout {

    TextField firstName = new TextField("First name");

    TextField phone = new TextField("Phone number") ;

    TextArea  textArea = new TextArea("Reminder");

    Button send = new Button("Send");
    Button cancel = new Button("Cancel");
    public TodoForm() {

        add(firstName,
            phone,
            textArea,
            createButtonsLayout()
        );

    }

    private Component createButtonsLayout() {
        send.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        return new HorizontalLayout(send,cancel);
    }
}
