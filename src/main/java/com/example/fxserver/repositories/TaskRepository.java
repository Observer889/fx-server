package com.example.fxserver.repositories;

import com.example.fxserver.entity.Task;
import org.springframework.data.repository.CrudRepository;

// наследуем чтобы были доступны действия с записями
// указываем тип с чем будет работать репозиторий и тип ключа
public interface TaskRepository extends CrudRepository<Task, Integer> {



}
