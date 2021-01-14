package X;

import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.0Xt  reason: invalid class name and case insensitive filesystem */
public class C07460Xt implements AnonymousClass0C0 {
    public static volatile C07460Xt A0L;
    public final C03290Fp A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass0EW A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass0Fk A04;
    public final AnonymousClass0I5 A05;
    public final AnonymousClass0ES A06;
    public final AnonymousClass0DH A07;
    public final AnonymousClass01A A08;
    public final AnonymousClass08B A09;
    public final AnonymousClass0I9 A0A;
    public final AnonymousClass08C A0B;
    public final AnonymousClass0EV A0C;
    public final AnonymousClass0HN A0D;
    public final AnonymousClass0IB A0E;
    public final AnonymousClass09A A0F;
    public final C03120Ew A0G;
    public final AnonymousClass09H A0H;
    public final AnonymousClass0AR A0I;
    public final AnonymousClass0AT A0J;
    public final AnonymousClass00T A0K;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{25};
    }

    public C07460Xt(AnonymousClass02M r2, AnonymousClass009 r3, AnonymousClass00T r4, AnonymousClass0AR r5, AnonymousClass0DH r6, AnonymousClass09H r7, AnonymousClass01A r8, AnonymousClass0EW r9, AnonymousClass0Fk r10, AnonymousClass0I5 r11, AnonymousClass08B r12, AnonymousClass0AT r13, AnonymousClass09A r14, AnonymousClass08C r15, AnonymousClass0HN r16, C03120Ew r17, C03290Fp r18, AnonymousClass0EV r19, AnonymousClass0ES r20, AnonymousClass0I9 r21, AnonymousClass0IB r22) {
        this.A03 = r2;
        this.A01 = r3;
        this.A0K = r4;
        this.A0I = r5;
        this.A07 = r6;
        this.A0H = r7;
        this.A08 = r8;
        this.A02 = r9;
        this.A04 = r10;
        this.A05 = r11;
        this.A09 = r12;
        this.A0J = r13;
        this.A0F = r14;
        this.A0B = r15;
        this.A0D = r16;
        this.A0G = r17;
        this.A00 = r18;
        this.A0C = r19;
        this.A06 = r20;
        this.A0A = r21;
        this.A0E = r22;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i != 25) {
            return false;
        }
        Parcelable parcelable = message.getData().getParcelable("stanzaKey");
        AnonymousClass00E.A04(parcelable, "stanzaKey is null");
        AnonymousClass1XX r2 = (AnonymousClass1XX) parcelable;
        AnonymousClass0M5 r1 = (AnonymousClass0M5) message.obj;
        AnonymousClass0M5 A0C2 = r1.A0C(0);
        if (A0C2 == null) {
            return true;
        }
        if (AnonymousClass0M5.A02(A0C2, "add")) {
            byte[] bArr = A0C2.A01;
            AnonymousClass0Hz r0 = new AnonymousClass0Hz(EnumC03840Hy.NOTIFICATION_CONTACT);
            r0.A04 = true;
            r0.A02();
            r0.A03(bArr);
            this.A0D.A02(r0.A01(), true);
            this.A0I.A0M(r2);
            return true;
        } else if (AnonymousClass0M5.A02(A0C2, "remove")) {
            Jid A082 = A0C2.A08(UserJid.class, "jid", this.A01);
            this.A0F.A01(new RunnableEBaseShape3S0200000_I0_2(this, A082, 42), 45);
            this.A0K.ANF(new RunnableEBaseShape1S0300000_I0_1(this, A082, r2, 2));
            return true;
        } else if (AnonymousClass0M5.A02(A0C2, "update")) {
            String A0G2 = A0C2.A0G("hash", null);
            if (A0G2 == null) {
                AnonymousClass009 r5 = this.A01;
                UserJid userJid = (UserJid) A0C2.A08(UserJid.class, "jid", r5);
                AnonymousClass01A r11 = this.A08;
                C007003k A092 = r11.A09(userJid);
                if (A092 != null) {
                    AnonymousClass0EW r3 = this.A02;
                    r3.A00.post(new RunnableEBaseShape1S0300000_I0_1(this, A092, userJid, 1));
                    AnonymousClass0I5 r7 = this.A05;
                    if (!r7.A09(userJid)) {
                        r7.A03(userJid, 0);
                        this.A03.A0E(new RunnableEBaseShape3S0200000_I0_2(this, userJid, 41));
                    }
                    if (((AnonymousClass1LF) Conversation.A4n.get()).A01(userJid)) {
                        boolean z = false;
                        if (this.A04.A00 == 3) {
                            z = true;
                        }
                        if (!z) {
                            r7.A06(userJid);
                        }
                    }
                    new AnonymousClass3LF(r5, this.A0H, new AnonymousClass3L0(this.A03, this.A0K, this.A07, r11, this.A09, this.A0A)).A00(userJid, A092.A07);
                }
            } else if (!TextUtils.isEmpty(A0G2)) {
                byte[] decode = Base64.decode(A0G2.getBytes(), 0);
                StringBuilder A0S = AnonymousClass008.A0S("contactupdatenotificationhandler/handleContactUpdate decodeHash=");
                A0S.append(Arrays.toString(decode));
                Log.d(A0S.toString());
                AnonymousClass0Hz r02 = new AnonymousClass0Hz(EnumC03840Hy.NOTIFICATION_SIDELIST);
                r02.A04 = true;
                r02.A00 = new AnonymousClass0RB(false, false, true, false, false, false);
                r02.A03(decode);
                this.A0D.A02(r02.A01(), true);
            }
            this.A0I.A0M(r2);
            return true;
        } else if (AnonymousClass0M5.A02(A0C2, "sync")) {
            long j = 0;
            long A042 = C006803i.A04(A0C2.A0G("after", null), 0) * 1000;
            long A043 = C006803i.A04(r1.A0G("t", null), 0) * 1000;
            StringBuilder sb = new StringBuilder("contactupdatenotificationhandler/handleContactSync stanzaKey=");
            sb.append(r2);
            sb.append("; beforeTimestamp=");
            sb.append(A043);
            sb.append("; afterTimestamp=");
            sb.append(A042);
            Log.d(sb.toString());
            AnonymousClass02M r9 = this.A03;
            RunnableEBaseShape3S0100000_I0_3 runnableEBaseShape3S0100000_I0_3 = new RunnableEBaseShape3S0100000_I0_3(this, 43);
            if (A042 > A043 && A043 > 0) {
                j = A042 - A043;
            }
            r9.A02.postDelayed(runnableEBaseShape3S0100000_I0_3, j);
            this.A0I.A0M(r2);
            return true;
        } else if (!AnonymousClass0M5.A02(A0C2, "modify")) {
            return true;
        } else {
            long A044 = C006803i.A04(r1.A0G("t", null), 0) * 1000;
            AnonymousClass009 r4 = this.A01;
            UserJid userJid2 = (UserJid) A0C2.A08(UserJid.class, "old", r4);
            UserJid userJid3 = (UserJid) A0C2.A08(UserJid.class, "new", r4);
            StringBuilder sb2 = new StringBuilder("contactupdatenotificationhandler/handleContactModify oldUserJid=");
            sb2.append(userJid2);
            sb2.append(" newUserJid=");
            sb2.append(userJid3);
            Log.i(sb2.toString());
            C03290Fp r52 = this.A00;
            if (r52 != null) {
                StringBuilder sb3 = new StringBuilder("ChangeNumberManager/onContactNumberChanged/oldJid=");
                sb3.append(userJid2);
                sb3.append("; newJid=");
                sb3.append(userJid3);
                Log.i(sb3.toString());
                AnonymousClass0A6 r32 = r52.A07.A04;
                AnonymousClass00S r8 = r32.A01;
                AnonymousClass01I r72 = r32.A00;
                C12130hb r112 = (C12130hb) AnonymousClass01R.A00(AnonymousClass0FI.A07(r8, r72, userJid2, true), A044, 28);
                r112.A01 = userJid2;
                r112.A00 = userJid3;
                C12130hb r73 = (C12130hb) AnonymousClass01R.A00(AnonymousClass0FI.A07(r8, r72, userJid3, true), A044, 28);
                r73.A01 = userJid2;
                r73.A00 = userJid3;
                AnonymousClass01K r03 = r52.A04;
                r03.A0J(r112);
                r03.A0J(r73);
                AnonymousClass0EH r6 = r52.A03;
                C006903j r82 = r6.A03;
                C08560bL A052 = r82.A05(userJid2);
                if (A052 != null) {
                    r6.A00.A01(new RunnableEBaseShape0S0300000_I0_0(r6, A052, r112, 25), 18);
                }
                C08560bL A053 = r82.A05(userJid3);
                if (A053 != null) {
                    r6.A00.A01(new RunnableEBaseShape0S0300000_I0_0(r6, A053, r73, 25), 18);
                }
                C02360Br r83 = r52.A06;
                C02400Bv r74 = r83.A0D;
                if (r74.A03() && userJid3 != null) {
                    String A032 = r83.A0E.A03();
                    AnonymousClass01J r62 = r83.A04;
                    r62.A00.A01(new SendWebForwardJob(A032, r74.A01().A03, Message.obtain(null, 0, 174, 0, new AnonymousClass220(A032, userJid3, null, userJid2))));
                }
                if (r74.A03() && userJid2 != null) {
                    String A033 = r83.A0E.A03();
                    AnonymousClass01J r63 = r83.A04;
                    r63.A00.A01(new SendWebForwardJob(A033, r74.A01().A03, Message.obtain(null, 0, 174, 0, new AnonymousClass220(A033, userJid2, userJid3, null))));
                }
                this.A0I.A0M(r2);
                return true;
            }
            throw null;
        }
    }
}
