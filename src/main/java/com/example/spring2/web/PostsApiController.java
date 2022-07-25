package com.example.spring2.web;

import com.example.spring2.service.PostsService;
import com.example.spring2.web.dto.PostsResponseDto;
import com.example.spring2.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts/{id}")
    public Long save(@PathVariable Long id,@RequestBody PostsSaveRequestDto requestDto){
        return postsService.update(id,requestDto);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findId(@PathVariable Long id){
        return postsService.findById(id);
    }

}
