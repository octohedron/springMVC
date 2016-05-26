package blog.repos;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import blog.model.Post;
/**
 * Created on 5/25/16.
 */
@Repository
public class PostRepository {
  @PersistenceContext
  private EntityManager em;
  public Post getPost() {
    List<Post> posts = em.createNamedQuery(Post.GET_ALL).getResultList();
    return posts.size() == 1 ? posts.get(0) : null;
  }
}
