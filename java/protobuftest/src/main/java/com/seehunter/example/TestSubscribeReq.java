package com.seehunter.example;
import java.util.ArrayList;
import java.util.List;
 
public class TestSubscribeReq {
    public static void main(String[] args)throws Exception{
        SubscribeReqProto.SubscribeReq req=createSubscribeReq();
        System.out.println("Before encode:"+req.toString());
 
        SubscribeReqProto.SubscribeReq result=decode(encode(req));
        System.out.println("decode cotent is:"+result.toString());
 
        System.out.println(req.equals(result));
    }
    private static byte[] encode(SubscribeReqProto.SubscribeReq req){
        return req.toByteArray();
    }
    private static  SubscribeReqProto.SubscribeReq decode(byte[] body) throws Exception{
        return SubscribeReqProto.SubscribeReq.parseFrom(body);
    }
 
    private static SubscribeReqProto.SubscribeReq createSubscribeReq(){
        SubscribeReqProto.SubscribeReq.Builder builder= SubscribeReqProto.SubscribeReq.newBuilder();
        builder.setSubReqId(1);
        builder.setUserName("zzf");
        builder.setProductName("Netty Book");
        List<String> address=new ArrayList<String>();
        address.add("浙江");
        address.add("超人");
        address.add("乌龟");
        builder.addAllAddress(address);
        return builder.build();
 
    }
}