import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import net.minidev.json.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luoc
 * @date 2018/11/2 0002
 * @time 10:27
 */
public class JwtUtils {

    //创建一个32-byte 的密钥
    private static final byte[] secret = "geiwodiangasfdjsikolkjikolkijswe".getBytes();


    /**
     *  生成token
     * @param payLoadMap 传入载荷Map
     * @return
     * @throws JOSEException
     */
    public  static String createToken(Map<String,Object> payLoadMap) throws JOSEException {

        //3.先建立一个头部Header
        /**
         * JWSHeader参数：1.加密算法法则,2.类型，3.。。。。。。。
         * 一般只需要传入加密算法法则就可以。
         * 这里则采用HS256
         *
         * JWSAlgorithm类里面有所有的加密算法法则，直接调用。
         */
        JWSHeader jwsHeader = new JWSHeader(JWSAlgorithm.HS256);


        // 建立一个载荷 payload
        Payload payload = new Payload(new JSONObject(payLoadMap));


        //将头部和载荷链接在一起
        JWSObject jwsObject = new JWSObject(jwsHeader,payload);

        //建立一个密钥
        JWSSigner jwsSigner = new MACSigner(secret);

        //签名
        jwsObject.sign(jwsSigner);

        return jwsObject.serialize();
    }


    public static Map<String,Object> valid(String token) throws Exception{

        //解析token
        JWSObject jwsObject = JWSObject.parse(token);


        //载荷
        Payload payload = jwsObject.getPayload();

        //建立一个解锁密匙
        JWSVerifier jwsVerifier = new MACVerifier(secret);

        //
        Map<String, Object> resultMap = new HashMap<>();

        if(jwsObject.verify(jwsVerifier)){
                resultMap.put("Result",0);
                // 载荷的数据解析成json对象
                JSONObject jsonObject = payload.toJSONObject();
                resultMap.put("data",jsonObject);

                // 判断token是否过期
                if (jsonObject.containsKey("exp")){
                    Long expTime = Long.valueOf(jsonObject.get("exp").toString());
                    Long nowTime = System.currentTimeMillis();
                    //判断是否过期
                    if (nowTime > expTime) {
                        //已经过期
                        resultMap.clear();
                        resultMap.put("Result", 2);
                    }
                }
        }else {
            resultMap.put("Result",1);
        }
         return  resultMap;
    }

    public static void main(String[] args) throws Exception {
          Map<String,Object>  map = new HashMap<>();
          map.put("userName","luoc");
          map.put("time",System.currentTimeMillis());
          String token = JwtUtils.createToken(map);
          System.out.println(token);

          System.out.println("---------------------------");

         System.out.println(JSONObject.toJSONString(JwtUtils.valid(token)));


    }
}
