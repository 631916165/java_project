package com.example.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/file")
@CrossOrigin(origins = "http://127.0.0.1:5500") // 允许来自这个源的请求
public class Uploadfile {

    //定义保存文件的目录
    private static final String UPLOAD_DIR = "C:/Users/root/Desktop/uploadfiles/src/main/resources/upload/";

    @PostMapping("/upload")
    public String uploadfile(@RequestParam("file")MultipartFile file) {
        if (file.isEmpty()) {
            return "请选择一个文件来上传";
        }
        try {
            //获取文件的字节数组
            byte[] bytes = file.getBytes();

            //创建保存文件的路径
            Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());

            //将文件保存到指定路径
            file.transferTo(path.toFile());
            System.out.println("ok。。。。。");
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "文件上传失败";
        }
    }
}
