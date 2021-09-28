package com.yxy.notebookspringmvc.service;

import com.yxy.notebookspringmvc.mapper.NoteMapper;
import com.yxy.notebookspringmvc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteMapper noteMapper;

    public List<Note> getNoteList() {
        return noteMapper.listNote();
    }
}
