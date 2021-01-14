package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2kE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57392kE implements AbstractC03150Ez {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C57392kE(MediaViewFragment mediaViewFragment, AnonymousClass0M3 r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass0M3 r1 = this.A01;
        mediaViewFragment.A0a.A02();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType((Uri) obj, r1.A07);
        intent.setFlags(1);
        Context A012 = mediaViewFragment.A01();
        AnonymousClass2UI r0 = mediaViewFragment.A0G;
        if (r0 != null) {
            r0.AHr();
        }
        mediaViewFragment.A0Y.A05(A012, intent);
    }
}
