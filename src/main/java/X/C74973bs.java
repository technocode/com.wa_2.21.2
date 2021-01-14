package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.3bs  reason: invalid class name and case insensitive filesystem */
public class C74973bs extends AnonymousClass3Zd {
    public final LinearLayout A00 = ((LinearLayout) AnonymousClass0Q7.A0D(this, R.id.button_frame));
    public final WaTextView A01 = ((WaTextView) AnonymousClass0Q7.A0D(this, R.id.media_time));
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final MessageThumbView A03 = ((MessageThumbView) AnonymousClass0Q7.A0D(this, R.id.thumb_view));

    @Override // X.AnonymousClass3Zd
    public float getRatio() {
        return 1.0f;
    }

    public C74973bs(Context context) {
        super(context);
        this.A03.setContentDescription(this.A02.A06(R.string.video_preview_description));
    }

    @Override // X.AnonymousClass3Zd
    public int getMark() {
        return R.drawable.mark_video;
    }

    public void setMessage(AnonymousClass0ZC r7) {
        super.setMessage((AnonymousClass0M3) r7);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = ((AnonymousClass3ON) this).A00;
        messageThumbView.setMessage(r7);
        WaTextView waTextView = this.A01;
        AnonymousClass01X r5 = this.A02;
        waTextView.setText(C28051Sr.A0w(r5, r7));
        waTextView.setVisibility(0);
        int dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.search_grid_video_mark_margin_bottom) << 1) + ((int) waTextView.getTextSize());
        LinearLayout linearLayout = this.A00;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.width;
        if (i < dimensionPixelSize) {
            int i3 = 3;
            if (r5.A02().A06) {
                i3 = 5;
            }
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(i2, dimensionPixelSize, i3 | 80));
        }
    }
}
