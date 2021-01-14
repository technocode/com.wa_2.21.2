package X;

import android.view.ViewTreeObserver;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.2IZ  reason: invalid class name */
public class AnonymousClass2IZ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaAlbumActivity A00;

    public AnonymousClass2IZ(MediaAlbumActivity mediaAlbumActivity) {
        this.A00 = mediaAlbumActivity;
    }

    public boolean onPreDraw() {
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        mediaAlbumActivity.A0T().getViewTreeObserver().removeOnPreDrawListener(this);
        if (mediaAlbumActivity != null) {
            AnonymousClass0TX.A0E(mediaAlbumActivity);
            return true;
        }
        throw null;
    }
}
