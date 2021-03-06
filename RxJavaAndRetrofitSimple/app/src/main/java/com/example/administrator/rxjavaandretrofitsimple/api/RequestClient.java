package com.example.administrator.rxjavaandretrofitsimple.api;

import com.example.administrator.rxjavaandretrofitsimple.bean.JokeResponse;
import com.example.administrator.rxjavaandretrofitsimple.bean.NewsResponse;
import com.example.administrator.rxjavaandretrofitsimple.util.rx.RxTransformer;

import java.util.Map;

import rx.Observable;

/**
 * 作者：quzongyang
 *
 * 创建时间：2017/3/20
 *
 * 类描述：请求接口类 功能与APIService一样
 */

public class RequestClient {

    /*public static Observable<JokeResponse> getJokeInfo(JokeParams params) {
        return ApiManager.getDefault(HostType.JUHE_DATE_NET_INTERFACEJOKE).getJokeInfo(params)
                .compose(RxTransformer.<JokeResponse>ioToUI());
    }*/

    /**
     * 获取笑话信息接口
     * @param params
     * @return
     */
    public static Observable<JokeResponse> getJokeInfo(Map<String, String> params) {
        return ApiManager.getDefault(HostType.JUHE_DATE_NET_INTERFACEJOKE).getJokeInfo(params)
                .compose(RxTransformer.<JokeResponse>ioToUI());
    }

    public static Observable<NewsResponse> getNews(String cacheControl) {
        return ApiManager.getDefault(HostType.JUHE_DATE_NET_INTERFACE).getNews(cacheControl)
                .compose(RxTransformer.<NewsResponse>ioToUI());
    }

    /**
     * 获取新闻分类信息
     * @param requestType
     * @param cacheControl
     * @return
     */
    public static Observable<NewsResponse> getNewsClassify(String requestType, String cacheControl) {
        return ApiManager.getDefault(HostType.JUHE_DATE_NET_INTERFACE).getNewsClassify(requestType,cacheControl)
                .compose(RxTransformer.<NewsResponse>ioToUI());
    }



}
