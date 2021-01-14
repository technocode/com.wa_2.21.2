package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2kL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57462kL implements AbstractC03150Ez {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C57462kL(MediaViewFragment mediaViewFragment, AnonymousClass0M3 r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass0M3 r2 = this.A01;
        Uri uri = (Uri) obj;
        mediaViewFragment.A0a.A02();
        StringBuilder sb = new StringBuilder("mediaview/uri ");
        sb.append(uri);
        Log.d(sb.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        byte b = r2.A0m;
        if (b == 1) {
            intent.setDataAndType(uri, "image/*");
        } else if (b == 3 || b == 13) {
            intent.setDataAndType(uri, "video/*");
        } else if (b != 42 && b != 43) {
            intent.setData(uri);
        } else {
            return;
        }
        intent.setFlags(1);
        Context A012 = mediaViewFragment.A01();
        AnonymousClass2UI r0 = mediaViewFragment.A0G;
        if (r0 != null) {
            r0.AHr();
        }
        mediaViewFragment.A0Y.A05(A012, intent);
    }
}
