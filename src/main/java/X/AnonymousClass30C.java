package X;

/* renamed from: X.30C  reason: invalid class name */
public class AnonymousClass30C {
    public int A00 = -1;
    public String A01;
    public boolean A02;
    public final ActivityC004702f A03;
    public final AnonymousClass00D A04;

    public AnonymousClass30C(ActivityC004702f r2, AnonymousClass00D r3) {
        this.A03 = r2;
        this.A04 = r3;
    }

    public void A00() {
        this.A02 = false;
        AnonymousClass0JE.A00 = this.A04.A00.getString("registration_failure_reason", "");
        String str = this.A01;
        if (str != null) {
            this.A03.APr(str);
        }
        int i = this.A00;
        if (i != -1) {
            C002001d.A2O(this.A03, i);
        }
        this.A01 = null;
        this.A00 = -1;
    }

    public void A01(int i) {
        if (!this.A02) {
            C002001d.A2O(this.A03, i);
        } else {
            this.A00 = i;
        }
    }

    public void A02(int i) {
        if (!this.A02) {
            ActivityC004702f r1 = this.A03;
            if (!r1.isFinishing()) {
                r1.APo(i);
                return;
            }
        }
        ActivityC004702f r0 = this.A03;
        r0.getString(i);
        this.A01 = r0.getString(i);
    }

    public void A03(String str) {
        if (!this.A02) {
            ActivityC004702f r1 = this.A03;
            if (!r1.isFinishing()) {
                r1.APr(str);
                return;
            }
        }
        this.A01 = str;
    }
}
