package com.kk.kkpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kk.kkpicturebackend.model.dto.picture.PictureQueryRequest;
import com.kk.kkpicturebackend.model.dto.picture.PictureUploadRequest;
import com.kk.kkpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.kkpicturebackend.model.entity.User;
import com.kk.kkpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

/**
* @author dxm
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-06-23 16:11:32
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);
}
