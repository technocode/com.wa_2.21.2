package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.196  reason: invalid class name */
public final class AnonymousClass196 {
    public static int A01 = -1;
    public static AnonymousClass199 A02;
    public static AnonymousClass19A A03;
    public static Boolean A04;
    public static String A05;
    public static final AnonymousClass192 A06 = new C35491kR();
    public static final AnonymousClass194 A07 = new C35511kT();
    public static final AnonymousClass194 A08 = new C35501kS();
    public static final ThreadLocal A09 = new ThreadLocal();
    public final Context A00;

    public AnonymousClass196(Context context) {
        C001801b.A1Q(context);
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        throw new X.AnonymousClass191("V2 version check failed", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096 A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass196.A00(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0246, code lost:
        if (r11.A00 != 0) goto L_0x0248;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass196 A01(android.content.Context r14, X.AnonymousClass194 r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 653
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass196.A01(android.content.Context, X.194, java.lang.String):X.196");
    }

    public static AnonymousClass196 A02(Context context, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Selected local version of ".concat(valueOf);
        } else {
            str2 = new String("Selected local version of ");
        }
        Log.i("DynamiteModule", str2);
        return new AnonymousClass196(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r1 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass199 A03(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass196.A03(android.content.Context):X.199");
    }

    public static void A04(ClassLoader classLoader) {
        AnonymousClass19A r3 = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof AnonymousClass19A) {
                    r3 = (AnonymousClass19A) queryLocalInterface;
                } else {
                    r3 = new C35531kV(iBinder);
                }
            }
            A03 = r3;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new AnonymousClass191("Failed to instantiate dynamite loader", e);
        }
    }
}
