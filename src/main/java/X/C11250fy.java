package X;

import java.net.InetAddress;

/* renamed from: X.0fy  reason: invalid class name and case insensitive filesystem */
public class C11250fy {
    public int A00;
    public boolean A01;
    public final C11240fx A02;
    public final boolean A03;
    public final InetAddress[] A04;

    public C11250fy(C11240fx r3, InetAddress inetAddress, int i, boolean z) {
        this.A00 = i;
        this.A02 = r3;
        this.A04 = new InetAddress[]{inetAddress};
        this.A03 = z;
    }

    public C11250fy(C11240fx r3, InetAddress[] inetAddressArr) {
        this.A00 = -1;
        this.A02 = r3;
        this.A04 = inetAddressArr;
        this.A03 = false;
    }
}
