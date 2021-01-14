package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.storage.StorageUsageMediaPreviewOverflowOverlayView;

/* renamed from: X.34E  reason: invalid class name */
public class AnonymousClass34E extends FrameLayout {
    public C59592ny A00;
    public final WaTextView A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final StorageUsageMediaPreviewOverflowOverlayView A03;

    public AnonymousClass34E(Context context) {
        super(context, null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.storage_usage_media_preview_overflow_item_view, (ViewGroup) this, true);
        this.A03 = (StorageUsageMediaPreviewOverflowOverlayView) AnonymousClass0Q7.A0D(this, R.id.overflow_overlay_view);
        this.A01 = (WaTextView) AnonymousClass0Q7.A0D(this, R.id.overflow_text_view);
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A03.setFrameDrawable(drawable);
        C59592ny r0 = this.A00;
        if (r0 != null) {
            r0.setFrameDrawable(drawable);
        }
    }
}
