package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Looper;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0We  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC07170We extends AbstractC07180Wf {
    public static AnonymousClass1ND A06;
    public static final AtomicReference A07 = new AtomicReference(null);
    public boolean A00;
    public final Activity A01;
    public final HandlerC07210Wi A02;
    public final AbstractC07200Wh A03 = new C07190Wg(this);
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final boolean A05;

    public AbstractC07170We(Activity activity, AnonymousClass02M r37, AnonymousClass01I r38, AnonymousClass00T r39, AnonymousClass0DG r40, AnonymousClass0AR r41, C000300f r42, AnonymousClass09E r43, AnonymousClass01J r44, AnonymousClass01A r45, AnonymousClass0EP r46, C03160Fa r47, AnonymousClass01X r48, AnonymousClass0BD r49, AnonymousClass0IX r50, AnonymousClass0EO r51, AnonymousClass0BZ r52, AnonymousClass02J r53, AnonymousClass0BB r54, AnonymousClass00C r55, AnonymousClass0HN r56, C02290Bk r57, AnonymousClass0FZ r58, AnonymousClass0HM r59, C016608y r60, C06310Ss r61, AnonymousClass321 r62, AnonymousClass0GW r63, AnonymousClass01T r64, AnonymousClass0I6 r65, AnonymousClass094 r66, AnonymousClass0PB r67, boolean z) {
        super(r37, r38, r39, r40, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67);
        this.A01 = activity;
        this.A05 = z;
        this.A02 = new HandlerC07210Wi(Looper.getMainLooper(), new WeakReference(activity));
    }

    public final Dialog A01(int i, int i2) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(this.A01);
        AnonymousClass01X r2 = this.A07;
        String A062 = r2.A06(i2);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0E = A062;
        r1.A0J = false;
        r3.A07(r2.A06(R.string.retry), new DialogInterface$OnClickListenerC26171Ju(this, i));
        r3.A05(r2.A06(R.string.msg_store_do_not_restore), new DialogInterface$OnClickListenerC26191Jw(this, i));
        return r3.A00();
    }

    public void A02() {
        int A062 = this.A0F.A06();
        AnonymousClass008.A0v("verifymsgstore/usehistoryifexists/backupfilesfound ", A062);
        if (A062 > 0) {
            C002001d.A2O(this.A01, 103);
        } else {
            A03(false, true);
        }
    }

    public void A03(boolean z, boolean z2) {
        String str;
        this.A00 = z;
        StringBuilder A0S = AnonymousClass008.A0S("verifymsgstore/preparemsgstore isregname=");
        boolean z3 = this.A05;
        A0S.append(z3);
        A0S.append(" restorefrombackup=");
        A0S.append(z);
        A0S.append(" skipdialog=");
        if (z2) {
            str = "true";
        } else {
            str = "false";
        }
        AnonymousClass008.A1U(A0S, str);
        if (!z2) {
            Activity activity = this.A01;
            if (!activity.isFinishing() && (!z3 || this.A00)) {
                C002001d.A2O(activity, 100);
            }
        }
        A00();
    }
}
