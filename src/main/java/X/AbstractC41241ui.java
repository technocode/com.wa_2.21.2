package X;

import android.app.AlertDialog;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.1ui  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC41241ui extends AnonymousClass1Pz {
    public void A01(C04080Iy r11, AbstractC27431Py r12) {
        if (this instanceof AnonymousClass3YE) {
            AnonymousClass3YE r6 = (AnonymousClass3YE) this;
            long A01 = r6.A06.A01() * 1000;
            if (A01 > r6.A03.A05()) {
                r6.A02.A11(A01);
                return;
            }
            C61892tu r7 = r6.A05;
            AnonymousClass3YD r5 = new AnonymousClass3YD(r6, r12);
            long A05 = r7.A01.A05() / 1000;
            if (!r7.A04.A06(C61932ty.A01(Long.valueOf(A05)), r11, new C68843Et(r7, r5, A05))) {
                AnonymousClass3YE r2 = r5.A01;
                r2.A02.A0q();
                AlertDialog.Builder builder = new AlertDialog.Builder(r2.A01);
                AnonymousClass01X r3 = r2.A04;
                builder.setTitle(r3.A06(R.string.payments_biometric_invalidated_key_title)).setMessage(r3.A06(R.string.payments_biometric_invalidated_key_error)).setPositiveButton(r3.A06(R.string.ok), new DialogInterface$OnClickListenerC61882tt(r5)).setCancelable(false).show();
            }
        } else if (!(this instanceof AnonymousClass3YC)) {
            Log.i("AppAuthSettingsActivity/authenticate");
            AnonymousClass1Pw r1 = ((ActivityC004602e) ((C459627f) this).A00).A0A;
            AnonymousClass00E.A07(r1.A05());
            r1.A01.A29(r11, r12);
        } else {
            AnonymousClass3YC r62 = (AnonymousClass3YC) this;
            long A012 = r62.A06.A01() * 1000;
            if (A012 > r62.A03.A05()) {
                r62.A02.A11(A012);
                return;
            }
            AbstractC61552tM r52 = r62.A05;
            AnonymousClass3YB r4 = new AnonymousClass3YB(r62, r12);
            r52.A0K.ANF(new RunnableEBaseShape11S0100000_I1_6(r52, 16));
            C61762th r32 = r52.A0E;
            String str = r52.A0P;
            C68653Ea A02 = r32.A02(str, "PIN", true);
            if (A02 != null) {
                r52.A01(new C61952u0(A02), r11, r4);
            } else {
                r52.A0D.A00(str, new AnonymousClass3EQ(r52, r11, r4));
            }
        }
    }
}
