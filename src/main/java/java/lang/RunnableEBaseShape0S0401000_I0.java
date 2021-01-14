package java.lang;

import X.AbstractC007503q;
import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass02P;
import X.AnonymousClass0E6;
import X.AnonymousClass0I8;
import X.AnonymousClass0KZ;
import X.AnonymousClass0L0;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0MI;
import X.AnonymousClass0MP;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QZ;
import X.AnonymousClass0XI;
import X.AnonymousClass1UF;
import X.AnonymousClass1UK;
import X.AnonymousClass1XX;
import X.C001000o;
import X.C001801b;
import X.C05360Of;
import X.C55862hg;
import android.view.View;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.ArrayList;

public class RunnableEBaseShape0S0401000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableEBaseShape0S0401000_I0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.A05 = 0;
        this.A00 = i;
        this.A03 = arrayList;
        this.A01 = arrayList2;
        this.A04 = arrayList3;
        this.A02 = arrayList4;
    }

    public RunnableEBaseShape0S0401000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A00 = i;
    }

    public void run() {
        C001000o r2;
        AnonymousClass1UF A052;
        switch (this.A05) {
            case 0:
                for (int i = 0; i < this.A00; i++) {
                    AnonymousClass0Q7.A0g((View) ((AbstractList) this.A03).get(i), (String) ((AbstractList) this.A01).get(i));
                    AnonymousClass0Q7.A0g((View) ((AbstractList) this.A04).get(i), (String) ((AbstractList) this.A02).get(i));
                }
                return;
            case 1:
                AnonymousClass0L0 r5 = (AnonymousClass0L0) this.A01;
                DeviceJid deviceJid = (DeviceJid) this.A02;
                byte[] bArr = (byte[]) this.A03;
                byte[] bArr2 = (byte[]) this.A04;
                byte b = (byte) this.A00;
                if (!deviceJid.isPrimary()) {
                    AnonymousClass0I8 r1 = r5.A0R;
                    if (!r1.A09(deviceJid, bArr, bArr2, b)) {
                        Log.e("recvmessagelistener/on-get-identity-success/invalid device identity");
                        r1.A06(deviceJid, true);
                        return;
                    }
                }
                try {
                    r5.A0I.A0N(C001801b.A0A(deviceJid), new AnonymousClass0QZ(C001801b.A08(C05360Of.A08(new byte[]{b}, bArr2))));
                    AnonymousClass02M r22 = r5.A02;
                    r22.A02.post(new RunnableEBaseShape1S0200000_I0_0(r5, deviceJid, 25));
                    return;
                } catch (AnonymousClass1UK e) {
                    Log.e("recvmessagelistener/on-get-identity-success/invalidkey/", e);
                    return;
                }
            case 2:
                AnonymousClass0KZ r6 = (AnonymousClass0KZ) this.A01;
                AnonymousClass0M3 r52 = (AnonymousClass0M3) this.A02;
                int i2 = this.A00;
                AbstractC007503q r4 = (AbstractC007503q) this.A03;
                AnonymousClass0M4 r3 = (AnonymousClass0M4) this.A04;
                boolean z = false;
                if (i2 == 1 || i2 == 2 || (r52 instanceof AnonymousClass0MI) || ((r52 instanceof AnonymousClass0MP) && ((AbstractC007503q) r52).A04 == 1)) {
                    z = true;
                }
                StringBuilder A0S = AnonymousClass008.A0S("unsentMessages/sendUnsentMessages/send failed, will try to resend it from the beginning; key=");
                A0S.append(r4.A0n.A01);
                A0S.append(" canUpload=");
                A0S.append(z);
                Log.d(A0S.toString());
                if (r3 != null) {
                    r3.A0P = false;
                }
                ((AbstractC007503q) r52).A08 = 0;
                if (z) {
                    r6.A01.A03(r52, false, false);
                    return;
                } else {
                    r6.A06.A0Q(r4, -1);
                    return;
                }
            case 3:
                AnonymousClass0XI r53 = (AnonymousClass0XI) this.A01;
                DeviceJid deviceJid2 = (DeviceJid) this.A02;
                int i3 = this.A00;
                AnonymousClass1XX r8 = (AnonymousClass1XX) this.A03;
                AnonymousClass02P r42 = (AnonymousClass02P) this.A04;
                StringBuilder sb = new StringBuilder("axolotl received a location notification; jid=");
                sb.append(deviceJid2);
                sb.append("; retryCount=");
                sb.append(i3);
                Log.i(sb.toString());
                AnonymousClass0E6 A0A = C001801b.A0A(deviceJid2);
                C55862hg r12 = new C55862hg(r53, r8, A0A);
                int i4 = r42.A00;
                if (i4 == 0) {
                    r2 = r53.A04;
                    A052 = r2.A04(A0A, r42.A02, r12);
                } else if (i4 == 1) {
                    r2 = r53.A04;
                    A052 = r2.A05(A0A, r42.A02, r12);
                } else {
                    StringBuilder sb2 = new StringBuilder("axolotl unrecognized ciphertext type; stanzaKey=");
                    sb2.append(r8);
                    sb2.append("; type=");
                    AnonymousClass008.A1M(sb2, i4);
                    return;
                }
                int i5 = A052.A00;
                if (i5 != 0) {
                    AnonymousClass008.A0w("axolotl error; status=", i5);
                    if (i5 == -1005 || i5 == -1008 || i5 == -1003 || i5 == -1002) {
                        int A022 = r2.A08.A02();
                        AnonymousClass02M r0 = r53.A01;
                        r0.A02.post(new RunnableEBaseShape0S0202000_I0(r53, A022, i3, r8, 3));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
