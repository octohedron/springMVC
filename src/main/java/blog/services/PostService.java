package blog.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;

import blog.model.Post;
import blog.repos.PostRepository;
/**
 * Created on 5/25/16.
 */
@Service
public class PostService {
  @Autowired
  private PostRepository postRepository;
  @Transactional(readOnly = true)
  public Post getPost(){
    return postRepository.getPost();
  }
}
