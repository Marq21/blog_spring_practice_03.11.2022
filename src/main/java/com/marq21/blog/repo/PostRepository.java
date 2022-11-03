package com.marq21.blog.repo;

import com.marq21.blog.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {}
