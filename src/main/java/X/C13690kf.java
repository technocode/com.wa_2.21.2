package X;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.0kf  reason: invalid class name and case insensitive filesystem */
public class C13690kf {
    public final Bundle A00 = new Bundle();

    public C13700kg A00() {
        Bundle bundle = this.A00;
        CharSequence charSequence = bundle.getCharSequence("title");
        CharSequence charSequence2 = bundle.getCharSequence("negative_text");
        boolean z = bundle.getBoolean("allow_device_credential");
        boolean z2 = bundle.getBoolean("handling_device_credential_result");
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("Title must be set and non-empty");
        } else if (TextUtils.isEmpty(charSequence2) && !z) {
            throw new IllegalArgumentException("Negative text must be set and non-empty");
        } else if (!TextUtils.isEmpty(charSequence2) && z) {
            throw new IllegalArgumentException("Can't have both negative button behavior and device credential enabled");
        } else if (!z2 || z) {
            return new C13700kg(bundle);
        } else {
            throw new IllegalArgumentException("Can't be handling device credential result without device credential enabled");
        }
    }
}
