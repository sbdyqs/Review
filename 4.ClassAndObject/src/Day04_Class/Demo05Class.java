package Day04_Class;
class Message1{
    private Channel channel;
    private String title;
    private String content;
    public Message1(Channel channel, String title, String content){
        this.channel = channel;
        this.title = title;
        this.content = content;
    }
    public void send(){
        if (this.channel.isContent()){
            System.out.println("[消息发送]title=" + this.title + ",content=" + this.content);
        }else {
            System.out.println("[ERROR]没有任何可用的连接通道,无法进行消息发送");
        }
    }
}
class Channel{
    private Message1 message1;
    public Channel(String title, String content){
        this.message1 = new Message1(this, title, content);
        this.message1.send();
    }
    public boolean isContent(){
        return true;
    }
}
public class Demo05Class {
    public static void main(String[] args) {
        Channel channel = new Channel("警告!","飞船即将爆炸,请尽快撤离!");
//        new Message1(channel,"警告!","飞船即将爆炸,请尽快撤离!").send();
    }
}
