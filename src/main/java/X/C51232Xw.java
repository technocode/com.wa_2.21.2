package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.whatsapp.components.PhoneNumberEntry;

/* renamed from: X.2Xw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51232Xw implements AbstractC27141Og {
    public final /* synthetic */ PhoneNumberEntry A00;

    public /* synthetic */ C51232Xw(PhoneNumberEntry phoneNumberEntry) {
        this.A00 = phoneNumberEntry;
    }

    @Override // X.AbstractC27141Og
    public final boolean AKw(int i) {
        ClipboardManager A05;
        ClipData primaryClip;
        String str;
        PhoneNumberEntry phoneNumberEntry = this.A00;
        if ((i != 16908322 && i != 16908337) || (A05 = phoneNumberEntry.A06.A05()) == null || (primaryClip = A05.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
            return false;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt == null || itemAt.getText() == null) {
            str = "";
        } else {
            str = itemAt.getText().toString();
        }
        if (!str.startsWith("+")) {
            return false;
        }
        try {
            C12490iB A0E = C12440i6.A00().A0E(str, null);
            String num = Integer.toString(A0E.countryCode_);
            String A01 = C12440i6.A01(A0E);
            if (AnonymousClass0HU.A05(phoneNumberEntry.A05, num, A01) != 1) {
                return false;
            }
            phoneNumberEntry.A01.setText(num);
            phoneNumberEntry.A02.setText(A01);
            return true;
        } catch (AnonymousClass1F5 unused) {
            return false;
        }
    }
}
