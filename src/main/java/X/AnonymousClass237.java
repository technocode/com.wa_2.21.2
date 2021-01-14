package X;

import com.whatsapp.util.Log;

/* renamed from: X.237  reason: invalid class name */
public class AnonymousClass237 implements AnonymousClass1XK, AnonymousClass1XD {
    public final AbstractC67843As A00;
    public final AnonymousClass0C4 A01;

    public AnonymousClass237(AnonymousClass0C4 r1, AbstractC67843As r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass1XK
    public void AN9(int i) {
        boolean z;
        String str;
        if (i >= 500) {
            AnonymousClass0C4 r3 = this.A01;
            AbstractC67843As r2 = this.A00;
            if (r2.A00() || ((str = r2.A00) != null && str.equals(r3.A0L.A01().A03))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder A0S = AnonymousClass008.A0S("qr_error 500 queueing: ");
                A0S.append(r2);
                Log.e(A0S.toString());
                r3.A0R.add(r2);
                return;
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("qr_error 500 op invalid dropping: ");
            A0S2.append(r2);
            Log.e(A0S2.toString());
        } else if (i >= 400) {
            this.A01.A0F(false);
        } else {
            StringBuilder A0T = AnonymousClass008.A0T("unexpected return code: ", i, " op: ");
            A0T.append(this.A00);
            Log.e(A0T.toString());
        }
    }

    @Override // X.AnonymousClass1XD
    public void AND(Exception exc) {
        StringBuilder A0S = AnonymousClass008.A0S("qr_exception: ");
        A0S.append(this.A00);
        Log.e(A0S.toString(), exc);
    }
}
