import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

        private final int _id;
        private final String text;
        private final String type;
        private final String user;
        private final int upvotes;
        private final int userUpvoted;


        public Post(
                @JsonProperty("id") int _id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") Integer upvotes,
                @JsonProperty("userUpvoted") Integer userUpvoted
        )
        {
            this._id = _id;
            this.text = text;
            this.type = type;
            this.user = user;
            this.upvotes = upvotes;
            this.userUpvoted = userUpvoted;
        }


        public int get_id() {
            return _id;
        }

        public String getText() {
            return text;
        }

        public String getType() {
            return type;
        }

        public String getUser() {
            return user;
        }

        public Integer getUpvotes() {
            return upvotes;
        }

        public int getUserUpvoted() {
            return userUpvoted;
        }

    @Override
    public String toString() {
        return "\n _id: " + _id +
                "\n text: " + text +
                "\n type: " + type +
                "\n user: " + user +
                "\n upvotes: " + upvotes +
                "\n userUpvoted: " + userUpvoted;
    }
}
