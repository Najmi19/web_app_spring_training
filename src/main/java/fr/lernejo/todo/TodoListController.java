package fr.lernejo.todo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class TodoListController {
   TodoRepository repo;

    public TodoListController(TodoRepository repo) {
        this.repo = repo;
    }

    @PostMapping("api/todo")
    public TodoEntity add(@RequestBody TodoEntity repos) {
       return repo.save(repos);
    }

    @GetMapping("api/todo")
    public Iterable<TodoEntity> getlist(){

        return repo.findAll();
    }
}

