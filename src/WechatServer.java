
public class WechatServer {
	
	public void recharge(int amount,String account,ServerInterface wechatClient){
        System.out.println("server starts to charge");
        new Thread(new CharingThread(amount, account, wechatClient)).start();
    }
}


