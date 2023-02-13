package com.example.path.Entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "qdata")
public class User {


    @PrimaryKey(autoGenerate = true)
    public int Id;
    @ColumnInfo(name = "Question")
    public String Question;
    @ColumnInfo(name = "Card_1")

    public String Card_1;
    @ColumnInfo(name = "Card_2")
    public String Card_2;
    @ColumnInfo(name = "Card_3")
    public String Card_3;
    @ColumnInfo(name = "Card_4")
    public String Card_4;
    @ColumnInfo(name = "Card_5")
    public String Card_5;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getCard_1() {
        return Card_1;
    }

    public void setCard_1(String card_1) {
        Card_1 = card_1;
    }

    public String getCard_2() {
        return Card_2;
    }

    public void setCard_2(String card_2) {
        Card_2 = card_2;
    }

    public String getCard_3() {
        return Card_3;
    }

    public void setCard_3(String card_3) {
        Card_3 = card_3;
    }

    public String getCard_4() {
        return Card_4;
    }

    public void setCard_4(String card_4) {
        Card_4 = card_4;
    }

    public String getCard_5() {
        return Card_5;
    }

    public void setCard_5(String card_5) {
        Card_5 = card_5;
    }
}