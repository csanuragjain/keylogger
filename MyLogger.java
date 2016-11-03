import java.util.HashMap;
import java.util.Map;


public class MyLogger {

	final static String key="BackSpace:8,Tab:9,Return:13,Shift:16,Control:17,Alt:18,Pause:19,CapsLock:20,Escape:27,Space:32,PageUp:33,PageDown:34,End:35,Home:36,Left:37,Up:38,Right:39,Down:40,PrintScreen:44,Insert:45,Delete:46,0:48,1:49,2:50,3:51,4:52,5:53,6:54,7:55,8:56,9:57,A:65,B:66,C:67,D:68,E:69,F:70,G:71,H:72,I:73,J:74,K:75,L:76,M:77,N:78,O:79,P:80,Q:81,R:82,S:83,T:84,U:85,V:86,W:87,X:88,Y:89,Z:90,LWin:91,RWin:92,Apps:93,NumPad0:96,NumPad1:97,NumPad2:98,NumPad3:99,NumPad4:100,NumPad5:101,NumPad6:102,NumPad7:103,NumPad8:104,NumPad9:105,Multiply:106,Add:107,Subtract:109,Decimal:110,Divide:111,F1:112,F2:113,F3:114,F4:115,F5:116,F6:117,F7:118,F8:119,F9:120,F10:121,F11:122,F12:123,F13:124,F14:125,F15:126,F16:127,NumLock:144,ScrollLock:145,LShift:160,RShift:161,LControl:162,RControl:163,LAlt:164,RAlt:165,SemiColon:186,Equals:187,Comma:188,UnderScore:189,Period:190,Slash:191,BackSlash:220,RightBrace:221,LeftBrace:219,Apostrophe:222";
	static Map<Integer,String> keyList= new HashMap<Integer, String>();
	static
	{
		System.loadLibrary("MyLogger");
	}
	
	public static native int GetKey();
	
	public static void main(String[] args) {
		
		loadKey();
		for(int i=0;i<100;i++)
		{
		int d=GetKey();
		System.out.print(keyList.get(d));
		}
	}
	
	public static void loadKey()
	{
		String[] allKeys=key.split(",");
		for(int i=0;i<allKeys.length;i++)
		{
		String[] keyDecoder=allKeys[i].split(":");	
		keyList.put(Integer.parseInt(keyDecoder[1]), keyDecoder[0]);
		}
	}
}
