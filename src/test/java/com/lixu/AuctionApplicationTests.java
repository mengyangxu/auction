package com.lixu;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.lixu.dao.GoodsDao;
import com.lixu.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuctionApplicationTests {

	@Autowired
	private UserDao userDao;

	@Autowired
	private GoodsDao goodsDao;

	public static void create(){
		int width = 300;
		int height = 300;
		String format = "png";
		String content = "http://120.79.211.240/lixu.html";
		//定义二维码的参数
		HashMap map = new HashMap();
		//设置编码
		map.put(EncodeHintType.CHARACTER_SET, "utf-8");
		//设置纠错等级
		map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		map.put(EncodeHintType.MARGIN, 2);

		try {
			//生成二维码
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
			Path file = new File("D:/test/qrcode.png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@Test
	public void contextLoads() {
		//userDao.findAddress();

		goodsDao.findName();
	}

}
