package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.3MC  reason: invalid class name */
public class AnonymousClass3MC implements AbstractC64792yn {
    public final /* synthetic */ AbstractActivityC29861aJ A00;

    public AnonymousClass3MC(AbstractActivityC29861aJ r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC64792yn
    public void ADi(int i) {
        AbstractActivityC29861aJ r3 = this.A00;
        if (r3.A0B.A04()) {
            ((ActivityC004702f) r3).A0F.A06(R.string.error_camera_disabled_during_video_call, 1);
        } else if (i != 2) {
            ((ActivityC004702f) r3).A0F.A06(R.string.cannot_start_camera, 1);
        }
        r3.finish();
    }

    @Override // X.AbstractC64792yn
    public void AIo() {
        Log.i("qractivity/previewready");
        AbstractActivityC29861aJ r2 = this.A00;
        r2.A07 = true;
        if (!r2.A06) {
            r2.A04.A04.setOneShotPreviewCallback(r2.A08);
        }
    }
}
