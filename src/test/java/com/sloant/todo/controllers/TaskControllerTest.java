package com.sloant.todo.controllers;

import com.sloant.todo.domain.Task;
import com.sloant.todo.service.CRUDTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TaskControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    CRUDTaskService service;

    @Test
    public void addTaskShouldReturnTaskFromService() throws Exception {
        Task t = new Task("Test", "1");
        when(service.addTask(t)).thenReturn(t);
        this.mvc.perform(get("/addTask?name=Test&priority=1")).andDo(print()).andExpect(status().isOk());
                //.andExpect(content().string(containsString("Hello Mock")));
    }
}
