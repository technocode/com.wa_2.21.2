package X;

/* renamed from: X.1hO  reason: invalid class name and case insensitive filesystem */
public class C33791hO implements AnonymousClass129 {
    public int A00;
    public boolean A01;
    public final int A02 = -1;
    public final long A03 = AnonymousClass11u.A00((long) 0);
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final AnonymousClass15H A08;
    public final boolean A09 = true;

    public C33791hO(AnonymousClass15H r8, int i, int i2, int i3, int i4) {
        A00(i3, 0, "bufferForPlaybackMs", "0");
        A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        A00(i2, i, "maxBufferMs", "minBufferMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A08 = r8;
        this.A07 = AnonymousClass11u.A00((long) i);
        this.A06 = AnonymousClass11u.A00((long) i2);
        this.A05 = AnonymousClass11u.A00((long) i3);
        this.A04 = AnonymousClass11u.A00((long) i4);
    }

    public static void A00(int i, int i2, String str, String str2) {
        boolean z = false;
        if (i >= i2) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C002001d.A3B(z, sb.toString());
    }

    public final void A01(boolean z) {
        this.A00 = 0;
        this.A01 = false;
        if (z) {
            AnonymousClass15H r1 = this.A08;
            synchronized (r1) {
                if (r1.A05) {
                    r1.A01(0);
                }
            }
        }
    }
}
