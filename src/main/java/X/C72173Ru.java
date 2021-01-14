package X;

import android.text.Editable;
import com.whatsapp.twofactor.SetEmailFragment;

/* renamed from: X.3Ru  reason: invalid class name and case insensitive filesystem */
public class C72173Ru extends C07860Zy {
    public final /* synthetic */ SetEmailFragment A00;

    public C72173Ru(SetEmailFragment setEmailFragment) {
        this.A00 = setEmailFragment;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        SetEmailFragment setEmailFragment = this.A00;
        int i = setEmailFragment.A00;
        if (i == 1) {
            setEmailFragment.A05.A03 = trim;
        } else if (i == 2) {
            setEmailFragment.A04.setText("");
            setEmailFragment.A05.A04 = trim;
        }
        setEmailFragment.A0n();
    }
}
