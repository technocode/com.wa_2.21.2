package java.lang;

import X.AbstractC007503q;
import X.AbstractC667835x;
import X.AnonymousClass01K;
import X.AnonymousClass0CH;
import X.AnonymousClass0CT;
import X.AnonymousClass0DF;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass1XO;
import X.AnonymousClass1Y0;
import X.AnonymousClass232;
import X.C007303n;
import X.C04260Jr;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

public class RunnableEBaseShape0S0301000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0301000_I0(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                int i = this.A00;
                ((AnonymousClass01K) this.A01).A0m.A04((AbstractC007503q) this.A02, i);
                ((CountDownLatch) this.A03).countDown();
                return;
            case 1:
                ((AnonymousClass0DF) this.A01).A04((C007303n) this.A02, this.A00, (AbstractC667835x) this.A03);
                return;
            case 2:
                AnonymousClass0M3 r2 = (AnonymousClass0M3) this.A02;
                int i2 = this.A00;
                AnonymousClass0CT r4 = ((AnonymousClass0CH) this.A01).A0Z;
                String str = AnonymousClass1XO.A02(r2).A02;
                String str2 = r2.A05;
                String str3 = ((AnonymousClass0M4) this.A03).A0G;
                int i3 = 1;
                if (i2 == 0) {
                    i3 = 2;
                }
                if (r4 == null) {
                    throw null;
                } else if (str != null) {
                    r4.A0A(str, str2, str3, i3);
                    return;
                } else {
                    r4.A0A("image", str2, str3, i3);
                    return;
                }
            case 3:
                C04260Jr r5 = (C04260Jr) this.A01;
                Context context = (Context) this.A02;
                Uri uri = (Uri) this.A03;
                int i4 = this.A00;
                try {
                    AnonymousClass232 r1 = new AnonymousClass232(i4);
                    r1.A00.setDataSource(context, uri);
                    r1.A04();
                    r1.A06();
                    AnonymousClass1Y0 r0 = r5.A00;
                    if (r0 != null) {
                        r0.A05();
                    }
                    r5.A00 = r1;
                    return;
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("asyncaudioplayer/play/e Error playing URI: ");
                    sb.append(uri);
                    sb.append(" with stream: ");
                    sb.append(i4);
                    Log.w(sb.toString(), e);
                    return;
                }
            default:
                return;
        }
    }
}
