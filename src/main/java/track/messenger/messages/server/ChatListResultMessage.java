package track.messenger.messages.server;

import track.messenger.messages.Type;

import java.util.List;

public class ChatListResultMessage extends ResultMessage {
    public ChatListResultMessage(ChatListResult result, Status status, String errorMessage) {
        super(Type.MSG_CHAT_LIST_RESULT);
        this.result = result;
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public static class ChatListResult extends Result{
        public ChatListResult(List<Long> chatList) {
            this.chatList = chatList;
        }

        public List<Long> chatList;
    }
}
