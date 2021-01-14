package X;

import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2e1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53902e1 implements AbstractC64722ye {
    public final /* synthetic */ MediaPreviewActivity A00;

    public /* synthetic */ C53902e1(MediaPreviewActivity mediaPreviewActivity) {
        this.A00 = mediaPreviewActivity;
    }

    @Override // X.AbstractC64722ye
    public final void AJd(String str, int i) {
        MediaPreviewActivity mediaPreviewActivity = this.A00;
        if (C002001d.A3D(mediaPreviewActivity)) {
            return;
        }
        if (i == 2) {
            C07550Yd r2 = mediaPreviewActivity.A0S;
            if (r2 != null) {
                r2.A02(str, false, 3);
                return;
            }
            return;
        }
        AnonymousClass008.A0t("mediapreviewactivity/no qr detected, result=", i);
    }
}
