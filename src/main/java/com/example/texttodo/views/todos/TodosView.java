package com.example.texttodo.views.todos;

import com.example.texttodo.data.entity.Task;
import com.example.texttodo.data.service.TaskService;
import com.example.texttodo.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("To-do's")
@Route(value = "todo", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class TodosView extends VerticalLayout {

    private final TaskService taskService;
   // private Task task;

    public TodosView(TaskService taskService) {
        this.taskService= taskService;
        VerticalLayout todosList = new VerticalLayout();
        todosList.setSpacing(false);
        TextArea textArea = new TextArea();
        textArea.setLabel("Comment");
        int charLimit = 140;
        textArea.setMaxLength(charLimit);
        textArea.setValueChangeMode(ValueChangeMode.EAGER);
        textArea.addValueChangeListener(e -> {
            e.getSource()
                    .setHelperText(e.getValue().length() + "/" + charLimit);
        });
        Button addButton = new Button("Add");

        addButton.addClickListener(click -> {
            TaskView taskView = new TaskView(textArea.getValue());
            Task task = new Task();
            task.setTodoString(textArea.getValue());
            taskService.update(task);
            todosList.add(taskView);
            textArea.clear();
        });

        addButton.addClickShortcut(Key.ENTER);


        HorizontalLayout inputArea = new HorizontalLayout(
                textArea,
                addButton
        );
        inputArea.setAlignItems(Alignment.BASELINE);
        add(
                inputArea,
                todosList

        );
    }

}
