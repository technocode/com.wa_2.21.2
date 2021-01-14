package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1VX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1VX extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ AnonymousClass00Y A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass1VX(AnonymousClass00Y r1, Context context, int i, int i2, boolean z, int i3) {
        this.A04 = r1;
        this.A03 = context;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A02 = i3;
    }

    public final void run() {
        AnonymousClass00Y r1 = this.A04;
        Context context = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        boolean z = this.A05;
        int i3 = this.A02;
        File file = new File(context.getFilesDir(), "wam.wam");
        AnonymousClass03K r10 = r1.A0E;
        C05600Pi r4 = new C05600Pi(file, i, i2, z, 0, r10);
        r1.A00 = r4;
        AnonymousClass038 r3 = r1.A0D;
        r1.A05 = new AnonymousClass0Q3(r4, r3);
        r1.A0G.countDown();
        C05600Pi r11 = new C05600Pi(new File(context.getFilesDir(), "wamrealtime.wam"), i3, i2, true, 1, r10);
        r1.A02 = r11;
        r1.A04 = new AnonymousClass0Q3(r11, r3);
        r1.A0I.countDown();
        C05600Pi r42 = new C05600Pi(new File(context.getFilesDir(), "wamprivatestats.wam"), i, i2, true, 2, r10);
        r1.A01 = r42;
        r1.A03 = new AnonymousClass0Q3(r42, r3);
        r1.A0H.countDown();
    }
}
