package cn.kgc.controller.xiao;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadController2 {


    @RequestMapping("/image")
    @ResponseBody
    public Map<String,Object> uploadImage(MultipartFile pictureFile, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();

        //获取原始文件名
        String fileName = pictureFile.getOriginalFilename();
        //获取原始图片后缀
        String extension = FilenameUtils.getExtension(fileName);
        //生成新的文件名
        String newFileName = System.currentTimeMillis() + RandomStringUtils.randomNumeric(6)+"."+extension;

        try{
            String dirPath = request.getServletContext().getRealPath("/images");
            System.out.println(dirPath);
            File destFile = new File(dirPath,newFileName);
            pictureFile.transferTo(destFile);
        }catch (Exception e){
            e.printStackTrace();
        }


        map.put("success",true);
        map.put("newFileName",newFileName);
        return map;
    }
}
