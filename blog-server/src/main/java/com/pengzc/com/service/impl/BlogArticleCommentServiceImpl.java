package service.impl;

import entity.BlogArticleComment;
import mapper.BlogArticleCommentMapper;
import service.BlogArticleCommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
@Service
public class BlogArticleCommentServiceImpl extends ServiceImpl<BlogArticleCommentMapper, BlogArticleComment> implements BlogArticleCommentService {

}
