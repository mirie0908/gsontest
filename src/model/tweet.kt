package model

data class tweet(
    var text: String?,
    var truncated: Boolean,
    var in_reply_to_user_id: String?,
    var in_reply_to_status_id: String?,
    var favorited: Boolean,
    var source: String?,
    var in_reply_to_screen_name: String?,
    var in_reply_to_status_id_str: String?,
    var id_str: String?,
    var entities: entities,
    var contributors: String?,
    var retweeted: Boolean,
    var in_reply_to_user_id_str: String?,
    var place: String?,
    var retweet_count: Int,
    var created_at: String?,
    var retweeted_status: retweeted_status,
    var user: user,
    var id: Long,
    var coordinates: String?,
    var geo: String?
)

data class entities(
    var user_mentions: List<user_mention>?,
    var urls: List<String>?,
    var hashtags: List<hashtag>?
)

data class hashtag(
        val text: String?,
        val indices: List<Int>
)

data class user_mention(
        val indices: List<Int>,
        val screen_name: String?,
        val id_str: String?,
        val name: String?,
        val id: Int
)

data class retweeted_status(
    val text: String?,
    val truncated: Boolean,
    val in_reply_to_user_id: String?,
    val in_reply_to_status_id: String?,
    val favorited: Boolean,
    val source: String?,
    val in_reply_to_screen_name: String?,
    val in_reply_to_status_id_str: String?,
    val id_str: String?,
    val entities: entities,
    val contributors: String?,
    val retweeted: Boolean,
    val in_reply_to_user_id_str: String?,
    val place: String?,
    val retweet_count: Int,
    val created_at: String?,
    val user: user,
    val id: Long,
    val coordinates: String?,
    val geo: String?
)

data class user(
    val notifications: String?,
    val profile_use_background_image: Boolean,
    val statuses_count: Int,
    val profile_background_color: String?,
    val followers_count: Int,
    val profile_image_url: String?,
    val listed_count: Int,
    val profile_background_image_url: String?,
    val description: String?,
    val screen_name: String?,
    val default_profile: Boolean,
    val verified: Boolean,
    val time_zone: String?,
    val profile_sidebar_fill_color: String?,
    val location: String?,
    val id_str: String?,
    val default_profile_image: Boolean,
    val profile_background_title: Boolean,
    val lang: String?,
    val friends_count: Int,
    val protected: Boolean,
    val favorites_count: Int,
    val created_at: String?,
    val profile_link_color: String?,
    val name: String?,
    val show_all_inline_media: Boolean,
    val follow_request_sent: String?,
    val geo_enabled: Boolean,
    val profile_sidebar_border_color: String?,
    val url: String?,
    val id: Int,
    val contributors_enabled: Boolean,
    val following: String?,
    val utc_offset: Int
)