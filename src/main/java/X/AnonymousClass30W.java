package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.30W  reason: invalid class name */
public class AnonymousClass30W extends Handler {
    public final AnonymousClass00D A00;
    public final AnonymousClass0KP A01;
    public final C70833Mo A02;
    public final AnonymousClass324 A03;
    public final AnonymousClass00T A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass30W(String str, String str2, Looper looper, C70833Mo r5, AnonymousClass00T r6, AnonymousClass00D r7, AbstractC03820Hw r8, AnonymousClass324 r9, AnonymousClass0KP r10) {
        super(looper);
        if (looper != null) {
            this.A05 = str;
            this.A06 = str2;
            this.A02 = r5;
            this.A04 = r6;
            this.A07 = new WeakReference(r8);
            this.A00 = r7;
            this.A03 = r9;
            this.A01 = r10;
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            StringBuilder A0S = AnonymousClass008.A0S("verifysms/handle-retry/");
            A0S.append(message.obj);
            Log.d(A0S.toString());
            AbstractC03820Hw r9 = (AbstractC03820Hw) this.A07.get();
            if (r9 != null) {
                AnonymousClass00T r3 = this.A04;
                String str = this.A05;
                String str2 = this.A06;
                if (str2 != null) {
                    r3.ANC(new C09910dj(str, str2, "sms", AnonymousClass2Nx.RETRIED, r9, this.A00, this.A01, this.A02), message.obj);
                    return;
                }
                throw null;
            }
        }
    }
}
