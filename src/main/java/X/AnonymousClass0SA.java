package X;

import android.os.Bundle;
import com.whatsapp.SingleSelectionDialogFragment;

/* renamed from: X.0SA  reason: invalid class name */
public class AnonymousClass0SA extends ActivityC004602e {
    public void A0T(int i, int i2, int i3, int i4) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i3);
        bundle.putInt("dialogTitleResId", i2);
        bundle.putInt("itemsArrayResId", i4);
        singleSelectionDialogFragment.A0N(bundle);
        APm(singleSelectionDialogFragment);
    }

    public void A0U(int i, int i2, int i3, String[] strArr) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        singleSelectionDialogFragment.A0N(SingleSelectionDialogFragment.A00(i, i3, i2, strArr));
        APm(singleSelectionDialogFragment);
    }
}
