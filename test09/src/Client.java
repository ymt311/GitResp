public class Client {
    public static void main (String args[]){
        AbstractChatroom happyChat = new ChatGroup();

        Member member1,member2,member3;
        member1 = new DiamondMember("张三");
        member2 = new DiamondMember("李四");
        member3 = new CommonMember("王五");

        happyChat.register(member1);
        happyChat.register(member2);
        happyChat.register(member3);

        member1.sendText("李四","你好，李四！");
        member2.sendText("张三","你好，张三！");
        member1.sendText("李四","今天天气很好！");
        member2.receiveImage("张三","一个很大的太阳");
        member3.sendImage("张三","太阳");
    }
}
