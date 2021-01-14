package X;

import android.app.Activity;
import com.whatsapp.RequestPermissionActivity;
import java.util.List;

/* renamed from: X.0KB  reason: invalid class name */
public class AnonymousClass0KB {
    public static volatile AnonymousClass0KB A06;
    public final AnonymousClass03S A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass0KD A02;
    public final AnonymousClass0KI A03;
    public final C08580bN A04 = new C08580bN();
    public final AnonymousClass00T A05;

    public AnonymousClass0KB(AnonymousClass00G r3, AnonymousClass00T r4, AnonymousClass088 r5, AnonymousClass03S r6, AnonymousClass00D r7) {
        AnonymousClass0KC r1 = new AnonymousClass0KC(r3, r5);
        this.A05 = r4;
        this.A00 = r6;
        this.A02 = new AnonymousClass0KD(r3, r1);
        this.A03 = new AnonymousClass0KI(r3, r1);
        this.A01 = r7;
    }

    public static AnonymousClass0KB A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0KB.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0KB(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass088.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A06;
    }

    public boolean A01() {
        AnonymousClass0KD r3 = this.A02;
        int i = 0;
        while (true) {
            AnonymousClass0KF[] r1 = r3.A00;
            if (i >= r1.length) {
                return false;
            }
            if (!r1[i].ABg()) {
                i++;
            } else if (!this.A01.A00.getBoolean("is_status_sharing_with_fb_disabled", false)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final boolean A02(List list, Activity activity, AnonymousClass037 r10, AnonymousClass0KE r11) {
        boolean A0J;
        AnonymousClass03S r1 = this.A00;
        if (!r1.A06()) {
            if (r10 != null) {
                A0J = RequestPermissionActivity.A0O(r10, r1);
            } else {
                A0J = RequestPermissionActivity.A0J(activity, r1);
            }
            if (!A0J) {
                return false;
            }
        }
        this.A05.ANF(new RunnableEBaseShape0S0400000_I0(this, r11, list, activity, 10));
        return true;
    }
}
