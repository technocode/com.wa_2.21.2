package X;

import java.io.File;

/* renamed from: X.0ur  reason: invalid class name and case insensitive filesystem */
public final class C19340ur {
    public long A00;
    public C19330uq A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C19380uv A05;

    public C19340ur(C19380uv r2, String str) {
        this.A05 = r2;
        this.A03 = str;
        this.A04 = new long[r2.A06];
    }

    public File A00(int i) {
        File file = this.A05.A07;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(".");
        sb.append(i);
        return new File(file, sb.toString());
    }

    public File A01(int i) {
        File file = this.A05.A07;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(".");
        sb.append(i);
        sb.append(".tmp");
        return new File(file, sb.toString());
    }
}
