package X;

/* renamed from: X.3XH  reason: invalid class name */
public class AnonymousClass3XH implements AnonymousClass3D9 {
    public long A00;
    public final AnonymousClass3D9 A01;

    public AnonymousClass3XH(AnonymousClass3D9 r1) {
        this.A01 = r1;
    }

    @Override // X.AnonymousClass3D9
    public String readLine() {
        long currentTimeMillis = System.currentTimeMillis();
        String readLine = this.A01.readLine();
        this.A00 = (System.currentTimeMillis() - currentTimeMillis) + this.A00;
        return readLine;
    }
}
