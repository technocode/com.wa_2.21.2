package com.google.android.material.bottomsheet;

import X.DialogC458926w;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        return new DialogC458926w(A00(), A0n());
    }
}
