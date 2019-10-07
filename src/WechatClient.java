public class WechatClient implements ServerInterface{
    private int amount;
    private String account;
    @Override
    public void sendMessage(int amount, String account) {
        // TODO Auto-generated method stub
        System.out.println("CustomerID:"+account+"finish charging£¬amount£º"+amount);
    }
     public void forRecharge(){
        System.out.println("server begins charging");
        new WechatServer().recharge(amount, account, this);
    }
    public WechatClient(int amount,String account) {
        this.amount = amount;
        this.account = account;
    }
}
