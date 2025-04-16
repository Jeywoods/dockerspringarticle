package org.example.springarticle.repository;

import org.example.springarticle.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
