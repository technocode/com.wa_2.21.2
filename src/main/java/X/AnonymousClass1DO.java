package X;

import android.widget.CompoundButton;

/* renamed from: X.1DO  reason: invalid class name */
public class AnonymousClass1DO implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C36771mq A00;

    public AnonymousClass1DO(C36771mq r1) {
        this.A00 = r1;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C36771mq r3 = this.A00;
        if (!r3.A05) {
            int id = compoundButton.getId();
            int i = r3.A00;
            if (z) {
                if (!(i == -1 || i == id || !r3.A06)) {
                    r3.A00(i, false);
                }
                r3.A00 = id;
            } else if (i == id) {
                r3.A00 = -1;
            }
        }
    }
}
