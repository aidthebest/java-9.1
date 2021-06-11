package ru.netology.manager;

import ru.netology.domain.VKpagePost;

public class PostManager {
    private VKpagePost posts;

    public VKpagePost getPosts() {
        return posts;
    }
    public int deliteWall (int ownerId,  int positiveId) {
        return 0;
    }

    public String searchWall (int ownerId, String domain, String query, boolean ownersOnly,
                              short count, short offset) {
        return null;
    }
}
