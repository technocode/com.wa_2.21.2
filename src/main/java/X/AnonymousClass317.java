package X;

import android.media.MediaPlayer;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.317  reason: invalid class name */
public class AnonymousClass317 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ MessageGifVideoPlayer A00;

    public AnonymousClass317(MessageGifVideoPlayer messageGifVideoPlayer) {
        this.A00 = messageGifVideoPlayer;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A00;
        messageGifVideoPlayer.A09 = true;
        messageGifVideoPlayer.A02();
    }
}
