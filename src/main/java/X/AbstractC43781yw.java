package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1yw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC43781yw extends AnonymousClass0RL {
    public AnonymousClass1VM A03() {
        if (this instanceof C74733bP) {
            AbstractC59432ne r4 = (AbstractC59432ne) this;
            C05870Qv A00 = C05870Qv.A00("BR");
            if (A00 != null) {
                return new C43771yv(A00, r4.A04, r4.A06, r4);
            }
            return null;
        } else if (this instanceof C74723bO) {
            C74723bO r2 = (C74723bO) this;
            C05870Qv A002 = C05870Qv.A00("BR");
            String str = r2.A0H;
            int i = ((AbstractC460627w) r2).A00;
            int i2 = 0;
            int i3 = 0;
            if (r2.A0Q) {
                i3 = 2;
            }
            if (r2.A0P) {
                i2 = 2;
            }
            String str2 = r2.A0J;
            long j = ((AbstractC460627w) r2).A05;
            C43761yu r3 = new C43761yu(A002, str, r2.A05(), i, i3, i2, str2, ((AbstractC460627w) r2).A01);
            r3.A03 = j;
            r3.A06 = r2;
            r3.A02 = r2.A01;
            return r3;
        } else if (!(this instanceof C74713bN)) {
            return null;
        } else {
            C74713bN r13 = (C74713bN) this;
            C05870Qv A003 = C05870Qv.A00("BR");
            if (A003 == null) {
                return null;
            }
            C43751yt r1 = new C43751yt(A003, ((AnonymousClass27v) r13).A04, ((AnonymousClass27v) r13).A00, -1, 0, 0, "", r13.A05, null, r13);
            r1.A02 = r13.A00;
            return r1;
        }
    }

    public String A04() {
        if (this instanceof C74713bN) {
            return null;
        }
        if (!(this instanceof C74463ay)) {
            return !(this instanceof AbstractC59432ne) ? null : null;
        }
        C74463ay r1 = (C74463ay) this;
        if (!TextUtils.isEmpty(r1.A06)) {
            return r1.A06;
        }
        try {
            return new JSONObject(r1.A0A).optString("account_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    public String A05() {
        if (this instanceof AbstractC59432ne) {
            return null;
        }
        if (!(this instanceof AbstractC460627w)) {
            return ((AnonymousClass27v) this).A05;
        }
        return ((AbstractC460627w) this).A0A;
    }

    public boolean A06() {
        if (!(this instanceof AbstractC460627w)) {
            return true;
        }
        return ((AbstractC460627w) this).A0X;
    }
}
