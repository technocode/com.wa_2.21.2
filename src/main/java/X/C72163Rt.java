package X;

import com.whatsapp.twofactor.SetCodeFragment;

/* renamed from: X.3Rt  reason: invalid class name and case insensitive filesystem */
public class C72163Rt implements AbstractC26321Kk {
    public final /* synthetic */ SetCodeFragment A00;

    public C72163Rt(SetCodeFragment setCodeFragment) {
        this.A00 = setCodeFragment;
    }

    @Override // X.AbstractC26321Kk
    public void AEJ(String str) {
        SetCodeFragment setCodeFragment = this.A00;
        boolean z = false;
        if (((AnonymousClass037) setCodeFragment).A04 >= 4) {
            z = true;
        }
        if (z) {
            setCodeFragment.A0n();
            int i = setCodeFragment.A00;
            if (i == 1) {
                setCodeFragment.A04.A01 = str;
            } else if (i == 2) {
                setCodeFragment.A04.A02 = str;
            }
            if (!setCodeFragment.A0o(str)) {
                return;
            }
            if (setCodeFragment.A00 != 2 || !setCodeFragment.A04.A0X(setCodeFragment)) {
                SetCodeFragment.A00(setCodeFragment);
            }
        }
    }

    @Override // X.AbstractC26321Kk
    public void AI2(String str) {
        SetCodeFragment setCodeFragment = this.A00;
        boolean z = false;
        if (((AnonymousClass037) setCodeFragment).A04 >= 4) {
            z = true;
        }
        if (z) {
            int i = setCodeFragment.A00;
            if (i == 1) {
                setCodeFragment.A04.A01 = str;
            } else if (i == 2) {
                setCodeFragment.A04.A02 = str;
            }
            setCodeFragment.A02.setText("");
            setCodeFragment.A0n();
        }
    }
}
