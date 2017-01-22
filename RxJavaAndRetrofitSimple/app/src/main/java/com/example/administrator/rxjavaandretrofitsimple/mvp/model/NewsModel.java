package com.example.administrator.rxjavaandretrofitsimple.mvp.model;

import com.example.administrator.rxjavaandretrofitsimple.bean.NewsEntity;
import com.example.administrator.rxjavaandretrofitsimple.mvp.model.base.BaseModel;

import rx.Observable;

/**
 * 作者：quzongyang
 *
 * 创建时间：2017/1/18
 *
 * 类描述：
 */

public class NewsModel extends BaseModel{

    /**
     * 获取新闻
     *
     * @param type
     * @return
     */
    public Observable<NewsEntity> getNews(String type) {
        //Map<String, String> params = NetParams.getInstance().WaitGrabSearch(user_id,position_x, position_y,OrderIDList);
        return getClientService().getNews();
    }
}