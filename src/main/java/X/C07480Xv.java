package X;

import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: X.0Xv  reason: invalid class name and case insensitive filesystem */
public class C07480Xv implements AnonymousClass0C0 {
    public static volatile C07480Xv A03;
    public final AnonymousClass0DH A00;
    public final AnonymousClass0KJ A01;
    public final AnonymousClass0AR A02;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{210};
    }

    public C07480Xv(AnonymousClass0AR r1, AnonymousClass0DH r2, AnonymousClass0KJ r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i != 210) {
            return false;
        }
        AnonymousClass0M5 r1 = (AnonymousClass0M5) message.obj;
        if (r1 == null) {
            return true;
        }
        HashSet hashSet = new HashSet();
        for (AnonymousClass0M5 r12 : r1.A0H("collection")) {
            String A0G = r12.A0G("name", null);
            if (!TextUtils.isEmpty(A0G)) {
                hashSet.add(A0G);
            }
        }
        AnonymousClass0DH r4 = this.A00;
        r4.A0N.ANF(new RunnableEBaseShape0S0210000_I0(r4, hashSet, this.A01.A01(null), 2));
        Parcelable parcelable = message.getData().getParcelable("stanzaKey");
        AnonymousClass00E.A04(parcelable, "stanzaKey is null");
        this.A02.A0M((AnonymousClass1XX) parcelable);
        return true;
    }
}
