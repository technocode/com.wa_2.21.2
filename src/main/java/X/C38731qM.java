package X;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.WaEditText;

/* renamed from: X.1qM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38731qM implements AnonymousClass1MG {
    public final /* synthetic */ WaEditText A00;

    public /* synthetic */ C38731qM(WaEditText waEditText) {
        this.A00 = waEditText;
    }

    @Override // X.AnonymousClass1MG
    public final boolean A2P(InputMethodManager inputMethodManager, ResultReceiver resultReceiver) {
        return inputMethodManager.hideSoftInputFromWindow(this.A00.getWindowToken(), 0, resultReceiver);
    }
}
