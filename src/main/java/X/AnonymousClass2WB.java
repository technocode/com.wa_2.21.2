package X;

import android.view.View;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;

/* renamed from: X.2WB  reason: invalid class name */
public class AnonymousClass2WB implements View.OnTouchListener {
    public final /* synthetic */ NumberEntryKeyboard A00;

    public AnonymousClass2WB(NumberEntryKeyboard numberEntryKeyboard) {
        this.A00 = numberEntryKeyboard;
    }

    public final void A00() {
        NumberEntryKeyboard numberEntryKeyboard = this.A00;
        numberEntryKeyboard.A05 = null;
        if (numberEntryKeyboard.A0B) {
            AnonymousClass2WG r1 = (AnonymousClass2WG) numberEntryKeyboard.A0A.get(Long.valueOf(numberEntryKeyboard.A02));
            if (r1.A02.isRunning()) {
                r1.A05 = true;
            } else if (!r1.A03.isRunning()) {
                r1.A03.start();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r3 != 3) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WB.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
