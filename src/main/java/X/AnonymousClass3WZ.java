package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import org.npci.commonlibrary.ATMPinFragment;
import org.npci.commonlibrary.GetCredential;
import org.npci.commonlibrary.NPCIFragment;
import org.npci.commonlibrary.PinFragment;

/* renamed from: X.3WZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WZ implements AnonymousClass3BY {
    public final /* synthetic */ GetCredential A00;

    public /* synthetic */ AnonymousClass3WZ(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    @Override // X.AnonymousClass3BY
    public final void AGw(View view, int i) {
        NPCIFragment nPCIFragment;
        GetCredential getCredential = this.A00;
        getCredential.dispatchKeyEvent(new KeyEvent(0, i));
        if (i == 66 && (nPCIFragment = getCredential.A0B) != null) {
            if (!(nPCIFragment instanceof PinFragment)) {
                ATMPinFragment aTMPinFragment = (ATMPinFragment) nPCIFragment;
                int i2 = aTMPinFragment.A00;
                if (i2 == 0) {
                    ((AnonymousClass3BR) ((NPCIFragment) aTMPinFragment).A0C.get(1)).A4L();
                    aTMPinFragment.A00++;
                    return;
                }
                if (i2 == 1) {
                    ArrayList arrayList = ((NPCIFragment) aTMPinFragment).A0C;
                    if (((C73263Wc) arrayList.get(0)).A00 != ((AnonymousClass3BR) arrayList.get(0)).getInputValue().length()) {
                        aTMPinFragment.A0q((View) arrayList.get(0), ((NPCIFragment) aTMPinFragment).A0B.A06(R.string.npci_otp_title));
                        return;
                    } else if (((C73263Wc) arrayList.get(1)).A00 != ((AnonymousClass3BR) arrayList.get(1)).getInputValue().length()) {
                        aTMPinFragment.A0q((View) arrayList.get(1), ((NPCIFragment) aTMPinFragment).A0B.A06(R.string.npci_atm_title));
                        return;
                    } else {
                        ViewSwitcher viewSwitcher = aTMPinFragment.A01;
                        if (viewSwitcher != null) {
                            viewSwitcher.showNext();
                            aTMPinFragment.A00 = 2;
                            return;
                        }
                    }
                }
                int i3 = aTMPinFragment.A00;
                if (i3 != 2) {
                    aTMPinFragment.A0s();
                } else if (((AnonymousClass3BR) ((NPCIFragment) aTMPinFragment).A0C.get(i3)).A4L()) {
                    aTMPinFragment.A0s();
                }
            } else {
                PinFragment pinFragment = (PinFragment) nPCIFragment;
                int i4 = pinFragment.A00;
                ArrayList arrayList2 = ((NPCIFragment) pinFragment).A0C;
                if (i4 >= arrayList2.size() - 1) {
                    pinFragment.A0s();
                } else if (((AnonymousClass3BR) arrayList2.get(i4 + 1)).A4L()) {
                    int i5 = pinFragment.A00 + 1;
                    pinFragment.A00 = i5;
                    if (i5 >= arrayList2.size() - 1) {
                        pinFragment.A0s();
                    }
                }
            }
        }
    }
}
