package X;

import com.whatsapp.dns.DnsCacheEntrySerializable;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.0c1  reason: invalid class name and case insensitive filesystem */
public final class C08940c1 {
    public static final String[] A0B = {"e1.whatsapp.net.", "e2.whatsapp.net.", "e3.whatsapp.net.", "e4.whatsapp.net.", "e5.whatsapp.net.", "e6.whatsapp.net.", "e7.whatsapp.net.", "e8.whatsapp.net.", "e9.whatsapp.net.", "e10.whatsapp.net.", "e11.whatsapp.net.", "e12.whatsapp.net.", "e13.whatsapp.net.", "e14.whatsapp.net.", "e15.whatsapp.net.", "e16.whatsapp.net."};
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public final int A03;
    public final int A04;
    public final C000800l A05;
    public final String A06;
    public final InetSocketAddress A07;
    public final List A08;
    public final List A09;
    public final Random A0A;

    public C08940c1(C000800l r4, InetSocketAddress inetSocketAddress, String str, List list, Random random) {
        this.A05 = r4;
        this.A07 = inetSocketAddress;
        this.A06 = str;
        this.A0A = random;
        this.A09 = new ArrayList();
        this.A08 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DnsCacheEntrySerializable dnsCacheEntrySerializable = (DnsCacheEntrySerializable) it.next();
            if (dnsCacheEntrySerializable.forceOverride) {
                this.A09.add(dnsCacheEntrySerializable);
            } else {
                this.A08.add(dnsCacheEntrySerializable);
            }
        }
        boolean nextBoolean = random.nextBoolean();
        int i = 5222;
        this.A03 = nextBoolean ? 443 : 5222;
        this.A04 = !nextBoolean ? 443 : i;
    }

    public final C11250fy A00(int i, boolean z) {
        String str;
        if (z) {
            str = "g.whatsapp.net";
        } else {
            String[] strArr = A0B;
            str = strArr[this.A0A.nextInt(strArr.length)];
        }
        C11250fy A012 = this.A05.A01(str);
        A012.A00 = i;
        AnonymousClass008.A18("ConnectionSequence/getInetSocketAddress; host=", str);
        return A012;
    }
}
