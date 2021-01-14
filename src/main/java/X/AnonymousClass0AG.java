package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0AG  reason: invalid class name */
public class AnonymousClass0AG extends Handler {
    public final /* synthetic */ AnonymousClass09F A00;
    public final /* synthetic */ C006903j A01;
    public final /* synthetic */ AnonymousClass0AC A02;
    public final /* synthetic */ AnonymousClass09E A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0AG(Looper looper, AnonymousClass09F r2, AnonymousClass0AC r3, AnonymousClass09E r4, C006903j r5) {
        super(looper);
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass09F r1 = this.A00;
            AnonymousClass02N A012 = AnonymousClass02N.A01((String) message.obj);
            if (A012 != null) {
                r1.A03(A012, false);
                return;
            }
            throw null;
        } else if (i == 2) {
            AnonymousClass02N A013 = AnonymousClass02N.A01((String) message.obj);
            if (A013 != null) {
                this.A02.A03(A013);
                this.A00.A03(A013, false);
                return;
            }
            throw null;
        } else if (i == 8) {
            AnonymousClass09E r0 = this.A03;
            r0.A0C();
            r0.A05.clear();
            AnonymousClass0AC r3 = this.A02;
            r3.A03(C12060hU.A00);
            for (AnonymousClass02N r12 : this.A01.A09()) {
                r3.A03(r12);
                this.A00.A03(r12, true);
            }
        } else if (i == 9) {
            AnonymousClass09E r02 = this.A03;
            r02.A0C();
            r02.A05.clear();
            AnonymousClass0AC r6 = this.A02;
            r6.A03(C12060hU.A00);
            C006903j r5 = this.A01;
            for (AnonymousClass02N r2 : r5.A09()) {
                boolean z = true;
                if (r2 == null || r2.getType() != 1) {
                    z = false;
                }
                if (!z) {
                    synchronized (r5) {
                        if (r2 != null) {
                            r5.A0A().remove(r2);
                        }
                    }
                    AnonymousClass09F r13 = this.A00;
                    r13.A08.A0D(r2);
                    AnonymousClass0A8 r03 = r13.A07;
                    r03.A02();
                    r03.A06(r2);
                } else {
                    this.A00.A03(r2, true);
                }
                r6.A03(r2);
            }
        }
    }
}
