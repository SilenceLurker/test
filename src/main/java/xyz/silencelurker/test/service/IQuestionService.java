package xyz.silencelurker.test.service;

import xyz.silencelurker.test.entity.Question;

/**
 * @author Silence_Lurker
 */
public interface IQuestionService {

    /**
     * 添加新的题目
     * 
     * @param question
     */
    void addNewQuestion(Question question);

    /**
     * 通过id删除题目
     * 
     * @param id 题目id
     */
    void deleteQuestionById(String id);

    /**
     * 从数据库中获取一个id
     * 
     * @param id
     * @return
     */
    Question getQuestionById(String id);

    /**
     * 按类型随机获取一个问题
     * 
     * @param type
     * @return
     */
    Question getRandomQuestionByType(String type);
}
