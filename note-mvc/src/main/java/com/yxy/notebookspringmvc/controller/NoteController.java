package com.yxy.notebookspringmvc.controller;


import com.yxy.notebookspringmvc.model.Note;
import com.yxy.notebookspringmvc.service.NoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class NoteController {

    @Resource
    private NoteService noteService;

    @RequestMapping(value = "note/list", produces = "application/json; charset=utf-8")
    public String noteList(){
        System.out.println(noteService.getNoteList().toString());
        return noteService.getNoteList().toString();
    }
}
