package ru.netology.domain;

public class Comment {
    long id;
    User author;
    String text;
    Like[] likes;
    Comment[] comments;
}
