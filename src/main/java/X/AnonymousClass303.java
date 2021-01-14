package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;

/* renamed from: X.303  reason: invalid class name */
public class AnonymousClass303 extends Handler {
    public final /* synthetic */ ChangeNumber A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass303(ChangeNumber changeNumber, Looper looper) {
        super(looper);
        this.A00 = changeNumber;
    }

    public void handleMessage(Message message) {
        EditText editText;
        EditText editText2;
        int i = message.what;
        if (i == 1) {
            Log.w("changenumber/check-number/match");
            ChangeNumber changeNumber = this.A00;
            changeNumber.A08.removeMessages(4);
            changeNumber.A0R.ANF(new RunnableEBaseShape12S0100000_I1_7(this, 20));
            if (!ChangeNumber.A0T.equals(AnonymousClass0HU.A0N)) {
                C002001d.A2N(changeNumber, 1);
                C002001d.A2O(changeNumber, 2);
                AnonymousClass30A r0 = changeNumber.A06;
                if (r0 != null && (editText = r0.A02) != null) {
                    editText.requestFocus();
                    return;
                }
                return;
            }
            changeNumber.A0W();
        } else if (i == 2) {
            Log.w("changenumber/check-number/mismatch");
            ChangeNumber changeNumber2 = this.A00;
            changeNumber2.A08.removeMessages(4);
            C002001d.A2N(changeNumber2, 1);
            changeNumber2.APo(R.string.delete_account_mismatch);
            AnonymousClass30A r02 = changeNumber2.A06;
            if (r02 != null && (editText2 = r02.A03) != null) {
                editText2.requestFocus();
            }
        } else if (i == 3) {
            Log.e("changenumber/error");
            ChangeNumber changeNumber3 = this.A00;
            C002001d.A2N(changeNumber3, 1);
            C002001d.A2O(changeNumber3, 109);
        } else if (i == 4) {
            Log.e("changenumber/timeout");
            ChangeNumber changeNumber4 = this.A00;
            changeNumber4.A08.removeMessages(4);
            C002001d.A2N(changeNumber4, 1);
            C002001d.A2O(changeNumber4, 109);
        }
    }
}
