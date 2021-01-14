package X;

import android.os.Handler;
import android.util.Log;
import java.util.UUID;

/* renamed from: X.0zx  reason: invalid class name and case insensitive filesystem */
public class C22150zx {
    public C32391es A00;
    public String A01;
    public final C22170zz A02;
    public volatile UUID A03;
    public volatile boolean A04;

    public C22150zx(C22170zz r1) {
        this.A02 = r1;
    }

    public UUID A00(String str, Handler handler) {
        UUID uuid;
        C22170zz r2 = this.A02;
        synchronized (r2) {
            if (this.A04) {
                String str2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" has been evicted. ");
                sb.append(str);
                sb.append(" now owns the camera device");
                Log.e("SessionManager", sb.toString());
                C32391es r0 = this.A00;
                if (r0 != null) {
                    RunnableEBaseShape1S2100000_I1 runnableEBaseShape1S2100000_I1 = new RunnableEBaseShape1S2100000_I1(r0, str2, str);
                    Handler handler2 = r2.A00;
                    if (handler2 != null) {
                        handler2.post(runnableEBaseShape1S2100000_I1);
                    } else {
                        AnonymousClass100.A00(runnableEBaseShape1S2100000_I1);
                    }
                    this.A00 = null;
                }
            }
            A01();
            r2.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public final void A01() {
        if (this.A03 != null) {
            C22170zz r2 = this.A02;
            UUID uuid = this.A03;
            synchronized (r2) {
                if (uuid.equals(r2.A01)) {
                    r2.A03.removeCallbacksAndMessages(uuid);
                    Handler handler = r2.A00;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(uuid);
                    } else {
                        AnonymousClass100.A00.removeCallbacksAndMessages(uuid);
                    }
                }
            }
        }
        this.A03 = UUID.randomUUID();
        C22170zz r1 = this.A02;
        UUID uuid2 = this.A03;
        synchronized (r1) {
            r1.A01 = uuid2;
        }
    }

    public void A02(UUID uuid) {
        C22170zz r2 = this.A02;
        synchronized (r2) {
            if (uuid != null) {
                if (uuid.equals(this.A03)) {
                    A01();
                    r2.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                }
            }
        }
    }
}
