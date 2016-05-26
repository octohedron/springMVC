package blog.controllers;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import blog.model.Post;
import blog.services.PostService;
/**
 * Created on 5/25/16.
 */
@Controller
@RequestMapping("post")
public class PostController {
  @Autowired
  PostService postService;

  @ResponseBody
  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = RequestMethod.GET)
  public String getPost(){
    Post post = postService.getPost();
    return post.toString();
  }
}
