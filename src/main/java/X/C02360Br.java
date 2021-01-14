package X;

import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Br  reason: invalid class name and case insensitive filesystem */
public class C02360Br implements AbstractC02370Bs, AbstractC02380Bt, AnonymousClass0AZ {
    public static AbstractC02390Bu A0F = C57762kp.A00;
    public static AbstractC02390Bu A0G = C57772kq.A00;
    public static volatile C02360Br A0H;
    public final AnonymousClass0AV A00;
    public final AnonymousClass0CD A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass09G A03;
    public final AnonymousClass01J A04;
    public final AnonymousClass09K A05;
    public final AnonymousClass0AX A06;
    public final C02120As A07;
    public final AnonymousClass01T A08;
    public final AnonymousClass09E A09;
    public final AnonymousClass0CB A0A;
    public final AnonymousClass09H A0B;
    public final AnonymousClass00T A0C;
    public final C02400Bv A0D;
    public final AnonymousClass0C4 A0E;

    public C02360Br(AnonymousClass01I r1, AnonymousClass00T r2, C02400Bv r3, AnonymousClass0C4 r4, AnonymousClass09E r5, AnonymousClass09G r6, AnonymousClass01J r7, AnonymousClass09H r8, AnonymousClass0CB r9, AnonymousClass09K r10, AnonymousClass0CD r11, AnonymousClass0AV r12, C02120As r13, AnonymousClass01T r14, AnonymousClass0AX r15) {
        this.A02 = r1;
        this.A0C = r2;
        this.A0D = r3;
        this.A0E = r4;
        this.A09 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A0B = r8;
        this.A0A = r9;
        this.A05 = r10;
        this.A01 = r11;
        this.A00 = r12;
        this.A07 = r13;
        this.A08 = r14;
        this.A06 = r15;
    }

    public static C02360Br A00() {
        if (A0H == null) {
            synchronized (AnonymousClass0AR.class) {
                if (A0H == null) {
                    AnonymousClass01I A002 = AnonymousClass01I.A00();
                    AnonymousClass00T A003 = C002101e.A00();
                    C02400Bv A004 = C02400Bv.A00();
                    AnonymousClass0C4 A005 = AnonymousClass0C4.A00();
                    AnonymousClass09E A006 = AnonymousClass09E.A00();
                    AnonymousClass09G A007 = AnonymousClass09G.A00();
                    AnonymousClass01J A008 = AnonymousClass01J.A00();
                    AnonymousClass0AN.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    C014308b.A00();
                    AnonymousClass0CB A009 = AnonymousClass0CB.A00();
                    AnonymousClass09K r12 = AnonymousClass09K.A07;
                    AnonymousClass0BB.A00();
                    AnonymousClass0CD A0010 = AnonymousClass0CD.A00();
                    AnonymousClass01P.A00();
                    A0H = new C02360Br(A002, A003, A004, A005, A006, A007, A008, A012, A009, r12, A0010, AnonymousClass0AV.A00(), C02120As.A00(), AnonymousClass01T.A00(), AnonymousClass0AX.A00());
                }
            }
        }
        return A0H;
    }

    public void A01(int i, AnonymousClass02N r9, long j, int i2) {
        if (!AnonymousClass1VY.A0d(r9)) {
            A0C(new AnonymousClass1XZ(r9, i, j, 0), i2);
        }
    }

    public void A02(int i, String str, String str2) {
        if (this.A05.A06 && str != null) {
            this.A0B.A09(Message.obtain(null, 0, 49, 0, new AnonymousClass226(i, str, str2)));
        }
    }

    public final void A03(AnonymousClass0AW r7, boolean z) {
        if (this.A05.A06 && this.A0D.A03()) {
            double A002 = r7.A00();
            if (!Double.isNaN(A002)) {
                AnonymousClass0C4 r3 = this.A0E;
                AnonymousClass1YZ r1 = new AnonymousClass1YZ((int) A002, r7.A01(), z);
                if (!r1.equals(r3.A0U.getAndSet(r1))) {
                    this.A0B.A09(Message.obtain(null, 0, 56, 0, new C448721z(r1)));
                }
            }
        }
    }

    public void A04(AnonymousClass0OP r9, boolean z) {
        C02400Bv r3 = this.A0D;
        if ((r3.A03() || z) && AnonymousClass1VY.A0T(r9)) {
            ArrayList arrayList = new ArrayList(this.A08.A01(r9).A03().A02());
            AnonymousClass01I r0 = this.A02;
            r0.A04();
            arrayList.remove(r0.A03);
            AnonymousClass3WN r2 = new AnonymousClass3WN(this, r9, z);
            ((AbstractC67843As) r2).A00 = r3.A01().A03;
            AnonymousClass0C4 r02 = this.A0E;
            AnonymousClass237 r1 = new AnonymousClass237(r02, r2);
            String A032 = r02.A03();
            AnonymousClass01J r5 = this.A04;
            r5.A00.A01(new SendWebForwardJob(A032, r3.A01().A03, Message.obtain(null, 0, 51, 0, new C448621y(A032, r9, arrayList, r1))));
        }
    }

    public void A05(AnonymousClass02N r12, Collection collection, int i) {
        C02400Bv r3 = this.A0D;
        if (r3.A03() && r12 != null && collection != null && collection.size() != 0) {
            AnonymousClass3WQ r1 = new AnonymousClass3WQ(this, r12, collection, i);
            ((AbstractC67843As) r1).A00 = r3.A01().A03;
            AnonymousClass0C4 r2 = this.A0E;
            AnonymousClass237 r10 = new AnonymousClass237(r2, r1);
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC007503q) it.next()).A0n);
            }
            String A032 = r2.A03();
            AnonymousClass01J r4 = this.A04;
            String str = r3.A01().A03;
            AnonymousClass1XZ r9 = new AnonymousClass1XZ(r12, 2);
            r9.A00 = i;
            r4.A00.A01(new SendWebForwardJob(A032, str, Message.obtain(null, 0, 54, 0, new AnonymousClass225(A032, r12, arrayList, r9, r10))));
        }
    }

    public void A06(AnonymousClass02N r8, boolean z) {
        if (r8 != null && !AnonymousClass1VY.A0d(r8)) {
            C02400Bv r3 = this.A0D;
            if (r3.A03()) {
                AnonymousClass3WO r2 = new AnonymousClass3WO(this, r8, z);
                ((AbstractC67843As) r2).A00 = r3.A01().A03;
                AnonymousClass0C4 r0 = this.A0E;
                AnonymousClass237 r1 = new AnonymousClass237(r0, r2);
                String A032 = r0.A03();
                AnonymousClass01J r5 = this.A04;
                r5.A00.A01(new SendWebForwardJob(A032, r3.A01().A03, Message.obtain(null, 0, 48, 0, new AnonymousClass223(A032, r8, z, r1))));
            }
        }
    }

    public void A07(Jid jid, String str, boolean z, String str2, String str3, long j, String str4) {
        AnonymousClass0C4 r2;
        AnonymousClass0K4 r0;
        StringBuilder A0Z = AnonymousClass008.A0Z("app/xmpp/recv/qr_terminate recv: ", str2, " local: ");
        C02400Bv r1 = this.A0D;
        A0Z.append(r1.A01().A03);
        A0Z.append(" clear: ");
        A0Z.append(z);
        Log.i(A0Z.toString());
        if (!r1.A03() || !r1.A01().A03.equals(str2)) {
            r2 = this.A0E;
            r2.A0C(j, str3);
        } else {
            Handler handler = this.A01.A00;
            handler.removeMessages(5);
            handler.removeMessages(3);
            handler.removeMessages(4);
            r2 = this.A0E;
            r2.A05 = false;
            r2.A0B();
            r2.A0C(j, r2.A0L.A01().A00);
            r2.A0F(z);
        }
        if (str2 != null) {
            if (!str2.equals(r1.A01().A03) && str3 != null && z && r2.A05().containsKey(str3)) {
                r2.A0H(false, str3);
                r2.A0A();
            }
        } else if (!(str4 == null || str3 == null || !z || (r0 = (AnonymousClass0K4) r2.A05().get(str3)) == null)) {
            byte[] decode = Base64.decode(r0.A0B, 0);
            byte[] bArr = new byte[32];
            System.arraycopy(decode, 0, bArr, 0, 32);
            byte[] bArr2 = new byte[32];
            System.arraycopy(decode, 32, bArr2, 0, 32);
            byte[] A012 = AnonymousClass3WM.A01(bArr2, bArr);
            if (A012 != null && Base64.encodeToString(A012, 2).equals(str4)) {
                r2.A0H(false, str3);
                r2.A0A();
            }
        }
        this.A03.A09(str, jid, "web");
    }

    public void A08(UserJid userJid) {
        if (this.A05.A06 && this.A0D.A03() && userJid != null) {
            this.A0C.ANF(new RunnableEBaseShape3S0200000_I0_2(this, userJid, 24));
        }
    }

    public void A09(UserJid userJid, C02840Dr r7, long j) {
        if (this.A0D.A03() && r7 != null && userJid != null) {
            this.A0B.A09(Message.obtain(null, 0, 155, 0, new AnonymousClass22B(userJid, r7.A09(), j)));
        }
    }

    public void A0A(C007303n r8, int i) {
        C02400Bv r3 = this.A0D;
        if (!r3.A03()) {
            return;
        }
        if (i == 0 || i == 5 || i == 13 || i == 7 || i == 8) {
            AnonymousClass3WT r2 = new AnonymousClass3WT(this, r8, i);
            ((AbstractC67843As) r2).A00 = r3.A01().A03;
            AnonymousClass0C4 r0 = this.A0E;
            AnonymousClass237 r1 = new AnonymousClass237(r0, r2);
            String A032 = r0.A03();
            AnonymousClass01J r5 = this.A04;
            r5.A00.A01(new SendWebForwardJob(A032, r3.A01().A03, Message.obtain(null, 0, 47, 0, new AnonymousClass22C(A032, r8, i, r1))));
            return;
        }
        Log.e("app/xmpp/send/qr_msg_status invalid status");
    }

    public void A0B(AbstractC007503q r12, String str) {
        if (r12 != null && str != null) {
            C02400Bv r2 = this.A0D;
            if (r2.A03() && (r12.A07() instanceof UserJid)) {
                AnonymousClass3WX r1 = new AnonymousClass3WX(this, r12, str);
                ((AbstractC67843As) r1).A00 = r2.A01().A03;
                AnonymousClass0C4 r0 = this.A0E;
                AnonymousClass237 r10 = new AnonymousClass237(r0, r1);
                String A032 = r0.A03();
                AnonymousClass01J r4 = this.A04;
                r4.A00.A01(new SendWebForwardJob(A032, r2.A01().A03, Message.obtain(null, 0, 127, 0, new AnonymousClass22O(A032, (UserJid) r12.A07(), str, r12.A0n, r10))));
            }
        }
    }

    public void A0C(AnonymousClass1XZ r3, int i) {
        if (!AnonymousClass1VY.A0d(r3.A06)) {
            A0H(Collections.singletonList(r3), Integer.valueOf(i));
        }
    }

    public void A0D(AnonymousClass0ZJ r14) {
        C02400Bv r1 = this.A0D;
        if (r1.A03()) {
            C007303n r10 = r14.A0n;
            AnonymousClass02N r9 = r10.A00;
            if (AnonymousClass1VY.A0b(r9)) {
                String A022 = AnonymousClass09E.A02(this.A09.A08());
                AnonymousClass3WX r2 = new AnonymousClass3WX(this, r14, A022);
                ((AbstractC67843As) r2).A00 = r1.A01().A03;
                AnonymousClass0C4 r0 = this.A0E;
                AnonymousClass237 r12 = new AnonymousClass237(r0, r2);
                String A032 = r0.A03();
                if (r14.A0G instanceof UserJid) {
                    AnonymousClass01J r4 = this.A04;
                    r4.A00.A01(new SendWebForwardJob(r10.A01, r1.A01().A03, Message.obtain(null, 0, 154, 0, new AnonymousClass22P(A032, (UserJid) r14.A0G, A022, r10, r14.A00, r12))));
                    return;
                }
                return;
            }
            AnonymousClass01J r42 = this.A04;
            String str = r10.A01;
            r42.A00.A01(new SendWebForwardJob(str, r1.A01().A03, Message.obtain(null, 0, 128, 0, new AnonymousClass22K(str, r14.A00, r10.A02, r9, r14.A0G))));
        }
    }

    public void A0E(String str, int i) {
        if (this.A05.A06 && this.A0D.A03() && str != null) {
            this.A0B.A09(Message.obtain(null, 0, 57, 0, new AnonymousClass221(str, i)));
        }
    }

    public void A0F(String str, String str2) {
        if (this.A0D.A03()) {
            AnonymousClass00E.A03(str2);
            this.A0B.A09(Message.obtain(null, 0, 199, 0, new AnonymousClass22Q(str, "delete", str2)));
        }
    }

    public void A0G(String str, String str2) {
        if (this.A0D.A03()) {
            AnonymousClass00E.A08(!"delete".equals(str2), "sendWebStickerPacksUpdate should not handle delete event, use sendWebStickerPacksDelete for that");
            this.A0B.A09(Message.obtain(null, 0, 199, 0, new AnonymousClass22Q(str, str2, null)));
        }
    }

    public void A0H(List list, Integer num) {
        C02400Bv r3 = this.A0D;
        if (r3.A03()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass1XZ r1 = (AnonymousClass1XZ) it.next();
                if (!AnonymousClass1VY.A0d(r1.A06)) {
                    if (num != null) {
                        r1.A00 = num.intValue();
                    }
                    arrayList.add(r1);
                }
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass3WP r2 = new AnonymousClass3WP(this, arrayList);
                ((AbstractC67843As) r2).A00 = r3.A01().A03;
                AnonymousClass0C4 r0 = this.A0E;
                AnonymousClass237 r12 = new AnonymousClass237(r0, r2);
                String A032 = r0.A03();
                AnonymousClass01J r5 = this.A04;
                r5.A00.A01(new SendWebForwardJob(A032, r3.A01().A03, Message.obtain(null, 0, 52, 0, new AnonymousClass224(A032, arrayList, r12))));
            }
        }
    }

    public void A0I(boolean z) {
        if (this.A05.A06) {
            C02400Bv r5 = this.A0D;
            if (r5.A03()) {
                this.A0B.A09(Message.obtain(null, 0, 44, 0, new AnonymousClass227(z)));
                A07(null, null, z, r5.A01().A03, r5.A01().A00, 0, null);
            }
        }
    }

    public boolean A0J(String str) {
        AnonymousClass0C4 r1 = this.A0E;
        Number number = (Number) r1.A06(true).get(str);
        if (number == null) {
            r1.A0E(str, -1);
            return false;
        }
        int intValue = number.intValue();
        if (intValue < 0) {
            AnonymousClass008.A16("app/xmpp/web/handled/action/in_progress/", str);
            return true;
        }
        A0E(str, intValue);
        return true;
    }

    @Override // X.AbstractC02380Bt
    public void ADF(DeviceJid deviceJid) {
        if (deviceJid != null) {
            A08(deviceJid.userJid);
        }
    }

    @Override // X.AbstractC02370Bs
    public void ADV(AnonymousClass0AW r2) {
        A03(r2, this.A06.A00);
    }

    @Override // X.AnonymousClass0AZ
    public void AId(boolean z) {
        A03(this.A00.A00, z);
    }
}
