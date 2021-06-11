package ru.netology.domain;

public class VKpagePost {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int signerId;
    private int postDate;
    private int likes;
    private int wiews;
    private int share;
    private int postPonedId;


    private String postBody;
    private String imageUrl;
    private String postType;
    private String postName;


    private boolean friendsOnly;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean ismarkedAsAds;
    private boolean isFavorite;


    private Comment comments;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;


    //   + get/set на все поля

}
