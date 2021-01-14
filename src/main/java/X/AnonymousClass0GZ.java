package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: X.0GZ  reason: invalid class name */
public class AnonymousClass0GZ {
    public static volatile AnonymousClass0GZ A09;
    public int A00;
    public final AnonymousClass03R A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass00D A05;
    public final AnonymousClass03U A06;
    public final AnonymousClass03A A07;
    public final AnonymousClass00T A08;

    public AnonymousClass0GZ(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass03A r3, AnonymousClass00T r4, AnonymousClass03R r5, AnonymousClass03U r6, AnonymousClass04j r7, AnonymousClass00D r8) {
        this.A04 = r1;
        this.A03 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A01 = r5;
        this.A06 = r6;
        this.A02 = r7;
        this.A05 = r8;
    }

    public static AnonymousClass0GZ A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0GZ.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0GZ(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass03A.A00(), C002101e.A00(), AnonymousClass03R.A00(), AnonymousClass03U.A00(), AnonymousClass04j.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A09;
    }

    public Uri A01() {
        if (!A02()) {
            return Uri.parse("https://www.whatsapp.com/android/current/WhatsApp.apk");
        }
        return Uri.parse("market://details?id=com.whatsapp");
    }

    public boolean A02() {
        try {
            PackageManager packageManager = this.A04.A00.getPackageManager();
            packageManager.getPackageInfo("com.android.vending", 0);
            if (new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")).resolveActivity(packageManager) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
