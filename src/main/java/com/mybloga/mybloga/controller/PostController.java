package com.mybloga.mybloga.controller;

import com.mybloga.mybloga.payload.PostDto;

import com.mybloga.mybloga.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectmybloga")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto){
        PostDto dto=postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<PostDto>getPostById(@RequestParam long id){
        PostDto dto= postService.getPostById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
