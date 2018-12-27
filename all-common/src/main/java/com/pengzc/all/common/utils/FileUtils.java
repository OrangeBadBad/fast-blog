package com.pengzc.all.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.*;


/**
 * FileUtils
 *
 * @author pengzc
 * @create 2018-12-19 11:18
 * @desc 文件工具类
 **/
public class FileUtils {

    private final static Logger logger = LoggerFactory
            .getLogger(FileUtils.class);


    /**
     * 文件copy方法
     *
     * @param src
     * @param dest
     */
    public static void copy(InputStream src, OutputStream dest) {
        try {
            byte[] tmp = new byte[1024];
            int len = -1;
            while ((len = src.read(tmp)) != -1)
                dest.write(tmp, 0, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                src.close();
                dest.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 获取文 MultipartFile 文件后缀名工具
    public static String getSuffix(MultipartFile fileupload) {
        String originalFilename = fileupload.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        return suffix;
    }


    /**
     * 根据内容类型判断文件扩展名
     *
     * @param contentType 内容类型
     * @return
     */
    public static String getFileexpandedName(String contentType) {
        String fileEndWitsh = "";
        if ("image/jpeg".equals(contentType))
            fileEndWitsh = ".jpg";
        else if ("audio/mpeg".equals(contentType))
            fileEndWitsh = ".mp3";
        else if ("audio/amr".equals(contentType))
            fileEndWitsh = ".amr";
        else if ("video/mp4".equals(contentType))
            fileEndWitsh = ".mp4";
        else if ("video/mpeg4".equals(contentType))
            fileEndWitsh = ".mp4";
        return fileEndWitsh;
    }

    /**
     * 文件copy方法
     *
     * @param src
     * @param dest
     */
    public static void copyHtml(InputStream src, OutputStream dest) {
        try {
            byte[] beforeStr = transFromUTF8("<meta charset=\"UTF-8\">");
            dest.write(beforeStr, 0, beforeStr.length);
            byte[] tmp = new byte[1024];
            int len = -1;
            while ((len = src.read(tmp)) != -1)
                dest.write(tmp, 0, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                src.close();
                dest.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static byte[] transFromUTF8(String s) {
        byte[] b = new byte[s.length()];
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(Integer.toHexString((byte)s.charAt(i)& 0xFF).toUpperCase()+"   :16进制utf-8");
            b[i] = (byte) s.charAt(i);
        }
        return b;
    }

    /**
     * 给文件重命名 防止覆盖
     *
     * @param fileName
     * @return 时间戳+原始文件的后缀
     */
    public static String reName(String fileName) {
        return new StringBuffer().append(new Date().getTime()).append(fileName.substring(fileName.indexOf("."))).toString();
    }

    /**
     * 给文件路径
     *
     * @return 年/月日
     */
    public static String rePath() {
        Calendar now = Calendar.getInstance();
        StringBuffer rePath = new StringBuffer("");
        rePath.append(now.get(Calendar.YEAR)).append("/").append((now.get(Calendar.MONTH) + 1)).append("/").append(now.get(Calendar.DAY_OF_MONTH)).append("/");
        return rePath.toString();
    }

    /**
     * 文件保存
     *
     * @param fileName reName之后的文件名称
     * @param content
     * @param filePath 文件保存路径
     * @return
     * @throws IOException
     */
    public static String saveFile(String fileName, InputStream content, String filePath, String type) throws IOException {
        FileOutputStream fos = null;
        StringBuffer contentPath = new StringBuffer("");
        ; // 上下文地址
        try {
            Calendar now = Calendar.getInstance();
            contentPath.append(File.separator);
            contentPath.append(type);
            contentPath.append(File.separator);
            contentPath.append(now.get(Calendar.YEAR)).append(File.separator).append("0" + (now.get(Calendar.MONTH) + 1)).append("0" + now.get(Calendar.DAY_OF_MONTH));
            contentPath.append(File.separator);
            contentPath.append(fileName);
            String tPath = filePath + contentPath.toString();
            tPath = validFilePath(tPath);
            if ("".equals(tPath)) {
                throw new IllegalArgumentException();
            }
            File pictureFile = new File(tPath);
            File pf = pictureFile.getParentFile();
            if (!pf.exists()) {
                pf.mkdirs();
            }
            pictureFile.createNewFile();    // 创建文件
            fos = new FileOutputStream(pictureFile);
            FileUtils.copy(content, fos);
        } catch (Exception e) {
            throw new IOException("文件保存失败!");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    throw new IOException("文件保存失败!");
                }
            }
        }
        return contentPath.toString();
    }

    public static String validFilePath(String filepath) throws Exception {
        List<String> allowedExtensions = new ArrayList<String>();
        boolean result = false;
        allowedExtensions.add(".jpg");
        allowedExtensions.add(".png");
        allowedExtensions.add(".jpeg");
        allowedExtensions.add(".pdf");
        allowedExtensions.add(".doc");
        allowedExtensions.add(".docx");
        allowedExtensions.add(".xls");
        allowedExtensions.add(".xlsx");
        allowedExtensions.add(".ppt");
        allowedExtensions.add(".pptx");
        allowedExtensions.add(".gif");
        allowedExtensions.add(".bmp");
        allowedExtensions.add(".mp3");
        allowedExtensions.add(".amr");
        for (String suf : allowedExtensions) {
            if (filepath.toLowerCase(Locale.ENGLISH).endsWith(suf)) {
                result = true;
                break;
            }
        }
        if (!result) return "";
        filepath.replaceAll("../", "");
        filepath.replaceAll("..\\\\", "");
        return filepath;
    }


}
