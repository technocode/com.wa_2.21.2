package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2TT  reason: invalid class name */
public class AnonymousClass2TT {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass2TP A04;
    public final AnonymousClass1XO A05;
    public final C29251Xr A06;
    public final File A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass2TT(String str, File file, String str2, String str3, String str4, AnonymousClass1XO r10, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, C29251Xr r20, AnonymousClass2TP r21, boolean z4, boolean z5) {
        if (z3 && (r10 == AnonymousClass1XO.A0A || r10 == AnonymousClass1XO.A0P || r10 == AnonymousClass1XO.A0C || r10 == AnonymousClass1XO.A0H || r10 == AnonymousClass1XO.A06)) {
            AnonymousClass00E.A0A(r21 != null, "Image transcoding should have quality settings");
        }
        this.A08 = str;
        this.A07 = file;
        this.A0B = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = r10;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
        this.A0D = z;
        this.A0G = z2;
        this.A0C = z3;
        this.A06 = r20;
        this.A04 = r21;
        this.A0E = z4;
        this.A0F = z5;
    }

    public File A00() {
        Uri parse;
        String str = this.A0B;
        if (str == null || (parse = Uri.parse(str)) == null || !parse.isAbsolute()) {
            return null;
        }
        return C006803i.A0B(parse);
    }
}
