package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0Kk  reason: invalid class name and case insensitive filesystem */
public class C04450Kk {
    public static volatile C04450Kk A04;
    public final C04460Kl A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass0AR A03;

    public C04450Kk(AnonymousClass01I r1, AnonymousClass0AR r2, C000300f r3, C04460Kl r4) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    public static C04450Kk A00() {
        if (A04 == null) {
            synchronized (C04450Kk.class) {
                AnonymousClass01I A002 = AnonymousClass01I.A00();
                AnonymousClass0AR A003 = AnonymousClass0AR.A00();
                C000300f A004 = C000300f.A00();
                if (C04460Kl.A01 == null) {
                    synchronized (C04460Kl.class) {
                        C04460Kl.A01 = new C04460Kl(JniBridge.getInstance());
                    }
                }
                A04 = new C04450Kk(A002, A003, A004, C04460Kl.A01);
            }
        }
        return A04;
    }

    public static final void A01(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("expected media key of length 32 bytes.");
        } else if (bArr2.length != 12) {
            throw new IllegalArgumentException("expected iv of length 12 bytes.");
        }
    }

    public void A02(AnonymousClass0M3 r7, int i, Jid jid, String str, AnonymousClass02N r11, boolean z, UserJid userJid, String str2) {
        byte[] bArr;
        byte[] bArr2;
        if (i == 1 || this.A01.A08(DeviceJid.of(jid))) {
            if (!this.A02.A0D(AbstractC000400g.A1Z) || r7 == null) {
                bArr = null;
                bArr2 = null;
            } else {
                AnonymousClass0M4 r0 = r7.A02;
                if (r0 != null) {
                    byte[] bArr3 = r0.A0U;
                    if (bArr3 != null) {
                        String str3 = r7.A0n.A01;
                        if (i != 1) {
                            str2 = null;
                        }
                        C20990xv r1 = new C20990xv(str3, str2, i);
                        bArr2 = C007603r.A0C(12);
                        A01(bArr3, bArr2);
                        bArr = (byte[]) JniBridge.jvidispatchOOOOO(2, str3, r1.A00, bArr3, bArr2);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            AnonymousClass0AR r12 = this.A03;
            if (r12.A04.A06) {
                AnonymousClass09H r3 = r12.A08;
                Message obtain = Message.obtain(null, 0, 34, 0);
                Bundle data = obtain.getData();
                data.putString("id", str);
                data.putParcelable("jid", jid);
                data.putParcelable("remote_jid", r11);
                data.putBoolean("from_me", z);
                data.putParcelable("participant", userJid);
                data.putByteArray("enc_data", bArr);
                data.putByteArray("enc_iv", bArr2);
                data.putInt("error_code", i);
                r3.A09(obtain);
            }
        }
    }
}
