package dev.pranay.socialmedia2.repo;

import dev.pranay.socialmedia2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, String> {
    List<Comment> findByPostId(int postId);
}
