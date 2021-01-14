package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.2sQ  reason: invalid class name and case insensitive filesystem */
public class C61052sQ {
    public AnonymousClass01X A00;
    public C01970Ad A01;
    public final C018809u A02 = C018809u.A00("PaymentMethodNotificationUtil", "notification", "COMMON");

    public C61052sQ(AnonymousClass01X r4, C01970Ad r5) {
        this.A00 = r4;
        this.A01 = r5;
    }

    public PendingIntent A00(Context context, AnonymousClass1VM r8, String str) {
        if (r8 != null) {
            Intent intent = new Intent(context, this.A01.A03().A4e());
            intent.addFlags(335544320);
            intent.putExtra("extra_bank_account", r8);
            return PendingIntent.getActivity(context, 0, intent, 0);
        }
        Class A8J = this.A01.A03().A8J();
        C018809u r2 = this.A02;
        StringBuilder sb = new StringBuilder("getPendingIntent for ");
        sb.append(str);
        r2.A07(null, sb.toString(), null);
        Intent intent2 = new Intent(context, A8J);
        intent2.addFlags(335544320);
        return PendingIntent.getActivity(context, 0, intent2, 0);
    }
}
