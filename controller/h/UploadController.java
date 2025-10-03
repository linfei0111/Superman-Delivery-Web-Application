package cn.kgc.controller.h;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @RequestMapping("/photo")
    @ResponseBody
    public Map<String,Object> photo(MultipartFile pictureFile, HttpServletRequest request){
            Map<String,Object> map = new HashMap<String,Object>();
            String fileName = pictureFile.getOriginalFilename();
        String extension = FilenameUtils.getExtension(fileName);
        String newFileName = System.currentTimeMillis()+ RandomStringUtils.randomNumeric(6)+"." + extension;
        String realPath = request.getServletContext().getRealPath("/statics/images");
        //创建文件存放目录
        File newFile = new File(realPath,newFileName);
        try {
            // 将上传的文件保存到指定位置
            pictureFile.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.put("success", true);
        map.put("newFileName", newFileName);
        System.out.println(newFileName);
        return map;
    }
}
