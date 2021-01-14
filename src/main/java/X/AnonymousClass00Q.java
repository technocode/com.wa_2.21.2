package X;

import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.00Q  reason: invalid class name */
public class AnonymousClass00Q implements AnonymousClass00R {
    public static volatile AnonymousClass00Q A02;
    public String A00 = null;
    public Method A01 = null;

    public static AnonymousClass00Q A00() {
        if (A02 == null) {
            synchronized (AnonymousClass00R.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass00Q();
                }
            }
        }
        return A02;
    }

    @Override // X.AnonymousClass00R
    public synchronized void ABm(String str, int i) {
        Method method = this.A01;
        if (method == null) {
            System.load(str);
            return;
        }
        try {
            boolean z = false;
            if (this.A00 != null) {
                z = true;
            }
            AnonymousClass00E.A07(z);
            String str2 = (String) method.invoke(Runtime.getRuntime(), str, AnonymousClass00Q.class.getClassLoader(), this.A00);
            if (str2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("robustsofileloader/load: nativeLoad returned error ");
                sb.append(str2);
                throw new UnsatisfiedLinkError(sb.toString());
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("robustsofileloader/load: Cannot load ");
            sb2.append(str);
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("robustsofileloader/load: Error when loading lib: ");
            sb3.append(obj);
            Log.e(sb3.toString(), e);
            throw new UnsatisfiedLinkError(obj);
        }
    }
}
