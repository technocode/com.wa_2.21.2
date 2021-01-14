package X;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Ls  reason: invalid class name and case insensitive filesystem */
public class C26631Ls {
    public static volatile C26631Ls A0B;
    public final AnonymousClass0C2 A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass088 A02;
    public final C000300f A03;
    public final AnonymousClass03R A04;
    public final AnonymousClass00S A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass03S A07;
    public final AnonymousClass00D A08;
    public final AnonymousClass00Y A09;
    public final C014708f A0A;

    public C26631Ls(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass088 r4, AnonymousClass00Y r5, AnonymousClass03R r6, C000300f r7, AnonymousClass03S r8, AnonymousClass00D r9, C014708f r10, AnonymousClass0C2 r11) {
        this.A06 = r1;
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A09 = r5;
        this.A04 = r6;
        this.A03 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A0A = r10;
        this.A00 = r11;
    }

    public final int A00() {
        int i = this.A08.A00.getInt("external_dir_migration_stage", 0);
        if (i >= 0 && i <= 5) {
            return i;
        }
        StringBuilder sb = new StringBuilder("externaldirmigration/unexpected stage (");
        sb.append(i);
        sb.append(") resetting to not started");
        Log.e(sb.toString());
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if ((!new java.io.File(r19, ".nomedia").exists()) == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(java.io.File r18, java.io.File r19, android.util.SparseIntArray r20, X.C38681qH r21) {
        /*
        // Method dump skipped, instructions count: 433
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26631Ls.A01(java.io.File, java.io.File, android.util.SparseIntArray, X.1qH):int");
    }

    public final void A02(int i, SparseIntArray sparseIntArray) {
        String obj;
        if (sparseIntArray != null) {
            int i2 = sparseIntArray.get(i, 0);
            sparseIntArray.put(i, i2 + 1);
            if (i2 != 0) {
                return;
            }
        }
        if (i == 2 || i == 3 || i == 4 || i == 6) {
            AnonymousClass009 r2 = this.A01;
            StringBuilder A0S = AnonymousClass008.A0S("externaldirmigration/failed: ");
            Integer valueOf = Integer.valueOf(i);
            if (valueOf == null) {
                obj = null;
            } else {
                obj = valueOf.toString();
            }
            A0S.append(obj);
            r2.A03(A0S.toString(), -1);
        }
        C44351zu r5 = new C44351zu();
        r5.A00 = Integer.valueOf(i);
        SharedPreferences sharedPreferences = this.A08.A00;
        r5.A01 = Long.valueOf(sharedPreferences.getLong("external_dir_migration_attempt_n", -1));
        r5.A04 = Long.valueOf(sharedPreferences.getLong("ext_dir_migration_rescan_time", -1));
        r5.A03 = Long.valueOf(sharedPreferences.getLong("ext_dir_migration_move_time", -1));
        r5.A02 = Long.valueOf(this.A05.A01() - sharedPreferences.getLong("ext_dir_migration_start_time", 0));
        this.A09.A0B(r5, null, false);
    }

    public final void A03(Uri uri, File file) {
        ContentResolver contentResolver = this.A06.A00.getContentResolver();
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append('%');
        int delete = contentResolver.delete(uri, "_data LIKE ?", new String[]{sb.toString()});
        StringBuilder sb2 = new StringBuilder("externaldirmigration/unscanned ");
        sb2.append(delete);
        sb2.append(" files in ");
        sb2.append(uri);
        sb2.append(" rootDir=");
        sb2.append(file);
        Log.d(sb2.toString());
    }

    public final void A04(File file, List list, Set set) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            boolean z = !new File(file, ".nomedia").exists();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (set.add(file2)) {
                        A04(file2, list, set);
                    }
                } else if (z) {
                    list.add(file2);
                }
            }
        }
    }

    public boolean A05() {
        if (this.A0A.A02() && this.A03.A0D(AbstractC000400g.A2U) && this.A04.A03() != null && A00() != 5) {
            return true;
        }
        return false;
    }
}
