package com.harith.todolist;

import com.harith.todolist.datamodel.TodoItems;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItems> todoItem;

    @FXML
    private ListView todolistView;

    public void initialize(){
        TodoItems item1 = new TodoItems("Mail a card","buy a 30th birthday card for john",
                LocalDate.of(2020, Month.AUGUST,25));
        TodoItems item2 = new TodoItems("Buy something","buy something for you ",
                LocalDate.of(2020, Month.AUGUST,25));
        TodoItems item3 = new TodoItems("go to this address","and party",
                LocalDate.of(2020, Month.AUGUST,25));
        TodoItems item4 = new TodoItems("Bleh bleh bleh","I don't say bleh bleh bleh",
                LocalDate.of(2020, Month.AUGUST,25));
        TodoItems item5 = new TodoItems("enough?","yeah maybe",
                LocalDate.of(2020, Month.AUGUST,25));

        todoItem = new ArrayList<TodoItems>();
        todoItem.add(item1);
        todoItem.add(item2);
        todoItem.add(item3);
        todoItem.add(item4);
        todoItem.add(item5);

        todolistView.getItems().setAll(todoItem);
        todolistView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
}
