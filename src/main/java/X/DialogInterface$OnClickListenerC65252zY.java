package X;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.2zY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65252zY implements DialogInterface.OnClickListener {
    public final /* synthetic */ ActivityC004702f A00;
    public final /* synthetic */ AnonymousClass04j A01;
    public final /* synthetic */ AnonymousClass03P A02;
    public final /* synthetic */ AnonymousClass03S A03;
    public final /* synthetic */ AnonymousClass01X A04;
    public final /* synthetic */ AnonymousClass0KP A05;
    public final /* synthetic */ AnonymousClass00T A06;

    public /* synthetic */ DialogInterface$OnClickListenerC65252zY(ActivityC004702f r1, AnonymousClass00T r2, AnonymousClass03P r3, AnonymousClass01X r4, AnonymousClass04j r5, AnonymousClass03S r6, AnonymousClass0KP r7) {
        this.A00 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A05 = r7;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004702f r3 = this.A00;
        AnonymousClass00T r1 = this.A06;
        AnonymousClass03P r4 = this.A02;
        AnonymousClass01X r5 = this.A04;
        AnonymousClass04j r6 = this.A01;
        AnonymousClass03S r7 = this.A03;
        AnonymousClass0KP r8 = this.A05;
        Log.i("verifynumber/dialog/cant-connect/button/checkstatus");
        C002001d.A2N(r3, 109);
        r1.ANC(new C39451rY(r3, r4, r5, r6, r7, r8, true, true, false, "reg/cant-connect", null), new String[0]);
    }
}
