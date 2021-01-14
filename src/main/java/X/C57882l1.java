package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2l1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57882l1 implements AbstractC03150Ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ DeviceJid A08;
    public final /* synthetic */ C56862jJ A09;
    public final /* synthetic */ AnonymousClass0EI A0A;
    public final /* synthetic */ File A0B;
    public final /* synthetic */ String A0C;

    public /* synthetic */ C57882l1(AnonymousClass0EI r3, File file, C56862jJ r5, int i, long j, DeviceJid deviceJid, int i2, int i3, int i4, long j2, long j3, long j4, String str) {
        this.A0A = r3;
        this.A0B = file;
        this.A09 = r5;
        this.A00 = i;
        this.A06 = j;
        this.A08 = deviceJid;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A07 = j2;
        this.A04 = j3;
        this.A05 = j4;
        this.A0C = str;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C50152Tp r1;
        AnonymousClass0EI r0 = this.A0A;
        File file = this.A0B;
        C56862jJ r2 = this.A09;
        int i = this.A00;
        long j = this.A06;
        DeviceJid deviceJid = this.A08;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        long j2 = this.A07;
        long j3 = this.A04;
        long j4 = this.A05;
        String str = this.A0C;
        Number number = (Number) obj;
        StringBuilder sb = new StringBuilder("history-sync-send-methods/data uploaded:");
        sb.append(number);
        Log.d(sb.toString());
        if (!file.delete()) {
            StringBuilder sb2 = new StringBuilder("history-sync-send-methods/failed to delete temp file: ");
            sb2.append(file);
            Log.w(sb2.toString());
        }
        AnonymousClass00Y r12 = r0.A0D;
        AnonymousClass0EJ r13 = r0.A0F;
        int intValue = number.intValue();
        r12.A0B(r13.A04(r2, intValue, 8), null, false);
        r2.A03();
        if (intValue == 0 && (r1 = (C50152Tp) r2.A0G.A00()) != null) {
            if (i == 0) {
                if (r0.A0B != null) {
                    Log.i("companion-device-manager/onCriticalMsgHistoryDataUploaded");
                } else {
                    throw null;
                }
            }
            C50142To r02 = r1.A02;
            String A032 = r02.A03();
            String A052 = r02.A05();
            String A042 = r02.A04();
            C49882So A002 = r02.A00();
            if (A002 != null && !TextUtils.isEmpty(A032) && !TextUtils.isEmpty(A052) && !TextUtils.isEmpty(A042)) {
                AnonymousClass01I r03 = r0.A01;
                r03.A04();
                UserJid userJid = r03.A03;
                if (userJid == null) {
                    Log.e("history-sync-send-methods/no my user id (unregistered?).");
                    return;
                }
                AnonymousClass0AL r14 = r0.A0K;
                long A053 = r0.A06.A05();
                byte[] bArr = A002.A01;
                AnonymousClass0A6 r22 = r14.A07;
                AnonymousClass28D r23 = new AnonymousClass28D(AnonymousClass0FI.A07(r22.A01, r22.A00, userJid, true), A053);
                ((AbstractC05460Oq) r23).A00 = deviceJid;
                r23.A08 = A032;
                r23.A0A = A052;
                r23.A09 = A042;
                r23.A0C = bArr;
                r23.A04 = j;
                r23.A00 = i2;
                r23.A01 = i3;
                r23.A03 = i;
                r23.A02 = i4;
                r23.A06 = j2;
                r23.A07 = j4;
                r23.A05 = j3;
                r23.A0B = str;
                long A012 = r0.A0C.A01(r23);
                if (A012 < 0) {
                    Log.e("history-sync-send-methods/failed to add peer message");
                }
                AnonymousClass01J r4 = r0.A03;
                StringBuilder A0S = AnonymousClass008.A0S("device-history-sync-notification-");
                A0S.append((int) deviceJid.device);
                r4.A00.A01(new SendPeerMessageJob(A0S.toString(), A012, deviceJid));
            }
        }
    }
}
