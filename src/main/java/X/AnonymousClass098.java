package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.098  reason: invalid class name */
public class AnonymousClass098 {
    public static volatile AnonymousClass098 A08;
    public final C000300f A00;
    public final AnonymousClass00S A01;
    public final C006903j A02;
    public final C015408m A03;
    public final AnonymousClass099 A04;
    public final AnonymousClass01P A05;
    public final AnonymousClass00Y A06;
    public final AnonymousClass09D A07;

    public AnonymousClass098(AnonymousClass00S r1, AnonymousClass099 r2, C006903j r3, AnonymousClass00Y r4, C000300f r5, C015408m r6, AnonymousClass01P r7, AnonymousClass09D r8) {
        this.A01 = r1;
        this.A04 = r2;
        this.A02 = r3;
        this.A06 = r4;
        this.A00 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A07 = r8;
    }

    public static AnonymousClass098 A00() {
        if (A08 == null) {
            synchronized (AnonymousClass098.class) {
                if (A08 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    if (AnonymousClass099.A04 == null) {
                        synchronized (AnonymousClass099.class) {
                            if (AnonymousClass099.A04 == null) {
                                AnonymousClass099.A04 = new AnonymousClass099(C014408c.A00(), C006903j.A00(), AnonymousClass09A.A02, AnonymousClass094.A00());
                            }
                        }
                    }
                    A08 = new AnonymousClass098(A002, AnonymousClass099.A04, C006903j.A00(), AnonymousClass00Y.A00(), C000300f.A00(), C015408m.A00(), AnonymousClass01P.A00(), AnonymousClass09D.A00());
                }
            }
        }
        return A08;
    }

    public final int A01(AnonymousClass02N r4) {
        if (AnonymousClass1VY.A0a(r4)) {
            return 1;
        }
        C08560bL A052 = this.A02.A05(r4);
        int i = !A05(r4);
        if (A052 == null) {
            return i ^ 1;
        }
        if (i != 0) {
            return A052.A02;
        }
        return 1;
    }

    public final List A02() {
        String A012 = this.A03.A01("call_not_spam_jids");
        if (A012 == null || A012.length() <= 0) {
            return null;
        }
        return AnonymousClass1VY.A0G(AnonymousClass02N.class, Arrays.asList(A012.split(",")));
    }

    public final void A03(AnonymousClass02N r5, Integer num) {
        AnonymousClass212 r3 = new AnonymousClass212();
        r3.A00 = num;
        r3.A01 = 1;
        r3.A02 = r5.getRawString();
        AnonymousClass00Y r2 = this.A06;
        r2.A0B(r3, null, false);
        r2.A04();
    }

    public void A04(AnonymousClass02N r6, boolean z, Integer num) {
        if (this.A00.A0D(AbstractC000400g.A2Z)) {
            AnonymousClass09D r4 = this.A07;
            long A052 = this.A01.A05();
            if (r4 != null) {
                try {
                    JSONObject A022 = r4.A02(r6);
                    if (A022 == null) {
                        A022 = new JSONObject();
                    }
                    A022.put("tb_last_action_ts", A052);
                    r4.A03(r6, A022);
                } catch (JSONException unused) {
                }
                if (z) {
                    A03(r6, num);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public boolean A05(AnonymousClass02N r4) {
        if (r4 == null) {
            StringBuilder sb = new StringBuilder("spamManager/isCallNotSpamProp/invalid jid: ");
            sb.append(r4);
            Log.e(sb.toString());
            return false;
        }
        List A022 = A02();
        if (A022 == null || !A022.contains(r4)) {
            return false;
        }
        return true;
    }

    public boolean A06(AnonymousClass02N r3) {
        int A012 = A01(r3);
        return A012 == -1 || A012 == -2 || A012 == 0;
    }
}
