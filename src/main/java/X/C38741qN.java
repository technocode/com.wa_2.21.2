package X;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.WaEditText;

/* renamed from: X.1qN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38741qN implements AnonymousClass1MG {
    public final /* synthetic */ WaEditText A00;

    public /* synthetic */ C38741qN(WaEditText waEditText) {
        this.A00 = waEditText;
    }

    @Override // X.AnonymousClass1MG
    public final boolean A2P(InputMethodManager inputMethodManager, ResultReceiver resultReceiver) {
        return inputMethodManager.showSoftInput(this.A00, 0, resultReceiver);
    }
}
