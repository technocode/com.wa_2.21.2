package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.biz.catalog.AspectRatioFrameLayout;

/* renamed from: X.3Zd  reason: invalid class name */
public abstract class AnonymousClass3Zd extends AnonymousClass3ON {
    public final FrameLayout A00 = ((FrameLayout) AnonymousClass0Q7.A0D(this, R.id.overlay));
    public final LinearLayout A01 = ((LinearLayout) AnonymousClass0Q7.A0D(this, R.id.button_frame));
    public final WaImageView A02 = ((WaImageView) AnonymousClass0Q7.A0D(this, R.id.starred_status));

    public abstract int getMark();

    public int getMarkTintColor() {
        return -1;
    }

    public abstract float getRatio();

    public AnonymousClass3Zd(Context context) {
        super(context);
        ((AspectRatioFrameLayout) this).A00 = getRatio();
        FrameLayout.inflate(context, R.layout.search_message_video_preview, this);
        ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(this, R.id.button_image);
        Drawable A03 = C004302a.A03(context, getMark());
        if (A03 != null) {
            int markTintColor = getMarkTintColor();
            A03 = markTintColor != -1 ? C002001d.A0e(A03, C004302a.A00(context, markTintColor)) : A03;
            imageView.setImageDrawable(A03);
            this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, A03.getIntrinsicHeight() << 1, 80));
            this.A00.setVisibility(0);
            imageView.setImageDrawable(A03);
        }
    }

    @Override // X.AnonymousClass3ON
    public void setMessage(AnonymousClass0M3 r3) {
        super.A01 = r3;
        WaImageView waImageView = this.A02;
        if (r3 == null) {
            return;
        }
        if (r3.A0j) {
            waImageView.setVisibility(0);
        } else {
            waImageView.setVisibility(8);
        }
    }

    @Override // X.AnonymousClass3ON
    public void setRadius(int i) {
        super.setRadius(i);
        if (i > 0) {
            FrameLayout frameLayout = this.A00;
            frameLayout.setBackgroundDrawable(C004302a.A03(getContext(), R.drawable.search_media_thumbnail_rounded_overlay));
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ((GradientDrawable) frameLayout.getBackground()).setCornerRadius((float) i);
        }
    }
}
