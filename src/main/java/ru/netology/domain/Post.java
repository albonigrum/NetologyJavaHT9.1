package ru.netology.domain;

import java.util.Date;

public class Post {
    private long id;
    private User author;
    private Date publicationDate;
    private String text;
    private Attachment[] attachments;
    private Comment[] comments;
    private Like[] likes;
    private Repost[] reposts;
    private long countViews;
    private String copyright;
    private GeoTag geoTag;
    private boolean isPinned;
    private boolean markedAsAds;
}
