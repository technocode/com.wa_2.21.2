package X;

import com.whatsapp.CodeInputField;

/* renamed from: X.1xn  reason: invalid class name and case insensitive filesystem */
public class C43101xn extends AbstractC25311Gi {
    public static final C43101xn A00 = new C43101xn();

    public final void A01(CodeInputField codeInputField, AnonymousClass05q r11, C46482Aq r12) {
        int i;
        boolean z = !Boolean.FALSE.equals(r12.A03);
        C43091xm r3 = new C43091xm(r12, r11);
        if (z) {
            int intValue = r12.A04.intValue();
            C009405x r0 = r12.A00;
            if (r0 != null) {
                i = r0.A00(r11).intValue();
            } else {
                i = 0;
            }
            codeInputField.A04(intValue, r3, i);
            return;
        }
        codeInputField.A05(r3, r12.A04.intValue(), 8211, 8226, null, new C39231rA(codeInputField));
    }
}
