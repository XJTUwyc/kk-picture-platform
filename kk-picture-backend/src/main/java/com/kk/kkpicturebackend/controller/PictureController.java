package com.kk.kkpicturebackend.controller;

import com.kk.kkpicturebackend.common.BaseResponse;
import com.kk.kkpicturebackend.common.ResultUtils;
import com.kk.kkpicturebackend.model.dto.picture.PictureUploadRequest;
import com.kk.kkpicturebackend.model.entity.User;
import com.kk.kkpicturebackend.model.vo.PictureVO;
import com.kk.kkpicturebackend.service.PictureService;
import com.kk.kkpicturebackend.service.UserService;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class PictureController {

    @Resource
    private UserService userService;

    @Resource
    private PictureService pictureService;
    /**
     * 上传图片
     */
    public BaseResponse<PictureVO> uploadPicture(
            @RequestPart("file") MultipartFile multipartFile,
            PictureUploadRequest pictureUploadRequest,
            HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        PictureVO pictureVO = pictureService.uploadPicture(multipartFile, pictureUploadRequest, loginUser);
        return ResultUtils.success(pictureVO);
    }
}
