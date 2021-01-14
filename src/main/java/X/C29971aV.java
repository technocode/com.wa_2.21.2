package X;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;

/* renamed from: X.1aV  reason: invalid class name and case insensitive filesystem */
public class C29971aV extends AnonymousClass0Hs {
    @Override // X.AnonymousClass0Hs
    public RemoteViews A02(AbstractC14530mR r4) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        AnonymousClass03E r0 = this.A00;
        if (r0 != null) {
            RemoteViews remoteViews = r0.A0E;
            if (remoteViews == null) {
                return null;
            }
            return A07(remoteViews, true);
        }
        throw null;
    }

    @Override // X.AnonymousClass0Hs
    public RemoteViews A03(AbstractC14530mR r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT < 24 && (remoteViews = this.A00.A0E) != null) {
            return A07(remoteViews, false);
        }
        return null;
    }

    @Override // X.AnonymousClass0Hs
    public RemoteViews A04(AbstractC14530mR r4) {
        if (Build.VERSION.SDK_INT >= 24 || this.A00 != null) {
            return null;
        }
        throw null;
    }

    @Override // X.AnonymousClass0Hs
    public void A06(AbstractC14530mR r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((C30011aZ) r3).A02.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r18.A00.A0C == null) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.RemoteViews A07(android.widget.RemoteViews r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 764
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29971aV.A07(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
    }
}
