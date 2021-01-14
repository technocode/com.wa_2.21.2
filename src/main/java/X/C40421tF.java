package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1tF  reason: invalid class name and case insensitive filesystem */
public class C40421tF {
    public final AbstractC03810Hu A00;
    public final /* synthetic */ AnonymousClass0ES A01;

    public C40421tF(AnonymousClass0ES r1, AbstractC03810Hu r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00(AnonymousClass1WL r28, long j) {
        AbstractC03810Hu r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass3LC) r0).A00(2);
        }
        if (r28.A01 == -1) {
            AnonymousClass0ES r2 = this.A01;
            AnonymousClass0AT r1 = r2.A0A;
            if (r1 != null) {
                int i = r28.A02;
                if (i == 1) {
                    r1.A02.A01(r28.A03);
                } else if (i == 2) {
                    r1.A02.A01(r28.A03);
                }
                r2.A04.A03(r28.A03);
                return;
            }
            throw null;
        }
        AnonymousClass02N r12 = r28.A03;
        int i2 = r28.A02;
        String str = r28.A04;
        if (str != null) {
            AnonymousClass0EX r10 = this.A01.A08;
            if (r10 != null) {
                StringBuilder A0S = AnonymousClass008.A0S("ProfilePicturePlainFileDownloadManager/create/jid = ");
                A0S.append(r12);
                A0S.append(", type = ");
                AnonymousClass008.A1K(A0S, i2);
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(i2);
                String format = String.format(locale, "%s.%d", r12.getRawString(), valueOf);
                HashMap hashMap = r10.A09;
                synchronized (hashMap) {
                    AnonymousClass2A3 r7 = (AnonymousClass2A3) hashMap.get(format);
                    if (r7 != null) {
                        if (r7.A08.A04.equals(str)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ProfilePicturePlainFileDownloadManager/downloader is running/jid = ");
                            sb.append(r12);
                            sb.append(", type = ");
                            sb.append(i2);
                            Log.d(sb.toString());
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("ProfilePicturePlainFileDownloadManager/direct path changes/jid = ");
                        sb2.append(r12);
                        sb2.append(", type = ");
                        sb2.append(i2);
                        Log.d(sb2.toString());
                        r7.A01();
                        hashMap.remove(format);
                    }
                    StringBuilder A0S2 = AnonymousClass008.A0S("ProfilePicturePlainFileDownloadManager/startProfilePictureDownload/jid = ");
                    A0S2.append(r12);
                    A0S2.append(", type = ");
                    AnonymousClass008.A1K(A0S2, i2);
                    String format2 = String.format(locale, "%s.%d", r12.getRawString(), valueOf);
                    AnonymousClass2A3 r13 = new AnonymousClass2A3(j, format2, new C448221u(r10, r28), r10.A04, r10.A01, r10.A00, r28, r10.A07, r10.A03, r10.A05, r10.A02, r10.A06);
                    hashMap.put(format2, r13);
                    r10.A08.ANF(r13);
                    return;
                }
            }
            throw null;
        } else if (r28.A05 != null) {
            C40451tI.A01(r28, 0, j, this.A01.A0B);
        } else {
            AnonymousClass0ES r4 = this.A01;
            AnonymousClass0EV r3 = r4.A04;
            AnonymousClass0EW r22 = r3.A00;
            r22.A00.post(new RunnableEBaseShape2S0200000_I0_1(r3, r28, 4));
            r4.A07.A02(1, 1, Long.valueOf(SystemClock.elapsedRealtime() - j), null);
        }
    }
}
