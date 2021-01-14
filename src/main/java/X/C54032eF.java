package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2eF  reason: invalid class name and case insensitive filesystem */
public class C54032eF implements AnonymousClass2PK {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ ImagePreviewFragment A01;
    public final /* synthetic */ AnonymousClass2PF A02;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void A2A() {
    }

    public C54032eF(ImagePreviewFragment imagePreviewFragment, Bundle bundle, AnonymousClass2PF r3) {
        this.A01 = imagePreviewFragment;
        this.A00 = bundle;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass2PK
    public void AFq() {
        ActivityC004902h A0A = this.A01.A0A();
        if (A0A == null) {
            return;
        }
        if (A0A != null) {
            AnonymousClass0TX.A0E(A0A);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        Uri uri;
        ImagePreviewFragment imagePreviewFragment = this.A01;
        Context A002 = imagePreviewFragment.A00();
        if (A002 != null && imagePreviewFragment.A01.getTag() == (uri = ((MediaPreviewFragment) imagePreviewFragment).A00)) {
            if (this.A00 == null) {
                AnonymousClass2PF r1 = this.A02;
                String A66 = r1.A66(uri);
                String A69 = r1.A69(((MediaPreviewFragment) imagePreviewFragment).A00);
                if (A66 != null) {
                    AnonymousClass2Mt r4 = new AnonymousClass2Mt();
                    try {
                        r4.A08(A66, A002, ((MediaPreviewFragment) imagePreviewFragment).A0B, imagePreviewFragment.A04, imagePreviewFragment.A07, imagePreviewFragment.A06, ((MediaPreviewFragment) imagePreviewFragment).A0D);
                    } catch (JSONException e) {
                        Log.e("imagepreview/error-loading-doodle", e);
                    }
                    AnonymousClass2MF r12 = ((MediaPreviewFragment) imagePreviewFragment).A01;
                    r12.A04.setDoodle(r4);
                    r12.A04.setEditState(A69);
                    r12.A02();
                } else if (!(!((MediaPreviewFragment) imagePreviewFragment).A01.A04.A0U.A01.isEmpty())) {
                    RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                    DoodleView doodleView = ((MediaPreviewFragment) imagePreviewFragment).A01.A04;
                    doodleView.setBitmapRect(rectF);
                    doodleView.setCropRect(rectF);
                }
            }
            if (!z) {
                imagePreviewFragment.A01.A06(((MediaPreviewFragment) imagePreviewFragment).A02.A04);
                ActivityC004902h A0A = imagePreviewFragment.A0A();
                if (A0A != null) {
                    if (A0A != null) {
                        AnonymousClass0TX.A0E(A0A);
                    } else {
                        throw null;
                    }
                }
            } else {
                AnonymousClass2OT r13 = ((MediaPreviewFragment) imagePreviewFragment).A02;
                if (bitmap == null) {
                    Log.d("FilterUi/setMediaBitmap/mediaBitmap is null");
                } else {
                    r13.A05 = bitmap;
                    r13.A0C = false;
                }
                AnonymousClass2OT r42 = ((MediaPreviewFragment) imagePreviewFragment).A02;
                r42.A06(r42.A02, null, new RunnableEBaseShape9S0100000_I1_4(r42, 35));
            }
            AnonymousClass2OT r2 = ((MediaPreviewFragment) imagePreviewFragment).A02;
            r2.A05();
            C53602dX r0 = r2.A0B;
            if (r0 != null) {
                ((AbstractC16300pa) r0).A01.A00();
            } else if (0 != 0) {
                Handler handler = r2.A0M;
                Runnable runnable = r2.A0Z;
                handler.removeCallbacks(runnable);
                runnable.run();
            }
        }
    }
}
