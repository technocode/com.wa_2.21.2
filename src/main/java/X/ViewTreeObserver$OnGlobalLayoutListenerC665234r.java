package X;

import android.view.ViewTreeObserver;
import com.whatsapp.ui.media.MediaCard;

/* renamed from: X.34r  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC665234r implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ MediaCard A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC665234r(MediaCard mediaCard) {
        this.A00 = mediaCard;
    }

    public void onGlobalLayout() {
        MediaCard mediaCard = this.A00;
        mediaCard.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        mediaCard.A01.fullScroll(66);
    }
}
