package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2Xm  reason: invalid class name and case insensitive filesystem */
public class C51132Xm extends AnonymousClass0SD {
    public C02270Bi A00;
    public C02270Bi A01;
    public C08580bN A02;
    public C08580bN A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass02M A06 = AnonymousClass02M.A00();
    public final C02420Bx A07 = C02420Bx.A00();
    public final AnonymousClass0DH A08 = AnonymousClass0DH.A00();
    public final AnonymousClass04j A09 = AnonymousClass04j.A00();
    public final AnonymousClass00D A0A = AnonymousClass00D.A00();
    public final C02430Bz A0B = C02430Bz.A00();
    public final AbstractC28721Vm A0C;
    public final C02360Br A0D = C02360Br.A00();
    public final AnonymousClass00T A0E = C002101e.A00();
    public final AnonymousClass0C4 A0F = AnonymousClass0C4.A00();

    public C51132Xm(boolean z, boolean z2) {
        AbstractC28721Vm r0 = AbstractC28721Vm.A00;
        if (r0 != null) {
            this.A0C = r0;
            this.A01 = new C02270Bi();
            this.A02 = new C08580bN();
            this.A03 = new C08580bN();
            this.A00 = new C02270Bi();
            this.A04 = z;
            this.A05 = z2;
            this.A01.A07(Boolean.valueOf(this.A0A.A00.getBoolean("companion_reg_opt_in_enabled", false)));
            return;
        }
        throw null;
    }

    public final void A02(int i) {
        int i2;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        if (this.A04) {
            C08580bN r2 = this.A02;
            if (this.A05) {
                i2 = R.string.md_opt_out_confirmation_with_portal;
                if (z) {
                    i2 = R.string.md_opt_in_confirmation_with_portal;
                }
            } else {
                i2 = R.string.md_opt_out_confirmation;
                if (z) {
                    i2 = R.string.md_opt_in_confirmation;
                }
            }
            r2.A07(new AnonymousClass2FQ(i, i2));
            return;
        }
        A04(z);
    }

    public final void A03(boolean z) {
        Log.d("OptInWebBeta/Finishing_OptIn-Out");
        this.A07.A02();
        this.A0E.ANF(new RunnableEBaseShape8S0100000_I1_3(this.A08, 39));
        AnonymousClass008.A0n(this.A0A, "companion_reg_opt_in_enabled", z);
        this.A01.A08(Boolean.valueOf(z));
    }

    public final void A04(boolean z) {
        if (!this.A09.A05()) {
            this.A03.A07(Integer.valueOf((int) R.string.connectivity_check_connection));
        } else if (!this.A04) {
            C02270Bi r1 = this.A00;
            int i = R.string.md_opt_out_in_progress;
            if (z) {
                i = R.string.md_opt_in_in_progress;
            }
            r1.A07(Integer.valueOf(i));
            AnonymousClass02M r4 = this.A06;
            r4.A02.postDelayed(new RunnableEBaseShape1S0110000_I1(this, z, 7), 1000);
        } else if (z) {
            this.A04 = false;
            this.A05 = false;
            this.A0E.ANF(new RunnableEBaseShape7S0200000_I1_2(this, null, 13));
            A03(true);
        } else {
            this.A00.A07(Integer.valueOf((int) R.string.md_opt_out_in_progress));
            this.A0E.ANF(new RunnableEBaseShape7S0200000_I1_2(this, new C51112Xk(this), 13));
        }
    }
}
