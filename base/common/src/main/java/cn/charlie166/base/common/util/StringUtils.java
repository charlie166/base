package cn.charlie166.base.common.util;

/**
* @ClassName: StringUtils 
* @Description: 字符串工具类
* @company 
* @author liyang
* @Email charlie166@163.com
* @date 2016年12月26日 
*
 */
public class StringUtils {

	/**空白字符串***/
	public final static String EMPTY_STRING = "";
	
	/**
	* @Title: isNullOrEmpty 
	* @Description: 判断给定字符串是否为null或空白字符串
	* @param str 判断字符串
	* @return
	 */
	public static boolean isNullOrEmpty(String str){
		return str == null || StringUtils.EMPTY_STRING.equals(str.trim());
	}
	
	/**
	* @Title: hasContent 
	* @Description: 判断字符串是否有内容
	* @param str 判定字符串
	* @return
	 */
	public static boolean hasContent(String str){
		return !StringUtils.isNullOrEmpty(str);
	}
	
	/**
	* @Title: removeBlank 
	* @Description: 处理掉给定字符串中的空白字符
	* @param str
	* @return
	 */
	public static String replaceBlankWith(String str){
		return StringUtils.replaceBlankWith(str, StringUtils.EMPTY_STRING);
	}
	
	/**
	* @Title: replaceBlankWith 
	* @Description: 用指定字符串替换空白内容
	* @param str 给定字符串
	* @param rep 替换内容
	* @return
	 */
	public static String replaceBlankWith(String str, String rep){
		if(StringUtils.hasContent(str)){
			return str.replaceAll("\\s+", rep);
		} else {
			return StringUtils.EMPTY_STRING;
		}
	}
	
	public static void main(String[] args) {
		String str = " de rf          rw fve ";
		System.out.println("result:" + StringUtils.replaceBlankWith(str));
	}
}
