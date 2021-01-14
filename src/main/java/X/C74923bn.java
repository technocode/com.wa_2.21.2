package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.3bn  reason: invalid class name and case insensitive filesystem */
public class C74923bn extends AnonymousClass3Zd {
    public final WaTextView A00 = ((WaTextView) AnonymousClass0Q7.A0D(this, R.id.media_time));
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final MessageThumbView A02;

    @Override // X.AnonymousClass3Zd
    public float getRatio() {
        return 1.0f;
    }

    public C74923bn(Context context) {
        super(context);
        MessageThumbView messageThumbView = (MessageThumbView) AnonymousClass0Q7.A0D(this, R.id.thumb_view);
        this.A02 = messageThumbView;
        messageThumbView.setContentDescription(this.A01.A06(R.string.gif_preview_description));
    }

    @Override // X.AnonymousClass3Zd
    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    public void setMessage(AnonymousClass0ZB r3) {
        super.setMessage((AnonymousClass0M3) r3);
        MessageThumbView messageThumbView = this.A02;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = ((AnonymousClass3ON) this).A00;
        messageThumbView.setMessage(r3);
        WaTextView waTextView = this.A00;
        waTextView.setText("");
        waTextView.setVisibility(8);
    }
}
