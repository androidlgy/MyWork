package cn.wistron.Socket;

public class testString{
	public static void main(String[] args) {
		String s="ÎÂ¶È1-1";
		CharSequence subSequence = s.subSequence(0, s.indexOf("1"));
		System.out.println(subSequence);
	}

}
