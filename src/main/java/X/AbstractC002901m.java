package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.01m  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC002901m {
    public final String A00;
    public final String A01;

    public AbstractC002901m(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public void A00(Map map, SharedPreferences.Editor editor) {
        if (this instanceof C006103b) {
            C006103b r0 = (C006103b) this;
            C002001d.A35(((AbstractC002901m) r0).A00, (String) map.get(r0.A01), editor);
        } else if (this instanceof C006003a) {
            C006003a r1 = (C006003a) this;
            String str = ((AbstractC002901m) r1).A00;
            String str2 = (String) map.get(((AbstractC002901m) r1).A01);
            Integer num = r1.A02;
            Integer num2 = r1.A01;
            if (TextUtils.isEmpty(str2)) {
                editor.remove(str);
                return;
            }
            try {
                int parseInt = Integer.parseInt(str2);
                if (num != null) {
                    parseInt = Math.max(num.intValue(), parseInt);
                }
                if (num2 != null) {
                    parseInt = Math.min(num2.intValue(), parseInt);
                }
                editor.putInt(str, parseInt);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
                sb.append(str);
                sb.append("; value=");
                sb.append(str2);
                Log.w(sb.toString(), e);
                editor.remove(str);
            }
        } else if (!(this instanceof C006203c)) {
            C002801l r02 = (C002801l) this;
            C002001d.A36(((AbstractC002901m) r02).A00, (String) map.get(r02.A01), editor);
        } else {
            C006203c r03 = (C006203c) this;
            C002001d.A33(((AbstractC002901m) r03).A00, (String) map.get(r03.A01), editor);
        }
    }
}
