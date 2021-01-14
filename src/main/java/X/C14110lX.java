package X;

/* renamed from: X.0lX  reason: invalid class name and case insensitive filesystem */
public class C14110lX {
    public float A00;
    public int A01;
    public int A02;
    public EnumC14100lW A03;
    public String A04;
    public String A05;
    public boolean A06;

    public C14110lX(C14110lX r2, Object obj) {
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        A00(obj);
    }

    public C14110lX(String str, EnumC14100lW r2, Object obj) {
        this.A04 = str;
        this.A03 = r2;
        A00(obj);
    }

    public void A00(Object obj) {
        switch (this.A03.ordinal()) {
            case 0:
                this.A02 = ((Number) obj).intValue();
                return;
            case 1:
                this.A00 = ((Number) obj).floatValue();
                return;
            case 2:
            case 3:
                this.A01 = ((Number) obj).intValue();
                return;
            case 4:
                this.A05 = (String) obj;
                return;
            case 5:
                this.A06 = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.A00 = ((Number) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
