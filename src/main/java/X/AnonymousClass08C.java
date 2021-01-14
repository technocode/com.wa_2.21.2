package X;

import android.content.res.Resources;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.util.AbstractMap;

/* renamed from: X.08C  reason: invalid class name */
public class AnonymousClass08C {
    public static volatile AnonymousClass08C A04;
    public final AnonymousClass088 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass08D A02;
    public final AnonymousClass00G A03;

    public AnonymousClass08C(AnonymousClass00G r1, AnonymousClass08D r2, AnonymousClass01I r3, AnonymousClass088 r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }

    public static AnonymousClass08C A00() {
        if (A04 == null) {
            synchronized (AnonymousClass08C.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass08C(AnonymousClass00G.A01, AnonymousClass08D.A00(), AnonymousClass01I.A00(), AnonymousClass088.A00());
                }
            }
        }
        return A04;
    }

    public File A01() {
        File file = this.A00.A04().A07;
        AnonymousClass089.A03(file, false);
        return AnonymousClass089.A01(file, "tmpp");
    }

    public File A02(C007003k r6) {
        if (r6 instanceof C11230fv) {
            return A01();
        }
        Jid A022 = r6.A02(AnonymousClass02N.class);
        if (A022 == null) {
            throw null;
        } else if (this.A01.A09(A022)) {
            return new File(this.A03.A00.getFilesDir(), "me.jpg");
        } else {
            File file = new File(this.A03.A00.getCacheDir(), "Profile Pictures");
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = A022.user;
            if (str != null) {
                return new File(file, AnonymousClass008.A0O(new StringBuilder(), str, ".jpg"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A022.getRawString());
            sb.append(".jpg");
            return new File(file, sb.toString());
        }
    }

    public File A03(C007003k r5) {
        String rawString;
        if (r5 instanceof C11230fv) {
            return A01();
        }
        Jid A022 = r5.A02(AnonymousClass02N.class);
        if (A022 != null) {
            File file = new File(this.A03.A00.getFilesDir(), "Avatars");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (this.A01.A09(A022)) {
                rawString = "me";
            } else {
                rawString = A022.getRawString();
            }
            return new File(file, AnonymousClass008.A0K(rawString, ".j"));
        }
        throw null;
    }

    public void A04(C007003k r3) {
        File A022 = A02(r3);
        if (A022.exists()) {
            A022.delete();
        }
        File A032 = A03(r3);
        if (A032.exists()) {
            A032.delete();
        }
    }

    public void A05(C007003k r6) {
        String A032 = r6.A03();
        AnonymousClass0DD A022 = this.A02.A02();
        for (String str : ((AbstractMap) A022.A00.A05()).keySet()) {
            if (str.startsWith(A032)) {
                A022.A04(str);
            }
        }
        r6.A0R = true;
    }

    public boolean A06(C007003k r4) {
        Resources resources = this.A03.A00.getResources();
        return this.A02.A02().A02(r4.A05(resources.getDimensionPixelSize(R.dimen.small_avatar_size), resources.getDimension(R.dimen.small_avatar_radius))) != null;
    }

    public boolean A07(C007003k r3) {
        File A032 = A03(r3);
        if (!A032.exists()) {
            A032 = A02(r3);
        }
        return A032.exists();
    }
}
