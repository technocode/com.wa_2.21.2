package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.jobqueue.job.SendPlayedReceiptJob;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.0AR  reason: invalid class name */
public class AnonymousClass0AR {
    public static volatile AnonymousClass0AR A0B;
    public final AnonymousClass0AV A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass09T A02;
    public final AnonymousClass01J A03;
    public final AnonymousClass09K A04;
    public final AnonymousClass0AX A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass0AS A07;
    public final AnonymousClass09H A08;
    public final C28991Wn A09;
    public final AnonymousClass0AT A0A;

    public AnonymousClass0AR(AnonymousClass00G r1, AnonymousClass009 r2, AnonymousClass01J r3, AnonymousClass09H r4, AnonymousClass0AS r5, AnonymousClass0AT r6, AnonymousClass09T r7, AnonymousClass09K r8, C28991Wn r9, AnonymousClass0AV r10, AnonymousClass0AX r11) {
        this.A06 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A08 = r4;
        this.A07 = r5;
        this.A0A = r6;
        this.A02 = r7;
        this.A04 = r8;
        this.A09 = r9;
        this.A00 = r10;
        this.A05 = r11;
    }

    public static AnonymousClass0AR A00() {
        if (A0B == null) {
            synchronized (AnonymousClass0AR.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass0AR(AnonymousClass00G.A01, AnonymousClass009.A00(), AnonymousClass01J.A00(), AnonymousClass09H.A01(), AnonymousClass0AS.A00(), AnonymousClass0AT.A03, AnonymousClass09T.A00(), AnonymousClass09K.A07, C28991Wn.A00(), AnonymousClass0AV.A00(), AnonymousClass0AX.A00());
                }
            }
        }
        return A0B;
    }

    public Future A01(AnonymousClass02U r11, List list, AbstractC29121Xd r13, AnonymousClass1Xa r14) {
        AnonymousClass09K r1 = this.A04;
        if (!r1.A06 || !r1.A02) {
            return null;
        }
        String A022 = r14 == null ? this.A08.A02() : r14.A01;
        try {
            return this.A08.A05(A022, Message.obtain(null, 0, 210, 0, new C28931Wh(A022, r11, list, r13, r14)), false);
        } catch (AnonymousClass1WI unused) {
            return null;
        }
    }

    public Future A02(C29111Xc r11, AnonymousClass1W0 r12, AnonymousClass1XK r13, AnonymousClass1Xa r14) {
        AnonymousClass09K r1 = this.A04;
        if (!r1.A06 || !r1.A02) {
            return null;
        }
        String A022 = r14 == null ? this.A08.A02() : r14.A01;
        try {
            return this.A08.A05(A022, Message.obtain(null, 0, 209, 0, new C28871Wb(A022, r11, r12, r13, r14)), false);
        } catch (AnonymousClass1WI unused) {
            return null;
        }
    }

    public void A03() {
        if (this.A04.A06) {
            Log.i("sendmethods/sendGetABProps");
            this.A08.A09(Message.obtain(null, 0, 220, 1));
        }
    }

    public void A04() {
        if (this.A04.A06) {
            Log.i("sendmethods/sendGetBroadcastLists");
            this.A08.A09(Message.obtain(null, 0, 59, 0));
        }
    }

    public void A05() {
        if (this.A04.A06) {
            this.A08.A09(Message.obtain(null, 0, 13, 0));
        }
    }

    public void A06(AnonymousClass27z r5) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendAddParticipants");
            this.A08.A09(Message.obtain(null, 0, 15, 0, r5));
        }
    }

    public void A07(AnonymousClass21U r5) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendAddAdmins");
            this.A08.A09(Message.obtain(null, 0, 91, 0, r5));
        }
    }

    public void A08(AnonymousClass21U r5) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendLeaveGroup");
            this.A07.A01(5, r5.A01);
            this.A08.A09(Message.obtain(null, 0, 16, 0, r5));
        }
    }

    public void A09(AnonymousClass21U r5) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendRemoveAdmins");
            this.A08.A09(Message.obtain(null, 0, 92, 0, r5));
        }
    }

    public void A0A(AnonymousClass21U r5) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendRemoveParticipants");
            this.A08.A09(Message.obtain(null, 0, 30, 0, r5));
        }
    }

    public void A0B(AnonymousClass21U r5) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendSetGroupSubject");
            this.A08.A09(Message.obtain(null, 0, 17, 0, r5));
        }
    }

    public void A0C(AnonymousClass02N r6, String str, AnonymousClass02N r8, Integer num, String str2, String str3) {
        if (this.A04.A06) {
            StringBuilder sb = new StringBuilder("SendMethods/sendHSMStructureUnavailableReceipt errorCode=");
            sb.append(num);
            sb.append("; type=");
            sb.append(str2);
            sb.append("; index=");
            AnonymousClass008.A1S(sb, str3);
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 117, 0, r6);
            obtain.getData().putString("messageKeyId", str);
            if (r8 != null) {
                obtain.getData().putParcelable("remoteResource", r8);
            }
            if (num != null) {
                obtain.getData().putInt("errorCode", num.intValue());
            }
            if (str2 != null) {
                obtain.getData().putString("subType", str2);
            }
            if (str3 != null) {
                obtain.getData().putString("buttonIndex", str3);
            }
            r3.A09(obtain);
        }
    }

    public void A0D(AnonymousClass02U r5) {
        Log.i("sendmethods/sendGetGroupDescription");
        if (this.A04.A06) {
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 158, 0);
            obtain.getData().putParcelable("gid", r5);
            r3.A09(obtain);
        }
    }

    public void A0E(AnonymousClass02U r5, int i, AnonymousClass21U r7) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendSetGroupEphemeralSetting");
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 224, 0, r7);
            obtain.getData().putParcelable("gjid", r5);
            obtain.getData().putInt("ephemeralDuration", i);
            r3.A09(obtain);
        }
    }

    public void A0F(AnonymousClass02U r5, String str) {
        if (!this.A04.A06) {
            return;
        }
        if (!this.A0A.A00.A02(r5)) {
            Log.w("sendmethods/skip sendGetGroupInfo");
            return;
        }
        Log.w("sendmethods/sendGetGroupInfo");
        AnonymousClass09H r3 = this.A08;
        Message obtain = Message.obtain(null, 0, 20, 0);
        obtain.getData().putParcelable("gid", r5);
        obtain.getData().putString("context", str);
        r3.A09(obtain);
    }

    public void A0G(AnonymousClass02U r5, boolean z, AnonymousClass21U r7) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendSetGroupAnnouncements");
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 161, 0, r7);
            obtain.getData().putParcelable("gjid", r5);
            obtain.getData().putBoolean("announcements_only", z);
            r3.A09(obtain);
        }
    }

    public void A0H(AnonymousClass02U r5, boolean z, AnonymousClass21U r7) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendSetGroupNoFrequentlyForwarded");
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 213, 0, r7);
            obtain.getData().putParcelable("gjid", r5);
            obtain.getData().putBoolean("no_frequently_forwarded", z);
            r3.A09(obtain);
        }
    }

    public void A0I(AnonymousClass02U r5, boolean z, AnonymousClass21U r7) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendSetGroupRestrictMode");
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 159, 0, r7);
            obtain.getData().putParcelable("gjid", r5);
            obtain.getData().putBoolean("restrict_mode", z);
            r3.A09(obtain);
        }
    }

    public void A0J(AnonymousClass1W2 r5) {
        if (this.A04.A06) {
            StringBuilder A0S = AnonymousClass008.A0S("sendmethods/sendSubscribeLocations/");
            A0S.append(r5.A00);
            A0S.append("/");
            AnonymousClass008.A1a(A0S, r5.A01);
            this.A08.A09(Message.obtain(null, 0, 82, 0, r5));
        }
    }

    public void A0K(RunnableC448121t r5) {
        if (this.A04.A06) {
            StringBuilder A0S = AnonymousClass008.A0S("sendmethods/sendUnsubscribeLocations/");
            A0S.append(r5.A00);
            Log.i(A0S.toString());
            this.A08.A09(Message.obtain(null, 0, 83, 0, r5));
        }
    }

    public void A0L(AbstractC007503q r3) {
        StringBuilder sb = new StringBuilder("sendMethods/sendMessagePlayed message:");
        sb.append(r3);
        Log.d(sb.toString());
        AnonymousClass01J r0 = this.A03;
        r0.A00.A01(new SendPlayedReceiptJob(r3));
    }

    public void A0M(AnonymousClass1XX r7) {
        AbstractC28981Wm A012 = this.A09.A01(1, r7.A00);
        if (A012 != null) {
            A012.A01(4);
        }
        if (this.A04.A06) {
            if ("receipt".equals(r7.A05)) {
                String str = r7.A08;
                if ("read".equals(str) || "read-self".equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("stanzaKey", r7);
                    bundle.putBoolean("disable", !this.A02.A02(AnonymousClass1VY.A09(r7.A01)));
                    this.A08.A09(Message.obtain(null, 0, 96, 0, bundle));
                    return;
                }
            }
            AnonymousClass09H r2 = this.A08;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("stanzaKey", r7);
            r2.A09(Message.obtain(null, 0, 76, 0, bundle2));
        }
    }

    public void A0N(AnonymousClass0M3 r3) {
        C007303n r1 = r3.A0n;
        if (r1.A02) {
            StringBuilder sb = new StringBuilder("sendMethods/sendMessageMediaError skip sending error because message is from_me:");
            sb.append(r3);
            Log.d(sb.toString());
        } else if (AnonymousClass1VY.A0X(r1.A00)) {
            StringBuilder sb2 = new StringBuilder("sendMethods/sendMessageMediaError skip sending error because jid is gdpr");
            sb2.append(r3);
            Log.d(sb2.toString());
        } else {
            AnonymousClass0M4 r0 = r3.A02;
            if (r0 == null || r0.A0U == null) {
                StringBuilder sb3 = new StringBuilder("sendMethods/sendMessageMediaError skip sending error since no media key");
                sb3.append(r3);
                Log.d(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("sendMethods/sendMessageMediaError message:");
            sb4.append(r3);
            Log.d(sb4.toString());
            AnonymousClass01J r02 = this.A03;
            r02.A00.A01(new SendMediaErrorReceiptJob(r3));
        }
    }

    public void A0O(String str, int i, String str2) {
        if (this.A04.A06) {
            StringBuilder sb = new StringBuilder("sendmethods/sendAttestationResult jws=");
            sb.append(str);
            sb.append(" errorCode=");
            sb.append(i);
            sb.append(" errorMessage=");
            AnonymousClass008.A1U(sb, str2);
            AnonymousClass09H r3 = this.A08;
            Message obtain = Message.obtain(null, 0, 194, 0);
            obtain.getData().putString("result", str);
            obtain.getData().putInt("errorCode", i);
            obtain.getData().putString("errorMessage", str2);
            r3.A09(obtain);
        }
    }

    public void A0P(String str, Long l) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendClearDirty");
            AnonymousClass09H r5 = this.A08;
            Message obtain = Message.obtain(null, 0, 18, 0);
            obtain.getData().putString("category", str);
            if (l != null) {
                obtain.getData().putLong("timestamp", l.longValue());
            }
            r5.A09(obtain);
        }
    }

    public void A0Q(String str, String str2, List list) {
        if (this.A04.A06) {
            AnonymousClass008.A16("Sending config for platform:", str2);
            this.A08.A09(Message.obtain(null, 0, 1, 0, new AnonymousClass1WM(str, str2, list)));
        }
    }

    public void A0R(List list) {
        StringBuilder sb = new StringBuilder("app/send-get-identities jids=");
        sb.append(list);
        Log.i(sb.toString());
        AnonymousClass09K r1 = this.A04;
        if (r1.A06 && r1.A02) {
            AnonymousClass09H r4 = this.A08;
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("jids", (Jid[]) list.toArray(new DeviceJid[0]));
            r4.A09(Message.obtain(null, 0, 153, 0, bundle));
        }
    }

    public void A0S(boolean z) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendGetServerProps");
            AnonymousClass09H r4 = this.A08;
            Bundle bundle = new Bundle();
            bundle.putBoolean("forceRefresh", z);
            r4.A09(Message.obtain(null, 0, 21, 0, bundle));
        }
    }

    public void A0T(byte[] bArr, byte[] bArr2, Runnable runnable) {
        if (this.A04.A06) {
            Log.i("sendmethods/sendcreatecipherkey");
            AnonymousClass009 r0 = this.A01;
            AnonymousClass0HY.A0A(r0, bArr);
            AnonymousClass0HY.A0B(r0, bArr2);
            this.A08.A09(AnonymousClass1VY.A06(bArr, bArr2, runnable));
        }
    }

    public boolean A0U(String str, AnonymousClass1XY r12, AnonymousClass1XK r13, AnonymousClass1XD r14, AnonymousClass1Xa r15) {
        if (!this.A04.A06) {
            return false;
        }
        this.A08.A09(Message.obtain(null, 0, 29, 0, new C28951Wj(str, r12, r13, r14, r15)));
        return true;
    }
}
