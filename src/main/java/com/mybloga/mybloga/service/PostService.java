package com.mybloga.mybloga.service;


import com.mybloga.mybloga.payload.PostDto;

public interface PostService  {

    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);
}
