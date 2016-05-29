package blog.services;
import org.apache.log4j.Logger;
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
  private static final Logger LOGGER = Logger.getLogger(PostService.class);
  @Autowired
  private PostRepository postRepository;
  @Transactional(readOnly = true)
  public Post getPost(){
    return postRepository.getPost();
  }
}
