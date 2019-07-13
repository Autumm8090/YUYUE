package com.yus.taobaoui.utils;


import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;


/**
 * Created by zhouweilong on 2016/12/27.
 */

public class DataUtils {

    public static String data="{\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"goodscatrgory\": {\n" +
            "                \"goodsitem\": [\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 11号\",\n" +
            "                        \"price\": 329,\n" +
            "                        \"introduce\": \"新品潮流\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 13号\",\n" +
            "                        \"price\": 399,\n" +
            "                        \"introduce\": \"胜利的渴望\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 7号\",\n" +
            "                        \"price\": 299,\n" +
            "                        \"introduce\": \"这就是酷\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 1号\",\n" +
            "                        \"price\": 309,\n" +
            "                        \"introduce\": \"新轻奢主义\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 19号\",\n" +
            "                        \"price\": 350,\n" +
            "                        \"introduce\": \"新品韩潮\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 15号\",\n" +
            "                        \"price\": 199,\n" +
            "                        \"introduce\": \"比你想像的酷！\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 22号\",\n" +
            "                        \"price\": 289,\n" +
            "                        \"introduce\": \"最好的温暖都给他！\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"潮牌\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"goodscatrgory\": {\n" +
            "                \"goodsitem\": [\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 21号\",\n" +
            "                        \"price\": 379,\n" +
            "                        \"introduce\": \"伊夫圣罗兰的秘密\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 12号\",\n" +
            "                        \"price\": 329,\n" +
            "                        \"introduce\": \"我的包，我做主\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 17号\",\n" +
            "                        \"price\": 369,\n" +
            "                        \"introduce\": \"香奈儿，不一样的女人\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 85号\",\n" +
            "                        \"price\": 379,\n" +
            "                        \"introduce\": \"OMG！！！ 买它！！！\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 86号\",\n" +
            "                        \"price\": 339,\n" +
            "                        \"introduce\": \"纯情西班牙风\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"YSL 7号\",\n" +
            "                        \"price\": 359,\n" +
            "                        \"introduce\": \"意大利匠心工艺\",\n" +
            "                        \"goodsImgUrl\": \"https://gd1.alicdn.com/imgextra/i1/83804236/O1CN01h9FqFL1hA8EFmrRh7_!!83804236.jpg\",\n" +
            "                        \"moreStandard\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"美妆\"\n" +
            "            }\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    /**
     * 转成list
     *
     * @param gsonString
     * @param cls
     * @return
     */
    public static <T> List<T> GsonToList(String gsonString, Class<T[]> cls) {
        T[] arr = new Gson().fromJson(gsonString, cls);
        return Arrays.asList(arr); //or return Arrays.asList(new Gson().fromJson(s, clazz)); for a one-liner
    }
    /**
     * 转成bean
     *
     * @param gsonString
     * @param cls
     * @return
     */
    public static <T> T GsonToBean(String gsonString, Class<T> cls) {
        T t = new Gson().fromJson(gsonString, cls);
        return t;
    }

}
