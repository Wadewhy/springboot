package com.zzh.springbootbanner.util;

/**
 * @PACKAGE_NAME: com.zzh.springbootbanner.util
 * @NAME: GeneratorTextImage
 * @Author: 钟子豪
 * @DATE: 2019/12/25
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 25
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: springboot
 **/

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

/**
 * 根据图片生产字符图案
 * 1.图片片大小缩放
 * 2.便利图片像素点
 * 3.获取图片像素点亮度
 * 4.匹配字符
 * 5.输出图案
 */
public class GeneratorTextImage {
    private static final char[] PIXEL = {'@', '#', '8', '&', 'o', ':', '*', '.', ' '};

    public static void main(String[] args) throws Exception {
        // 图片缩放
        BufferedImage bufferedImage = makeSmallImage("F:\\MyIdeaProgram\\SpringBoot\\springboot\\springboot-banner\\src\\main\\resources/banner.jpg");
        // 输出
        printImage(bufferedImage);
    }

    static void printImage(BufferedImage image) throws Exception {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int rgb = image.getRGB(j, i);
                Color color = new Color(rgb);
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                // 一个用于计算RGB像素点亮度的公式
                Double luminace = 0.2126 * red + 0.7152 * green + 0.0722 * blue;
                double index = luminace / (Math.ceil(255 / PIXEL.length) + 0.5);
                System.out.print(PIXEL[(int) (Math.floor(index))]);
            }
            System.out.println();
        }
    }

    static BufferedImage makeSmallImage(String srcImageName) throws Exception {
        File srcImageFile = new File(srcImageName);
        if (srcImageFile == null) {
            System.out.println("文件不存在");
            return null;
        }
        FileOutputStream fileOutputStream = null;
        BufferedImage tagImage = null;
        Image srcImage = null;
        try {
            srcImage = ImageIO.read(srcImageFile);
            int srcWidth = srcImage.getWidth(null);// 原图片宽度
            int srcHeight = srcImage.getHeight(null);// 原图片高度
            int dstMaxSize = 90;// 目标缩略图的最大宽度/高度，宽度与高度将按比例缩写
            int dstWidth = srcWidth;// 缩略图宽度
            int dstHeight = srcHeight;// 缩略图高度
            float scale = 0;
            // 计算缩略图的宽和高
            if (srcWidth > dstMaxSize) {
                dstWidth = dstMaxSize;
                scale = (float) srcWidth / (float) dstMaxSize;
                dstHeight = Math.round((float) srcHeight / scale);
            }
            srcHeight = dstHeight;
            if (srcHeight > dstMaxSize) {
                dstHeight = dstMaxSize;
                scale = (float) srcHeight / (float) dstMaxSize;
                dstWidth = Math.round((float) dstWidth / scale);
            }
            // 生成缩略图
            tagImage = new BufferedImage(dstWidth, dstHeight, BufferedImage.TYPE_INT_RGB);
            tagImage.getGraphics().drawImage(srcImage, 0, 0, dstWidth, dstHeight, null);
            return tagImage;
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                }
                fileOutputStream = null;
            }
            tagImage = null;
            srcImage = null;
            System.gc();
        }
    }
}

