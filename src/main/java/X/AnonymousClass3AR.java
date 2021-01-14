package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.3AR  reason: invalid class name */
public class AnonymousClass3AR extends Intent {
    public AnonymousClass3AR(Context context, String str, String str2, boolean z) {
        super(context, WaBloksActivity.class);
        HashMap hashMap;
        Serializable serializableExtra = getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = new HashMap();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put("params", str2);
        putExtra("screen_params", hashMap);
        putExtra("screen_name", str);
        putExtra("has_options", z);
        if (z) {
            putExtra("options_key", str2);
        }
    }
}
