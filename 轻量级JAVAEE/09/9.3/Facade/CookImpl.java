

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class CookImpl
	implements Cook
{
	//模拟烹调食物的方法
	public String cook(String food)
	{
		System.out.println("厨师正在烹调:" + food);
		return food;
	}
}

