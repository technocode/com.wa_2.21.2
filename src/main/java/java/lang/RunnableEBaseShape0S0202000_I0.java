package java.lang;

import X.AnonymousClass01J;
import X.AnonymousClass01S;
import X.AnonymousClass038;
import X.AnonymousClass0E6;
import X.AnonymousClass0XI;
import X.AnonymousClass1UO;
import X.AnonymousClass1XX;
import X.C001000o;
import X.C001801b;
import X.C007303n;
import X.C05360Of;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.util.Log;

public class RunnableEBaseShape0S0202000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0202000_I0(Object obj, int i, int i2, Object obj2, int i3) {
        this.A04 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = obj2;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                AnonymousClass038 r3 = (AnonymousClass038) this.A02;
                int i = this.A00;
                int i2 = this.A01;
                Object obj = this.A03;
                r3.A01(i);
                r3.A02(i2, obj, i);
                return;
            case 1:
                AnonymousClass038 r32 = (AnonymousClass038) this.A02;
                int i3 = this.A00;
                int i4 = this.A01;
                Object obj2 = this.A03;
                r32.A01(i3);
                r32.A02(i4, obj2, i3);
                return;
            case 2:
                AnonymousClass0XI r9 = (AnonymousClass0XI) this.A02;
                DeviceJid deviceJid = (DeviceJid) this.A03;
                int i5 = this.A00;
                int i6 = this.A01;
                AnonymousClass0E6 A0A = C001801b.A0A(deviceJid);
                StringBuilder sb = new StringBuilder("axolotl checking sessions for ");
                sb.append(A0A);
                sb.append(" due to retry receipt for ");
                sb.append(deviceJid);
                Log.i(sb.toString());
                C001000o r5 = r9.A04;
                byte[] bArr = null;
                if (r5.A0W(A0A)) {
                    AnonymousClass1UO r2 = r5.A0D(A0A).A01;
                    if (r2.A00.A03 != i5) {
                        StringBuilder sb2 = new StringBuilder("axolotl deleting session due to registration id change for ");
                        sb2.append(deviceJid);
                        sb2.append(" stop retrying");
                        Log.i(sb2.toString());
                        r5.A0H.A00();
                        r5.A0C.A01(A0A);
                        r5.A0M(A0A);
                        return;
                    }
                    if (i6 >= 2) {
                        StringBuilder sb3 = new StringBuilder("axolotl requiring new session before resending for ");
                        sb3.append(deviceJid);
                        Log.i(sb3.toString());
                        bArr = r2.A00.A05.A01();
                    }
                    if (i6 > 2) {
                        UserJid userJid = deviceJid.userJid;
                        r5.A0H.A00();
                        if (r5.A0X(A0A, new C007303n(userJid, true, "location_msg_id"))) {
                            Log.i("axolotl will wait to send notification until a new prekey has been fetched");
                            return;
                        }
                    }
                    if (i6 == 2) {
                        Log.i("axolotl will record the base key used to send ");
                        UserJid userJid2 = deviceJid.userJid;
                        r5.A0H.A00();
                        r5.A0Q(A0A, new C007303n(userJid2, true, "location_msg_id"), bArr);
                    }
                }
                AnonymousClass01J r0 = r9.A03;
                r0.A00.A01(new SendLiveLocationKeyJob(deviceJid, bArr, i6));
                return;
            case 3:
                AnonymousClass0XI r7 = (AnonymousClass0XI) this.A02;
                AnonymousClass1XX r6 = (AnonymousClass1XX) this.A03;
                int i7 = this.A00;
                int i8 = this.A01;
                StringBuilder sb4 = new StringBuilder("need to send retry receipt; stanzaKey=");
                sb4.append(r6);
                Log.i(sb4.toString());
                byte[] A042 = C05360Of.A04(i7);
                if (i8 > 1) {
                    r7.A02.A03();
                }
                StringBuilder sb5 = new StringBuilder("axolotl sending retry receipt; stanzaKey=");
                sb5.append(r6);
                sb5.append("; localRegistrationId=");
                sb5.append(i7);
                Log.i(sb5.toString());
                AnonymousClass01S r1 = r7.A06;
                UserJid A002 = r6.A00();
                if (A002 != null) {
                    r1.A0T(A002, A042, i8 + 1);
                    return;
                }
                throw null;
            default:
                return;
        }
    }
}
