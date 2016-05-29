package blog.controllers;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import blog.model.Post;
import blog.services.PostService;
/**
 * Created on 5/25/16.
 */
@RestController
@RequestMapping("post")
public class PostController {
  Logger LOGGER = Logger.getLogger(PostController.class);
  @Autowired
  PostService postService;
  @ResponseBody
  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = RequestMethod.GET)
  public String getPost() {
    Post post = postService.getPost();
    return "post";
  }
}
