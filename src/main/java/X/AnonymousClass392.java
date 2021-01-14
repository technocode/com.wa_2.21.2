package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.392  reason: invalid class name */
public class AnonymousClass392 {
    public final AnonymousClass01V A00 = new C72543Th(this);
    public final AnonymousClass01M A01;
    public final C03250Fl A02;
    public final C04540Kt A03;
    public final AnonymousClass0EQ A04;
    public final AbstractC02380Bt A05 = new AnonymousClass3TB(this);
    public final AnonymousClass0L3 A06;
    public final C001000o A07;
    public final C001400w A08;
    public final AnonymousClass1VF A09 = new C72553Ti(this);
    public final C016508x A0A;
    public final AnonymousClass0I8 A0B;
    public final AnonymousClass00Y A0C;
    public final AnonymousClass3U2 A0D;
    public final Set A0E = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile Future A0F;

    public AnonymousClass392(AnonymousClass00Y r2, C001400w r3, C03250Fl r4, AnonymousClass0EQ r5, AnonymousClass01M r6, C001000o r7, AnonymousClass0I8 r8, C04540Kt r9, AnonymousClass0L3 r10, C016508x r11, AnonymousClass3U2 r12) {
        this.A0C = r2;
        this.A08 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A07 = r7;
        this.A0B = r8;
        this.A03 = r9;
        this.A06 = r10;
        this.A0A = r11;
        this.A0D = r12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass391 A00(X.C70073Jq r32) {
        /*
        // Method dump skipped, instructions count: 933
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass392.A00(X.3Jq):X.391");
    }

    public final void A01(DeviceJid deviceJid) {
        if (this.A0E.add(deviceJid)) {
            StringBuilder sb = new StringBuilder("voip/encryption/startGetPreKeyJob for ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            this.A03.A03(new DeviceJid[]{deviceJid}, false, 7);
            return;
        }
        StringBuilder sb2 = new StringBuilder("voip/encryption/startGetPreKeyJob do nothing, PreKey already sent for ");
        sb2.append(deviceJid);
        Log.i(sb2.toString());
    }

    public boolean A02(DeviceJid deviceJid, String str, byte[] bArr, int i) {
        if (i < 0 || i > 4) {
            AnonymousClass008.A0v("voip/receive_message/onPeerE2EDecryptionFailed do nothing for retry count: ", i);
            return true;
        } else if (bArr == null || bArr.length != 4) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/receive_message/onPeerE2EDecryptionFailed e2e decryption failure; invalid remote remoteRegBytes id; remoteRegistrationId=");
            A0S.append(Arrays.toString(bArr));
            Log.i(A0S.toString());
            return false;
        } else {
            int A002 = C05360Of.A00(bArr);
            StringBuilder A0U = AnonymousClass008.A0U("voip/receive_message/onPeerE2EDecryptionFailed peer e2e decryption failure; remoteRegistrationId=", A002, " retryCount: ", i, " from: ");
            A0U.append(deviceJid);
            Log.i(A0U.toString());
            try {
                C001400w r0 = this.A08;
                DeviceJid deviceJid2 = (DeviceJid) r0.A00.submit(new CallableC671737m(this, deviceJid, str, A002, i)).get();
                if (deviceJid2 != null) {
                    this.A0D.A00(deviceJid2);
                }
                return true;
            } catch (InterruptedException e) {
                Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e);
                return false;
            } catch (ExecutionException e2) {
                Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e2);
                return false;
            }
        }
    }
}
