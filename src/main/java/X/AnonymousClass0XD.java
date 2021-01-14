package X;

import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0XD  reason: invalid class name */
public class AnonymousClass0XD implements AnonymousClass0C0 {
    public static volatile AnonymousClass0XD A09;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass0EQ A03;
    public final AnonymousClass0I8 A04;
    public final AnonymousClass01L A05;
    public final AnonymousClass0AR A06;
    public final AnonymousClass02H A07;
    public final List A08 = new ArrayList();

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{204};
    }

    public AnonymousClass0XD(AnonymousClass009 r3, AnonymousClass01I r4, AnonymousClass00T r5, AnonymousClass0AR r6, AnonymousClass01A r7, AnonymousClass0EQ r8, AnonymousClass01L r9, AnonymousClass0I8 r10) {
        this.A00 = r3;
        this.A01 = r4;
        this.A06 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A04 = r10;
        this.A07 = new AnonymousClass02H(r5, false);
    }

    public static AnonymousClass0XD A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0XD.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0XD(AnonymousClass009.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass0AR.A00(), AnonymousClass01A.A00(), AnonymousClass0EQ.A00(), AnonymousClass01L.A00(), AnonymousClass0I8.A01());
                }
            }
        }
        return A09;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        AnonymousClass2W6 r12;
        String A0F;
        AnonymousClass0M5 A0D;
        byte[] bArr;
        long A062;
        if (i != 204) {
            return false;
        }
        AnonymousClass1XX r15 = (AnonymousClass1XX) message.getData().getParcelable("stanzaKey");
        AnonymousClass00E.A04(r15, "stanzaKey is null");
        AnonymousClass01L r8 = this.A05;
        if (!r8.A05.A03()) {
            this.A06.A0M(r15);
            return true;
        }
        AnonymousClass0M5 r7 = (AnonymousClass0M5) message.obj;
        if (r7.A0D("update") != null) {
            r12 = new AnonymousClass2W6(r7.A0E("update").A0F("hash"), r15);
            if (r7.A05("offline", -1) == 0) {
                List list = this.A08;
                synchronized (list) {
                    list.add(r12);
                }
                return true;
            }
        } else {
            AnonymousClass0M5 A0D2 = r7.A0D("add");
            AnonymousClass0M5 A0D3 = r7.A0D("remove");
            if (A0D2 != null) {
                A0F = A0D2.A0F("device_hash");
                A0D = A0D2.A0D("key-index-list");
            } else if (A0D3 != null) {
                A0F = A0D3.A0F("device_hash");
                A0D = A0D3.A0D("key-index-list");
            } else {
                Log.e("DeviceUpdateNotificationHandler/handleXmppMessage/unknown type of device notification.");
                throw new AnonymousClass1XC("unknown device notification not found");
            }
            AnonymousClass009 r1 = this.A00;
            UserJid userJid = (UserJid) r7.A09(UserJid.class, "from", r1);
            AnonymousClass0PU A0t = C002001d.A0t(r1, A0D2);
            AnonymousClass0PU A0t2 = C002001d.A0t(r1, A0D3);
            if (A0D == null) {
                bArr = null;
            } else {
                bArr = A0D.A01;
            }
            if (A0D == null) {
                A062 = 0;
            } else {
                A062 = A0D.A06("ts");
            }
            r12 = new AnonymousClass2W6(userJid, A0F, r15, A0t, A0t2, bArr, A062);
        }
        this.A07.execute(new RunnableEBaseShape0S0800000_I0(this.A00, this.A01, this.A06, this.A02, this.A03, r8, this.A04, Collections.singletonList(r12), 1));
        return true;
    }
}
