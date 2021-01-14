package X;

import android.text.Editable;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.2Ye  reason: invalid class name and case insensitive filesystem */
public class C51302Ye extends C07860Zy {
    public boolean A00;
    public final /* synthetic */ SharedTextPreviewDialogFragment A01;

    public C51302Ye(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A01 = sharedTextPreviewDialogFragment;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A01;
        C002001d.A2U(sharedTextPreviewDialogFragment.A0A(), sharedTextPreviewDialogFragment.A0J, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0E, sharedTextPreviewDialogFragment.A0O, editable, sharedTextPreviewDialogFragment.A02.getPaint(), 1.3f);
        sharedTextPreviewDialogFragment.A10(editable, this.A00);
    }
}
