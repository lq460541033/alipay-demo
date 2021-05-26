package com.haust.alipaydemoserver.config;

import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by 钟述林 393156105@qq.com on 2016/10/28 23:57.
 */
public class TemplateFileUtil {

    public static FileInputStream getTemplates(String tempName) throws FileNotFoundException {

        return new FileInputStream(ResourceUtils.getFile("classpath:"+tempName));
    }

    public static InputStream getTemplates2(String tempName)  {
        //  解决打包后读取不到模板的问题
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("alipay/"+tempName);
        return inputStream;
    }

    public static InputStream getTemplates3(String tempName) throws FileNotFoundException {
        //  解决打包后读取不到模板的问题

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(tempName);
        return inputStream;
    }

    /**
     * @Description:  获取文件的绝对路径
     * @param :
     * @author : lq
     * @date Date : 2021/5/26 17:23
     */
    public static String getFilePath(String tempName)  {
        //  解决打包后读取不到模板的问题
        String path = Thread.currentThread().getContextClassLoader().getResource("alipay/" + tempName).getPath();
        return path;
    }

}
