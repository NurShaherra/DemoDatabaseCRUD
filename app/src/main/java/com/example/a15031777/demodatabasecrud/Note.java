package com.example.a15031777.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15031777 on 18/5/2017.
 */

public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String notecontent) {
        this.id = id;
        this.noteContent = notecontent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }


    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    //pass the id inside listview - to display
    @Override
    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }

}
