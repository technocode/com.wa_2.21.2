package X;

import android.text.Editable;
import android.widget.EditText;
import com.whatsapp.voipcalling.CallRatingActivity;

/* renamed from: X.3ae  reason: invalid class name and case insensitive filesystem */
public class C74323ae extends C07850Zx {
    public final /* synthetic */ CallRatingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74323ae(CallRatingActivity callRatingActivity, C02590Cr r12, AnonymousClass03P r13, AnonymousClass01X r14, AnonymousClass022 r15, EditText editText) {
        super(r12, r13, r14, r15, editText, null, 1024, 0, false);
        this.A00 = callRatingActivity;
    }

    @Override // X.C07860Zy, X.C07850Zx
    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.A00.A0D();
    }
}
