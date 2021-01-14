package X;

import android.text.Editable;

/* renamed from: X.2c3  reason: invalid class name */
public class AnonymousClass2c3 extends C07860Zy {
    public final /* synthetic */ AnonymousClass2MQ A00;

    public AnonymousClass2c3(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        AnonymousClass2MQ r4 = this.A00;
        C002001d.A2f(editable, r4.getContext(), r4.A0A.getPaint(), 1.3f, r4.A0H);
        r4.A00(editable);
    }
}
