package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;

/* renamed from: X.1Vy  reason: invalid class name and case insensitive filesystem */
public class C28841Vy {
    public static volatile C28841Vy A02;
    public final AnonymousClass00G A00;
    public final C28631Vd A01;

    public C28841Vy(AnonymousClass00G r1, C28631Vd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C28841Vy A00() {
        if (A02 == null) {
            synchronized (C28841Vy.class) {
                if (A02 == null) {
                    A02 = new C28841Vy(AnonymousClass00G.A01, C28631Vd.A00());
                }
            }
        }
        return A02;
    }

    public C28831Vx A01() {
        int length;
        C28831Vx r0;
        synchronized (this.A01) {
        }
        if (Binder.getCallingUid() != Process.myUid()) {
            int callingUid = Binder.getCallingUid();
            String[] packagesForUid = this.A00.A00.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null || (length = packagesForUid.length) == 0) {
                throw new SecurityException(AnonymousClass008.A0F("No packages associated with uid: ", callingUid));
            } else if (length == 1) {
                String str = packagesForUid[0];
                String A04 = A04(str);
                if (C28811Vv.A01.contains(Pair.create(str, A04))) {
                    r0 = new C28831Vx(true, str, callingUid, A04);
                } else {
                    r0 = new C28831Vx(false, str, callingUid, A04);
                }
                if (r0.A03) {
                    return r0;
                }
                throw new SecurityException(r0.toString());
            } else {
                throw new SecurityException(AnonymousClass008.A0F("Multiple packages per uid are not supported, uid: ", callingUid));
            }
        } else {
            throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
        }
    }

    public C28831Vx A02(String str) {
        int i = this.A00.A00.getPackageManager().getPackageInfo(str, 0).applicationInfo.uid;
        String A04 = A04(str);
        if (C28811Vv.A01.contains(Pair.create(str, A04))) {
            return new C28831Vx(true, str, i, A04);
        }
        return new C28831Vx(false, str, i, A04);
    }

    public C28831Vx A03(String str) {
        try {
            C28831Vx A022 = A02(str);
            if (A022.A03) {
                return A022;
            }
            throw new SecurityException(A022.toString());
        } catch (PackageManager.NameNotFoundException e) {
            throw new SecurityException(AnonymousClass008.A0K("Package not found: ", str), e);
        }
    }

    public final String A04(String str) {
        int length;
        try {
            PackageInfo packageInfo = this.A00.A00.getPackageManager().getPackageInfo(str, 64);
            String str2 = packageInfo.packageName;
            if (str.equals(str2)) {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    throw new SecurityException(AnonymousClass008.A0K("Signatures are missing: ", str));
                } else if (length <= 1) {
                    Signature signature = signatureArr[0];
                    if (signature != null) {
                        return C003701u.A01(signature);
                    }
                    throw new SecurityException("No uid signature.");
                } else {
                    throw new SecurityException(AnonymousClass008.A0K("Multiple signatures not supported: ", str));
                }
            } else {
                StringBuilder A0Z = AnonymousClass008.A0Z("Package name mismatch: expected=", str, ", was=");
                A0Z.append(str2);
                throw new SecurityException(A0Z.toString());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass008.A0K("Name not found: ", str));
        }
    }
}
