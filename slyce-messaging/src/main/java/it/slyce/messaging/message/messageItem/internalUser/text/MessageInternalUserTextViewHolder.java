package it.slyce.messaging.message.messageItem.internalUser.text;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.messaging.R;
import it.slyce.messaging.message.messageItem.master.text.MessageTextViewHolder;
import it.slyce.messaging.utils.CustomSettings;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public class MessageInternalUserTextViewHolder extends MessageTextViewHolder {

    public MessageInternalUserTextViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);

        carrot = (ImageView) itemView.findViewById(R.id.message_user_text_image_view_carrot);
        text = (TextView) itemView.findViewById(R.id.message_user_text_text_view_text);
        timestamp = (TextView) itemView.findViewById(R.id.message_user_text_text_view_timestamp);
        bubble = (FrameLayout) itemView.findViewById(R.id.message_user_text_view_group_bubble);

        Drawable drawable = ContextCompat.getDrawable(itemView.getContext(), R.drawable.shape_rounded_rectangle_white);
        drawable.setColorFilter(customSettings.localBubbleBackgroundColor, PorterDuff.Mode.SRC_ATOP);
        bubble.setBackground(drawable);
        carrot.setColorFilter(customSettings.localBubbleBackgroundColor);
        text.setTextColor(customSettings.localBubbleTextColor);
        timestamp.setTextColor(customSettings.timestampColor);
    }
}
