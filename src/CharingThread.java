
public class CharingThread  implements Runnable{
    private int amount;
    private String account;
    private ServerInterface wechatClient;
	public CharingThread(int amount, String account, ServerInterface wechatClient) {
		super();
		this.amount = amount;
		this.account = account;
		this.wechatClient = wechatClient;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("charging finished");
		wechatClient.sendMessage(amount, account);
	}

}
