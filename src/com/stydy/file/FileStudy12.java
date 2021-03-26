package com.stydy.file;

import java.io.File;
import java.io.FileFilter;

/**
 * 筛选隐藏文件
 * @author fengfasong
 * @date 2020/10/9
 */
public class FileStudy12 {

    public static void main(String[] args) {
        //筛选目录下的隐藏文件
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
        //java8的方法
        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
    }

}
