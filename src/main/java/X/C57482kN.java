package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.List;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57482kN implements AbstractC03150Ez {
    public final /* synthetic */ MediaViewFragment A00;

    public /* synthetic */ C57482kN(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        List<ResolveInfo> queryIntentActivities;
        MediaViewFragment mediaViewFragment = this.A00;
        mediaViewFragment.A0a.A02();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType((Uri) obj, "video/*");
        intent.setFlags(1);
        if (Build.MANUFACTURER.startsWith("Sony") && (queryIntentActivities = mediaViewFragment.A0B().getPackageManager().queryIntentActivities(intent, 0)) != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                StringBuilder A0S = AnonymousClass008.A0S("mediaview/share");
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                A0S.append(activityInfo.packageName);
                A0S.append(" | ");
                AnonymousClass008.A1U(A0S, activityInfo.name);
                if (resolveInfo.activityInfo.name.equals("com.sonyericsson.gallery.MovieView")) {
                    intent.setClassName("com.sonyericsson.gallery", "com.sonyericsson.gallery.MovieView");
                }
            }
        }
        Context A01 = mediaViewFragment.A01();
        AnonymousClass2UI r0 = mediaViewFragment.A0G;
        if (r0 != null) {
            r0.AHr();
        }
        mediaViewFragment.A0Y.A05(A01, intent);
    }
}
