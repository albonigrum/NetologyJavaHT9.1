package ru.netology.domain;

import java.util.Date;

public class Post {
    private long id;
    private long ownerId;
    private long fromId;
    private long createdBy;
    private Date publicationDate;
    private String text;
    private long replyOwnerId;
    private long replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private String copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private long countViews;
    private String postType;
    private PostSource postSource;
    private GeoTag geoTag;
    private long signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private long postponedId;
}
