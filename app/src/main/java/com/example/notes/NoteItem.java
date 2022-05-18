package com.example.notes;

public class NoteItem {

    String title;
    String txt;
    String date;

    public NoteItem(String title, String txt, String date) {
        this.title = title;
        this.txt = txt;
        this.date = date;
    }

    public NoteItem(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
