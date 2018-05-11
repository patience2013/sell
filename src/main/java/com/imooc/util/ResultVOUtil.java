package com.imooc.util;

import com.imooc.VO.ResultVO;

/**
 * @author: Administrator
 * @date: 2018/4/26/026
 * @description:
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO =new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return resultVO;
    }
    public static ResultVO success(){
        return success(null);
    }
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO =new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessage(msg);
        return resultVO;
    }
}
