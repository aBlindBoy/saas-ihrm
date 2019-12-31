package com.ihrm.system.service;


import org.springframework.web.multipart.MultipartFile;

@Service
public class FaceLoginService {

    @Value("${qr.url}")
    private String url;

	//创建二维码
    public QRCode getQRCode() throws Exception {
		return null;
    }

	//根据唯一标识，查询用户是否登录成功
    public FaceLoginResult checkQRCode(String code) {
		return null;
    }

	//扫描二维码之后，使用拍摄照片进行登录
    public String loginByFace(String code, MultipartFile attachment) throws Exception {
		return null;
    }

	//构造缓存key
    private String getCacheKey(String code) {
        return "qrcode_" + code;
    }
}
