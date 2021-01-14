package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.biz.catalog.AspectRatioFrameLayout;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.3Zb  reason: invalid class name and case insensitive filesystem */
public class C73853Zb extends AnonymousClass3ON {
    public final WaImageView A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final MessageThumbView A02;

    public C73853Zb(Context context) {
        super(context);
        ((AspectRatioFrameLayout) this).A00 = 1.0f;
        FrameLayout.inflate(context, R.layout.search_message_image_preview, this);
        this.A02 = (MessageThumbView) AnonymousClass0Q7.A0D(this, R.id.thumb_view);
        this.A00 = (WaImageView) AnonymousClass0Q7.A0D(this, R.id.starred_status);
        this.A02.setContentDescription(this.A01.A06(R.string.image_preview_description));
    }

    public void setMessage(AnonymousClass0MI r3) {
        super.A01 = r3;
        WaImageView waImageView = this.A00;
        if (r3 != null) {
            if (r3.A0j) {
                waImageView.setVisibility(0);
            } else {
                waImageView.setVisibility(8);
            }
        }
        MessageThumbView messageThumbView = this.A02;
        messageThumbView.A00 = ((AnonymousClass3ON) this).A00;
        messageThumbView.setMessage(r3);
    }
}
