package java.lang;

import X.AbstractC007503q;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass09H;
import X.AnonymousClass0CH;
import X.AnonymousClass0EJ;
import X.AnonymousClass0M3;
import X.AnonymousClass1W7;
import X.AnonymousClass1W8;
import X.AnonymousClass1WA;
import X.AnonymousClass1WK;
import X.AnonymousClass1XQ;
import X.AnonymousClass2T4;
import X.AnonymousClass2TE;
import X.C03250Fl;
import X.C04360Kb;
import X.C04420Kh;
import X.C40531tQ;
import X.C49982Sy;
import X.C50132Tn;
import X.C56862jJ;
import X.C56882jL;
import android.os.Bundle;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;

public class RunnableEBaseShape0S0510000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public RunnableEBaseShape0S0510000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = z;
    }

    public final void run() {
        boolean z;
        switch (this.A06) {
            case 0:
                Collection collection = (Collection) this.A01;
                boolean z2 = this.A05;
                AnonymousClass02M r6 = (AnonymousClass02M) this.A02;
                AnonymousClass01X r8 = (AnonymousClass01X) this.A03;
                Object obj = this.A04;
                ((C04360Kb) this.A00).A0R(collection, z2);
                if (collection.size() == 1) {
                    r6.A0D(r6.A04.A00.getString(R.string.message_deleted), 0);
                } else {
                    r6.A0D(r8.A0A(R.plurals.messages_deleted, (long) collection.size(), Integer.valueOf(collection.size())), 0);
                }
                r6.A02.post(new RunnableEBaseShape0S0100000_I0_0(obj, 12));
                return;
            case 1:
                C03250Fl r1 = (C03250Fl) this.A00;
                byte[] bArr = (byte[]) this.A01;
                byte[] bArr2 = (byte[]) this.A02;
                AnonymousClass1XQ[] r9 = (AnonymousClass1XQ[]) this.A03;
                AnonymousClass1XQ r82 = (AnonymousClass1XQ) this.A04;
                boolean z3 = this.A05;
                AnonymousClass00E.A01();
                if (z3) {
                    r1.A05();
                }
                synchronized (r1) {
                    r1.A02 = true;
                    r1.A04 = r9;
                }
                AnonymousClass09H r62 = r1.A0B;
                Bundle bundle = new Bundle();
                bundle.putByteArray("identity", bArr);
                bundle.putByteArray("registration", bArr2);
                bundle.putByte("type", (byte) 5);
                int length = r9.length;
                AnonymousClass1WK[] r3 = new AnonymousClass1WK[length];
                for (int i = 0; i < length; i++) {
                    r3[i] = new AnonymousClass1WK(r9[i]);
                }
                bundle.putParcelableArray("preKeys", r3);
                bundle.putParcelable("signedPreKey", new AnonymousClass1WK(r82));
                bundle.putByteArray("vname", null);
                r62.A09(Message.obtain(null, 0, 85, 0, bundle));
                return;
            case 2:
                C04360Kb r4 = (C04360Kb) this.A00;
                C40531tQ r5 = (C40531tQ) this.A01;
                AnonymousClass2T4 r7 = (AnonymousClass2T4) this.A02;
                AnonymousClass0M3 r83 = (AnonymousClass0M3) this.A03;
                byte[] bArr3 = (byte[]) this.A04;
                boolean z4 = this.A05;
                for (AbstractC007503q r12 : Collections.unmodifiableList(r5.A01)) {
                    r4.A0W.A0P(r12, 1);
                }
                r4.A0p.A04(r5, new C50132Tn(true, r5.A04()), r7, r83, true, z4, bArr3);
                return;
            case 3:
                C04420Kh r42 = (C04420Kh) this.A00;
                AbstractC007503q r2 = (AbstractC007503q) this.A01;
                StringBuilder A0S = AnonymousClass008.A0S("app/mediajobmanager/enqueuemediaresendupload enqueuing message: ");
                A0S.append(r2.A0n);
                Log.i(A0S.toString());
                C40531tQ r122 = new C40531tQ(Collections.singletonList(r2));
                AnonymousClass2TE A002 = AnonymousClass2TE.A00(r42.A0A, new C50132Tn(false, r122.A04()), r122, r42.A01, r42.A0B, false);
                AnonymousClass0EJ r22 = r42.A07;
                C56862jJ A062 = r22.A06(A002, false);
                A062.A00().A02(3);
                r42.A06(A062, r122);
                r22.A0B(A062, new C56882jL(A062.A01(), A062, (Jid) this.A02, (AnonymousClass02N) this.A03, this.A05, (UserJid) this.A04));
                return;
            case 4:
                AnonymousClass0CH r63 = (AnonymousClass0CH) this.A00;
                C49982Sy r84 = (C49982Sy) this.A01;
                AnonymousClass0M3 r52 = (AnonymousClass0M3) this.A02;
                AnonymousClass1WA r72 = (AnonymousClass1WA) this.A03;
                AnonymousClass1W7 r43 = (AnonymousClass1W7) this.A04;
                boolean z5 = this.A05;
                AnonymousClass0CH.A01(true, r84, r52, r72);
                r63.A0Q.A01(r52.A02, r72.A0C);
                AnonymousClass1W8 A012 = r84.A01();
                if (A012 != null) {
                    if (r43 != null) {
                        if (A012.A01 == 13) {
                            if (r84.A04() != null) {
                                z = r84.A04().booleanValue();
                            } else {
                                z = false;
                            }
                            r43.AFF(z);
                        } else {
                            r43.AFG(A012, r84);
                        }
                    }
                    r63.A0A(z5, r52, A012.A01);
                    return;
                }
                throw null;
            default:
                return;
        }
    }
}
