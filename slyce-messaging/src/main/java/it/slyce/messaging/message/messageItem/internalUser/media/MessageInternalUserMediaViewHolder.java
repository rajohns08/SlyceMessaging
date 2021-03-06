package it.slyce.messaging.message.messageItem.internalUser.media;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.messaging.R;
import it.slyce.messaging.message.messageItem.master.media.MessageMediaViewHolder;
import it.slyce.messaging.utils.CustomSettings;
import it.slyce.messaging.view.image.GlideRoundedImageView;

/**
 * Created by John C. Hunchar on 5/16/16.
 */
public class MessageInternalUserMediaViewHolder extends MessageMediaViewHolder {

    public MessageInternalUserMediaViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);

        carrot = (ImageView) itemView.findViewById(R.id.message_user_media_image_view_carrot);
        media = (GlideRoundedImageView) itemView.findViewById(R.id.message_user_media_picasso_rounded_image_view_media);
        mediaBackground = (FrameLayout) itemView.findViewById(R.id.message_user_media_view_group_bubble);
        timestamp = (TextView) itemView.findViewById(R.id.message_user_media_text_view_timestamp);

        carrot.setColorFilter(customSettings.localBubbleBackgroundColor);
        mediaBackground.setBackgroundColor(customSettings.localBubbleBackgroundColor);
    }
}
