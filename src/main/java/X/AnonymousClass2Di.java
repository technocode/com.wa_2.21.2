package X;

import java.io.File;

/* renamed from: X.2Di  reason: invalid class name */
public final class AnonymousClass2Di {
    public long A00;
    public C46562Dh A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ AnonymousClass2Dk A05;

    public AnonymousClass2Di(AnonymousClass2Dk r2, String str) {
        this.A05 = r2;
        this.A03 = str;
        this.A04 = new long[r2.A05];
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
