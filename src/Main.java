
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int amount = 100;
	        String account = "123123";
	        WechatClient wechatClient = new WechatClient(amount, account);
	        wechatClient.forRecharge();
	        System.out.println("continue;");
	}

}
