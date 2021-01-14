package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.3bm  reason: invalid class name and case insensitive filesystem */
public class C74913bm extends AnonymousClass3Zd {
    public AnimatorSet A00;
    public AnonymousClass318 A01 = new AnonymousClass3OQ(this);
    public final WaTextView A02 = ((WaTextView) AnonymousClass0Q7.A0D(this, R.id.media_time));
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final MessageThumbView A04 = ((MessageThumbView) AnonymousClass0Q7.A0D(this, R.id.thumb_view));
    public final MessageGifVideoPlayer A05 = ((MessageGifVideoPlayer) AnonymousClass0Q7.A0D(this, R.id.video_player));

    @Override // X.AnonymousClass3Zd
    public float getRatio() {
        return 1.5f;
    }

    public C74913bm(Context context) {
        super(context);
        this.A04.setContentDescription(this.A03.A06(R.string.gif_preview_description));
        this.A05.A06 = this.A01;
    }

    public static void A00(C74913bm r10, boolean z) {
        AnimatorSet animatorSet = r10.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        r10.A00 = new AnimatorSet();
        FrameLayout frameLayout = ((AnonymousClass3Zd) r10).A00;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", frameLayout.getAlpha(), f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((AnonymousClass3Zd) r10).A01, "alpha", frameLayout.getAlpha(), f);
        r10.A00.playTogether(ofFloat, ofFloat2);
        r10.A00.setInterpolator(new DecelerateInterpolator());
        r10.A00.setDuration(100L);
        r10.A00.start();
    }

    @Override // X.AnonymousClass3Zd
    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    @Override // X.AnonymousClass3Zd
    public int getMarkTintColor() {
        return R.color.white;
    }

    public void setMessage(AnonymousClass0ZB r4) {
        super.setMessage((AnonymousClass0M3) r4);
        super.setRadius(0);
        setId(R.id.gif_grid);
        MessageThumbView messageThumbView = this.A04;
        messageThumbView.setMessage(r4);
        this.A05.setMessage(r4);
        messageThumbView.setVisibility(0);
        WaTextView waTextView = this.A02;
        waTextView.setText("");
        waTextView.setVisibility(8);
    }

    @Override // X.AnonymousClass3ON
    public void setScrolling(boolean z) {
        this.A05.setScrolling(z);
    }

    @Override // X.AnonymousClass3ON
    public void setShouldPlay(boolean z) {
        this.A05.setShouldPlay(z);
    }
}
